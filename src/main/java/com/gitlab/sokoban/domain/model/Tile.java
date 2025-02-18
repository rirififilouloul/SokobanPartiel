package com.gitlab.sokoban.domain.model;

public class Tile {
    private final Position position;
    private State state;

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

    public State getState() {
        return state;
    }

    public Position getPosition() {
        return position;
    }

    public void setState(State state) {
        this.state = state;
    }
}
