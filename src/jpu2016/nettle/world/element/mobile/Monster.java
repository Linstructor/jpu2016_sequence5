package jpu2016.nettle.world.element.mobile;

import jpu2016.nettle.world.element.ISprite;

public abstract class Monster extends Mobile implements Animate {

    Animate animate;

    public Monster(ISprite sprite, Animate animate) {
        super(sprite);
        this.animate = animate;
    }
}
