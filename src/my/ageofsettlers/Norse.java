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
    private int[] maxTerrainNorse = {3, 4, 3, 4, 1, 1};
    private List<TerrainTiles> norseTerrains = new ArrayList<>();
    private static Norse instance = null;
    private int food = 4;
    private int favor = 4;
    private int wood = 4;
    private int gold = 4;
    private int victory = 0;
    private int age = 0;
    private int house = 0;
    private boolean wall = false;
    private boolean tower = false;
    private boolean storehouse = false;
    private boolean market = false;
    private boolean armory = false;
    private boolean quarry = false;
    private boolean monument = false;
    private boolean granary = false;
    private boolean goldmint = false;
    private boolean woodworkshop = false;
    private boolean siegeworkshop = false;
    private boolean greattemple = false;
    private boolean wonder = false;
    private List<UnitCard> totalUnitList = new ArrayList<>();
    private List<UnitCard> currentUnitList = new ArrayList<>();
    
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

    public void setMaxTerrains(int[] maxTerrains) {
        this.maxTerrainNorse = maxTerrains;
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

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public boolean isWall() {
        return wall;
    }

    public void setWall(boolean wall) {
        this.wall = wall;
    }

    public boolean isTower() {
        return tower;
    }

    public void setTower(boolean tower) {
        this.tower = tower;
    }

    public boolean isStorehouse() {
        return storehouse;
    }

    public void setStorehouse(boolean storehouse) {
        this.storehouse = storehouse;
    }

    public boolean isMarket() {
        return market;
    }

    public void setMarket(boolean market) {
        this.market = market;
    }

    public boolean isArmory() {
        return armory;
    }

    public void setArmory(boolean armory) {
        this.armory = armory;
    }

    public boolean isQuarry() {
        return quarry;
    }

    public void setQuarry(boolean quarry) {
        this.quarry = quarry;
    }

    public boolean isMonument() {
        return monument;
    }

    public void setMonument(boolean monument) {
        this.monument = monument;
    }

    public boolean isGranary() {
        return granary;
    }

    public void setGranary(boolean granary) {
        this.granary = granary;
    }

    public boolean isGoldmint() {
        return goldmint;
    }

    public void setGoldmint(boolean goldmint) {
        this.goldmint = goldmint;
    }

    public boolean isWoodworkshop() {
        return woodworkshop;
    }

    public void setWoodworkshop(boolean woodworkshop) {
        this.woodworkshop = woodworkshop;
    }

    public boolean isSiegeworkshop() {
        return siegeworkshop;
    }

    public void setSiegeworkshop(boolean siegeworkshop) {
        this.siegeworkshop = siegeworkshop;
    }

    public boolean isGreattemple() {
        return greattemple;
    }

    public void setGreattemple(boolean greattemple) {
        this.greattemple = greattemple;
    }

    public boolean isWonder() {
        return wonder;
    }

    public void setWonder(boolean wonder) {
        this.wonder = wonder;
    }

    public List<UnitCard> getTotalUnitList() {
        return totalUnitList;
    }

    public void setTotalUnitList(List<UnitCard> totalUnitList) {
        this.totalUnitList = totalUnitList;
    }

    public List<UnitCard> getCurrentUnitList() {
        return currentUnitList;
    }

    public void setCurrentUnitList(List<UnitCard> currentUnitList) {
        this.currentUnitList = currentUnitList;
    }
    
    
}
