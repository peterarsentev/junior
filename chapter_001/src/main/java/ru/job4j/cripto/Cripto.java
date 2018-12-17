package ru.job4j.cripto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Cripto {
    public static void main(String[] args) throws IOException {
        String ulr = "https://indodax.com/api/btc_idr/depth";

        URLConnection connection = new URL(ulr).openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            System.out.println(inputLine);
        }
        in.close();
    }
}
