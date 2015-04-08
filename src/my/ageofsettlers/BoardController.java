/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.ageofsettlers;

import java.awt.Component;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import javax.swing.JPanel;

/**
 *
 * @author Tim
 */
public class BoardController {
    private static List<TerrainTiles> terrainList = new ArrayList<>();
    private String playerCulture;
    private String aiCulture;
    private String aiCulture2;
    private int playerAge = 0;
    private int playerTurnCount = 0;
    private static Norse norsePlayer;
    private static Egyptian egyptianPlayer;
    private static Greek greekPlayer;
    private int[] victoryCards = new int[4];
    private static BoardController instance = null;
    private List<String> playerPermCards = new ArrayList<>();
    private static BoardGUI bGUI;
    private int roundCount = 0;
    private List<UnitCard> aiBattleUnits = new ArrayList<>();
    
    /**
     * @param args the command line arguments
     */
    
    public static synchronized BoardController getInstance() {
        if(instance == null) {
            instance = new BoardController();
        }
        
        return instance;
    }
    
    public static void main(String[] args) {
        CultureSelectGUI culSelect = new CultureSelectGUI();
        culSelect.setVisible(true);
    }
    
    public static void boardSetup(BoardGUI board) {
        bGUI = board;
        norsePlayer = Norse.getInstance();
        egyptianPlayer = Egyptian.getInstance();
        greekPlayer = Greek.getInstance();
        terrainList = terrainSetup();
        unitSetup();
        terrainList = randomTerrainTiles(terrainList);
    }
    
    public static void setupRounds() {
        victoryCardGUI victoryRounds = victoryCardGUI.getInstance();
        victoryRounds.getTextField().setVisible(true);
        victoryRounds.setVisible(true);
    }
    
    public void initVictoryCards() {
        victoryCardGUI vcGUI = victoryCardGUI.getInstance();
        vcGUI.setVisible(true);
    }
    
    public void initPermanentCards() {
        PermanentCardsGUI pcGUI = new PermanentCardsGUI();
        int num = getMaxCards();
        pcGUI.setMaxCards(num);
        pcGUI.setVisible(true);
    }
    
    public void initPlayPermCards() {
        SelectedPermanentCardsGUI spCards = new SelectedPermanentCardsGUI();
        if(playerPermCards.size() > 0) {
            spCards.setMaxCards(playerPermCards.size());
            spCards.setupCards();
        }
        else {
            roundCount = 3;
        }
        roundCount++;
        if(roundCount > 3) {
            spCards.setVisible(false);
            spoilage();
            TurnFinishGUI tfGUI = new TurnFinishGUI();
            tfGUI.setVisible(true);
        }
        else {
            spCards.setVisible(true);
        }
    }
    
    public void playCard(String str) {
        if(str.compareTo("age") == 0) {
            playNextAgeCard(playerCulture);
        }
        else if(str.compareTo("gather") == 0) {
            gatherGUI gGUI = new gatherGUI();
            gGUI.setVisible(true);
            aiGatherHandler();
        }
        else if(str.compareTo("trade") == 0) {
            tradeCostGUI tcGUI = new tradeCostGUI();
            tradeGUI tGUI = new tradeGUI();
            boolean market = false;
            if(playerCulture.compareTo("Norse") == 0) {
                market = norsePlayer.isMarket();
            }
            else if(playerCulture.compareTo("Greek") == 0) {
                market = greekPlayer.isMarket();
            }
            else {
                market = egyptianPlayer.isMarket();
            }
            
            if(market == true) {
                tGUI.setVisible(true);
                tGUI.setupTradeGUI(playerCulture);
            }
            else {
                tcGUI.setVisible(true);
                tcGUI.setupTradeCostGUI(playerCulture);
            }
        }
        else if(str.compareTo("build") == 0) {
            buildingGUI buildGUI = new buildingGUI();
            buildGUI.setVisible(true);
        }
        else if(str.compareTo("explore") == 0) {
            exploreGUI eGUI = new exploreGUI();
            eGUI.setVisible(true);
            terrainList = pickExploreTerrains(eGUI);
        }
        else if(str.compareTo("recruit") == 0) {
            recruitGUI rGUI = new recruitGUI();
            rGUI.setupRecruitGUI(playerCulture);
            rGUI.setMaxRecruits(2);
            rGUI.setVisible(true);
        }
        else {
            attackAreaGUI aaGUI = new attackAreaGUI();
            aaGUI.setVisible(true);
        }
    }
    
    private static void unitSetup() {
        norseUnitSetup();
        greekUnitSetup();
        egyptianUnitSetup();
    }
    
    private static void norseUnitSetup() {
        List<UnitCard> unitList = new ArrayList<>();
        List<UnitCard> currUnitList = new ArrayList<>();
        String[] bonuses;
        
        bonuses = new String[1];
        bonuses[0] = "4;Giant-Killer";
        UnitCard norseUnit1 = new UnitCard(0, "Nidhogg", "CardBattleNorse1.png", 3, "Myth;Flyer", 7, bonuses, 0, 1, 0, 4);
        
        bonuses = new String[2];
        bonuses[0] = "3;Warrior";
        bonuses[1] = "4;Flyer";
        UnitCard norseUnit2 = new UnitCard(1, "Throwing Axeman", "CardBattleNorse2.png", 0, "Mortal;Archer", 3, bonuses, 1, 0, 1, 0);
        
        bonuses = new String[2];
        bonuses[0] = "4;Hero";
        bonuses[1] = "4;Archer";
        UnitCard norseUnit3 = new UnitCard(2, "Jarl", "CardBattleNorse3.png", 0, "Mortal;Calvalry", 10, bonuses, 1, 0, 0, 1);
        
        bonuses = new String[1];
        bonuses[0] = "4;Archer";
        UnitCard norseUnit4 = new UnitCard(3, "Valkyrie", "CardBattleNorse4.png", 3, "Myth;Calvalry", 5, bonuses, 0, 3, 0, 1);
        
        bonuses = new String[1];
        bonuses[0] = "4;Calvalry";
        UnitCard norseUnit5 = new UnitCard(4, "Troll", "CardBattleNorse5.png", 3, "Myth;Warrior", 6, bonuses, 3, 0, 2, 0);
        
        bonuses = new String[1];
        bonuses[0] = "4;Giant-Killer";
        UnitCard norseUnit6 = new UnitCard(5, "Nidhogg", "CardBattleNorse6.png", 3, "Myth;Flyer", 7, bonuses, 0, 1, 0, 4); //Incorrect Duplicate

        bonuses = new String[1];
        bonuses[0] = "7;Giant";
        UnitCard norseUnit7 = new UnitCard(6, "Dwarf", "CardBattleNorse7.png", 3, "Myth;Giant-Killer", 4, bonuses, 2, 0, 0, 2);

        bonuses = new String[1];
        bonuses[0] = "4;Calvalry";
        UnitCard norseUnit8 = new UnitCard(7, "Huskarl", "CardBattleNorse8.png", 0, "Mortal;Warrior", 3, bonuses, 1, 0, 0, 2);

        bonuses = new String[2];
        bonuses[0] = "2;Warrior";
        bonuses[1] = "3;Mortal";
        UnitCard norseUnit9 = new UnitCard(8, "Frost Giant", "CardBattleNorse9.png", 3, "Myth;Giant", 7, bonuses, 4, 2, 0, 0);
        
        bonuses = new String[1];
        bonuses[0] = "4;Myth";
        UnitCard norseUnit10 = new UnitCard(9, "Classical Norse Hero", "CardBattleNorse10.png", 1, "Hero", 5, bonuses, 3, 0, 0, 3);

        bonuses = new String[1];
        bonuses[0] = "4;Myth";
        UnitCard norseUnit11 = new UnitCard(10, "Heroic Norse Hero", "CardBattleNorse11.png", 2, "Hero", 6, bonuses, 3, 0, 0, 3);

        bonuses = new String[1];
        bonuses[0] = "4;Myth";
        UnitCard norseUnit12 = new UnitCard(11, "Mythic Norse Hero", "CardBattleNorse12.png", 3, "Hero", 8, bonuses, 4, 4, 0, 0);

        unitList.add(norseUnit1);
        unitList.add(norseUnit2);
        unitList.add(norseUnit3);
        unitList.add(norseUnit4);
        unitList.add(norseUnit5);
        unitList.add(norseUnit6);
        unitList.add(norseUnit7);
        unitList.add(norseUnit8);
        unitList.add(norseUnit9);
        unitList.add(norseUnit10);
        unitList.add(norseUnit11);
        unitList.add(norseUnit12);
        norsePlayer.setTotalUnitList(unitList);
        
        currUnitList.add(norseUnit2);
        currUnitList.add(norseUnit2);
        currUnitList.add(norseUnit3);
        currUnitList.add(norseUnit3);
        currUnitList.add(norseUnit8);
        currUnitList.add(norseUnit8);
        norsePlayer.setCurrentUnitList(currUnitList);
    }
    
    private static void greekUnitSetup() {
        List<UnitCard> unitList = new ArrayList<>();
        List<UnitCard> currUnitList = new ArrayList<>();
        String[] bonuses;

        bonuses = new String[2];
        bonuses[0] = "3;Archer";
        bonuses[1] = "3;Flyer";
        UnitCard greekUnit1 = new UnitCard(0, "Centaur", "CardBattleGreek1.png", 3, "Myth;Archer;Calvalry", 5, bonuses, 0, 1, 3, 0);

        bonuses = new String[1];
        bonuses[0] = "4;Mortal";
        UnitCard greekUnit2 = new UnitCard(1, "Cyclops", "CardBattleGreek2.png", 3, "Myth;Giant", 6, bonuses, 3, 3, 0, 0);

        bonuses = new String[1];
        bonuses[0] = "4;Giant-Killer";
        UnitCard greekUnit3 = new UnitCard(2, "Manticore", "CardBattleGreek3.png", 3, "Myth;Flyer", 5, bonuses, 2, 2, 0, 0);

        bonuses = new String[1];
        bonuses[0] = "4;Myth";
        UnitCard greekUnit4 = new UnitCard(3, "Classical Greek Hero", "CardBattleGreek4.png", 1, "Hero", 5, bonuses, 3, 0, 0, 3);

        bonuses = new String[2];
        bonuses[0] = "4;Flyer";
        bonuses[1] = "3;Warrior";
        UnitCard greekUnit5 = new UnitCard(4, "Toxotes", "CardBattleGreek5.png", 0, "Mortal;Archer", 3, bonuses, 1, 0, 1, 0);

        bonuses = new String[1];
        bonuses[0] = "4;Myth";
        UnitCard greekUnit6 = new UnitCard(5, "Heroic Greek Hero", "CardBattleGreek6.png", 2, "Hero", 6, bonuses, 3, 0, 0, 4);

        bonuses = new String[1];
        bonuses[0] = "4;Warrior";
        UnitCard greekUnit7 = new UnitCard(6, "Hydra", "CardBattleGreek7.png", 3, "Myth;Giant", 6, bonuses, 0, 2, 0, 2);

        bonuses = new String[1];
        bonuses[0] = "4;Calvalry";
        UnitCard greekUnit8 = new UnitCard(7, "Minotaur", "CardBattleGreek8.png", 3, "Myth;Warrior", 5, bonuses, 2, 0, 2, 0);
        
        bonuses = new String[1];
        bonuses[0] = "";
        UnitCard greekUnit9 = new UnitCard(8, "Mythical Greek Hero", "CardBattleGreek9.png", 3, "Hero", 5, bonuses, 0, 4, 0, 4);

        bonuses = new String[2];
        bonuses[0] = "4;Hero";
        bonuses[1] = "4;Archer";
        UnitCard greekUnit10 = new UnitCard(9, "Hippokon", "CardBattleGreek10.png", 0, "Mortal;Calvalry", 3, bonuses, 1, 0, 0, 1);

        bonuses = new String[2];
        bonuses[0] = "3;Calvalry";
        bonuses[1] = "1;Mortal";
        UnitCard greekUnit11 = new UnitCard(10, "Hoplite", "CardBattleGreek11.png", 0, "Mortal;Warrior", 3, bonuses, 1, 0, 1, 0);

        bonuses = new String[1];
        bonuses[0] = "6;Giant";
        UnitCard greekUnit12 = new UnitCard(11, "Medusa", "CardBattleGreek12.png", 3, "Myth;Giant-Killer", 5, bonuses, 1, 3, 0, 0);
        
        unitList.add(greekUnit1);
        unitList.add(greekUnit2);
        unitList.add(greekUnit3);
        unitList.add(greekUnit4);
        unitList.add(greekUnit5);
        unitList.add(greekUnit6);
        unitList.add(greekUnit7);
        unitList.add(greekUnit8);
        unitList.add(greekUnit9);
        unitList.add(greekUnit10);
        unitList.add(greekUnit11);
        unitList.add(greekUnit12);
        greekPlayer.setTotalUnitList(unitList);
        
        currUnitList.add(greekUnit5);
        currUnitList.add(greekUnit5);
        currUnitList.add(greekUnit10);
        currUnitList.add(greekUnit10);
        currUnitList.add(greekUnit11);
        currUnitList.add(greekUnit11);
        greekPlayer.setCurrentUnitList(currUnitList);
    }
    
    private static void egyptianUnitSetup() {
        List<UnitCard> unitList = new ArrayList<>();
        List<UnitCard> currUnitList = new ArrayList<>();
        String[] bonuses;
        
        bonuses = new String[1];
        bonuses[0] = "4;Myth";
        UnitCard egyptianUnit1 = new UnitCard(0, "Pharaoh", "CardBattleEgypt1.png", 2, "Hero", 6, bonuses, 3, 0, 0, 3);

        bonuses = new String[1];
        bonuses[0] = "4;Mortal";
        UnitCard egyptianUnit2 = new UnitCard(1, "Scorpion-Man", "CardBattleEgypt2.png", 3, "Myth;Giant", 5, bonuses, 4, 0, 0, 2);

        bonuses = new String[1];
        bonuses[0] = "6;Giant";
        UnitCard egyptianUnit3 = new UnitCard(2, "Sphinx", "CardBattleEgypt3.png", 3, "Myth;Giant-Killer", 5, bonuses, 0, 2, 0, 2);

        bonuses = new String[1];
        bonuses[0] = "4;Archer";
        UnitCard egyptianUnit4 = new UnitCard(3, "Anubite", "CardBattleEgypt4.png", 3, "Myth;Calvalry", 5, bonuses, 0, 1, 0, 3);

        bonuses = new String[1];
        bonuses[0] = "4;Myth";
        UnitCard egyptianUnit5 = new UnitCard(4, "Son of Osiris", "CardBattleEgypt5.png", 3, "Hero", 8, bonuses, 0, 4, 0, 4);

        bonuses = new String[2];
        bonuses[0] = "3;Flyer";
        bonuses[1] = "3;Warrior";
        UnitCard egyptianUnit6 = new UnitCard(5, "Chariot Archer", "CardBattleEgypt6.png", 0, "Mortal;Archer;Calvalry", 3, bonuses, 0, 0, 1, 1);

        bonuses = new String[1];
        bonuses[0] = "5;Myth";
        UnitCard egyptianUnit7 = new UnitCard(6, "Priest", "CardBattleEgypt7.png", 1, "Hero", 4, bonuses, 2, 0, 0, 4);

        bonuses = new String[1];
        bonuses[0] = "2;Mortal";
        UnitCard egyptianUnit8 = new UnitCard(7, "Elephant", "CardBattleEgypt8.png", 0, "Mortal;Giant", 3, bonuses, 2, 0, 0, 1);
        
        bonuses = new String[1];
        bonuses[0] = "";
        UnitCard egyptianUnit9 = new UnitCard(8, "Mummy", "CardBattleEgypt9.png", 3, "Myth", 5, bonuses, 0, 2, 0, 3);

        bonuses = new String[2];
        bonuses[0] = "3;Calvalry";
        bonuses[1] = "4;Hero";
        UnitCard egyptianUnit10 = new UnitCard(9, "Spearman", "CardBattleEgypt10.png", 0, "Mortal;Warrior", 3, bonuses, 1, 0, 1, 0);

        bonuses = new String[1];
        bonuses[0] = "4;Giant-Killer";
        UnitCard egyptianUnit11 = new UnitCard(10, "Phoenix", "CardBattleEgypt11.png", 3, "Myth;Flyer", 6, bonuses, 0, 3, 2, 0);

        bonuses = new String[1];
        bonuses[0] = "4;Calvalry";
        UnitCard egyptianUnit12 = new UnitCard(11, "Wadjet", "CardBattleEgypt12.png", 3, "Myth;Warrior", 5, bonuses, 2, 2, 0, 0);
        unitList.add(egyptianUnit1);
        unitList.add(egyptianUnit2);
        unitList.add(egyptianUnit3);
        unitList.add(egyptianUnit4);
        unitList.add(egyptianUnit5);
        unitList.add(egyptianUnit6);
        unitList.add(egyptianUnit7);
        unitList.add(egyptianUnit8);
        unitList.add(egyptianUnit9);
        unitList.add(egyptianUnit10);
        unitList.add(egyptianUnit11);
        unitList.add(egyptianUnit12);
        egyptianPlayer.setTotalUnitList(unitList);
        
        currUnitList.add(egyptianUnit6);
        currUnitList.add(egyptianUnit6);
        currUnitList.add(egyptianUnit8);
        currUnitList.add(egyptianUnit8);
        currUnitList.add(egyptianUnit10);
        currUnitList.add(egyptianUnit10);
        egyptianPlayer.setCurrentUnitList(currUnitList);
    }
    
    private static List<TerrainTiles> terrainSetup() {
        List<TerrainTiles> terrains = new ArrayList<TerrainTiles>();
        TerrainTiles tile1 = new TerrainTiles(0, "fertile", "Fertile2Food.png", 12, 2, 0, 0, 0);
        terrains.add(tile1);
        TerrainTiles tile2 = new TerrainTiles(1, "fertile", "Fertile1Wood.png", 3, 0, 0, 1, 0);
        terrains.add(tile2);
        TerrainTiles tile3 = new TerrainTiles(2, "fertile", "Fertile1Favor.png", 3, 0, 1, 0, 0);
        terrains.add(tile3);
        TerrainTiles tile4 = new TerrainTiles(3, "fertile", "Fertile1Gold.png", 3, 0, 0, 0, 1);
        terrains.add(tile4);
        TerrainTiles tile5 = new TerrainTiles(4, "forest", "Forest2Wood.png", 9, 0, 0, 2, 0);
        terrains.add(tile5);
        TerrainTiles tile6 = new TerrainTiles(5, "forest", "Forest1Food.png", 2, 1, 0, 0, 0);
        terrains.add(tile6);
        TerrainTiles tile7 = new TerrainTiles(6, "forest", "Forest1Gold.png", 2, 0, 0, 0, 1);
        terrains.add(tile7);
        TerrainTiles tile8 = new TerrainTiles(7, "forest", "Forest1Favor.png", 2, 0, 1, 0, 0);
        terrains.add(tile8);
        TerrainTiles tile9 = new TerrainTiles(8, "hill", "Hills2GOld.png", 4, 0, 0, 0, 2);
        terrains.add(tile9);
        TerrainTiles tile10 = new TerrainTiles(9, "hill", "Hills1Food.png", 4, 1, 0, 0, 0);
        terrains.add(tile10);
        TerrainTiles tile11 = new TerrainTiles(10, "hill", "Hills1Wood.png", 4, 0, 0, 1, 0);
        terrains.add(tile11);
        TerrainTiles tile12 = new TerrainTiles(11, "hill", "Hills1Favor.png", 4, 0, 1, 0, 0);
        terrains.add(tile12);
        TerrainTiles tile13 = new TerrainTiles(12, "mountain", "Mountain2Gold.png", 6, 0, 0, 0, 2);
        terrains.add(tile13);
        TerrainTiles tile14 = new TerrainTiles(13, "mountain", "Mountain1Wood.png", 3, 0, 0, 1, 0);
        terrains.add(tile14);
        TerrainTiles tile15 = new TerrainTiles(14, "mountain", "Mountain1Favor.png", 3, 0, 1, 0, 0);
        terrains.add(tile15);
        TerrainTiles tile16 = new TerrainTiles(15, "desert", "Desert2Favor.png", 7, 0, 2, 0, 0);
        terrains.add(tile16);
        TerrainTiles tile17 = new TerrainTiles(16, "desert", "Desert1Gold.png", 7, 0, 0, 0, 1);
        terrains.add(tile17);
        TerrainTiles tile18 = new TerrainTiles(17, "swamp", "Swamp1Wood.png", 4, 0, 0, 1, 0);
        terrains.add(tile18);
        TerrainTiles tile19 = new TerrainTiles(18, "swamp", "Swamp1Food.png", 4, 1, 0, 0, 0);
        terrains.add(tile19);
        TerrainTiles tile20 = new TerrainTiles(19, "swamp", "Swamp1Favor.png", 4, 0, 1, 0, 0);
        terrains.add(tile20);
        
        return terrains;
    }
    
    private static List<TerrainTiles> randomTerrainTiles(List<TerrainTiles> terrainList) {
        List<TerrainTiles> randomTerrain = new ArrayList<>();
        int count = 0, num = 0, ndx = 0;
        
        for(int i = 0; i < 18; i++) {
            Random rand = new Random(System.nanoTime());
            num = rand.nextInt(90)+1;
            ndx = getTerrainListIndex(num);
            TerrainTiles terrain = terrainList.get(ndx);
            count = terrain.getTileCount();
            
            while(count == 0) {
                num = rand.nextInt(90)+1;
                ndx = getTerrainListIndex(num);
                terrain = terrainList.get(ndx);
                count = terrain.getTileCount();
            }
            
            terrain.setTileCount(count - 1);
            terrainList.set(ndx, terrain);
            randomTerrain.add(terrain);
        }
        
        bGUI.setTerrainTabLabelIcon(randomTerrain);
        
        return terrainList;
    }
    
    private static int getTerrainListIndex(int num) {
        if(num >= 1 && num <= 12) {
            return 0;
        }
        else if(num >= 13 && num <= 15) {
            return 1;
        }
        else if(num >= 16 && num <= 18) {
            return 2;
        }
        else if(num >= 19 && num <= 21) {
            return 3;
        }
        else if(num >= 22 && num <= 30) {
            return 4;
        }
        else if(num >= 31 && num <= 32) {
            return 5;
        }
        else if(num >= 33 && num <= 34) {
            return 6;
        }
        else if(num >= 35 && num <= 36) {
            return 7;
        }
        else if(num >= 37 && num <= 40) {
            return 8;
        }
        else if(num >= 41 && num <= 44) {
            return 9;
        }
        else if(num >= 45 && num <= 48) {
            return 10;
        }
        else if(num >= 49 && num <= 52) {
            return 11;
        }
        else if(num >= 53 && num <= 58) {
            return 12;
        }
        else if(num >= 59 && num <= 61) {
            return 13;
        }
        else if(num >= 62 && num <= 64) {
            return 14;
        }
        else if(num >= 65 && num <= 71) {
            return 15;
        }
        else if(num >= 72 && num <= 78) {
            return 16;
        }
        else if(num >= 79 && num <= 82) {
            return 17;
        }
        else if(num >= 83 && num <= 86) {
            return 18;
        }
        else if(num >= 87 && num <= 90) {
            return 19;
        }
        return 0;
    }
    
    public boolean terrainHandler(java.awt.event.MouseEvent evt) {
        String index = evt.getComponent().getAccessibleContext().getAccessibleDescription();
        TerrainTiles selectedTerrain = getTerrainTile(Integer.parseInt(index));
        boolean terrainSuccess = checkMaxTerrain(selectedTerrain);
        
        if(terrainSuccess == true) {
            evt.getComponent().setVisible(false);
        }
        
        return terrainSuccess;
    }
    
    private boolean checkMaxTerrain(TerrainTiles terrain) {
        List<TerrainTiles> cultureTerrain = null;
        int[] arr = {};
        
        if(this.playerCulture.compareTo("Norse") == 0) {
            cultureTerrain = norsePlayer.getNorseTerrains();
            arr = norsePlayer.getMaxTerrains();
        }
        else if(this.playerCulture.compareTo("Greek") == 0) {
            cultureTerrain = greekPlayer.getGreekTerrains();
            arr = greekPlayer.getMaxTerrains();
        }
        else if(this.playerCulture.compareTo("Egyptian") == 0) {
            cultureTerrain = egyptianPlayer.getEgyptianTerrains();
            arr = egyptianPlayer.getMaxTerrains();
        }
        
        if(terrain.getTerrainType().compareTo("fertile") == 0) {
            return this.addTerrainToList(playerCulture, 0, arr, cultureTerrain, terrain);
        }
        else if(terrain.getTerrainType().compareTo("forest") == 0) {
            return this.addTerrainToList(playerCulture, 1, arr, cultureTerrain, terrain);
        }
        else if(terrain.getTerrainType().compareTo("hill") == 0) {
            return this.addTerrainToList(playerCulture, 2, arr, cultureTerrain, terrain);
        }
        else if(terrain.getTerrainType().compareTo("mountain") == 0) {
            return this.addTerrainToList(playerCulture, 3, arr, cultureTerrain, terrain);
        }
        else if(terrain.getTerrainType().compareTo("desert") == 0) {
            return this.addTerrainToList(playerCulture, 4, arr, cultureTerrain, terrain);
        }
        else if(terrain.getTerrainType().compareTo("swamp") == 0) {
            return this.addTerrainToList(playerCulture, 5, arr, cultureTerrain, terrain);
        }
        
        return false;
    }
    
    private boolean addTerrainToList(String culture, int index, int[] arr, List<TerrainTiles> cultureTerrain, TerrainTiles terrain) {
        if(arr[index] > 0) {
            arr[index]--;
            if(culture.compareTo("Norse") == 0) {
                norsePlayer.setMaxTerrains(arr);
            }
            else if(culture.compareTo("Greek") == 0) {
                greekPlayer.setMaxTerrainGreek(arr);
            }
            else {
                egyptianPlayer.setMaxTerrainEgyptian(arr);
            }
            cultureTerrain.add(terrain);
            return true;
        }
        else {
            displayError();
        }
        
        return false;
    }
    
    private void displayError() {
        TerrainErrorGUI error = new TerrainErrorGUI();
        error.setVisible(true);
    }
    
    public void aiTurnHandler(javax.swing.JTabbedPane tabpanel, Component[] terrainComponents, Component[] norseTerrain, Component[] greekTerrain, Component[] egyptianTerrain) {
        List<String> aiPlayers = findAIPlayers();

        for(int i = 0; i < 2; i++) {
            if(aiPlayers.get(i).compareTo("Norse") == 0) {
                findAITerrain(aiPlayers.get(i), norseTerrain, terrainComponents, norsePlayer.getNorseTerrains());
            }
            else if(aiPlayers.get(i).compareTo("Greek") == 0) {
                findAITerrain(aiPlayers.get(i), greekTerrain, terrainComponents, greekPlayer.getGreekTerrains());
            }
            else if(aiPlayers.get(i).compareTo("Egyptian") == 0) {
                findAITerrain(aiPlayers.get(i), egyptianTerrain, terrainComponents, egyptianPlayer.getEgyptianTerrains());
            }
        }
        for(int j = 1; j >= 0; j--) {
            if(aiPlayers.get(j).compareTo("Norse") == 0) {
                findAITerrain(aiPlayers.get(j), norseTerrain, terrainComponents, norsePlayer.getNorseTerrains());
            }
            else if(aiPlayers.get(j).compareTo("Greek") == 0) {
                findAITerrain(aiPlayers.get(j), greekTerrain, terrainComponents, greekPlayer.getGreekTerrains());
            }
            else if(aiPlayers.get(j).compareTo("Egyptian") == 0) {
                findAITerrain(aiPlayers.get(j), egyptianTerrain, terrainComponents, egyptianPlayer.getEgyptianTerrains());
            }
        }
    }
    
    private List<String> findAIPlayers() {
        List<String> aiList = new ArrayList<>();
        
        if(playerCulture.compareTo("Norse") == 0) {
            aiList.add("Greek");
            aiList.add("Egyptian");
        }
        else if(playerCulture.compareTo("Greek") == 0) {
            aiList.add("Norse");
            aiList.add("Egyptian");
        }
        else if(playerCulture.compareTo("Egyptian") == 0) {
            aiList.add("Norse");
            aiList.add("Greek");
        }
        
        return aiList;
    }
    
    public void findAITerrain(String culture, Component[] boardTerrains, Component[] tabTerrains, List<TerrainTiles> cultureTerrains) {
        for(Component tabTerrain : tabTerrains) {
            if(tabTerrain instanceof javax.swing.JPanel) {
                javax.swing.JPanel panel = (javax.swing.JPanel) tabTerrain;
                javax.swing.JLabel label = (javax.swing.JLabel) panel.getComponent(0);
                if(label.isVisible()) {
                    TerrainTiles tabTile = terrainList.get(Integer.parseInt(label.getAccessibleContext().getAccessibleDescription()));
                    for(Component boardTerrain : boardTerrains) {
                        javax.swing.JPanel panel2 = (javax.swing.JPanel) boardTerrain;
                        javax.swing.JLabel label2 = (javax.swing.JLabel) panel2.getComponent(0);
                        if(label2.getAccessibleContext().getAccessibleDescription().compareTo(tabTile.getTerrainType()) == 0) {
                            cultureTerrains.add(tabTile);
                            decrementMaxTerrains(culture, tabTile);
                            label.setVisible(false);
                            label2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/" + tabTile.getFileName())));
                            label2.getAccessibleContext().setAccessibleDescription("");
                            label2.getAccessibleContext().setAccessibleName(tabTile.getFileName());
                            return;
                        }
                    }
                }
            }
        }
    }
    
    private void decrementMaxTerrains(String culture, TerrainTiles terrain) {
        String type = terrain.getTerrainType();
       
        if(culture.compareTo("Norse") == 0) {
            int[] arr = norsePlayer.getMaxTerrains();
            
            if(type.compareTo("fertile") == 0) {
                arr[0] -= 1;
            }
            else if(type.compareTo("forest") == 0) {
                arr[1] -= 1;
            }
            else if(type.compareTo("hill") == 0) {
                arr[2] -= 1;
            }
            else if(type.compareTo("mountain") == 0) {
                arr[3] -= 1;
            }
            else if(type.compareTo("desert") == 0) {
                arr[4] -= 1;
            }
            else if(type.compareTo("swamp") == 0) {
                arr[5] -= 1;
            }
            norsePlayer.setMaxTerrains(arr);
        }
        else if(culture.compareTo("Greek") == 0) {
            int[] arr = greekPlayer.getMaxTerrains();
            
            if(type.compareTo("fertile") == 0) {
                arr[0] -= 1;
            }
            else if(type.compareTo("forest") == 0) {
                arr[1] -= 1;
            }
            else if(type.compareTo("hill") == 0) {
                arr[2] -= 1;
            }
            else if(type.compareTo("mountain") == 0) {
                arr[3] -= 1;
            }
            else if(type.compareTo("desert") == 0) {
                arr[4] -= 1;
            }
            else if(type.compareTo("swamp") == 0) {
                arr[5] -= 1;
            }
            greekPlayer.setMaxTerrainGreek(arr);
        }
        else {
            int[] arr = egyptianPlayer.getMaxTerrains();
            
            if(type.compareTo("fertile") == 0) {
                arr[0] -= 1;
            }
            else if(type.compareTo("forest") == 0) {
                arr[1] -= 1;
            }
            else if(type.compareTo("hill") == 0) {
                arr[2] -= 1;
            }
            else if(type.compareTo("mountain") == 0) {
                arr[3] -= 1;
            }
            else if(type.compareTo("desert") == 0) {
                arr[4] -= 1;
            }
            else if(type.compareTo("swamp") == 0) {
                arr[5] -= 1;
            }
            egyptianPlayer.setMaxTerrainEgyptian(arr);
        }
    }
    
    public void drawVictoryCard(int cardClicked, int previousClick) {
        victoryCards[cardClicked] += 1;
        
        if(previousClick > -1) {
            victoryCards[previousClick] -= 1;
        }
        
        drawVictoryCubes();
    }
    
    public void drawVictoryCubes() {
        victoryCardGUI vcGUI = victoryCardGUI.getInstance();
        vcGUI.drawPanelsOne(victoryCards[0]);
        vcGUI.drawPanelsTwo(victoryCards[1]);
        vcGUI.drawPanelsThree(victoryCards[2]);
        vcGUI.drawPanelsFour(victoryCards[3]);
    }
    
    private int getMaxCards() {
        int age = 0;
        if(playerCulture.compareTo("Norse") == 0) {
            age = norsePlayer.getAge();
        }
        else if(playerCulture.compareTo("Greek") == 0) {
            age = greekPlayer.getAge();
        }
        else {
            age = egyptianPlayer.getAge();
        }
        
        if(age == 0) {
            return 4;
        }
        else if(age == 1) {
            return 5;
        }
        else if(age == 2) {
            return 6;
        }
        else {
            return 7;
        }
    }
    
    private void playNextAgeCard(String culture) {
        CardPlayError cardError = new CardPlayError();
        if(culture.compareTo("Norse") == 0) {
            int reqResources = findAge(norsePlayer.getAge());
            boolean advanceAge = checkAgeReqs(reqResources, norsePlayer.getWood(), norsePlayer.getGold(), norsePlayer.getFood(), norsePlayer.getFavor());
            if(advanceAge == true && reqResources >= 3) {
                norsePlayer.setWood(norsePlayer.getWood() - reqResources);
                norsePlayer.setGold(norsePlayer.getGold() - reqResources);
                norsePlayer.setFood(norsePlayer.getFood() - reqResources);
                norsePlayer.setFavor(norsePlayer.getFavor() - reqResources);
                norsePlayer.setAge(norsePlayer.getAge()+1);
                bGUI.changeAgeText("Norse", norsePlayer.getAge(), norsePlayer.getWood(), norsePlayer.getGold(), norsePlayer.getFood(), norsePlayer.getFavor(), norsePlayer.getVictory());
            }
            else {
                cardError.setVisible(true);
            }
        }
        else if(culture.compareTo("Greek") == 0) {
            int reqResources = findAge(greekPlayer.getAge());
            boolean advanceAge = checkAgeReqs(reqResources, greekPlayer.getWood(), greekPlayer.getGold(), greekPlayer.getFood(), greekPlayer.getFavor());
            if(advanceAge == true && reqResources >= 3) {
                greekPlayer.setWood(greekPlayer.getWood() - reqResources);
                greekPlayer.setGold(greekPlayer.getGold() - reqResources);
                greekPlayer.setFood(greekPlayer.getFood() - reqResources);
                greekPlayer.setFavor(greekPlayer.getFavor() - reqResources);
                greekPlayer.setAge(greekPlayer.getAge()+1);
                bGUI.changeAgeText("Greek", greekPlayer.getAge(), greekPlayer.getWood(), greekPlayer.getGold(), greekPlayer.getFood(), greekPlayer.getFavor(), greekPlayer.getVictory());
            }
            else {
                cardError.setVisible(true);
            }
        }
        else {
            int reqResources = findAge(egyptianPlayer.getAge());
            boolean advanceAge = checkAgeReqs(reqResources, egyptianPlayer.getWood(), egyptianPlayer.getGold(), egyptianPlayer.getFood(), egyptianPlayer.getFavor());
            if(advanceAge == true && reqResources >= 3) {
                egyptianPlayer.setWood(egyptianPlayer.getWood() - reqResources);
                egyptianPlayer.setGold(egyptianPlayer.getGold() - reqResources);
                egyptianPlayer.setFood(egyptianPlayer.getFood() - reqResources);
                egyptianPlayer.setFavor(egyptianPlayer.getFavor() - reqResources);
                egyptianPlayer.setAge(egyptianPlayer.getAge()+1);
                bGUI.changeAgeText("Egyptian", egyptianPlayer.getAge(), egyptianPlayer.getWood(), egyptianPlayer.getGold(), egyptianPlayer.getFood(), egyptianPlayer.getFavor(), egyptianPlayer.getVictory());
            }
            else {
                cardError.setVisible(true);
            }
        }
    }
    
    private int findAge(int currentAge) {
        if(currentAge == 0) {
            return 3;
        }
        else if(currentAge == 1) {
            return 4;
        }
        else if(currentAge == 2){
            return 5;
        }
        else {
            return -1;
        }
    }
    
    private boolean checkAgeReqs(int reqResources, int wood, int gold, int food, int favor) {
        if(wood >= reqResources && gold >= reqResources && food >= reqResources && favor >= reqResources) {
            return true;
        }
        
        return false;
    }
    
    private void aiGatherHandler() {
        String str = getRandomGatherType();
        String culture = aiCulture;
        System.out.println("AI " + culture + " gathered the " + str);
        playGatherCard(str, culture);
        
        str = getRandomGatherType();
        culture = aiCulture2;
        System.out.println("AI " + culture + " gathered the " + str);
        playGatherCard(str, culture);
    }
    
    private String getRandomGatherType() {
        Random rand = new Random(System.nanoTime());
        String str = "";
        int num = rand.nextInt(10);
        
        if(num == 0) {
            str = "desert";
        }
        else if(num == 1) {
            str = "fertile";
        }
        else if(num == 2) {
            str = "hill";
        }
        else if(num == 3) {
            str = "forest";
        }
        else if(num == 4) {
            str = "mountain";
        }
        else if(num == 5) {
            str = "swamp";
        }
        else if(num == 6) {
            str = "favor";
        }
        else if(num == 7) {
            str = "food";
        }
        else if(num == 8) {
            str = "wood";
        }
        else {
            str = "gold";
        }
        
        return str;
    }
    
    public void playGatherCard(String str, String culture) {
        if(str == "mountain" || str == "hill" || str == "swamp" || str == "fertile" || str == "desert" || str == "forest") {
            scanTerrainTypes(str, culture, 1);
        }
        else {
            scanTerrainTypes(str, culture, 2);
        }
    }
    
    private void scanTerrainTypes(String str, String culture, int scanType) {
        List<TerrainTiles> terrains;
        int[] arr;
        
        if(culture.compareTo("Norse") == 0) {
            terrains = norsePlayer.getNorseTerrains();
            if(scanType == 1)
                arr = calculateTerrainResources(str, terrains);
            else
                arr = calculateResources(str, terrains);
            arr = checkBuildingBonuses(arr, "Norse");
            norsePlayer.setFood(arr[0] + norsePlayer.getFood());
            norsePlayer.setFavor(arr[1] + norsePlayer.getFavor());
            norsePlayer.setWood(arr[2] + norsePlayer.getWood());
            norsePlayer.setGold(arr[3] + norsePlayer.getGold());
            bGUI.changeBoardResources(culture, norsePlayer.getWood(), norsePlayer.getGold(), norsePlayer.getFood(), norsePlayer.getFavor(), norsePlayer.getVictory());
            
        }
        else if(culture.compareTo("Greek") == 0) {
            terrains = greekPlayer.getGreekTerrains();
            if(scanType == 1)
                arr = calculateTerrainResources(str, terrains);
            else
                arr = calculateResources(str, terrains);
            arr = checkBuildingBonuses(arr, "Greek");
            greekPlayer.setFood(arr[0] + greekPlayer.getFood());
            greekPlayer.setFavor(arr[1] + greekPlayer.getFavor());
            greekPlayer.setWood(arr[2] + greekPlayer.getWood());
            greekPlayer.setGold(arr[3] + greekPlayer.getGold());
            bGUI.changeBoardResources(culture, greekPlayer.getWood(), greekPlayer.getGold(), greekPlayer.getFood(), greekPlayer.getFavor(), egyptianPlayer.getVictory());
        }
        else {
            terrains = egyptianPlayer.getEgyptianTerrains();
            if(scanType == 1)
                arr = calculateTerrainResources(str, terrains);
            else
                arr = calculateResources(str, terrains);
            arr = checkBuildingBonuses(arr, "Egyptian");
            egyptianPlayer.setFood(arr[0] + egyptianPlayer.getFood());
            egyptianPlayer.setFavor(arr[1] + egyptianPlayer.getFavor());
            egyptianPlayer.setWood(arr[2] + egyptianPlayer.getWood());
            egyptianPlayer.setGold(arr[3] + egyptianPlayer.getGold());
            bGUI.changeBoardResources(culture, egyptianPlayer.getWood(), egyptianPlayer.getGold(), egyptianPlayer.getFood(), egyptianPlayer.getFavor(), egyptianPlayer.getVictory());
        }
    }
    
    private int[] checkBuildingBonuses(int[] arr, String culture) {
        if(culture.compareTo("Norse") == 0) {
            if(norsePlayer.isGoldmint() == true) {
                arr[3] += 2;
            }
            if(norsePlayer.isGranary() == true) {
                arr[0] += 2;
            }
            if(norsePlayer.isMonument() == true) {
                arr[1] += 2;
            }
            if(norsePlayer.isWoodworkshop() == true) {
                arr[2] += 2;
            }
        }
        else if(culture.compareTo("Greek") == 0) {
            if(greekPlayer.isGoldmint() == true) {
                arr[3] += 2;
            }
            if(greekPlayer.isGranary() == true) {
                arr[0] += 2;
            }
            if(greekPlayer.isMonument() == true) {
                arr[1] += 2;
            }
            if(greekPlayer.isWoodworkshop() == true) {
                arr[2] += 2;
            }
        }
        else {
            if(egyptianPlayer.isGoldmint() == true) {
                arr[3] += 2;
            }
            if(egyptianPlayer.isGranary() == true) {
                arr[0] += 2;
            }
            if(egyptianPlayer.isMonument() == true) {
                arr[1] += 2;
            }
            if(egyptianPlayer.isWoodworkshop() == true) {
                arr[2] += 2;
            }
        }
        
        return arr;
    }
    
    private int[] calculateTerrainResources(String str, List<TerrainTiles> terrains) {
        int[] arr = {0,0,0,0};
        
        for(int i = 0; i < terrains.size(); i++) {
            TerrainTiles tile = terrains.get(i);

            if(str.compareTo(tile.getTerrainType()) == 0) {
                arr[0] += tile.getFoodCount();
                arr[1] += tile.getFavorCount();
                arr[2] += tile.getWoodCount();
                arr[3] += tile.getGoldCount();
            }
        }
        
        return arr;
    }
    
    private int[] calculateResources(String str, List<TerrainTiles> terrains) {
        int[] arr = {0,0,0,0};
        
        for(int i = 0; i < terrains.size(); i++) {
            TerrainTiles tile = terrains.get(i);
            
            if(str.compareTo("food") == 0) {
                arr[0] += tile.getFoodCount();
            }
            else if(str.compareTo("favor") == 0) {
                arr[1] += tile.getFavorCount();
            }
            else if(str.compareTo("wood") == 0) {
                arr[2] += tile.getWoodCount();
            }
            else {
                arr[3] += tile.getGoldCount();
            }
        }
        
        return arr;
    }
    
    public void updateResources(String culture) {
        if(culture.compareTo("Norse") == 0) {
            bGUI.changeBoardResources(culture, norsePlayer.getWood(), norsePlayer.getGold(), norsePlayer.getFood(), norsePlayer.getFavor(), norsePlayer.getVictory());
        }
        else if(culture.compareTo("Greek") == 0) {
            bGUI.changeBoardResources(culture, greekPlayer.getWood(), greekPlayer.getGold(), greekPlayer.getFood(), greekPlayer.getFavor(), greekPlayer.getVictory());
        }
        else {
            bGUI.changeBoardResources(culture, egyptianPlayer.getWood(), egyptianPlayer.getGold(), egyptianPlayer.getFood(), egyptianPlayer.getFavor(), egyptianPlayer.getVictory());
        }
    }
    
    private List<TerrainTiles> pickExploreTerrains(exploreGUI eGUI) {
        List<TerrainTiles> randomTerrain = new ArrayList<>();
        int count = 0, num = 0, ndx = 0;
        
        for(int i = 0; i < 4; i++) {
            Random rand = new Random(System.nanoTime());
            num = rand.nextInt(90)+1;
            ndx = getTerrainListIndex(num);
            TerrainTiles terrain = terrainList.get(ndx);
            count = terrain.getTileCount();
            
            while(count == 0) {
                num = rand.nextInt(90)+1;
                ndx = getTerrainListIndex(num);
                terrain = terrainList.get(ndx);
                count = terrain.getTileCount();
            }
            
            terrain.setTileCount(count - 1);
            terrainList.set(ndx, terrain);
            randomTerrain.add(terrain);
        }
        
        eGUI.setTerrainIcon(randomTerrain);
        
        return terrainList;
    }
    
    public void exploreHandler(java.awt.event.MouseEvent evt, javax.swing.JPanel panel) {
            bGUI.selectCultureTerrain(evt);
            exploreAiHandler(panel);
    }
    
    public void exploreAiHandler(javax.swing.JPanel panel) {
        bGUI.selectAiExploreTerrain(panel, aiCulture);
        bGUI.selectAiExploreTerrain(panel, aiCulture2);
    }
    
    public void buildBuilding(String culture, String building) {
        bGUI.setupBuildingIcon(culture, building);
    }
    
    private void spoilage() {
        spoilageNorse();
        spoilageGreek();
        spoilageEgyptian();
        //cleanup
        //start new turn
    }
    
    private void spoilageNorse() {
        int max = 5;
        Bank bank = Bank.getInstance();
        
        if(norsePlayer.isStorehouse() == true) {
            max = 8;
        }
        if(norsePlayer.getFood() > max) {
            int excess = norsePlayer.getFood() - max;
            norsePlayer.setFood(norsePlayer.getFood() - excess);
            bank.setFood(bank.getFood() + excess);
        }
        if(norsePlayer.getFavor() > max) {
            int excess = norsePlayer.getFavor() - max;
            norsePlayer.setFavor(norsePlayer.getFavor() - excess);
        }
        if(norsePlayer.getWood() > max) {
            int excess = norsePlayer.getWood() - max;
            norsePlayer.setWood(norsePlayer.getWood() - excess);
            bank.setWood(bank.getWood() + excess);
        }
        if(norsePlayer.getGold() > max) {
            int excess = norsePlayer.getGold() - max;
            norsePlayer.setGold(norsePlayer.getGold() - excess);
            bank.setGold(bank.getGold() + excess);
        }
        
        updateResources("Norse");
    }
    
        private void spoilageGreek() {
        int max = 5;
        Bank bank = Bank.getInstance();
        
        if(greekPlayer.isStorehouse() == true) {
            max = 8;
        }
        if(greekPlayer.getFood() > max) {
            int excess = greekPlayer.getFood() - max;
            greekPlayer.setFood(greekPlayer.getFood() - excess);
            bank.setFood(bank.getFood() + excess);
        }
        if(greekPlayer.getFavor() > max) {
            int excess = greekPlayer.getFavor() - max;
            greekPlayer.setFavor(greekPlayer.getFavor() - excess);
            bank.setFavor(bank.getFavor() + excess);
        }
        if(greekPlayer.getWood() > max) {
            int excess = greekPlayer.getWood() - max;
            greekPlayer.setWood(greekPlayer.getWood() - excess);
            bank.setWood(bank.getWood() + excess);
        }
        if(greekPlayer.getGold() > max) {
            int excess = greekPlayer.getGold() - max;
            greekPlayer.setGold(greekPlayer.getGold() - excess);
            bank.setGold(bank.getGold() + excess);
        }
        
        updateResources("Greek");
    }
        
    private void spoilageEgyptian() {
        int max = 5;
        Bank bank = Bank.getInstance();
        
        if(egyptianPlayer.isStorehouse() == true) {
            max = 8;
        }
        if(egyptianPlayer.getFood() > max) {
            int excess = egyptianPlayer.getFood() - max;
            egyptianPlayer.setFood(egyptianPlayer.getFood() - excess);
            bank.setFood(bank.getFood() + excess);
        }
        if(egyptianPlayer.getFavor() > max) {
            int excess = egyptianPlayer.getFavor() - max;
            egyptianPlayer.setFavor(egyptianPlayer.getFavor() - excess);
            bank.setFavor(bank.getFavor() + excess);
        }
        if(egyptianPlayer.getWood() > max) {
            int excess = egyptianPlayer.getWood() - max;
            egyptianPlayer.setWood(egyptianPlayer.getWood() - excess);
            bank.setWood(bank.getWood() + excess);
        }
        if(egyptianPlayer.getGold() > max) {
            int excess = egyptianPlayer.getGold() - max;
            egyptianPlayer.setGold(egyptianPlayer.getGold() - excess);
            bank.setGold(bank.getGold() + excess);
        }
        
        updateResources("Egyptian");
    }
    
    public void setupAttackCard(String opponent, String attackingArea) {
        int max = 4;
        int size = 0;
        
        if(opponent.compareTo("Norse") == 0) {
            size = norsePlayer.getCurrentUnitList().size();
        }
        else if(opponent.compareTo("Greek") == 0) {
            size = greekPlayer.getCurrentUnitList().size();
        }
        else {
            size = egyptianPlayer.getCurrentUnitList().size();
        }
        
        if(size > 0) {
            aiBattleUnits = getOpponentSelection(opponent, max);
            attackUnitSelectionGUI ausGUI = new attackUnitSelectionGUI();
            ausGUI.setVisible(true);
            if(playerCulture.compareTo("Norse") == 0) {
                if(norsePlayer.isArmory()) {
                    max += 1;
                }
            }
            else if(playerCulture.compareTo("Greek") == 0) {
                if(greekPlayer.isArmory()) {
                    max += 1;
                }
            }
            else {
                if(egyptianPlayer.isArmory()) {
                    max += 1;
                }
            }
            ausGUI.setMaxCards(max);
            ausGUI.setupAttackGUI(playerCulture, opponent);
            ausGUI.setAttackingArea(attackingArea);
        }
        else {
            distributeBattleVictory(playerCulture);
            if(attackingArea.compareTo("holding") == 0) {
                attackHoldingAreaGUI ahaGUI = new attackHoldingAreaGUI();
                ahaGUI.setupHoldingAreaGUI(playerCulture, opponent);
                ahaGUI.setVisible(true);
            }
            else if(attackingArea.compareTo("city") == 0) {
                attackCityAreaGUI acaGUI = new attackCityAreaGUI();
                acaGUI.setVisible(true);
                int maxBuildings = getMaxBuildingDestroy(playerCulture);
                acaGUI.setupCityAreaGUI(opponent, maxBuildings);
            }
            else {
                attackProductionAreaGUI apaGUI = new attackProductionAreaGUI();
                apaGUI.setupProductionArea(playerCulture, opponent);
                apaGUI.setVisible(true);
            }
        }
    }
    
    public void setupBattle(List<UnitCard> selectedUnits, String opponent, String attackingArea) {
        attackUnitPlayGUI aupGUI = new attackUnitPlayGUI();
        aupGUI.setVisible(true);
        aupGUI.setupCards(selectedUnits, opponent);
        aupGUI.setMaxCards(selectedUnits.size());
        aupGUI.setAttackingArea(attackingArea);
    }
    
    public void commenceBattle(String attacker, List<UnitCard> selectedUnits, UnitCard attackerCard, String defender, String attackingArea) {
        Random rand = new Random(System.nanoTime());
        UnitCard defenderCard = null;
        attackUnitPlayGUI aupGUI = new attackUnitPlayGUI();
        
        if(aiBattleUnits.size() > 0) {
            int ndx = rand.nextInt(aiBattleUnits.size());
            defenderCard = aiBattleUnits.get(ndx);
            aiBattleUnits.remove(ndx);
        }
        
        
        int attackerDice = compareCardsAttacker(attacker, attackerCard, defenderCard.getType());
        int defenderDice = compareCardsDefender(attacker, defender, attackingArea, defenderCard, attackerCard.getType());
        
        int[] attackerRolls = rollDice(attackerDice);
        int[] defenderRolls = rollDice(defenderDice);
        int attackerSixes = countSixes(attackerRolls);
        int defenderSixes = countSixes(defenderRolls);
        
        while((attackerSixes == 0 && defenderSixes == 0) || (attackerSixes == defenderSixes)) {
            attackerRolls = rollDice(attackerDice);
            defenderRolls = rollDice(defenderDice);
            attackerSixes = countSixes(attackerRolls);
            defenderSixes = countSixes(defenderRolls);
        }
        
        String victor = "";
        if(attackerSixes > defenderSixes) {
            victor = attacker;
        }
        else {
            victor = defender;
        }
        if(victor.compareTo(attacker) == 0) {
            selectedUnits.add(attackerCard);
        }
        else {
            aiBattleUnits.add(defenderCard);
        }
        
        if(aiBattleUnits.isEmpty()) {
            aupGUI.setVisible(false);
            roundResultsGUI rrGUI = new roundResultsGUI();
            rrGUI.setTextInfo(attacker, attackerCard.getName(), Arrays.toString(attackerRolls), defender, defenderCard.getName(), Arrays.toString(defenderRolls), victor);
            rrGUI.setVisible(true);
            distributeBattleVictory(attacker);
            addUnitsBacktoList(attacker, selectedUnits);
            if(attackingArea.compareTo("holding") == 0) {
                attackHoldingAreaGUI ahaGUI = new attackHoldingAreaGUI();
                ahaGUI.setupHoldingAreaGUI(attacker, defender);
                ahaGUI.setVisible(true);
            }
            else if(attackingArea.compareTo("city") == 0) {
                attackCityAreaGUI acaGUI = new attackCityAreaGUI();
                acaGUI.setVisible(true);
                int max = getMaxBuildingDestroy(attacker);
                acaGUI.setupCityAreaGUI(defender, max);
            }
            else {
                attackProductionAreaGUI apaGUI = new attackProductionAreaGUI();
                apaGUI.setupProductionArea(attacker, defender);
                apaGUI.setVisible(true);
            }
        }
        else if(selectedUnits.isEmpty()) {
            aupGUI.setVisible(false);
            roundResultsGUI rrGUI = new roundResultsGUI();
            rrGUI.setTextInfo(attacker, attackerCard.getName(), Arrays.toString(attackerRolls), defender, defenderCard.getName(), Arrays.toString(defenderRolls), victor);
            rrGUI.setVisible(true);
            attackResultsGUI arGUI = new attackResultsGUI();
            arGUI.setTextInfo("You unsuccessfully attacked the enemy.");
            arGUI.setVisible(true);
            distributeBattleVictory(defender);
            addUnitsBacktoList(defender, aiBattleUnits);
            initPlayPermCards();
        }
        else {
            aupGUI.setVisible(true);
            aupGUI.setMaxCards(selectedUnits.size());
            aupGUI.setupCards(selectedUnits, defender);
            aupGUI.setAttackingArea(attackingArea);
            roundResultsGUI rrGUI = new roundResultsGUI();
            rrGUI.setTextInfo(attacker, attackerCard.getName(), Arrays.toString(attackerRolls), defender, defenderCard.getName(), Arrays.toString(defenderRolls), victor);
            rrGUI.setVisible(true);
        }
    }
    
    private List<UnitCard> getOpponentSelection(String opponent, int baseMax) {
        int max = baseMax;
        List<UnitCard> opponentUnitList = new ArrayList<>();
        List<UnitCard> opponentCurrentList = new ArrayList<>();
        Random rand = new Random(System.nanoTime());
        int ndx = 0;
        
        if(opponent.compareTo("Norse") == 0) {
            opponentCurrentList = norsePlayer.getCurrentUnitList();
            if(norsePlayer.isArmory()) {
                max += 1;
            }
            if(max > opponentCurrentList.size()) {
                max = opponentCurrentList.size();
            }
            for(int i = 0; i < max; i++) {
                ndx = rand.nextInt(opponentCurrentList.size());
                opponentUnitList.add(opponentCurrentList.get(ndx));
                opponentCurrentList.remove(ndx);
            }
            norsePlayer.setCurrentUnitList(opponentCurrentList);
        }
        else if(opponent.compareTo("Greek") == 0) {
            opponentCurrentList = greekPlayer.getCurrentUnitList();
            if(greekPlayer.isArmory()) {
                max += 1;
            }
            if(max > opponentCurrentList.size()) {
                max = opponentCurrentList.size();
            }
            for(int i = 0; i < max; i++) {
                ndx = rand.nextInt(opponentCurrentList.size());
                opponentUnitList.add(opponentCurrentList.get(ndx));
                opponentCurrentList.remove(ndx);
            }
            greekPlayer.setCurrentUnitList(opponentCurrentList);
        }
        else {
            opponentCurrentList = egyptianPlayer.getCurrentUnitList();
            if(egyptianPlayer.isArmory()) {
                max += 1;
            }
            if(max > opponentCurrentList.size()) {
                max = opponentCurrentList.size();
            }
            for(int i = 0; i < max; i++) {
                ndx = rand.nextInt(opponentCurrentList.size());
                opponentUnitList.add(opponentCurrentList.get(ndx));
                opponentCurrentList.remove(ndx);
            }
            egyptianPlayer.setCurrentUnitList(opponentCurrentList);
        }
        
        return opponentUnitList;
    }
    
    private int compareCardsAttacker(String attacker, UnitCard card, String opponentType) {
        int dice = card.getNumberofDice();
        
        dice += getBonusDice(card, opponentType);
        
        
        return dice;
    }
    
    private int compareCardsDefender(String attacker, String defender, String attackingArea, UnitCard card, String attackerType) {
        int dice = card.getNumberofDice();
        boolean siegeWorkshop = false;

        dice += getBonusDice(card, attackerType);
        
        if(attacker.compareTo("Norse") == 0) {
            if(norsePlayer.isSiegeworkshop()) {
                siegeWorkshop = true;
            }
        }
        else if(attacker.compareTo("Greek") == 0) {
            if(greekPlayer.isSiegeworkshop()) {
                siegeWorkshop = true;
            }
        }
        else {
            if(egyptianPlayer.isSiegeworkshop()) {
                siegeWorkshop = true;
            }
        }
        if(siegeWorkshop == false) {
            if(defender.compareTo("Norse") == 0) {
                if(attackingArea.compareTo("city") == 0) {
                    if(norsePlayer.isWall()) {
                        dice += 2;
                    }
                }
                else if(attackingArea.compareTo("production") == 0) {
                    if(norsePlayer.isTower()) {
                        dice += 2;
                    }
                }
            }
            else if(defender.compareTo("Greek") == 0) {
                if(attackingArea.compareTo("city") == 0) {
                    if(greekPlayer.isWall()) {
                        dice += 2;
                    }
                }
                else if(attackingArea.compareTo("production") == 0) {
                    if(greekPlayer.isTower()) {
                        dice += 2;
                    }
                }
            }
            else {
                if(attackingArea.compareTo("city") == 0) {
                    if(egyptianPlayer.isWall()) {
                        dice += 2;
                    }
                }
                else if(attackingArea.compareTo("production") == 0) {
                    if(egyptianPlayer.isTower()) {
                        dice += 2;
                    }
                }
            }
        }
        
        return dice;
    }
    
    private int getBonusDice(UnitCard card, String type) {
        int dice = 0;
        String[] bonuses = card.getBonuses();

        for(int i = 0; i < bonuses.length; i++) {
            String[] arr = bonuses[i].split(";");
            String[] opponentArr = type.split(";");
            for(int j = 0; j < opponentArr.length; j++) {
                if(arr[1].compareTo(opponentArr[j]) == 0) {
                    dice += Integer.parseInt(arr[0]);
                }
            }
        }
        
        return dice;
    }
    
    private int[] rollDice(int diceNumber) {
        int[] diceRolls = new int[diceNumber];
        Random rand = new Random(System.nanoTime());
        
        for(int i = 0; i < diceNumber; i++) {
            diceRolls[i] = rand.nextInt(6) + 1;
        }
        
        return diceRolls;
    }
    
    private int countSixes(int[] rolls) {
        int sixes = 0;
        
        for(int i = 0; i < rolls.length; i++) {
            if(rolls[i] == 6) {
                sixes++;
            }
        }
        
        return sixes;
    }
    
    public void tacticalRetreat(List<UnitCard> playerCards, String opponent) {
        addUnitsBacktoList(playerCulture, playerCards);
        addUnitsBacktoList(opponent, aiBattleUnits);
    }
    
    private void addUnitsBacktoList(String culture, List<UnitCard> unitList) {
        if(culture.compareTo("Norse") == 0) {
            List<UnitCard> currentList = norsePlayer.getCurrentUnitList();
            for(int i = 0; i < unitList.size(); i++) {
                currentList.add(unitList.get(i));
            }
            norsePlayer.setCurrentUnitList(currentList);
        }
        else if(culture.compareTo("Greek") == 0) {
            List<UnitCard> currentList = greekPlayer.getCurrentUnitList();
            for(int i = 0; i < unitList.size(); i++) {
                currentList.add(unitList.get(i));
            }
            greekPlayer.setCurrentUnitList(currentList);
        }
        else {
            List<UnitCard> currentList = egyptianPlayer.getCurrentUnitList();
            for(int i = 0; i < unitList.size(); i++) {
                currentList.add(unitList.get(i));
            }
            egyptianPlayer.setCurrentUnitList(currentList);
        }
    }
    
    private void distributeBattleVictory(String culture) {
        if(culture.compareTo("Norse") == 0) {
            norsePlayer.setVictory(norsePlayer.getVictory() + victoryCards[3]);
        }
        else if(culture.compareTo("Greek") == 0) {
            greekPlayer.setVictory(greekPlayer.getVictory() + victoryCards[3]);
        }
        else {
            egyptianPlayer.setVictory(egyptianPlayer.getVictory() + victoryCards[3]);
        }
        
        victoryCards[3] = 0;
        updateResources(culture);
    }
    
    public void removeBuildingTiles(String culture, List<String> buildings) {
        removeBuildings(culture, buildings);
        bGUI.setupBuildingRemovalIcon(culture, buildings);
    }
    
    private int getMaxBuildingDestroy(String culture) {
        int max = 1;
        
        if(culture.compareTo("Norse") == 0) {
            if(norsePlayer.isSiegeworkshop() == true) {
                max += 1;
            }
        }
        else if(culture.compareTo("Greek") == 0) {
            if(greekPlayer.isSiegeworkshop() == true) {
                max += 1;
            }
        }
        else {
            if(egyptianPlayer.isSiegeworkshop() == true) {
                max += 1;
            }
        }
        
        return max;
    }
    
    private void removeBuildings(String culture, List<String> buildings) {
        if(culture.compareTo("Norse") == 0) {
            for(int i = 0; i < buildings.size(); i++) {
                if(buildings.get(i).compareTo("House.png") == 0) {
                    norsePlayer.setHouse(norsePlayer.getHouse() - 1);
                }
                if(buildings.get(i).compareTo("Armor.png") == 0) {
                    norsePlayer.setArmory(false);
                }
                if(buildings.get(i).compareTo("GoldMint.png") == 0) {
                    norsePlayer.setGoldmint(false);
                }
                if(buildings.get(i).compareTo("Granary.png") == 0) {
                    norsePlayer.setGranary(false);
                }
                if(buildings.get(i).compareTo("GreatTemple.png") == 0) {
                    norsePlayer.setGreattemple(false);
                }
                if(buildings.get(i).compareTo("Market.png") == 0) {
                    norsePlayer.setMarket(false);
                }
                if(buildings.get(i).compareTo("Monument.png") == 0) {
                    norsePlayer.setMonument(false);
                }
                if(buildings.get(i).compareTo("Quarry.png") == 0) {
                    norsePlayer.setQuarry(false);
                }
                if(buildings.get(i).compareTo("SiegeWork.png") == 0) {
                    norsePlayer.setSiegeworkshop(false);
                }
                if(buildings.get(i).compareTo("Storehouse.png") == 0) {
                    norsePlayer.setStorehouse(false);
                }
                if(buildings.get(i).compareTo("Tower.png") == 0) {
                    norsePlayer.setTower(false);
                }
                if(buildings.get(i).compareTo("Wall.png") == 0) {
                    norsePlayer.setWall(false);
                }
                if(buildings.get(i).compareTo("Wonder.png") == 0) {
                    norsePlayer.setWonder(false);
                }
                if(buildings.get(i).compareTo("WoodWork.png") == 0) {
                    norsePlayer.setWoodworkshop(false);
                }
            }
        }
        else if(culture.compareTo("Greek") == 0) {
            for(int i = 0; i < buildings.size(); i++) {
                if(buildings.get(i).compareTo("House.png") == 0) {
                    greekPlayer.setHouse(greekPlayer.getHouse() - 1);
                }
                if(buildings.get(i).compareTo("Armor.png") == 0) {
                    greekPlayer.setArmory(false);
                }
                if(buildings.get(i).compareTo("GoldMint.png") == 0) {
                    greekPlayer.setGoldmint(false);
                }
                if(buildings.get(i).compareTo("Granary.png") == 0) {
                    greekPlayer.setGranary(false);
                }
                if(buildings.get(i).compareTo("GreatTemple.png") == 0) {
                    greekPlayer.setGreattemple(false);
                }
                if(buildings.get(i).compareTo("Market.png") == 0) {
                    greekPlayer.setMarket(false);
                }
                if(buildings.get(i).compareTo("Monument.png") == 0) {
                    greekPlayer.setMonument(false);
                }
                if(buildings.get(i).compareTo("Quarry.png") == 0) {
                    greekPlayer.setQuarry(false);
                }
                if(buildings.get(i).compareTo("SiegeWork.png") == 0) {
                    greekPlayer.setSiegeworkshop(false);
                }
                if(buildings.get(i).compareTo("Storehouse.png") == 0) {
                    greekPlayer.setStorehouse(false);
                }
                if(buildings.get(i).compareTo("Tower.png") == 0) {
                    greekPlayer.setTower(false);
                }
                if(buildings.get(i).compareTo("Wall.png") == 0) {
                    greekPlayer.setWall(false);
                }
                if(buildings.get(i).compareTo("Wonder.png") == 0) {
                    greekPlayer.setWonder(false);
                }
                if(buildings.get(i).compareTo("WoodWork.png") == 0) {
                    greekPlayer.setWoodworkshop(false);
                }
            }
        }
        else {
            for(int i = 0; i < buildings.size(); i++) {
                if(buildings.get(i).compareTo("House.png") == 0) {
                    egyptianPlayer.setHouse(egyptianPlayer.getHouse() - 1);
                }
                if(buildings.get(i).compareTo("Armor.png") == 0) {
                    egyptianPlayer.setArmory(false);
                }
                if(buildings.get(i).compareTo("GoldMint.png") == 0) {
                    egyptianPlayer.setGoldmint(false);
                }
                if(buildings.get(i).compareTo("Granary.png") == 0) {
                    egyptianPlayer.setGranary(false);
                }
                if(buildings.get(i).compareTo("GreatTemple.png") == 0) {
                    egyptianPlayer.setGreattemple(false);
                }
                if(buildings.get(i).compareTo("Market.png") == 0) {
                    egyptianPlayer.setMarket(false);
                }
                if(buildings.get(i).compareTo("Monument.png") == 0) {
                    egyptianPlayer.setMonument(false);
                }
                if(buildings.get(i).compareTo("Quarry.png") == 0) {
                    egyptianPlayer.setQuarry(false);
                }
                if(buildings.get(i).compareTo("SiegeWork.png") == 0) {
                    egyptianPlayer.setSiegeworkshop(false);
                }
                if(buildings.get(i).compareTo("Storehouse.png") == 0) {
                    egyptianPlayer.setStorehouse(false);
                }
                if(buildings.get(i).compareTo("Tower.png") == 0) {
                    egyptianPlayer.setTower(false);
                }
                if(buildings.get(i).compareTo("Wall.png") == 0) {
                    egyptianPlayer.setWall(false);
                }
                if(buildings.get(i).compareTo("Wonder.png") == 0) {
                    egyptianPlayer.setWonder(false);
                }
                if(buildings.get(i).compareTo("WoodWork.png") == 0) {
                    egyptianPlayer.setWoodworkshop(false);
                }
            }
        }
    }
    
    public void removeTerrainTile(String attacker, String defender, String index) {
        int terrainNdx = Integer.parseInt(index);
        List<TerrainTiles> currentTerrainTiles = new ArrayList<>();
        TerrainTiles selectedTerrain;
        
        if(defender.compareTo("Norse") == 0) {
            currentTerrainTiles = norsePlayer.getNorseTerrains();
            selectedTerrain = currentTerrainTiles.get(terrainNdx);
            currentTerrainTiles.remove(terrainNdx);
            norsePlayer.setNorseTerrains(currentTerrainTiles);
            bGUI.setupRemoveTerrainTile(defender, selectedTerrain);
            checkRemovedTerrainTile(defender, selectedTerrain);
        }
        else if(defender.compareTo("Greek") == 0) {
            currentTerrainTiles = greekPlayer.getGreekTerrains();
            selectedTerrain = currentTerrainTiles.get(terrainNdx);
            currentTerrainTiles.remove(terrainNdx);
            greekPlayer.setGreekTerrains(currentTerrainTiles);
            bGUI.setupRemoveTerrainTile(defender, selectedTerrain);
            checkRemovedTerrainTile(defender, selectedTerrain);
        }
        else {
            currentTerrainTiles = egyptianPlayer.getEgyptianTerrains();
            selectedTerrain = currentTerrainTiles.get(terrainNdx);
            currentTerrainTiles.remove(terrainNdx);
            egyptianPlayer.setEgyptianTerrains(currentTerrainTiles);
            bGUI.setupRemoveTerrainTile(defender, selectedTerrain);
            checkRemovedTerrainTile(defender, selectedTerrain);
        }
        
        if(attacker.compareTo("Norse") == 0) {
            boolean usable = checkTerrainUsable(attacker, norsePlayer.getMaxTerrains(), selectedTerrain);
            
            if(usable == true) {
                List<TerrainTiles> currentTerrains = norsePlayer.getNorseTerrains();
                currentTerrains.add(selectedTerrain);
                norsePlayer.setNorseTerrains(currentTerrains);
            }
        }
        else if(attacker.compareTo("Greek") == 0) {
            boolean usable = checkTerrainUsable(attacker, greekPlayer.getMaxTerrains(), selectedTerrain);
            
            if(usable == true) {
                List<TerrainTiles> currentTerrains = greekPlayer.getGreekTerrains();
                currentTerrains.add(selectedTerrain);
                greekPlayer.setGreekTerrains(currentTerrains);
            }
        }
        else {
            boolean usable = checkTerrainUsable(attacker, egyptianPlayer.getMaxTerrains(), selectedTerrain);
            
            if(usable == true) {
                List<TerrainTiles> currentTerrains = egyptianPlayer.getEgyptianTerrains();
                currentTerrains.add(selectedTerrain);
                egyptianPlayer.setEgyptianTerrains(currentTerrains);
            }
        }
        
        initPlayPermCards();
    }
    
    private boolean checkTerrainUsable(String attacker, int[] arr, TerrainTiles selectedTerrain) {
        String type = selectedTerrain.getTerrainType();
        
        if(type.compareTo("fertile") == 0) {
                if(arr[0] > 0) {
                    arr[0]--;
                    setMaxArray(attacker, arr);
                    return true;
                }
            }
            else if(type.compareTo("forest") == 0) {
                if(arr[1] > 0) {
                    arr[1]--;
                    setMaxArray(attacker, arr);
                    return true;
                }
            }
            else if(type.compareTo("hill") == 0) {
                if(arr[2] > 0) {
                    arr[2]--;
                    setMaxArray(attacker, arr);
                    return true;
                }
            }
            else if(type.compareTo("mountain") == 0) {
                if(arr[3] > 0) {
                    arr[3]--;
                    setMaxArray(attacker, arr);
                    return true;
                }
            }
            else if(type.compareTo("desert") == 0) {
                if(arr[4] > 0) {
                    arr[4]--;
                    setMaxArray(attacker, arr);
                    return true;
                }
            }
            else if(type.compareTo("swamp") == 0) {
                if(arr[5] > 0) {
                    arr[5]--;
                    setMaxArray(attacker, arr);
                    return true;
                }
            }
        return false;
    }
    
    private void setMaxArray(String attacker, int[] arr) {
        if(attacker.compareTo("Norse") == 0) {
            norsePlayer.setMaxTerrains(arr);
        }
        else if(attacker.compareTo("Greek") == 0) {
            greekPlayer.setMaxTerrainGreek(arr);
        }
        else {
            egyptianPlayer.setMaxTerrainEgyptian(arr);
        }
    }
    
    private void checkRemovedTerrainTile(String defender, TerrainTiles selectedTerrain) {
        String type = selectedTerrain.getTerrainType();
       
        if(defender.compareTo("Norse") == 0) {
            int[] arr = norsePlayer.getMaxTerrains();
            
            if(type.compareTo("fertile") == 0) {
                arr[0] += 1;
            }
            else if(type.compareTo("forest") == 0) {
                arr[1] += 1;
            }
            else if(type.compareTo("hill") == 0) {
                arr[2] += 1;
            }
            else if(type.compareTo("mountain") == 0) {
                arr[3] += 1;
            }
            else if(type.compareTo("desert") == 0) {
                arr[4] += 1;
            }
            else if(type.compareTo("swamp") == 0) {
                arr[5] += 1;
            }
            norsePlayer.setMaxTerrains(arr);
        }
        else if(defender.compareTo("Greek") == 0) {
            int[] arr = greekPlayer.getMaxTerrains();
            
            if(type.compareTo("fertile") == 0) {
                arr[0] += 1;
            }
            else if(type.compareTo("forest") == 0) {
                arr[1] += 1;
            }
            else if(type.compareTo("hill") == 0) {
                arr[2] += 1;
            }
            else if(type.compareTo("mountain") == 0) {
                arr[3] += 1;
            }
            else if(type.compareTo("desert") == 0) {
                arr[4] += 1;
            }
            else if(type.compareTo("swamp") == 0) {
                arr[5] += 1;
            }
            greekPlayer.setMaxTerrainGreek(arr);
        }
        else {
            int[] arr = egyptianPlayer.getMaxTerrains();
            
            if(type.compareTo("fertile") == 0) {
                arr[0] += 1;
            }
            else if(type.compareTo("forest") == 0) {
                arr[1] += 1;
            }
            else if(type.compareTo("hill") == 0) {
                arr[2] += 1;
            }
            else if(type.compareTo("mountain") == 0) {
                arr[3] += 1;
            }
            else if(type.compareTo("desert") == 0) {
                arr[4] += 1;
            }
            else if(type.compareTo("swamp") == 0) {
                arr[5] += 1;
            }
            egyptianPlayer.setMaxTerrainEgyptian(arr);
        }
       
        
    }
    
    public TerrainTiles getTerrainTile(int index) {
        return terrainList.get(index);
    }

    public String getPlayerCulture() {
        return playerCulture;
    }

    public void setPlayerCulture(String playerCulture) {
        this.playerCulture = playerCulture;
    }

    public int getPlayerTurnCount() {
        return this.playerTurnCount;
    }
    
    public void incrementPlayerTurnCount() {
        this.playerTurnCount += 1;
    }

    public List<String> getPlayerPermCards() {
        return playerPermCards;
    }

    public void setPlayerPermCards(List<String> playerPermCards) {
        this.playerPermCards = playerPermCards;
    }
    
    public void removePlayerPermCards(String card) {
        playerPermCards.remove(card);
    }

    public String getAiCulture() {
        return aiCulture;
    }

    public void setAiCulture(String aiCulture) {
        this.aiCulture = aiCulture;
    }

    public String getAiCulture2() {
        return aiCulture2;
    }

    public void setAiCulture2(String aiCulture2) {
        this.aiCulture2 = aiCulture2;
    }
    
}
