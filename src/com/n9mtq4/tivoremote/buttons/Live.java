package com.n9mtq4.tivoremote.buttons;

import com.n9mtq4.tivoremote.ButtonMap;
import com.n9mtq4.tivoremote.TivoRemote;

import java.awt.*;
import java.awt.event.MouseEvent;

/**
 * Created by Will on 11/15/14.
 */
public class Live extends ButtonMap {
	
	public Live(TivoRemote parent) {
		super(parent, new Rectangle(19, 22), 102, 82);
	}
	
	@Override
	public void mousePress(MouseEvent e) {
		sendIrCode("livetv");
	}
	
}
