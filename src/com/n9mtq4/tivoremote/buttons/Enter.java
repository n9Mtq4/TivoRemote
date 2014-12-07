package com.n9mtq4.tivoremote.buttons;

import com.n9mtq4.tivoremote.ButtonMap;
import com.n9mtq4.tivoremote.TivoRemote;

import java.awt.event.MouseEvent;

/**
 * Created by Will on 11/15/14.
 */
public class Enter extends ButtonMap {
	
	public Enter(TivoRemote parent) {
		super(parent, 102, 425, 119, 436);
	}
	
	@Override
	public void mousePress(MouseEvent e) {
		sendIrCode("enter");
	}
	
}
