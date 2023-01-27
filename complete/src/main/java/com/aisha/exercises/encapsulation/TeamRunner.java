package com.aisha.exercises.encapsulation;

import java.io.BufferedReader;

public class TeamRunner {
    public static void main (String[] args){
        TeamBuilder builder = new TeamBuilder();
        builder.build("C:\\Users\\Aisha\\IdeaProjects\\java-repository\\complete\\src\\main\\resources\\PremierLeagueTableUnsorted.csv");
    }
}
