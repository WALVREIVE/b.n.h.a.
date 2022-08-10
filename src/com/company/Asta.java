package com.company;

public class Asta extends AllMighty{
    private String placeOfBirth;
    private int invitedInATeam;

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public int getInvitedInATeam() {
        return invitedInATeam;
    }

    public Asta(String placeOfBirth, int invitedInATeam) {
        this.placeOfBirth = placeOfBirth;
        this.invitedInATeam = invitedInATeam;
    }

    @Override
    public void print() {
        System.out.println("The place of birth "+placeOfBirth +"\nDate of invitation "+invitedInATeam);
    }
}
