package com.blackjack.database;

import java.util.ArrayList;
import java.util.List;

public class GameStateManager {

    private static GameStateManager instance;
    private List<Player> playerList;

    private CardDeck cards;

    public GameStateManager(){
        playerList = new ArrayList<>();
        cards = new CardDeck();
    }
    public static synchronized GameStateManager getInstance(){
        if(instance == null){
            instance = new GameStateManager();
        }
        return instance;
    }
    public void addPlayers(List<Player> players){
        playerList.addAll(players);
    }

    public void giveCardToPlayer(Player player){
        player.takeCard(cards.draw());
    }


}
