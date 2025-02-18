package com.gitlab.sokoban.domain.features;

import com.gitlab.sokoban.domain.livingdoc.Feature;

import java.io.IOException;

@Feature
public class Game {
    private Sokoban sokoban;

    public Game() throws IOException {
        sokoban = new Sokoban();
    }

    public Sokoban current() {
        return sokoban;
    }

    public void execute(Direction direction) {
        Sokoban.move(direction);
    }
}
