package com.TiltLoop.StarShip.Base;

import java.util.*;
import com.badlogic.gdx.graphics.g2d.*;
import com.badlogic.gdx.*;

public class BaseState
{
	private float stateTime=0f;
	private GameObject gameObject;
	private List<Transform> colliders= new ArrayList<Transform>();
	private List<GameObject> triggeredObjects = new ArrayList<GameObject>();

	public void setGameObject(GameObject gameObject)
	{
		this.gameObject = gameObject;
	}

	public GameObject getGameObject()
	{
		return gameObject;
	}

	public void setColliders(List<Transform> colliders)
	{
		this.colliders = colliders;
	}

	public List<Transform> getColliders()
	{
		return colliders;
	}

	public void setStateTime(float stateTime)
	{
		this.stateTime = stateTime;
	}
	public void addStateTime(float stateTime)
	{
		this.stateTime += stateTime;
	}
	public float getStateTime()
	{
		return stateTime;
	}

	public void setTriggeredObjects(List<GameObject> triggeredObjects)
	{
		this.triggeredObjects = triggeredObjects;
	}

	public List<GameObject> getTriggeredObjects()
	{
		return triggeredObjects;
	}


	public String getName(){return "BaseSate";};
	public Animation getStateAnimation(){return AnimationHelper.GetAnimationFromSpritesheet("hero-attack3-spritesheet.png",3,1,0.1f);};

	public void onTriggerEnter(Transform other){};
	public void Update()
	{
		stateTime += Gdx.graphics.getDeltaTime();
	};
	
}
