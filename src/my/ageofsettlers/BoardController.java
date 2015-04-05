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
        pcGUI.setMaxCards(4);
        pcGUI.setVisible(true);
    }
    
    public void initPlayPermCards() {
        SelectedPermanentCardsGUI spCards = new SelectedPermanentCardsGUI();
        spCards.setMaxCards(playerPermCards.size());
        spCards.setupCards();
        spCards.setVisible(true);
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
            tradeGUI tGUI = new tradeGUI();
            tGUI.setVisible(true);
            tGUI.setupTradeGUI(playerCulture);
        }
        else if(str.compareTo("build") == 0) {
            buildingGUI buildGUI = new buildingGUI();
            buildGUI.setVisible(true);
        }
        else if(str.compareTo("explore") == 0) {
            
        }
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
            return this.addTerrainToList(0, arr, cultureTerrain, terrain);
        }
        else if(terrain.getTerrainType().compareTo("forest") == 0) {
            return this.addTerrainToList(1, arr, cultureTerrain, terrain);
        }
        else if(terrain.getTerrainType().compareTo("hill") == 0) {
            return this.addTerrainToList(2, arr, cultureTerrain, terrain);
        }
        else if(terrain.getTerrainType().compareTo("mountain") == 0) {
            return this.addTerrainToList(3, arr, cultureTerrain, terrain);
        }
        else if(terrain.getTerrainType().compareTo("desert") == 0) {
            return this.addTerrainToList(4, arr, cultureTerrain, terrain);
        }
        else if(terrain.getTerrainType().compareTo("swamp") == 0) {
            return this.addTerrainToList(5, arr, cultureTerrain, terrain);
        }
        
        return false;
    }
    
    private boolean addTerrainToList(int index, int[] arr, List<TerrainTiles> cultureTerrain, TerrainTiles terrain) {
        if(arr[index] > 0) {
            arr[index]--;
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
            if(aiPlayers.get(i).compareTo("norse") == 0) {
                findAITerrain(norseTerrain, terrainComponents, norsePlayer.getNorseTerrains());
            }
            else if(aiPlayers.get(i).compareTo("greek") == 0) {
                findAITerrain(greekTerrain, terrainComponents, greekPlayer.getGreekTerrains());
            }
            else if(aiPlayers.get(i).compareTo("egyptian") == 0) {
                findAITerrain(egyptianTerrain, terrainComponents, egyptianPlayer.getEgyptianTerrains());
            }
        }
        for(int j = 1; j >= 0; j--) {
            if(aiPlayers.get(j).compareTo("norse") == 0) {
                findAITerrain(norseTerrain, terrainComponents, norsePlayer.getNorseTerrains());
            }
            else if(aiPlayers.get(j).compareTo("greek") == 0) {
                findAITerrain(greekTerrain, terrainComponents, greekPlayer.getGreekTerrains());
            }
            else if(aiPlayers.get(j).compareTo("egyptian") == 0) {
                findAITerrain(egyptianTerrain, terrainComponents, egyptianPlayer.getEgyptianTerrains());
            }
        }
    }
    
    private List<String> findAIPlayers() {
        List<String> aiList = new ArrayList<>();
        
        if(playerCulture.compareTo("Norse") == 0) {
            aiList.add("greek");
            aiList.add("egyptian");
        }
        else if(playerCulture.compareTo("Greek") == 0) {
            aiList.add("norse");
            aiList.add("egyptian");
        }
        else if(playerCulture.compareTo("Egyptian") == 0) {
            aiList.add("norse");
            aiList.add("greek");
        }
        
        return aiList;
    }
    
    private void findAITerrain(Component[] boardTerrains, Component[] tabTerrains, List<TerrainTiles> cultureTerrains) {
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
                            label.setVisible(false);
                            label2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/" + tabTile.getFileName())));
                            label2.getAccessibleContext().setAccessibleDescription("");
                            return;
                        }
                    }
                }
            }
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
                bGUI.changeAgeText("Norse", norsePlayer.getAge(), norsePlayer.getWood(), norsePlayer.getGold(), norsePlayer.getFood(), norsePlayer.getFavor());
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
                bGUI.changeAgeText("Greek", greekPlayer.getAge(), greekPlayer.getWood(), greekPlayer.getGold(), greekPlayer.getFood(), greekPlayer.getFavor());
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
                bGUI.changeAgeText("Egyptian", egyptianPlayer.getAge(), egyptianPlayer.getWood(), egyptianPlayer.getGold(), egyptianPlayer.getFood(), egyptianPlayer.getFavor());
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
            norsePlayer.setFood(arr[0] + norsePlayer.getFood());
            norsePlayer.setFavor(arr[1] + norsePlayer.getFavor());
            norsePlayer.setWood(arr[2] + norsePlayer.getWood());
            norsePlayer.setGold(arr[3] + norsePlayer.getGold());
            bGUI.changeBoardResources(culture, norsePlayer.getWood(), norsePlayer.getGold(), norsePlayer.getFood(), norsePlayer.getFavor());
            
        }
        else if(culture.compareTo("Greek") == 0) {
            terrains = greekPlayer.getGreekTerrains();
            if(scanType == 1)
                arr = calculateTerrainResources(str, terrains);
            else
                arr = calculateResources(str, terrains);
            greekPlayer.setFood(arr[0] + greekPlayer.getFood());
            greekPlayer.setFavor(arr[1] + greekPlayer.getFavor());
            greekPlayer.setWood(arr[2] + greekPlayer.getWood());
            greekPlayer.setGold(arr[3] + greekPlayer.getGold());
            bGUI.changeBoardResources(culture, greekPlayer.getWood(), greekPlayer.getGold(), greekPlayer.getFood(), greekPlayer.getFavor());
        }
        else {
            terrains = egyptianPlayer.getEgyptianTerrains();
            if(scanType == 1)
                arr = calculateTerrainResources(str, terrains);
            else
                arr = calculateResources(str, terrains);
            egyptianPlayer.setFood(arr[0] + egyptianPlayer.getFood());
            egyptianPlayer.setFavor(arr[1] + egyptianPlayer.getFavor());
            egyptianPlayer.setWood(arr[2] + egyptianPlayer.getWood());
            egyptianPlayer.setGold(arr[3] + egyptianPlayer.getGold());
            bGUI.changeBoardResources(culture, egyptianPlayer.getWood(), egyptianPlayer.getGold(), egyptianPlayer.getFood(), egyptianPlayer.getFavor());
        }
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
            bGUI.changeBoardResources(culture, norsePlayer.getWood(), norsePlayer.getGold(), norsePlayer.getFood(), norsePlayer.getFavor());
        }
        else if(culture.compareTo("Greek") == 0) {
            bGUI.changeBoardResources(culture, greekPlayer.getWood(), greekPlayer.getGold(), greekPlayer.getFood(), greekPlayer.getFavor());
        }
        else {
            bGUI.changeBoardResources(culture, egyptianPlayer.getWood(), egyptianPlayer.getGold(), egyptianPlayer.getFood(), egyptianPlayer.getFavor());
        }
    }
    
    public void buildBuilding(String culture, String building) {
        bGUI.setupBuildingIcon(culture, building);
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
