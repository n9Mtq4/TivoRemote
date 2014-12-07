package com.n9mtq4.tivoremote.buttons;

import com.n9mtq4.tivoremote.ButtonMap;
import com.n9mtq4.tivoremote.TivoRemote;

import java.awt.event.MouseEvent;

/**
 * Created by Will on 11/15/14.
 */
public class Advance extends ButtonMap {
	
	public Advance(TivoRemote parent) {
		super(parent, 107, 326, 121, 341);
	}
	
	@Override
	public void mousePress(MouseEvent e) {
		sendIrCode("advance");
	}
	
}
