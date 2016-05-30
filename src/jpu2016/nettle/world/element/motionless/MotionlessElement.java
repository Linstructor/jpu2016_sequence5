package jpu2016.nettle.world.element.motionless;

import jpu2016.nettle.world.element.Element;
import jpu2016.nettle.world.element.ISprite;
import jpu2016.nettle.world.element.Permeability;

public abstract class MotionlessElement extends Element implements IDoActionOnHeroes {
	private final char fileSymbol;

	public MotionlessElement(final ISprite sprite, final Permeability permeability, final char fileSymbol) {
		super(sprite, permeability);
		this.fileSymbol = fileSymbol;
	}

	public char getFileSymbol() {
		return this.fileSymbol;
	}

	@Override
	public ActionOnHeroes getActionOnHeroes() {
		return ActionOnHeroes.NOP;
	}
}