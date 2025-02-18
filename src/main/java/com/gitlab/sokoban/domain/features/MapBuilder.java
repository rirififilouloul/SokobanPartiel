package com.gitlab.sokoban.domain.features;
import com.gitlab.sokoban.domain.model.Position;
import com.gitlab.sokoban.domain.model.Tile;
import com.gitlab.sokoban.domain.model.State;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


/*
### 1.3. Le générateur de cartes (4 points)
Une carte est générée à partir d'un fichier texte contenant l'état de chaque case. Par exemple :
```
01234567890123456789
0 #####
1 # #
2 #$ #
3 ### $##
4 # $ $ #
5 ### # ## # ######
6 # # ## ##### ..#
7 # $ $ ..#
8 ##### ### #@## ..#
9 # #########
0 #######
```
`#` : Mur
`$` : caisse
`.` : Case de stockage
`@` : Joueur
` ` : Sol
Dans un premier temps, nous allons nous concentrer sur la création de la carte (sol et murs)
1. Créer une classe `MapBuilder` qui sera utilisée pour convertir une chaine de caractères (string) en une
carte `Map`
2. Créer une méthode statique `toTiles` qui prend une `string` en paramètres et retourne une liste de case
`Tile`
3. Créer une méthode statique `build` qui prend une `String` en paramètre et retourne une `Map`
Indice :
La `String` contient plusieurs lignes.
En parcourant la `String` ligne par ligne, on peut en déduire la valeur de Y. Puis caractère par caractère, on
peut en déduire la valeur de X de chaque case.
Par exemple, le premier '$' est à la position [5;2] (3ème ligne, 6ème caractère sur la ligne)
 */

public class MapBuilder {


    public static int getMapWidth(String fileMap) throws IOException {
        int width = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(fileMap))) {
            String line = br.readLine();
            width = line.length();
        }
        return width;
    }

    public static int getMapHeight(String fileMap) throws IOException {
        int height = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(fileMap))) {
            while (br.readLine() != null) {
                height++;
            }
        }
        return height;
    }

    public static ArrayList<Tile> toTiles(String row){

        int Ypos = Integer.parseInt(row.substring(1, 2));

        ArrayList<Tile> tiles = new ArrayList<>();
        for (int i = 1 ; i < row.length(); i++){
            char c = row.charAt(i);
            Position position = new Position(i-1, Ypos);
            switch (c){
                case '#':
                    tiles.add(new Tile(position, State.Wall));
                    break;
                case '$':
                    tiles.add(new Tile(position, State.Box));
                    break;
                case '.':
                    tiles.add(new Tile(position, State.Storage));
                    break;
                case '@':
                    tiles.add(new Tile(position, State.Player));
                    break;
                case ' ':
                    tiles.add(new Tile(position, State.Empty));
                    break;
            }
        }
        return tiles;
    }

    public static Map build(String fileMap) throws IOException {

        Map map = new Map(getMapWidth(fileMap), getMapHeight(fileMap));

        try (BufferedReader br = new BufferedReader(new FileReader(fileMap))) {
            String line = br.readLine();

            while (line != null) {
                ArrayList<Tile> tiles = toTiles(line);
                for (Tile tile : tiles){
                    map.getTiles()[tile.position().y][tile.position().x] = tile;
                }
            }

        }
        return map;
    }

    public static void displayMap(Map map){
        for (int i = 0; i < map.getTiles().length; i++){
            for (int j = 0; j < map.getTiles()[i].length; j++){
                System.out.print(map.getTiles()[i][j].state());
            }
            System.out.println();
        }
    }
}
