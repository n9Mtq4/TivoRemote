package com.n9mtq4.tivoremote.buttons;

import com.n9mtq4.tivoremote.ButtonMap;
import com.n9mtq4.tivoremote.TivoRemote;

import java.awt.event.MouseEvent;

/**
 * Created by Will on 11/15/14.
 */
public class Num0 extends ButtonMap {
	
	public Num0(TivoRemote parent) {
		super(parent, 72, 421, 93, 433);
	}
	
	@Override
	public void mousePress(MouseEvent e) {
		sendIrCode("num0");
	}
	
}
