package jpu2016.nettle;

import java.io.IOException;

import javax.swing.SwingUtilities;

import jpu2016.nettle.play.NettlePlay;
import jpu2016.nettle.view.INettleFrame;
import jpu2016.nettle.view.NettleFrame;
import jpu2016.nettle.world.INettleWorld;
import jpu2016.nettle.world.NettleWorld;

public final class Nettle implements Runnable {
	private final INettleWorld	nettleWorld;
	private final NettlePlay		nettlePlay;
	private INettleFrame				nettleFrame;

	public Nettle() throws IOException {
		this.nettleWorld = new NettleWorld("nettleWorld.txt");
		this.nettlePlay = new NettlePlay(this.nettleWorld);
		SwingUtilities.invokeLater(this);
	}

	@Override
	public void run() {
		this.nettleFrame = new NettleFrame("Welcome to NettleWorld", this.getNettleWorld(), this.getNettlePlay());
		this.nettlePlay.setNettleFrame(this.nettleFrame);
	}

	private INettleWorld getNettleWorld() {
		return this.nettleWorld;
	}

	private NettlePlay getNettlePlay() {
		return this.nettlePlay;
	}
}
