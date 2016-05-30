package jpu2016.nettle.world.element.motionless;

import jpu2016.nettle.world.element.Permeability;
import jpu2016.nettle.world.element.Sprite;

class Monastery extends MotionlessElement {

	public Monastery() {
		super(new Sprite("⌂⌂", "monastery.png"), Permeability.PENETRABLE, 'M');
	}

	@Override
	public ActionOnHeroes getActionOnHeroes() {
		return ActionOnHeroes.ENTER_MONASTERY;
	}
}
