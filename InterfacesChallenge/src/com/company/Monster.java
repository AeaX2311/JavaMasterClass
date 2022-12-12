package com.company;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{
    private String name; private int health;
    private String devility;

    public Monster(String name, int health, String devility) {
        this.name = name;
        this.health = health;
        this.devility = devility;
    }

    @Override
    public List<String> getList() {
        List<String> values = new ArrayList<>();
        values.add(name);
        values.add(""+health);
        values.add(devility);
        return values;
    }

    @Override
    public void addObject(List<String> object) {
        if(object!=null&&object.size()>0){
            this.name=object.get(0);
            this.health= Integer.parseInt(object.get(1));
            this.devility=object.get(2);
        }
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", devility='" + devility + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getDevility() {
        return devility;
    }

    public void setDevility(String devility) {
        this.devility = devility;
    }
}
