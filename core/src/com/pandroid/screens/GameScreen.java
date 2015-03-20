package com.pandroid.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.pandroid.gameworld.GameRenderer;
import com.pandroid.gameworld.GameWorld;

/**
 * Created by pumba30 on 17.03.2015.
 */
public class GameScreen implements Screen {
    public static final String TAG = GameScreen.class.getSimpleName();


    private GameRenderer renderer;
    private GameWorld world;


    Sprite bgSpr;
    Texture bg;


    public GameScreen() {
        world = new GameWorld();
        renderer = new GameRenderer(world);

        bg = world.courtBg;
        bgSpr = world.courtBGSprite;


    }

    @Override
    public void show() {
        Gdx.app.log(TAG, "show");

    }

    @Override
    public void render(float delta) {
        Gdx.app.log(TAG, "render");
        Gdx.gl.glClearColor(0f, 0f, 0f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        renderer.batch.setProjectionMatrix(renderer.camera.combined);
        renderer.batch.begin();

        //bgSpr.draw(renderer.batch);
        renderer.batch.draw(bg, renderer.camera.position.x - renderer.VIEWPORT_WIDTH * 0.5f,
                renderer.camera.position.y - renderer.VIEWPORT_HEIGHT * 0.5f);
        renderer.batch.end();

    }

    @Override
    public void resize(int width, int height) {
        Gdx.app.log(TAG, "resize");
        renderer.resize(width, height);

    }

    @Override
    public void pause() {
        Gdx.app.log(TAG, "pause");
    }

    @Override
    public void resume() {
        Gdx.app.log(TAG, "resume");
    }

    @Override
    public void hide() {
        Gdx.app.log(TAG, "hide");
    }

    @Override
    public void dispose() {
        Gdx.app.log(TAG, "dispose");
    }
}
