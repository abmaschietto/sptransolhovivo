package com.artucrop.sptrans.config;


import feign.RequestInterceptor;
import lombok.extern.slf4j.Slf4j;
import okhttp3.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import java.io.IOException;

@Slf4j
public class SpTransConfig {

    public static final MediaType MEDIA_TYPE = MediaType.parse("application/json");
    @Value("${sptrans.token}")
    private String token;
    @Value("${sptrans.url}")
    private String baseUrl;
    private String cookieAuthentication;
    private final OkHttpClient httpClient;

    public SpTransConfig() {
        this.httpClient = new OkHttpClient.Builder().build();
    }
    @Bean
    public RequestInterceptor requestInterceptor() {
        createCookieForRequest();
        return requestTemplate -> {
            requestTemplate.header("Cookie",cookieAuthentication);
        };
    }
    private void createCookieForRequest() {
        var preRequest = createRequest();
        try (Response response = httpClient.newCall(preRequest).execute()) {
            if (response.isSuccessful()) {
                extractCookie(response);
            }
        } catch (IOException e) {
           log.error(e.getMessage(), e);
        }
    }
    private void extractCookie(Response response) {
        var requestHttpUrl = HttpUrl.parse(baseUrl +token);
        var cookies = Cookie.parseAll(requestHttpUrl, response.headers());
        cookieAuthentication = new StringBuilder("apiCredentials=").append(cookies.get(0).value()).toString();
    }
    private Request createRequest() {
        return new Request.Builder()
                .url(baseUrl +token)
                .post(RequestBody.create(MEDIA_TYPE, ""))
                .build();
    }
}
