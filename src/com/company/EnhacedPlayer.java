package com.company;

public class EnhacedPlayer {
    private String name;
    private int HitPints =100;
    private String weapon;

    public EnhacedPlayer(String name, int health, String weapon) {
          this.name = name;
        if(health > 0 && health <=200){
          this.HitPints = health;
    }     this.weapon = weapon;
    }
    public void loseHealth(int damage){
        this.HitPints = this.HitPints - damage;
        if(this.HitPints <= 0){
            System.out.println("PLayer Knocked out ")
            ;
        }
    }
    public int healthRemaining(){
        return this.HitPints;
    }

    public int getHitPints() {
        return HitPints;
    }
}
