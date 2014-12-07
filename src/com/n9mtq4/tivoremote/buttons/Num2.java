package com.n9mtq4.tivoremote.buttons;

import com.n9mtq4.tivoremote.ButtonMap;
import com.n9mtq4.tivoremote.TivoRemote;

import java.awt.event.MouseEvent;

/**
 * Created by Will on 11/15/14.
 */
public class Num2 extends ButtonMap {
	
	public Num2(TivoRemote parent) {
		super(parent, 72, 365, 93, 376);
	}
	
	@Override
	public void mousePress(MouseEvent e) {
		sendIrCode("num2");
	}
	
}
