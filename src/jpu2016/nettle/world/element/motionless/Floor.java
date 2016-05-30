package jpu2016.nettle.world.element.motionless;

import jpu2016.nettle.world.element.Permeability;
import jpu2016.nettle.world.element.Sprite;

class Floor extends MotionlessElement {

	public Floor() {
		super(new Sprite("  ", "floor.jpg"), Permeability.PENETRABLE, 'f');
	}

}
