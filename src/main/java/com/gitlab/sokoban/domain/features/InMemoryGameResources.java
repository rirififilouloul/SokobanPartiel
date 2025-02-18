package com.gitlab.sokoban.domain.features;

import java.io.IOException;

public class InMemoryGameResources implements GameResources {

    private final Sokoban sokoban;

    public InMemoryGameResources() throws IOException {
        this.sokoban = new Sokoban();
    }

    public Sokoban get() {
        return sokoban;
    }

}
