package com.n9mtq4.tivoremote.buttons;

import com.n9mtq4.tivoremote.ButtonMap;
import com.n9mtq4.tivoremote.TivoRemote;

import java.awt.event.MouseEvent;

/**
 * Created by Will on 11/15/14.
 */
public class Num5 extends ButtonMap {
	
	public Num5(TivoRemote parent) {
		super(parent, 72, 385, 93, 396);
	}
	
	@Override
	public void mousePress(MouseEvent e) {
		sendIrCode("num5");
	}
	
}
