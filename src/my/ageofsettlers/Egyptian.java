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
public class Egyptian {
    private final int[] maxTerrainEgyptian = {5, 1, 2, 0, 6, 2};
    private List<TerrainTiles> egyptianTerrains = new ArrayList<>();
    private static Egyptian instance = null;
    private int food = 4;
    private int favor = 4;
    private int wood = 4;
    private int gold = 4;
    private int victory = 0;
    
    public static synchronized Egyptian getInstance() {
        if(instance == null) {
            instance = new Egyptian();
        }
        
        return instance;
    }

    public List<TerrainTiles> getEgyptianTerrains() {
        return egyptianTerrains;
    }

    public void setEgyptianTerrains(List<TerrainTiles> egyptianTerrains) {
        this.egyptianTerrains = egyptianTerrains;
    }
    
    public int[] getMaxTerrains() {
        return maxTerrainEgyptian;
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
