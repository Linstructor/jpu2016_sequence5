package jpu2016.nettle.world.element.motionless;

import jpu2016.nettle.world.element.Permeability;
import jpu2016.nettle.world.element.Sprite;

class Wall extends MotionlessElement {

	public Wall() {
		super(new Sprite("■▀", "wall.png"), Permeability.BLOCKING, 'w');
	}

}
