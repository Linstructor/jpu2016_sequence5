package jpu2016.nettle.world.element.motionless;

import jpu2016.nettle.world.element.Permeability;
import jpu2016.nettle.world.element.Sprite;

class Forest extends MotionlessElement {

	public Forest() {
		super(new Sprite("♠♣", "forest.png"), Permeability.BLOCKING, 'F');
	}

}
