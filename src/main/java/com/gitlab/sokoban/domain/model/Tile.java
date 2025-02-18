package com.gitlab.sokoban.domain.model;

public class Tile {
    private final Position position;
    private final State state;

    public Tile(Position position, State state) {
        this.position = position;
        this.state = state;
    }

    public Tile(Position position) {
        this.position = position;
        this.state = State.Empty;
    }

    public Position position() {
        return position;
    }

    public State state() {
        return state;
    }

    public Boolean isEquals(Tile tile) {
        return this.position.isEquals(tile.position) && this.state == tile.state;
    }
}
