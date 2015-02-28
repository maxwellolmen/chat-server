package dev.Maxxwell.chat.server;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Display extends JFrame {
	public static Accept a = new Accept();
	
	private static final long serialVersionUID = 1L;
	
	private JTextArea jtao = new JTextArea(10, 15);
	private JButton stop = new JButton("Stop Server");
	public Display(float version) {
		super("Chatting Server v" + version);
		setSize(500, 500);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setVisible(true);
		Container cp = getContentPane();
		jtao.setEditable(false);
		cp.add(jtao);
		stop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		cp.add(stop);
		a.start();
	}
	
	public static Accept getAccept() {
		return a;
	}
	
	public static void addLine(String line) {
		
	}
}
