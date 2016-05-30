package jpu2016.nettle.world.element.mobile;

import jpu2016.nettle.world.element.ISprite;

public class Monster extends Mobile implements Animate {

    Animate animate;

    public Monster(ISprite sprite) {
        super(sprite);
        this.animate = animate;
    }

    @Override
    public void animate() {

    }
}
