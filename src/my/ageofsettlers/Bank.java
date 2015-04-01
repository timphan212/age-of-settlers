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
public class Bank {
    private int food = 13;
    private int wood = 13;
    private int gold = 13;
    private int favor = 13;
    private int victory = 30;
    private static Bank instance = null;
    
    public static synchronized Bank getInstance() {
        if(instance == null) {
            instance = new Bank();
        }
        
        return instance;
    }
    
    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
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

    public int getFavor() {
        return favor;
    }

    public void setFavor(int favor) {
        this.favor = favor;
    }

    public int getVictory() {
        return victory;
    }

    public void setVictory(int victory) {
        this.victory = victory;
    }
    
    
}
