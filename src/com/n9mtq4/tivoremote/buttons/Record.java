package com.n9mtq4.tivoremote.buttons;

import com.n9mtq4.tivoremote.ButtonMap;
import com.n9mtq4.tivoremote.TivoRemote;

import java.awt.event.MouseEvent;

/**
 * Created by Will on 11/15/14.
 */
public class Record extends ButtonMap {
	
	public Record(TivoRemote parent) {
		super(parent, 73, 223, 90, 243);
	}
	
	@Override
	public void mousePress(MouseEvent e) {
		sendIrCode("record");
	}
	
}
