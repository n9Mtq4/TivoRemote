package com.n9mtq4.tivoremote.buttons;

import com.n9mtq4.tivoremote.ButtonMap;
import com.n9mtq4.tivoremote.TivoRemote;

import java.awt.*;
import java.awt.event.MouseEvent;

/**
 * Created by Will on 11/15/14.
 */
public class Play extends ButtonMap {
	
	public Play(TivoRemote parent) {
		super(parent, new Rectangle(18, 18), 74, 255);
	}
	
	@Override
	public void mousePress(MouseEvent e) {
		sendIrCode("play");
	}
	
}
