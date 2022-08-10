package com.company;

public class Deku  extends AllMighty{
    int killsNumber;
    String team;

    public Deku(int killsNumber, String team) {
        this.killsNumber = killsNumber;
        this.team = team;
    }

    public int getKillsNumber() {
        return killsNumber;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public void print() {
        System.out.println("Number of kills " +killsNumber +"\nThe name of team: "+team);
    }
}
