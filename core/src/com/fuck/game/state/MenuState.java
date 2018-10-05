package com.fuck.game.state;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.fuck.game.Fuck;

public class MenuState extends State {
    private Texture background;
    private Texture playBtn;

    public MenuState(GameStateManager gsm) {
        super(gsm);
        background = new Texture("Hills Free.png");
        playBtn = new Texture("gem3.png");
    }

    @Override
    public void handleInput() {
        if(Gdx.input.justTouched()){
            gsm.set(new PlayState(gsm));
            dispose();
        }
    }

    @Override
    public void update(float dt) {
        handleInput();
    }

    @Override
    public void render(SpriteBatch sb) {

        sb.begin();
        sb.draw(background, 0,0, Fuck.WIDTH, Fuck.HEIGHT);
        sb.draw(playBtn, (Fuck.WIDTH/2)-(playBtn.getWidth()/2),Fuck.HEIGHT/2);
        sb.end();

    }

    @Override
    public void dispose() {
        background.dispose();;
        playBtn.dispose();
    }
}
