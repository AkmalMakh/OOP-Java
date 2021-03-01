package com.company.InterfaceChallenge;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{
    private String name;
    private int hitPoints;
    private int strangth;

    public Monster(String name, int hitPoints, int strangth) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strangth = strangth;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrangth() {
        return strangth;
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(0, this.name);
        values.add(1,""+ this.hitPoints);
        values.add(2,""+this.strangth);

        return values;
    }

    @Override
    public void read(List<String> saveable) {
        if(saveable != null && saveable.size()> 0){
            this.name = saveable.get(0);
            this.hitPoints = Integer.parseInt(saveable.get(1));
            this.strangth = Integer.parseInt(saveable.get(2));
        }
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strangth=" + strangth +
                '}';
    }
}
