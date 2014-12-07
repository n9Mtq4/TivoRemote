package com.n9mtq4.tivoremote.buttons;

import com.n9mtq4.tivoremote.ButtonMap;
import com.n9mtq4.tivoremote.TivoRemote;

import java.awt.event.MouseEvent;

/**
 * Created by Will on 11/15/14.
 */
public class Num7 extends ButtonMap {
	
	public Num7(TivoRemote parent) {
		super(parent, 43, 404, 65, 415);
	}
	
	@Override
	public void mousePress(MouseEvent e) {
		sendIrCode("num7");
	}
	
}
