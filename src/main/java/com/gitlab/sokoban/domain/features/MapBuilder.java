package com.gitlab.sokoban.domain.features;
import com.gitlab.sokoban.domain.model.Tile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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

    public static Tile toTiles(String row){


    }

    public static Map build(String fileMap) throws IOException {

        Map map = new Map();

        try (BufferedReader br = new BufferedReader(new FileReader(fileMap))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {


            }
            String everything = sb.toString();
        }
        return map;
    }
}
