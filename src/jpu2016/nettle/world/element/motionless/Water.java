package jpu2016.nettle.world.element.motionless;

import jpu2016.nettle.world.element.Permeability;
import jpu2016.nettle.world.element.Sprite;

class Water extends MotionlessElement {

	public Water() {
		super(new Sprite("~~", "water.png"), Permeability.BLOCKING, 'W');
	}

}
