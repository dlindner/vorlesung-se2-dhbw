package de.dhbw.tit07.progress.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import de.dhbw.tit07.progress.model.ProgressListener;
import de.dhbw.tit07.progress.types.Percent;

public class Visualization implements ProgressListener {

	private static final int PREFERRED_WIDTH = 600;
	private final JFrame frame;
	private final JProgressBar progress;

	public Visualization() {
		super();
		this.frame = new JFrame("We are making progress here"); //$NON-NLS-1$
		this.progress = new JProgressBar(0, PREFERRED_WIDTH);
	}

	private void buildUI() {
		JPanel content = new JPanel();
		content.setLayout(new BorderLayout());
		this.progress.setBorder(BorderFactory.createEmptyBorder(10, 13, 10, 13));
		this.progress.setPreferredSize(new Dimension(PREFERRED_WIDTH, this.progress.getPreferredSize().height));
		content.add(this.progress, BorderLayout.CENTER);
		this.frame.setContentPane(content);
	}

	public void show() {
		buildUI();
		this.frame.pack();
		this.frame.setLocationRelativeTo(null);
		this.frame.setVisible(true);
	}

	protected JFrame getFrame() {
		return this.frame;
	}

	protected JProgressBar getProgress() {
		return this.progress;
	}

	@Override
	public void finished() {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				getFrame().setVisible(false);
			}
		});
	}

	@Override
	public void progressing(final Percent percentage) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				getProgress().setValue((int) (percentage.getValue() * getExpansionFactor()));
			}
		});
	}

	protected double getExpansionFactor() {
		return (PREFERRED_WIDTH / 100.0d);
	}
}
