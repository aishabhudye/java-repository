package com.aisha.exercises.encapsulation;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
                System.out.println(values[0]);
                String name = values[0];
                int played = Integer.parseInt(values[1]);
                int won = Integer.parseInt(values[2]);
                int drawn = Integer.parseInt(values[3]);
                int lost = Integer.parseInt(values[4]);
                int goalsScored = Integer.parseInt(values[5]);
                int goalsTaken = Integer.parseInt(values[6]);
                int goalDifference = goalsScored - goalsTaken;
                int points = (won * 3) + drawn;
                Team team = new Team(played, won, drawn, lost, goalsScored, goalsTaken, goalDifference, points,name);
                teams.add(team);
                System.out.println(teams);

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return teams;
    }
}
