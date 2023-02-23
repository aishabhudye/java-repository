package com.aisha.exercises.encapsulation;

import java.util.Collections;
import java.util.List;

public class TeamRunner {

    private static String unsortedFile = "/home/aishab/IdeaProjects/java-repository/complete/src/main/resources/PremierLeagueTableUnsorted.csv";
    private static String sortedFile = "/home/aishab/IdeaProjects/java-repository/complete/src/main/resources/PremierLeagueTableSortedByApp.csv";

    public static void main (String[] args){
        sortTeams();
    }

    private static void sortTeams() {
        TeamBuilder builder = new TeamBuilder();
        List<Team> teamList = builder.build(unsortedFile);
        Collections.sort(teamList);
        builder.createFile(teamList, sortedFile);
    }


}
