package jpu2016.nettle.world;

import java.util.ArrayList;
import java.util.Observer;

import jpu2016.nettle.world.element.Element;
import jpu2016.nettle.world.element.mobile.Hero;
import jpu2016.nettle.world.element.mobile.Mobile;
import jpu2016.nettle.world.element.motionless.MotionlessElement;

public interface INettleWorld {

	public int getWidth();

	public int getHeight();

	public MotionlessElement getElements(int x, int y);

	public Hero getHero();

	public void addMobile(Mobile mobile, int x, int y);

	public void addMobile(Hero hero, int x, int y);

	public void setMobileHasChanged();

	public Element[][] getElements();

	public ArrayList<Mobile> getMobiles();

	public void addObserver(Observer o);
}