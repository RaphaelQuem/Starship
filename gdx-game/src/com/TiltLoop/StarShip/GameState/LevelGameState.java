package com.TiltLoop.StarShip.GameState;
import com.TiltLoop.StarShip.Base.*;
import com.TiltLoop.StarShip.Entities.*;
import java.util.*;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.*;
import com.badlogic.gdx.assets.*;


public class LevelGameState extends GameState
{
	Touchable uiAction;
	Touchable uiCharacter;
	Touchable uiHealth;
	float healthW;
	public LevelGameState()
	{
		
		
	}
	@Override
	public void Update()
	{ 
		
		
		
		GameResources.Objects.addAll(GameResources.CreateObjects);
		GameResources.CreateObjects.clear();
		for(GameObject object : GameResources.Objects)
		{
			object.Update();
			object.CollisionHandle();
			
		}
		GameResources.Objects.removeAll(GameResources.DeleteObjects);
		GameResources.LockingObjects.removeAll(GameResources.DeleteObjects);
		GameResources.DeleteObjects.clear();
	
		
		
		
		//TextHelper.Show(String.valueOf(GameResources.debugme).replace('.','+'),new Transform(GameResources.getCameraLeft(),0,100f,20f),32,1);
		
	}
	
}
