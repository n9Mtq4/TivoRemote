package com.n9mtq4.tivoremote.buttons;

import com.n9mtq4.tivoremote.ButtonMap;
import com.n9mtq4.tivoremote.TivoRemote;

import java.awt.event.MouseEvent;

/**
 * Created by Will on 11/15/14.
 */
public class Num6 extends ButtonMap {
	
	public Num6(TivoRemote parent) {
		super(parent, 100, 385, 121, 394);
	}
	
	@Override
	public void mousePress(MouseEvent e) {
		sendIrCode("num6");
	}
	
}
