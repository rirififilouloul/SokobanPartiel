package com.gitlab.sokoban.domain.features;


import com.gitlab.sokoban.domain.model.Position;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MapTest {

    private Map map;

    @BeforeEach
    public void setUp() {
        map = new Map();
    }

    @Test
    public void isWallTest() {
        Position position = new Position(5, 0);
        assertTrue(map.isWall(position));
    }

    @Test
    public void isNotWallTest() {
        Position position = new Position(0, 0);
        assertFalse(map.isWall(position));
    }

    @Test
    public void insideTest() {
        Position position = new Position(5, 0);
        assertTrue(map.inside(position));
    }

    @Test
    public void isNotInsideTest() {
        Position position = new Position(0, 0);
        assertFalse(map.inside(position));
    }

    @Test
    public void isEqualMapTest() {
        Map map2 = new Map();

        for (int i = 0; i < map.tiles.size(); i++) {
            assertTrue(map.tiles.get(i).isEquals(map2.tiles.get(i)));
        }
    }
}
