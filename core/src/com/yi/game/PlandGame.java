package com.yi.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class PlandGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;

	float screenWidth, screenHeight, textureWidth, textureHeight;

	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");

		screenWidth = Gdx.graphics.getWidth();
		screenHeight = Gdx.graphics.getHeight();
		textureWidth = img.getWidth();
		textureHeight = img.getHeight();

		Gdx.app.log("MyTag", "screenWidth = " + screenWidth);
		Gdx.app.log("MyTag", "screenHeight = " + screenHeight);
		Gdx.app.log("MyTag", "textureWidth = " + textureWidth);
		Gdx.app.log("MyTag", "textureHeight = " + textureHeight);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}
}