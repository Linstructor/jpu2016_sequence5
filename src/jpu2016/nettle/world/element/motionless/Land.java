package jpu2016.nettle.world.element.motionless;

import jpu2016.nettle.world.element.Permeability;
import jpu2016.nettle.world.element.Sprite;

class Land extends MotionlessElement {

	public Land() {
		super(new Sprite("░░", "land.jpg"), Permeability.PENETRABLE, 'L');
	}

}
