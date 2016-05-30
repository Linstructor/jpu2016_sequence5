package jpu2016.nettle.world.element.motionless;

import jpu2016.nettle.world.element.Permeability;
import jpu2016.nettle.world.element.Sprite;

class Door extends MotionlessElement {

	public Door() {
		super(new Sprite("┌┐", "door.png"), Permeability.PENETRABLE, 'd');
	}
}
