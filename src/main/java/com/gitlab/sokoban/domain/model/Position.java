package com.gitlab.sokoban.domain.model;

public class Position {

    public final int x;
    public final int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Boolean isEquals(Position position) {
        return this.x == position.x && this.y == position.y;
    }
}
