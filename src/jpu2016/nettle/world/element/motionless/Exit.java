package jpu2016.nettle.world.element.motionless;

import jpu2016.nettle.world.element.Permeability;
import jpu2016.nettle.world.element.Sprite;

class Exit extends MotionlessElement {

	public Exit() {
		super(new Sprite("┌┐", "exit.png"), Permeability.PENETRABLE, 'E');
	}

	@Override
	public ActionOnHeroes getActionOnHeroes() {
		return ActionOnHeroes.EXIT;
	}

}
