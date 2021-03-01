package com.company.InterfaceChallenge;

import java.util.ArrayList;
import java.util.List;

public class Player implements  ISaveable {
    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;

    public Player(String name, int strength, int hitPoints) {
        this.name = name;
        this.strength = strength;
        this.weapon = "Sword";
        this.hitPoints = hitPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();

        values.add(0, this.name);
        values.add(1,""+this.hitPoints);
        values.add(2,""+this.strength);
        values.add(3,this.weapon);


        return values;
    }

    @Override
    public void read(List<String> saveable) {
        if (saveable !=null && saveable.size()>0){
            this.name = saveable.get(0);
            this.hitPoints =Integer.parseInt(saveable.get(1)) ;
            this.strength =Integer.parseInt( saveable.get(2));
            this.weapon = saveable.get(3);
        }
    }
}
