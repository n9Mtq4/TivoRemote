package com.n9mtq4.tivoremote;

import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

/**
 * Created by Will on 11/15/14.
 */
public class TivoProtocol {
	
	private String ip;
	private int port;
	private Socket s;
	
	public TivoProtocol(String ip) {
		this.ip = ip;
		this.port = 31339;
	}
	
	public void connect(String ip) {
		
		try {
			if (s == null || !s.isConnected()) {
				s = new Socket();
				s.setSoTimeout(2000);
				s.connect((SocketAddress) new InetSocketAddress(ip, port));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void send(String string) {
		
		try {
			
			connect(ip);
			
			PrintWriter pw = new PrintWriter(s.getOutputStream());
			pw.print(string);
			pw.flush();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void sendIrCode(String code) {
		
		send("IRCODE " + code.toUpperCase() + "\r\n");
		
	}
	
}
