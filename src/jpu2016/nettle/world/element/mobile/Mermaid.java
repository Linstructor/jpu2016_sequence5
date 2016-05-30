package jpu2016.nettle.world.element.mobile;

import jpu2016.nettle.world.element.Sprite;

import java.awt.*;

/**
 * Created by Tristan on 30/05/2016.
 */
public class Mermaid extends Swimming {

    private final Point position;

    public Mermaid(Point position) {
        super(new Sprite("~~", "mermaid.png"));
        this.position = new Point();
        this.position.setLocation(this.getPosition().x, this.getPosition().y);
    }

    private void saveLastPosition() {
        if ((this.position.getX() != this.getPosition().getX()) || (this.position.getY() != this.getPosition().getY())) {
            this.position.setLocation(this.getPosition().x, this.getPosition().y);
        }
    }
}
