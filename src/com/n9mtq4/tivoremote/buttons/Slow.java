package com.n9mtq4.tivoremote.buttons;

import com.n9mtq4.tivoremote.ButtonMap;
import com.n9mtq4.tivoremote.TivoRemote;

import java.awt.event.MouseEvent;

/**
 * Created by Will on 11/15/14.
 */
public class Slow extends ButtonMap {
	
	public Slow(TivoRemote parent) {
		super(parent, 73, 312, 91, 332);
	}
	
	@Override
	public void mousePress(MouseEvent e) {
		sendIrCode("slow");
	}
	
}
