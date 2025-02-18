package com.gitlab.sokoban.domain.features;

/*
Une carte contient une liste de cases.

Une carte peut dire :

si la case à une position donnée est un mur ou non
si une position donnée est dans la carte ou non. Par exemple, une carte de 4x4, la position 12;34 n'est pas dans la carte. Mais la position 2;2 est dans la carte
Créer la classe Map. Une carte est créée à partir d'une taille et une liste de cases
Créer la méthode isWall. Elle retourne True si la position donnée est un mur. Faux, sinon. Créer les tests qui valident ce comportement
Créer la méthode inside. Elle retourne True si la position donnée est dans la carte. Faux, sinon. Créer les tests qui valident ce comportement
Deux cartes sont égales si leur taille et leurs cases sont égales. Créer les tests qui valident ce comportement
 */

import com.gitlab.sokoban.domain.model.Position;
import com.gitlab.sokoban.domain.model.State;
import com.gitlab.sokoban.domain.model.Tile;

import java.util.List;

public class Map {
    List<Tile> tiles;


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
    public Boolean inside(int x, int y) {
        for (int i = 0; i < tiles.size(); i++) {
            if (tiles.get(i).position().isEquals(position)) {
                return true;
            }
        }
        return false;
    }
}
