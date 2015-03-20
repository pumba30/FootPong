package com.pandroid;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.pandroid.fphelpers.AssetLoader;
import com.pandroid.screens.GameScreen;

public class FootPongGame extends Game {
    //в этом классе(метод create() ) создать все экзепляры скринов, саунд менеджер, ассет менеджер, имидж провайдер
    //реализовать логику переходов между экранами (Screen)

    public static final String TAG =  FootPongGame.class.getSimpleName();


    AssetLoader assetLoader = new AssetLoader();

    @Override
    public void create () {
        Gdx.app.log(TAG, "created FootPongGame");

        //пока создание и переход на игровой экран
        setScreen(new GameScreen());
    }
    public void render() {
        super.render(); // важно!
    }

    @Override
    public void resize(int width, int height) {
        super.resize(width, height);
    }

    public void dispose(){
        //TODO не забыть dispose()!!
    }



}
