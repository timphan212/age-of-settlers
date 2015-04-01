/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.ageofsettlers;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tim
 */
public class Norse {
    private final int[] maxTerrainNorse = {3, 4, 3, 4, 1, 1};
    private List<TerrainTiles> norseTerrains = new ArrayList<>();
    private static Norse instance = null;
    private int food = 4;
    private int favor = 4;
    private int wood = 4;
    private int gold = 4;
    private int victory = 0;
    
    public static synchronized Norse getInstance() {
        if(instance == null) {
            instance = new Norse();
        }
        
        return instance;
    }
    
    public List<TerrainTiles> getNorseTerrains() {
        return norseTerrains;
    }

    public void setNorseTerrains(List<TerrainTiles> norseTerrains) {
        this.norseTerrains = norseTerrains;
    }
    
    public int[] getMaxTerrains() {
        return maxTerrainNorse;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getFavor() {
        return favor;
    }

    public void setFavor(int favor) {
        this.favor = favor;
    }

    public int getWood() {
        return wood;
    }

    public void setWood(int wood) {
        this.wood = wood;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getVictory() {
        return victory;
    }

    public void setVictory(int victory) {
        this.victory = victory;
    }
}
