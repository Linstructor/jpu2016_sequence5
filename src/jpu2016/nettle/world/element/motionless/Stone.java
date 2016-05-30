package jpu2016.nettle.world.element.motionless;

import jpu2016.nettle.world.element.Permeability;
import jpu2016.nettle.world.element.Sprite;

class Stone extends MotionlessElement {

	public Stone() {
		super(new Sprite("■▀", "stone.png"), Permeability.BLOCKING, 'S');
	}

}
