package com.n9mtq4.tivoremote.buttons;

import com.n9mtq4.tivoremote.ButtonMap;
import com.n9mtq4.tivoremote.TivoRemote;

import java.awt.*;
import java.awt.event.MouseEvent;

/**
 * Created by Will on 11/15/14.
 */
public class Thumbsup extends ButtonMap {
	
	public Thumbsup(TivoRemote parent) {
		super(parent, new Rectangle(24, 31), 102, 157);
	}
	
	@Override
	public void mousePress(MouseEvent e) {
		sendIrCode("thumbsup");
	}
	
}
