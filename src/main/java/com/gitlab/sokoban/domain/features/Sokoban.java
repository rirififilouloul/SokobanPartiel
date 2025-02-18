package com.gitlab.sokoban.domain.features;

import com.gitlab.sokoban.domain.model.Position;
import com.gitlab.sokoban.domain.model.Size;
import com.gitlab.sokoban.domain.model.State;
import com.gitlab.sokoban.domain.model.Tile;

import java.util.ArrayList;

import static com.gitlab.sokoban.domain.model.State.*;

public class Sokoban {


    private static Position playerPosition;
    private static Map map;
    private static ArrayList<Tile> storages;
//    private static box[] boxes;


    public static ArrayList<Tile> getTiles(State state) {
        // map type :   private Tile[][];
        ArrayList<Tile> tiles = new ArrayList<>();
        for (int i = 0; i < map.getTiles().length; i++) {
            for (int j = 0; j < map.getTiles()[i].length; j++) {
                if (map.getTiles()[i][j].state() == state) {
                    tiles.add(map.getTiles()[i][j]);
                }
            }
        }
        return tiles;
    }

    public static ArrayList<Tile> getTiles() {
        // map type :   private Tile[][];
        return storages;
    }


    public static Tile getTile(int x, int y) {
        return map.getTiles()[y][x];
    }


    public static void move(Direction direction) {

        Tile nextTile;
        switch (direction) {
            case Left:
                nextTile = getTile(playerPosition.x - 1, playerPosition.y);
                break;

            case Down:
                nextTile = getTile(playerPosition.x, playerPosition.y - 1);
                break;

            case Right:
                nextTile = getTile(playerPosition.x + 1, playerPosition.y);
                break;

            case Up:
                nextTile = getTile(playerPosition.x, playerPosition.y + 1);
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + direction);
        }

        if (nextTile.state() == Wall) {
            return;
        }

        if (nextTile.state() == Box) {
            Tile nextTile2;
            switch (direction) {
                case Left:
                    nextTile2 = getTile(playerPosition.x - 2, playerPosition.y);
                    break;

                case Down:
                    nextTile2 = getTile(playerPosition.x, playerPosition.y - 2);
                    break;

                case Right:
                    nextTile2 = getTile(playerPosition.x + 2, playerPosition.y);
                    break;

                case Up:
                    nextTile2 = getTile(playerPosition.x, playerPosition.y + 2);
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + direction);
            }

            if (nextTile2.state() == Wall || nextTile2.state() == Box) {
                return;
            }

            nextTile2.setState(Box);
            nextTile.setState(Player);
            playerPosition = new Position(playerPosition.x, playerPosition.y);
        } else {
            nextTile.setState(Player);
            playerPosition = new Position(playerPosition.x, playerPosition.y);
        }
    }

    public Size getSize() {
        return map.getSize();
    }
}