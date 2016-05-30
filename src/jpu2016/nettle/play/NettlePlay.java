package jpu2016.nettle.play;

import java.io.IOException;

import jpu2016.nettle.view.INettleFrame;
import jpu2016.nettle.view.NettleView;
import jpu2016.nettle.world.INettleWorld;
import jpu2016.nettle.world.NettleWorld;
import jpu2016.nettle.world.element.mobile.Hero;
import jpu2016.nettle.world.element.motionless.IDoActionOnHeroes;

public class NettlePlay implements IOrderPerformed {
	private final INettleWorld	nettleWorld;
	private INettleWorld				nettleMeeting;
	private INettleFrame				nettleFrame;
	private int									playMode;

	public NettlePlay(final INettleWorld nettleWorld) {
		this.nettleWorld = nettleWorld;
		this.nettleWorld.addMobile(new Hero(), 15, 15);
	}

	private INettleWorld getNettleWorld() {
		return this.nettleWorld;
	}

	private INettleWorld getNettleMeeting() {
		return this.nettleMeeting;
	}

	private INettleFrame getNettleFrame() {
		return this.nettleFrame;
	}

	public void setNettleFrame(final INettleFrame nettleFrame) {
		this.nettleFrame = nettleFrame;
	}

	private int getPlayMode() {
		return this.playMode;
	}

	private void setPlayMode(final int playMode) {
		this.playMode = playMode;
		this.getNettleFrame().setViewMode(playMode);
	}

	private INettleWorld getActuelNettleWorld() {
		if (this.getPlayMode() == NettleView.VIEW_MODE_MEETING) {
			return this.getNettleMeeting();
		}
		return this.getNettleWorld();
	}

	@Override
	public void orderPerform(final UserOrder userOrder) throws IOException {
		switch (userOrder) {
			case UP:
				this.getActuelNettleWorld().getHero().moveUp();
				break;
			case RIGHT:
				this.getActuelNettleWorld().getHero().moveRight();
				break;
			case DOWN:
				this.getActuelNettleWorld().getHero().moveDown();
				break;
			case LEFT:
				this.getActuelNettleWorld().getHero().moveLeft();
				break;
			case NOP:
			default:
				break;
		}
		this.getWorldAnswer();
	}

	private void resolveEnterCamp() throws IOException {
		this.setNettleMeeting(new NettleWorld("camp.txt"));
		this.resolveWorldAnswer();
	}

	private void resolveEnterTown() throws IOException {
		this.setNettleMeeting(new NettleWorld("town.txt"));
		this.resolveWorldAnswer();
	}

	private void resolveEnterMonastery() throws IOException {
		this.setNettleMeeting(new NettleWorld("monastery.txt"));
		this.resolveWorldAnswer();
	}

	private void resolveWorldAnswer() throws IOException {
		this.getNettleMeeting().addMobile(new Hero(), 0, 0);
		this.getNettleFrame().setMeeting(this.getNettleMeeting());
		this.setPlayMode(NettleView.VIEW_MODE_MEETING);
	}

	private void exitMetting() throws IOException {
		this.setPlayMode(NettleView.VIEW_MODE_MAP);
	}

	private void escapeMetting() throws IOException {
		this.exitMetting();
		this.getActuelNettleWorld().getHero().moveBack();
	}

	private void getWorldAnswer() throws IOException {
		final IDoActionOnHeroes element = this.getActuelNettleWorld().getElements(this.getActuelNettleWorld().getHero().getX(),
				this.getActuelNettleWorld().getHero().getY());

		switch (element.getActionOnHeroes()) {
			case ENTER_CAMP:
				NettleView.displayMessage("You enter a camp.");
				this.resolveEnterCamp();
				break;
			case ENTER_TOWN:
				NettleView.displayMessage("You enter a town.");
				this.resolveEnterTown();
				break;
			case ENTER_MONASTERY:
				NettleView.displayMessage("You enter a monastery.");
				this.resolveEnterMonastery();
				break;
			case EXIT:
				NettleView.displayMessage("You leave this place.");
				this.exitMetting();
				break;
			case ESCAPE:
				NettleView.displayMessage("You escape this place.");
				this.escapeMetting();
				break;
			case NOP:
			default:
				break;
		}
	}

	private void setNettleMeeting(final INettleWorld nettleMeeting) {
		this.nettleMeeting = nettleMeeting;
	}
}
