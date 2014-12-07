package com.n9mtq4.tivoremote;

import com.n9mtq4.tivoremote.buttons.*;
import com.n9mtq4.tivoremote.buttons.Menu;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Will on 11/15/14.
 */
public class TivoRemote {
	
	private JFrame frame;
	private TivoProtocol protocol;
	private ArrayList<ButtonMap> buttons;
	
	public TivoRemote() {
		
		String ip = JOptionPane.showInputDialog("TiVo ip address");
		if (ip == null || ip.trim().equalsIgnoreCase("")) {
			System.exit(0);
		}else {
			protocol = new TivoProtocol(ip);
		}
		buttons = new ArrayList<ButtonMap>();
		gui();
		
	}
	
	public void gui() {
		
		frame = new JFrame("TiVo Remote");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon img = new ImageIcon(this.getClass().getResource("/tivo.png"));
		frame.add(new JLabel(img), BorderLayout.CENTER);
		
		frame.pack();
		frame.setResizable(false);
		frame.setVisible(true);
		frame.pack();
		frame.setLocationRelativeTo(null);
		
		frame.addMouseListener(new GuiListener(this));
		
		initButtons();
		
	}
	
	private void add(ButtonMap map) {
		
		buttons.add(map);
		
	}
	
	private void initButtons() {
		
		add(new Menu(this));
		add(new Up(this));
		add(new Down(this));
		add(new Left(this));
		add(new Right(this));
		add(new Select(this));
		add(new Pause(this));
		add(new Forward(this));
		add(new Reverse(this));
		add(new Thumbsup(this));
		add(new Thumbsdown(this));
		add(new Play(this));
		add(new Info(this));
		add(new Live(this));
		add(new Guide(this));
		add(new Slow(this));
		add(new Replay(this));
		add(new Advance(this));
		add(new Num0(this));
		add(new Num1(this));
		add(new Num2(this));
		add(new Num3(this));
		add(new Num4(this));
		add(new Num5(this));
		add(new Num6(this));
		add(new Num7(this));
		add(new Num8(this));
		add(new Num9(this));
		add(new Record(this));
		add(new Channelup(this));
		add(new Channeldown(this));
		add(new Clear(this));
		add(new Enter(this));
		
	}
	
	public TivoProtocol getProtocol() {
		return protocol;
	}
	
	public JFrame getFrame() {
		return frame;
	}
	
	public ArrayList<ButtonMap> getButtons() {
		return buttons;
	}
	
}
