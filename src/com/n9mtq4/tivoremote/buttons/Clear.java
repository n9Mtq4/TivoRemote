package com.n9mtq4.tivoremote.buttons;

import com.n9mtq4.tivoremote.ButtonMap;
import com.n9mtq4.tivoremote.TivoRemote;

import java.awt.event.MouseEvent;

/**
 * Created by Will on 11/15/14.
 */
public class Clear extends ButtonMap {
	
	public Clear(TivoRemote parent) {
		super(parent, 46, 425, 64, 437);
	}
	
	@Override
	public void mousePress(MouseEvent e) {
		sendIrCode("clear");
	}
	
}
