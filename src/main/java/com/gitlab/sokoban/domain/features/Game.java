package com.gitlab.sokoban.domain.features;

import com.gitlab.sokoban.domain.livingdoc.Feature;

@Feature
public class Game {
    private Sokoban sokoban;

    public Game() {
        sokoban = new Sokoban();
    }

    public Sokoban current() {
        return sokoban;
    }

    public void execute(Direction direction) {
        Sokoban.move(direction);
    }
}
