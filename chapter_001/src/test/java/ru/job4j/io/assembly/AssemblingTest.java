package ru.job4j.io.assembly;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.Socket;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AssemblingTest {

    @Test
    public void readLinuxSeparator() throws IOException {
        var socket = mock(Socket.class);
        var data = "Hi\nExit";
        ByteArrayInputStream input = new ByteArrayInputStream(data.getBytes());
        when(socket.getInputStream()).thenReturn(input);
        Assembling assembling = new Assembling("\n");
        assembling.setInputReader(socket);
        assertThat(assembling.inputLine(), is("Hi"));
    }

    @Test
    public void readWindowsSeparator() throws IOException {
        var socket = mock(Socket.class);
        var data = "Hi\r\nExit";
        ByteArrayInputStream input = new ByteArrayInputStream(data.getBytes());
        when(socket.getInputStream()).thenReturn(input);
        Assembling assembling = new Assembling("\r\n");
        assembling.setInputReader(socket);
        assertThat(assembling.inputLine(), is("Hi"));
    }
}