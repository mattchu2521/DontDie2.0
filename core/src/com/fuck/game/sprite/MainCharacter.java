package com.fuck.game.sprite;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector3;

public class MainCharacter {
    private static final int GRAVITY = -15;
    private Vector3 position;
    private Vector3 velocity;
    private Texture mC;

    public Vector3 getPosition() {
        return position;
    }


    public Texture getmC() {
        return mC;
    }

    public MainCharacter(int x, int y){


        position = new Vector3(x, y,0);
        velocity = new Vector3(0,0,0);
        mC = new Texture("cat.jpg");

    }

    public void update(float dt){
        if(position.y >0) {
            velocity.add(0, GRAVITY, 0);
        }
        velocity.scl(dt);
        position.add(0,velocity.y,0);

        if(position.y<0){
            position.y=0;
        }

        velocity.scl(1/dt);

    }

    public void move(){
        velocity.y = 250;
    }

}
