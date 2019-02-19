package com.TiltLoop.StarShip.Entities;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.math.*;
import com.badlogic.gdx.*;
import com.TiltLoop.StarShip.Base.*;

public class CameraHolder extends GameObject
{
	public CameraHolder()
	{
		
		GameResources.Camera = new OrthographicCamera(1280f, 720f);
		GameResources.Camera.position.set(1280f/2f,720f/2f,10f);
		GameResources.Camera.update();
		
		this.setState(new BaseState());
	}

	@Override
	public void Update()
	{ 
		
		if(GameResources.ShakeTime >0f)
		{
			GameResources.ShakeTime-=Gdx.graphics.getDeltaTime();
			GameResources.Camera.position.x += MathUtils.random(-10f, 10f);
			GameResources.Camera.position.y += MathUtils.random(-10f, 10f);
			//Gdx.input.vibrate(1);
			
		}

		
		
		//GameResources.SpriteBatch.draw(GameResources.Level.getBackground(),GameResources.Camera.position.x,GameResources.Camera.position.y);
		//GameResources.Camera.update();
	//
		
		
	}
	
}
