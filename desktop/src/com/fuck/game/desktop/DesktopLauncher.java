package com.fuck.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.fuck.game.Fuck;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = Fuck.WIDTH;
		config.height = Fuck.HEIGHT;
		config.title = Fuck.TITLE;
		new LwjglApplication(new Fuck(), config);
	}
}
