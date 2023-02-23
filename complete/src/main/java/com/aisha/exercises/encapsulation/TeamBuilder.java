package com.aisha.exercises.encapsulation;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TeamBuilder {

    private static final String COMMA_DELIMITER = ",";

    public List<Team> build(String path) {
        List<Team> teams = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(COMMA_DELIMITER);
                String name = values[0];
                int played = Integer.parseInt(values[1]);
                int won = Integer.parseInt(values[2]);
                int drawn = Integer.parseInt(values[3]);
                int lost = Integer.parseInt(values[4]);
                int goalsScored = Integer.parseInt(values[5]);
                int goalsTaken = Integer.parseInt(values[6]);
                int goalDifference = goalsScored - goalsTaken;
                int points = (won * 3) + drawn;
                Team team = new Team(name, played, won, drawn, lost, goalsScored, goalsTaken, goalDifference, points);
                teams.add(team);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return teams;
    }


    public void createFile(List<Team> teamList, String sortedFile) {

        try {
            PrintWriter output = new PrintWriter(sortedFile);
            for (Team team : teamList) {
                String stringVersion = team.toCSVString();
                output.println(stringVersion);
            }
            output.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
