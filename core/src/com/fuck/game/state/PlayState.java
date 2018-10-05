package com.fuck.game.state;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.fuck.game.Fuck;
import com.fuck.game.sprite.MainCharacter;

public class PlayState extends State {
    private MainCharacter mC;
    private Texture bg;
    public PlayState(GameStateManager gsm) {
        super(gsm);
        mC = new MainCharacter(50, 100);
        cam.setToOrtho(false, Fuck.WIDTH/2, Fuck.HEIGHT/2);
        bg = new Texture("Hills Free.png");
    }

    @Override
    protected void handleInput() {
        if(Gdx.input.justTouched()){
            mC.move();
        }
    }


    @Override
    public void update(float dt) {
        handleInput();
        mC.update(dt);
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.setProjectionMatrix(cam.combined);
        sb.begin();
        sb.draw(bg, 0, 0);
        sb.draw(mC.getmC(), mC.getPosition().x, mC.getPosition().y);
        sb.end();
    }

    @Override
    public void dispose() {

    }
}
