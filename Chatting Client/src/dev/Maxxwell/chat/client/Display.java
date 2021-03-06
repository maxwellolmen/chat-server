package dev.Maxxwell.chat.client;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Display extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private JTextArea jtao = new JTextArea(20, 30);
	private JTextArea jtai = new JTextArea(1, 30);
	private JButton send = new JButton("Send");
	private JButton address = new JButton("Change Address");
	private JButton stop = new JButton("Stop Client");
	public Display(String version) {
		super("Chatting Client v" + version);
		setSize(500, 360);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setVisible(true);
		Container cp = getContentPane();
		jtao.setEditable(false);
		cp.add(jtao);
		cp.add(jtai);
		send.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		cp.add(send);
		address.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		cp.add(address);
		stop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
}
