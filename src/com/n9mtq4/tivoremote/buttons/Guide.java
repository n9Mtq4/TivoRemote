package com.n9mtq4.tivoremote.buttons;

import com.n9mtq4.tivoremote.ButtonMap;
import com.n9mtq4.tivoremote.TivoRemote;

import java.awt.*;
import java.awt.event.MouseEvent;

/**
 * Created by Will on 11/15/14.
 */
public class Guide extends ButtonMap {
	
	public Guide(TivoRemote parent) {
		super(parent, new Rectangle(17, 20), 110, 131);
	}
	
	@Override
	public void mousePress(MouseEvent e) {
		sendIrCode("guide");
	}
	
}
