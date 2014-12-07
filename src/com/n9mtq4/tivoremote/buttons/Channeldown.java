package com.n9mtq4.tivoremote.buttons;

import com.n9mtq4.tivoremote.ButtonMap;
import com.n9mtq4.tivoremote.TivoRemote;

import java.awt.event.MouseEvent;

/**
 * Created by Will on 11/15/14.
 */
public class Channeldown extends ButtonMap {
	
	public Channeldown(TivoRemote parent) {
		super(parent, 95, 221, 118, 238);
	}
	
	@Override
	public void mousePress(MouseEvent e) {
		sendIrCode("channeldown");
	}
	
}
