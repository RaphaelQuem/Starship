package com.TiltLoop.StarShip.Entities;
import com.TiltLoop.StarShip.Base.*;
import com.badlogic.gdx.graphics.g2d.*;

public class Shot extends GameObject
{
	private String projectileStyle;
	private String projectileColor;
	private Animation animation;
	public Shot(float x, float y)
	{
		animation = AnimationHelper.GetAnimationFromSpritesheet("shot-round-red.png",1,1,0.1f);
		
		super.setTransform(new Transform(x,y,5,1,100,100));
	}

	@Override
	public void Update()
	{
		super.getTransform().addY(30);
		GameResources.SpriteBatch.draw(animation.getKeyFrame(1, true), getTransform().getCanvas().x,getTransform().getCanvas().y, getTransform().getCanvas().width, getTransform().getCanvas().height);
	}
	
	
}
