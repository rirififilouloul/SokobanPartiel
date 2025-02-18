package com.gitlab.sokoban.domain.features;

/*
Deux cartes sont égales si leur taille et leurs cases sont égales. Créer les tests qui valident ce comportement
 */

import com.gitlab.sokoban.domain.model.Position;
import com.gitlab.sokoban.domain.model.State;
import com.gitlab.sokoban.domain.model.Tile;

import java.util.ArrayList;
import java.util.List;

public class Map {

    ArrayList<Tile> tiles;

    public Map() {

    }

    // retourne True si la position donnée est un mur. Faux, sinon.
    public Boolean isWall(Position position) {
        for (int i = 0; i < tiles.size(); i++) {
            if (tiles.get(i).position().isEquals(position) && tiles.get(i).state() == State.Wall) {
                return true;
            }
        }
        return false;
    }

    // retourne True si la position donnée est dans la carte. Faux, sinon.
    public Boolean inside(Position position) {
        for (int i = 0; i < tiles.size(); i++) {
            if (tiles.get(i).position().isEquals(position)) {
                return true;
            }
        }
        return false;
    }

    public List<Tile> getTiles() {
        return tiles;
    }
}
