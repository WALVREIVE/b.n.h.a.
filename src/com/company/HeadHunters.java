package com.company;

public class HeadHunters extends AllMighty{
    private String killingStyle;
    private int numberOfMembers;

    public String getKillingStyle() {
        return killingStyle;
    }

    public int getNumberOfMembers() {
        return numberOfMembers;
    }

    public HeadHunters(String killingStyle, int numberOfMembers) {
        this.killingStyle = killingStyle;
        this.numberOfMembers = numberOfMembers;
    }

    @Override
    public void print() {
        System.out.println("Killing Style "+killingStyle +"\nThe number of members "+numberOfMembers);
    }
}
