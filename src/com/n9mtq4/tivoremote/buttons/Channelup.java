package com.n9mtq4.tivoremote.buttons;

import com.n9mtq4.tivoremote.ButtonMap;
import com.n9mtq4.tivoremote.TivoRemote;

import java.awt.event.MouseEvent;

/**
 * Created by Will on 11/15/14.
 */
public class Channelup extends ButtonMap {
	
	public Channelup(TivoRemote parent) {
		super(parent, 98, 200, 119, 216);
	}
	
	@Override
	public void mousePress(MouseEvent e) {
		sendIrCode("channelup");
	}
	
}
