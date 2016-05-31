package jpu2016.nettle.world.element.mobile;

import jpu2016.nettle.world.element.ISprite;

public class Monster extends Mobile {

    Animate animate;

    public Monster(ISprite sprite, Animate animate) {
        super(sprite);
        this.animate = animate;
    }
}
