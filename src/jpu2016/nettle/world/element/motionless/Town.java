package jpu2016.nettle.world.element.motionless;

import jpu2016.nettle.world.element.Permeability;
import jpu2016.nettle.world.element.Sprite;

class Town extends MotionlessElement {

	public Town() {
		super(new Sprite("╔╗", "town.png"), Permeability.PENETRABLE, 'T');
	}

	@Override
	public ActionOnHeroes getActionOnHeroes() {
		return ActionOnHeroes.ENTER_TOWN;
	}
}
