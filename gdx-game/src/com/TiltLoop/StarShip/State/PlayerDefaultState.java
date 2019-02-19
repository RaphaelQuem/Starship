package com.TiltLoop.StarShip.State;
import com.TiltLoop.StarShip.Base.*;
import com.badlogic.gdx.*;

public class PlayerDefaultState extends BaseState
{
	public PlayerDefaultState()
	{ 
		super.setStateAnimation(AnimationHelper.GetAnimationFromSpritesheet("starship.png",1,1,0.1f));
		
	}
	
	@Override
	public void Update()
	{
		if(Gdx.input.isTouched())
			super.getGameObject().getTransform().setCenter( Gdx.input.getX(),Gdx.input.getY());
		
		
		
		
		GameResources.SpriteBatch.draw(getStateAnimation().getKeyFrame(super.getStateTime(), true), getGameObject().getTransform().getCanvas().x,getGameObject().getTransform().getCanvas().y, getGameObject().getTransform().getCanvas().width, getGameObject().getTransform().getCanvas().height);
	}
	
	
}
