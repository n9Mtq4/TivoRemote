package com.n9mtq4.tivoremote;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by Will on 11/15/14.
 */
public abstract class ButtonMap implements MouseListener {
	
	private TivoRemote parent;
	private Shape shape;
	private int x;
	private int y;
	
	public abstract void mousePress(MouseEvent e);
	
	public ButtonMap(TivoRemote parent, int x, int y, int x1, int y1) {
		this.parent = parent;
		this.shape = new Rectangle(x1 - x, y1 - y);
		this.x = x;
		this.y = y;
	}
	
	public ButtonMap(TivoRemote parent, Shape shape, int x, int y) {
		this.parent = parent;
		this.shape = shape;
		this.x = x;
		this.y = y;
	}
	
	public void send(String string) {
		parent.getProtocol().send(string);
	}
	
	public void sendIrCode(String code) {
		parent.getProtocol().sendIrCode(code);
	}
	
	@Override
	public void mouseClicked(MouseEvent mouseEvent) {
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		
		if (shape.contains(e.getX() - x, e.getY() - y)) {
			mousePress(e);
		}
		
	}
	
	@Override
	public void mouseReleased(MouseEvent mouseEvent) {
		
	}
	
	@Override
	public void mouseEntered(MouseEvent mouseEvent) {
		
	}
	
	@Override
	public void mouseExited(MouseEvent mouseEvent) {
		
	}
	
	public TivoRemote getParent() {
		return parent;
	}
	
}
