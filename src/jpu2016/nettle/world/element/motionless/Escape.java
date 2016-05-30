package jpu2016.nettle.world.element.motionless;

import jpu2016.nettle.world.element.Permeability;
import jpu2016.nettle.world.element.Sprite;

class Escape extends MotionlessElement {

	public Escape() {
		super(new Sprite("┌┐", "escape.png"), Permeability.PENETRABLE, 'e');
	}

	@Override
	public ActionOnHeroes getActionOnHeroes() {
		return ActionOnHeroes.ESCAPE;
	}

}
