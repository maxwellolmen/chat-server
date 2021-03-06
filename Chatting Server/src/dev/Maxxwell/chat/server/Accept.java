package dev.Maxxwell.chat.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Accept extends Thread {
	public static ArrayList<Socket> sockets = new ArrayList<Socket>();
	
	@SuppressWarnings("resource")
	public void run() {
		try {
			ServerSocket ss = new ServerSocket(7403);
			while (true) {
				Socket s = ss.accept();
				BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
				Distribute dst = new Distribute(in);
				dst.start();
				sockets.add(s);
			}
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "An error occured while trying to start the server.");
		}
	}
	
	public static ArrayList<Socket> getClients() {
		return sockets;
	}
}
