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
public class Greek {
    private List<TerrainTiles> greekTerrains = new ArrayList<>(); 
    private final int[] maxTerrainGreek = {3, 2, 8, 1, 1, 1};
    private static Greek instance = null;
    private int food = 4;
    private int favor = 4;
    private int wood = 4;
    private int gold = 4;
    private int victory = 0;
    private int age = 0;
    
    public static synchronized Greek getInstance() {
        if(instance == null) {
            instance = new Greek();
        }
        
        return instance;
    }
    
    public List<TerrainTiles> getGreekTerrains() {
        return greekTerrains;
    }

    public void setGreekTerrains(List<TerrainTiles> greekTerrains) {
        this.greekTerrains = greekTerrains;
    }
    
    public int[] getMaxTerrains() {
        return maxTerrainGreek;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
