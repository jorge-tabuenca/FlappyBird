package com.flappy.game.States;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.flappy.game.FlappyGame;

public class MenuState extends State {

    private Texture background;
    private Texture playBtn;

    public MenuState(GameStateManager gsm) {
        super(gsm);
        background = new Texture("bg.png");
        playBtn = new Texture("playbtn.png");
    }

    @Override
    public void handleInput() {

    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(background, 0, 0, FlappyGame.WIDTH, FlappyGame.HEIGHT);
        sb.draw(playBtn, (FlappyGame.WIDTH / 2) - (playBtn.getWidth() / 2), FlappyGame.HEIGHT / 2);
        sb.end();
    }
}
