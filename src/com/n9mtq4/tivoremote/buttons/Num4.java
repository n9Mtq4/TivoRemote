package com.n9mtq4.tivoremote.buttons;

import com.n9mtq4.tivoremote.ButtonMap;
import com.n9mtq4.tivoremote.TivoRemote;

import java.awt.event.MouseEvent;

/**
 * Created by Will on 11/15/14.
 */
public class Num4 extends ButtonMap {
	
	public Num4(TivoRemote parent) {
		super(parent, 43, 383, 66, 394);
	}
	
	@Override
	public void mousePress(MouseEvent e) {
		sendIrCode("num4");
	}
	
}
