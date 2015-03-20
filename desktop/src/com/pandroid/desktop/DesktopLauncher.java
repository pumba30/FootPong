package com.pandroid.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.tools.texturepacker.TexturePacker;
import com.pandroid.FootPongGame;

public class DesktopLauncher {
    private static boolean rebuildAtlas = false;
    private static boolean drawDebugOutline = false;

    public static void main(String[] arg) {
        if (rebuildAtlas) {
            TexturePacker.Settings settings = new TexturePacker.Settings();
            settings.maxWidth = 2048;
            settings.maxHeight = 2048;
            settings.filterMin = Texture.TextureFilter.Linear;
            settings.filterMag = Texture.TextureFilter.Linear;
            settings.duplicatePadding = false;
            settings.debug = drawDebugOutline;
            TexturePacker.process(settings, "D:\\workspase_android\\FootPong\\desktop\\assets-raw", "images",
                    "footpong_level.pack");
        }
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "FootPong";
        config.vSyncEnabled = true;
        config.width = 1280;
        config.height = 800;

        new LwjglApplication(new FootPongGame(), config);
    }
}
