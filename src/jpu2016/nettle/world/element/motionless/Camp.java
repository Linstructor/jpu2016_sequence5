package jpu2016.nettle.world.element.motionless;

import jpu2016.nettle.world.element.Permeability;
import jpu2016.nettle.world.element.Sprite;

class Camp extends MotionlessElement {

	public Camp() {
		super(new Sprite("┌┐", "camp.jpg"), Permeability.PENETRABLE, 'C');
	}

	@Override
	public ActionOnHeroes getActionOnHeroes() {
		return ActionOnHeroes.ENTER_CAMP;
	}

}
