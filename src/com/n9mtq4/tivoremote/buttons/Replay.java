package com.n9mtq4.tivoremote.buttons;

import com.n9mtq4.tivoremote.ButtonMap;
import com.n9mtq4.tivoremote.TivoRemote;

import java.awt.event.MouseEvent;

/**
 * Created by Will on 11/15/14.
 */
public class Replay extends ButtonMap {
	
	public Replay(TivoRemote parent) {
		super(parent, 43, 326, 60, 342);
	}
	
	@Override
	public void mousePress(MouseEvent e) {
		sendIrCode("replay");
	}
	
}
