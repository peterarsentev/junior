package ru.job4j.http;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringJoiner;

public class HttpServer {
    public static void main(String[] args) throws IOException {
        try (ServerSocket server = new ServerSocket(9000)) {
            while (true) {
                Socket socket = server.accept();
                try (
                        OutputStream out = socket.getOutputStream();
                        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                ) {
                    StringBuilder text = new StringBuilder();
                    while (in.ready()) {
                        text.append(in.readLine()).append(System.lineSeparator());
                    }
                    StringJoiner txt = new StringJoiner("\r\n")
                            .add("HTTP/1.1 200 OK")
                            .add("\r\n")
                            .add(text);
                    out.write(txt.toString().getBytes());
                }
            }
        }
    }
}
