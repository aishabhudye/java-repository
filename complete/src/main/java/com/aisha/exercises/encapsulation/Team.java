package com.aisha.exercises.encapsulation;

public class Team implements Comparable<Team> {
    private int played;
    private int won;
    private int drawn;
    private int lost;
    private int goalsScored;
    private int goalsTaken;
    private int goalDifference;
    private int points;

    private String name;


    public Team(String name, int played, int won, int drawn, int lost, int goalsScored, int goalsTaken, int goalDifference, int points) {
        this.name = name;
        this.played = played;
        this.won = won;
        this.drawn = drawn;
        this.lost = lost;
        this.goalsScored = goalsScored;
        this.goalsTaken = goalsTaken;
        this.goalDifference = goalDifference;
        this.points = points;
    }

    public Team() {
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

    public String getName() {
        return name;
    }

    public int getGoalDifference() {
        return goalDifference;
    }

    public int getPoints() {
        return points;
    }

    @Override
    public int compareTo(Team o) {
        System.out.println(String.format("%s has %d point while the other has %d points", this.name, this.points, o.points));
        if(o.points - this.points !=0){
            return o.points - this.points;
        }else{
            return o.goalDifference - this.goalDifference;
        }


    }

}

