package com.aisha.exercises.encapsulation;

import java.util.List;

public class TeamRunner {

    private static String unsortedFile = "C:\\Users\\Aisha\\IdeaProjects\\java-repository\\complete\\src\\main\\resources\\PremierLeagueTableUnsorted.csv";
    private static String sortedFile = "C:\\Users\\Aisha\\IdeaProjects\\java-repository\\complete\\src\\main\\resources\\PremierLeagueTableSortedByCode.csv";

    public static void main (String[] args){
        sortTeams();
    }

    private static void sortTeams() {
        TeamBuilder builder = new TeamBuilder();
        List<Team> teamList = builder.build(unsortedFile);
        builder.createFile(teamList, sortedFile);
    }


}
