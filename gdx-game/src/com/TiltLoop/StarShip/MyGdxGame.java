package com.TiltLoop.StarShip;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.*;
import com.badlogic.gdx.graphics.g2d.*;
import com.TiltLoop.StarShip.Base.*;
import com.TiltLoop.StarShip.Entities.*;
import com.TiltLoop.StarShip.GameState.*;

public class MyGdxGame implements ApplicationListener
{
	

	@Override
	public void create()
	{
		GameResources.Objects.add(new CameraHolder());
		
		GameResources.Player = new Player(new Transform(0f, 0f, 20f,1f,30f,100f));
		GameResources.SpriteBatch = new SpriteBatch();
		GameResources.HudBatch = new SpriteBatch();
		GameResources.Objects.add(GameResources.Player);

		GameResources.CurrentGameState = new LevelGameState();
		
	}
	@Override
	public void render()
	{       
		Init();


		GameResources.CurrentGameState.Update();

		//implementar Lightning
		//GameResources.SpriteBatch.setBlendFunction(GL20.GL_DST_COLOR, GL20.GL_SRC_ALPHA);
		//GameResources.SpriteBatch.draw(GameResources.Level.getBackground(),2,1);
		//GameResources.SpriteBatch.setBlendFunction(GL20.GL_SRC_ALPHA, GL20.GL_ONE_MINUS_SRC_ALPHA);

		GameResources.SpriteBatch.end(); 
		//GameResources.CurrentGameState.UpdateUi();
		//GameResources.HudBatch.end();
		

	}
	private void Init()
	{

	    Gdx.gl.glClearColor(0, 0, 0, 0);
	    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		GameResources.Camera.update();
		GameResources.SpriteBatch.setProjectionMatrix(GameResources.Camera.combined);
		GameResources.SpriteBatch.begin();
		
	}
	

	@Override
	public void dispose()
	{
	}

	@Override
	public void resize(int width, int height)
	{
	}

	@Override
	public void pause()
	{
	}

	@Override
	public void resume()
	{
	}
}
