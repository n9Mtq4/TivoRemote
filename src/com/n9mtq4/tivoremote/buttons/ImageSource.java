package com.n9mtq4.tivoremote.buttons;

import com.n9mtq4.tivoremote.ButtonMap;
import com.n9mtq4.tivoremote.TextAreaWindow;
import com.n9mtq4.tivoremote.TivoRemote;

import java.awt.event.MouseEvent;

/**
 * Created by Will on 12/7/14.
 */
public class ImageSource extends ButtonMap {
	public ImageSource(TivoRemote parent) {
		super(parent, 65, 449, 107, 482);
	}
	
	@Override
	public void mousePress(MouseEvent e) {
//		http://www.tivopedia.com/images/s2-humax.png
		new TextAreaWindow("Image Source", "I got this image from\n" +
				                                   "www.tivopedia.com\n" +
				                                   "http://www.tivopedia.com/images/s2-humax.png", getParent().getFrame());
	}
}
