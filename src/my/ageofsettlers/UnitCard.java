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
public class UnitCard {
    private int index;
    private String name;
    private String fileName;
    private int age;
    private String type;
    private int numberofDice;
    private String[] bonuses;
    private int food;
    private int favor;
    private int wood;
    private int gold;
    
    public UnitCard(int index, String name, String fileName, int age, String type, int numberofDice, String[] bonuses, int food, int favor, int wood, int gold) {
        this.index = index;
        this.name = name;
        this.fileName = fileName;
        this.age = age;
        this.type = type;
        this.numberofDice = numberofDice;
        this.bonuses = bonuses;
        this.food = food;
        this.favor = favor;
        this.wood = wood;
        this.gold = gold;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    public int getNumberofDice() {
        return numberofDice;
    }

    public int getFood() {
        return food;
    }

    public int getFavor() {
        return favor;
    }

    public int getWood() {
        return wood;
    }

    public int getGold() {
        return gold;
    }
    public int getIndex() {
        return index;
    }

    public String getFileName() {
        return fileName;
    } 

    public String[] getBonuses() {
        return bonuses;
    }

    public void setBonuses(String[] bonuses) {
        this.bonuses = bonuses;
    }
}
