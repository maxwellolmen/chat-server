package dev.Maxxwell.chat.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Distribute extends Thread {
	private BufferedReader in;
	
	public Distribute(BufferedReader in) {
		this.in = in;
	}
	
	public void run() {
		try {
			String line = in.readLine();
			ArrayList<Socket> clients = Accept.sockets;
			for (Socket client : clients) {
				new PrintWriter(client.getOutputStream(), true).println(line);
			}
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "An error occured while communicating with a client.");
		}
	}
}
