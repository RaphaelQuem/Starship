package com.TiltLoop.StarShip.Entities;
import com.TiltLoop.StarShip.Base.*;

public class Shot extends GameObject
{
	private String projectileStyle;
	private String projectileColor;
	public Shot(float x, float y)
	{
		super.setTransform(new Transform(0,0,5,1));
	}

	@Override
	public void Update()
	{
		
	}
	
	
}
