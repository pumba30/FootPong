package com.pandroid.gameobject;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by pumba30 on 19.03.2015.
 */
public class AbstractGameObjects {
    public Vector2 position;
    public Vector2 dimension;
    public Vector2 origin;
    public Vector2 scale;
    public float rotation;
    public Vector2 velocity;
    public Vector2 terminalVelocity; //конечная скорость
    //public Vector2 friction; //скольжения не будет
    public Vector2 acceleration;
    public Vector2 direction;
    public Rectangle bounds;

    //состояние объектов (например -  в движении, в покое и т.д.)
    public enum State {
        IN_MOTION, STOPPED, IN_TOUCHED
    }


}
