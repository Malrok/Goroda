package com.mrk.goroda;

import com.badlogic.gdx.Application.ApplicationType;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GorodaMain extends ApplicationAdapter {
	
	OrthographicCamera camera;
	SpriteBatch batch;
	Texture img;
	
//	private KeystrokeController keyController = new KeystrokeController();
	
	@Override
	public void create () {
		camera = new OrthographicCamera();
		camera.setToOrtho(false, 800, 480);
		
		batch = new SpriteBatch();
		img = new Texture(Gdx.files.internal("dot.png"));
	}

	@Override
	public void render () {
//		keyController.update();
		
		// clear the screen with a dark blue color. The
	      // arguments to glClearColor are the red, green
	      // blue and alpha component in the range [0,1]
	      // of the color to be used to clear the screen.
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		// tell the camera to update its matrices.
		camera.update();
		
		// tell the SpriteBatch to render in the
		// coordinate system specified by the camera.
		batch.setProjectionMatrix(camera.combined);
		
		// drawing
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
		
		ApplicationType appType = Gdx.app.getType();
		
		// should work also with Gdx.input.isPeripheralAvailable(Peripheral.Accelerometer)
		if (appType == ApplicationType.Android || appType == ApplicationType.iOS) {
//			world.update(Gdx.graphics.getDeltaTime(), Gdx.input.getAccelerometerX());
//		} else {
//			float accel = 0;
//			if (Gdx.input.isKeyPressed(Keys.DPAD_LEFT)) accel = 5f;
//			if (Gdx.input.isKeyPressed(Keys.DPAD_RIGHT)) accel = -5f;
//			world.update(Gdx.graphics.getDeltaTime(), accel);
		}
		
	}
}
