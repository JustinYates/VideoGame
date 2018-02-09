package com.company;

import java.util.*;

public class Library {

Gametitles gametitles = new Gametitles();
    ArrayList<String> installedGames = new ArrayList<>();

    protected void addGame(){
        installedGames.add(gametitles.getBattleField());
        installedGames.add(gametitles.getCall_Of_Duty_BoII());
        installedGames.add(gametitles.getDragonBallZfighters());
        installedGames.add(gametitles.getMineCraft());
        installedGames.add(gametitles.getTerraria());
        installedGames.add(gametitles.getMortalKombat());
    }
}
