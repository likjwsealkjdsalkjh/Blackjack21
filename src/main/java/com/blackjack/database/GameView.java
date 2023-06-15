package com.blackjack.database;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.button.Button;
import java.awt.*;

@PageTitle("BlackJack")
@Route("GameView")
public class GameView extends VerticalLayout {

    public GameView(){

        Button hit = new Button("Hit");
        hit.setWidth("100px");
        Button stand = new Button("Stand");
        stand.setWidth("100px");

        add(hit, stand);


    }

}
