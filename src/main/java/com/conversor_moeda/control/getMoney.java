package com.conversor_moeda.control;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;

public class getMoney {

    public static String getMoeda(String moeda) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("https://economia.awesomeapi.com.br/last/" + moeda + "-BRL"))
                .timeout(Duration.ofSeconds(30))
                .build();

        HttpClient httpClient = HttpClient.newBuilder()
                .build();

        HttpResponse<String> response = httpClient.send(request, BodyHandlers.ofString());
        String res = response.body();
        String value = res.substring(res.indexOf("\"ask\":") + 7, res.indexOf("times") - 5);
        return value;
    }
}
