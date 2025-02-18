package com.gitlab.sokoban.domain.features;

import com.gitlab.sokoban.domain.model.State;
import com.gitlab.sokoban.domain.model.Tile;

import java.util.ArrayList;

public class Sokoban {


//    private static Player player;
    private static Map map;
    private static ArrayList<Tile> storages;



    public ArrayList<Tile> getTiles(State state){
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


//    private static box[] boxes;
//
//    public static void move(player.Direction){
//        switch(player.Direction){
//            case Left:
//                playerPosition = player.getPosition();
//                nextTile = map.getTile(playerPosition.x - 1, playerPosition.y);
//                switch(nextTile){
//                    case Wall:
//                        break;
//                    case Box:
//                        nextTile = map.getTile(playerPosition.x - 1, playerPosition.y);
//                        switch(nextTile){
//                            case Wall:
//                                break;
//                            case Box:
//                                break;
//                            case Empty:
//                                map[playerPosition.x -1] = Tile.empty;
//                                map[playerPosition.x-2] = Tile.box;
//                                map[playerPosition] = Tile.empty;
//                                playerPosition.x = playerPosition.x - 1;
//                                map[playerPosition] = Tile.player;
//                                break;
//                        }
//                        break;
//                    case Empty:
//                        map[playerPosition] = Tile.empty;
//                        playerPosition.x = playerPosition.x - 1;
//                        map[playerPosition] = Tile.player;
//                        break;
//                }
//                break;
//            case Down:
//                playerPosition = player.getPosition();
//                nextTile = map.getTile(playerPosition.x, playerPosition.y-1);
//                switch(nextTile){
//                    case Wall:
//                        break;
//                    case Box:
//                        nextTile = map.getTile(playerPosition.x, playerPosition.y+2);
//                        switch(nextTile){
//                            case Wall:
//                                break;
//                            case Box:
//                                break;
//                            case Empty:
//                                map[playerPosition.y +1] = Tile.empty;
//                                map[playerPosition.y+2] = Tile.box;
//                                map[playerPosition] = Tile.empty;
//                                playerPosition.y = playerPosition.y + 1;
//                                map[playerPosition] = Tile.player;
//                                break;
//                        }
//                        break;
//                    case Empty:
//                        map[playerPosition] = Tile.empty;
//                        playerPosition.y = playerPosition.y + 1;
//                        map[playerPosition] = Tile.player;
//                        break;
//                }
//                break;
//            case Right:
//                playerPosition = player.getPosition();
//                nextTile = map.getTile(playerPosition.x + 1, playerPosition.y);
//                switch(nextTile){
//                    case Wall:
//                        break;
//                    case Box:
//                        nextTile = map.getTile(playerPosition.x + 2, playerPosition.y);
//                        switch(nextTile){
//                            case Wall:
//                                break;
//                            case Box:
//                                break;
//                            case Empty:
//                                map[playerPosition.x +1] = Tile.empty;
//                                map[playerPosition.x+2] = Tile.box;
//                                map[playerPosition] = Tile.empty;
//                                playerPosition.x = playerPosition.x + 1;
//                                map[playerPosition] = Tile.player;
//                                break;
//                        }
//                        break;
//                    case Empty:
//                        map[playerPosition] = Tile.empty;
//                        playerPosition.x = playerPosition.x + 1;
//                        map[playerPosition] = Tile.player;
//                        break;
//                }
//                break;
//            case Up:
//                playerPosition = player.getPosition();
//                nextTile = map.getTile(playerPosition.x, playerPosition.y-1);
//                switch(nextTile){
//                    case Wall:
//                        break;
//                    case Box:
//                        nextTile = map.getTile(playerPosition.x, playerPosition.y-2);
//                        switch(nextTile){
//                            case Wall:
//                                break;
//                            case Box:
//                                break;
//                            case Empty:
//                                map[playerPosition.y -1] = Tile.empty;
//                                map[playerPosition.y-2] = Tile.box;
//                                map[playerPosition] = Tile.empty;
//                                playerPosition.y = playerPosition.y - 1;
//                                map[playerPosition] = Tile.player;
//                                break;
//                        }
//                        break;
//                    case Empty:
//                        map[playerPosition] = Tile.empty;
//                        playerPosition.x = playerPosition.y - 1;
//                        map[playerPosition] = Tile.player;
//                        break;
//                }
//                break;
//        }
//    }


}
