package de.dhbw.tinf12b3.pattern.observer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TruthAboutExceptions {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		final JFrame frame = new JFrame("Nicht drücken");
		final JButton button = new JButton("Nicht drücken");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("NOOOOO! says " + Thread.currentThread().getName());
				try {
					Thread.sleep(5000L);
				} catch (InterruptedException e1) {
					Thread.interrupted();
				}
			}
		});
		frame.add(button);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
	}

}
