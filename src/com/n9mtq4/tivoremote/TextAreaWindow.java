package com.n9mtq4.tivoremote;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Will on 7/1/14.
 */
public class TextAreaWindow {

	public static Dimension DEFAULT_SIZE = new Dimension(320, 240);

	private JFrame frame;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JButton button;

	public TextAreaWindow(String title, String msg, JFrame centerOn) {

		gui(title, msg, "OK", JFrame.DISPOSE_ON_CLOSE, TextAreaWindow.DEFAULT_SIZE, centerOn);

	}

	public TextAreaWindow(String title, String msg, String buttonText, int closeOperation, Dimension size, JFrame centerOn) {

		gui(title, msg, buttonText, closeOperation, size, centerOn);

	}

	public void gui(String title, String msg, String buttonText, int closeOperation, Dimension size, JFrame centerOn) {

		frame = new JFrame(title);
		frame.setDefaultCloseOperation(closeOperation);

		button = new JButton(buttonText);
		textArea = new JTextArea(msg);
		scrollPane = new JScrollPane(textArea);

		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

		frame.add(scrollPane, BorderLayout.CENTER);
		frame.add(button, BorderLayout.SOUTH);

		frame.pack();;
		frame.setSize(size);
		frame.setLocationRelativeTo(centerOn);
		frame.setVisible(true);

		frame.getRootPane().setDefaultButton(button);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				onButtonPress(button);
			}
		});

	}

	public void onButtonPress(JButton pressedButton) {

		frame.dispose();

	}

}
