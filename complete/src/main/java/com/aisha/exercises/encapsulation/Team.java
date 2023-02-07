package com.aisha.exercises.encapsulation;

public class Team {
    private int played;
    private int won;
    private int drawn;
    private int lost;
    private int goalsScored;
    private int goalsTaken;
    private String name;


    public Team(int played, int won, int drawn, int lost, int goalsScored, int goalsTaken, int goalDifference, int points,String name) {
        this.played = played;
        this.won = won;
        this.drawn = drawn;
        this.lost = lost;
        this.goalsScored = goalsScored;
        this.goalsTaken = goalsTaken;
        this.name = name;


    }


    public int getPlayed() {
        return played;
    }

    public int getWon() {
        return won;
    }

    public int getDrawn() {
        return drawn;
    }

    public int getLost() {
        return lost;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public int getGoalsTaken() {
        return goalsTaken;
    }

    public String getName(){
        return name;
    }


}

