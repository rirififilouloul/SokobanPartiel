package com.gitlab.sokoban.domain.features;

/*
Deux cartes sont égales si leur taille et leurs cases sont égales. Créer les tests qui valident ce comportement
 */

import com.gitlab.sokoban.domain.model.Position;
import com.gitlab.sokoban.domain.model.Size;
import com.gitlab.sokoban.domain.model.State;
import com.gitlab.sokoban.domain.model.Tile;

import java.util.ArrayList;
import java.util.List;

public class Map {

    private Tile[][] tiles;
    Size size;

    public Map(int width, int height) {
        tiles = new Tile[height][width];
        size = new Size(width, height);
    }

    // retourne True si la position donnée est un mur. Faux, sinon.
    public Boolean isWall(Position position) {
        for (int i = 0; i < tiles.length; i++) {
            for (int j = 0; j < tiles[i].length; j++) {
                if (tiles[i][j].position().isEquals(position) && tiles[i][j].state() == State.Wall) {
                    return true;
                }
            }
        }
        return false;
    }

    // retourne True si la position donnée est dans la carte. Faux, sinon.
    public Boolean inside(Position position) {
        return position.x >= 0 && position.x < tiles[0].length && position.y >= 0 && position.y < tiles.length;
    }

    public Tile[][] getTiles() {
        return tiles;
    }

    public Size getSize() {
        return size;
    }
}
