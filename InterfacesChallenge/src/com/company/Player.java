package com.company;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{
    private String name; private int level;
    private String weapon; private String ability;

    public Player(String name, int level, String weapon, String ability) {
        this.name = name;
        this.level = level;
        this.weapon = weapon;
        this.ability = ability;
    }

    @Override
    public List<String> getList() {
        List<String> values = new ArrayList<>();
        values.add(name);
        values.add(""+level);
        values.add(weapon);
        values.add(ability);
        return values;
    }

    @Override
    public void addObject(List<String> object) {
         if(object!=null&&object.size()>0){
             this.name=object.get(0);
             this.level= Integer.parseInt(object.get(1));
             this.weapon=object.get(2);
             ability=object.get(3);
         }
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", weapon='" + weapon + '\'' +
                ", ability='" + ability + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public String getWeapon() {
        return weapon;
    }

    public String getAbility() {
        return ability;
    }
}
