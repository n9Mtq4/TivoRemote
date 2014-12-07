package com.n9mtq4.tivoremote;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by Will on 11/15/14.
 */
public class GuiListener implements MouseListener {
	
	private TivoRemote parent;
	
	public GuiListener(TivoRemote parent) {
		this.parent = parent;
	}
	
	@Override
	public void mouseClicked(MouseEvent mouseEvent) {
		
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		
		System.out.println(e.getX() + ", " + e.getY());
		for (ButtonMap m : parent.getButtons()) {
			m.mousePressed(e);
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
	
}
