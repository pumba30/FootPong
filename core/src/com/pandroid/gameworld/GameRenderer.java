package com.pandroid.gameworld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

/**
 * Created by pumba30 on 17.03.2015.
 */
public class GameRenderer implements Disposable {
    public static final String TAG = GameRenderer.class.getSimpleName();


    public static float VIRTUAL_HEIGHT;
    public static float VIRTUAL_WIDTH = 1f;
    public static float ASPECT_RATIO = VIRTUAL_WIDTH / VIRTUAL_HEIGHT;

    public static final float VIEWPORT_WIDTH = 1280;
    public static final float VIEWPORT_HEIGHT = 854;

    private GameWorld world;
    public OrthographicCamera camera;
    Viewport viewport;
    public SpriteBatch batch;

    public float width;
    public float height;


    public GameRenderer(GameWorld world) {
        width = Gdx.graphics.getWidth();
        height = Gdx.graphics.getHeight();
        VIRTUAL_HEIGHT = height / width;

        this.world = world;

        camera = new OrthographicCamera(VIRTUAL_WIDTH, VIRTUAL_HEIGHT);


        viewport = new ExtendViewport(VIEWPORT_WIDTH, VIEWPORT_HEIGHT, camera);
        camera.position.set(VIRTUAL_WIDTH/2, VIRTUAL_HEIGHT/2, 0);
        batch = new SpriteBatch();

        camera.update();


        // Gdx.app.log(TAG, "ширина " + Float.toString(SCENE_WIDTH));
        //Gdx.app.log(TAG, "высота " + Float.toString(SCENE_HEIGHT));


    }

    public void resize(int width, int height) {
       viewport.update(width, height);

    }

    @Override
    public void dispose() {

    }
}


