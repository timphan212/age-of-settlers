/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.ageofsettlers;

/**
 *
 * @author Tim
 */

public class TerrainTiles {
   private String terrainType;
   private String fileName;
   private int tileCount;
   private int foodCount;
   private int favorCount;
   private int woodCount;
   private int goldCount;
   
   public TerrainTiles(String type, String fileName, int tile, int food, int favor, int wood, int gold) {
       this.terrainType = type;
       this.fileName = fileName;
       this.tileCount = tile;
       this.foodCount = food;
       this.favorCount = favor;
       this.woodCount = wood;
       this.goldCount = gold;
   }

    public String getTerrainType() {
        return terrainType;
    }

    public void setTerrainType(String terrainType) {
        this.terrainType = terrainType;
    }

    public int getTileCount() {
        return tileCount;
    }

    public void setTileCount(int tileCount) {
        this.tileCount = tileCount;
    }

    public int getFoodCount() {
        return foodCount;
    }

    public void setFoodCount(int foodCount) {
        this.foodCount = foodCount;
    }

    public int getFavorCount() {
        return favorCount;
    }

    public void setFavorCount(int favorCount) {
        this.favorCount = favorCount;
    }

    public int getWoodCount() {
        return woodCount;
    }

    public void setWoodCount(int woodCount) {
        this.woodCount = woodCount;
    }

    public int getGoldCount() {
        return goldCount;
    }

    public void setGoldCount(int goldCount) {
        this.goldCount = goldCount;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
