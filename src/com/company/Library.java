package com.company;

import java.util.*;

public class Library {

Gametitles gametitles = new Gametitles();

    protected void addGame(){
        ArrayList<String> Installedgames = new ArrayList<String>();
        Installedgames.add(gametitles.getBattleField());
        Installedgames.add(gametitles.getCall_Of_Duty_BoII());
    }
}
