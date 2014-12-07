package com.n9mtq4.tivoremote.buttons;

import com.n9mtq4.tivoremote.ButtonMap;
import com.n9mtq4.tivoremote.TivoRemote;

import java.awt.event.MouseEvent;

/**
 * Created by Will on 11/15/14.
 */
public class Num1 extends ButtonMap {
	
	public Num1(TivoRemote parent) {
		super(parent, 44, 364, 64, 377);
	}
	
	@Override
	public void mousePress(MouseEvent e) {
		sendIrCode("num1");
	}
	
}
