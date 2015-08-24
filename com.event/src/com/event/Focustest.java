package com.event;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Focustest {
	private static JButton b1;
	private static JButton b2;

	public static void main(String[] inArgs) {
		JFrame f = new JFrame("focus test");

		Container c = f.getContentPane();

		JPanel p = new JPanel(new GridLayout(1, 2));
		c.add(p);

		b1 = new JButton("button 1");
		p.add(b1);
		b1.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent inEvent) {
				System.out.println("button 1 gained the focus");
			}

			public void focusLost(FocusEvent inEvent) {
				System.out.println("button 1 lost the focus");
			}
		});
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent inEvent) {
				FocusEvent aEvent = new FocusEvent(b2, FocusEvent.FOCUS_GAINED);
				Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(aEvent);
			}
		});

		b2 = new JButton("button 2");
		p.add(b2);
		b2.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent inEvent) {
				System.out.println("button 2 gained the focus");
			}

			public void focusLost(FocusEvent inEvent) {
				System.out.println("button 2 lost the focus");
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent inEvent) {
				FocusEvent aEvent = new FocusEvent(b1, FocusEvent.FOCUS_GAINED);
				Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(aEvent);
			}
		});

		f.pack();
		f.show();
	}

}
