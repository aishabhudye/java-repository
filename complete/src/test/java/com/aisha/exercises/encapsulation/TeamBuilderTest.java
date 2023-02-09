package com.aisha.exercises.encapsulation;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class TeamBuilderTest {
    private final TeamBuilder teamBuilder = new TeamBuilder();



    @Test
    public void testListSize() {
        String path = "C:\\Users\\Aisha\\IdeaProjects\\java-repository\\complete\\src\\main\\resources\\PremierLeagueTableUnsorted.csv";
        List<Team> teams = teamBuilder.build(path);
        assertEquals(20, teams.size());

    }

    private Team retrieveTeam(String teamToSelect) {
        String path = "C:\\Users\\Aisha\\IdeaProjects\\java-repository\\complete\\src\\main\\resources\\PremierLeagueTableUnsorted.csv";
        List<Team> teams = teamBuilder.build(path);
        Team selectedTeam = null;
        for (Team team : teams) {
            if (team.getName().equals(teamToSelect)) {
                selectedTeam = team;
            }
        }
        return selectedTeam;
    }

    @Test
    public void testNameProperty() {
        String path = "C:\\Users\\Aisha\\IdeaProjects\\java-repository\\complete\\src\\main\\resources\\PremierLeagueTableUnsorted.csv";
        Team expected = new Team(20, 8, 5, 7, 22, 21, 1, 29, "Chelsea");
        Team actual = retrieveTeam("Chelsea");
        assertEquals(expected.getName(), actual.getName());
    }

    @Test
    public void testPlayedProperty() {
        String path = "C:\\Users\\Aisha\\IdeaProjects\\java-repository\\complete\\src\\main\\resources\\PremierLeagueTableUnsorted.csv";
        Team expected = new Team(20, 8, 5, 7, 22, 21, 1, 29, "Chelsea");
        Team actual = retrieveTeam("Chelsea");
        assertEquals(expected.getPlayed(), actual.getPlayed());
    }

    @Test
    public void testWonProperty() {
        String path = "C:\\Users\\Aisha\\IdeaProjects\\java-repository\\complete\\src\\main\\resources\\PremierLeagueTableUnsorted.csv";
        Team expected = new Team(20, 8, 5, 7, 22, 21, 1, 29, "Chelsea");
        Team actual = retrieveTeam("Chelsea");
        assertEquals(expected.getWon(), actual.getWon());
    }

    @Test
    public void testDrawnProperty() {
        String path = "C:\\Users\\Aisha\\IdeaProjects\\java-repository\\complete\\src\\main\\resources\\PremierLeagueTableUnsorted.csv";
        Team expected = new Team(20, 8, 5, 7, 22, 21, 1, 29, "Chelsea");
        Team actual = retrieveTeam("Chelsea");
        assertEquals(expected.getDrawn(), actual.getDrawn());
    }

    @Test
    public void testLostProperty() {
        String path = "C:\\Users\\Aisha\\IdeaProjects\\java-repository\\complete\\src\\main\\resources\\PremierLeagueTableUnsorted.csv";
        Team expected = new Team(20, 8, 5, 7, 22, 21, 1, 29, "Chelsea");
        Team actual = retrieveTeam("Chelsea");
        assertEquals(expected.getLost(), actual.getLost());
    }

    @Test
    public void testGoalsScoredProperty() {
        String path = "C:\\Users\\Aisha\\IdeaProjects\\java-repository\\complete\\src\\main\\resources\\PremierLeagueTableUnsorted.csv";
        Team expected = new Team(20, 8, 5, 7, 22, 21, 1, 29, "Chelsea");
        Team actual = retrieveTeam("Chelsea");
        assertEquals(expected.getGoalsScored(), actual.getGoalsScored());
    }

    @Test
    public void testGoalsTakenProperty() {
        String path = "C:\\Users\\Aisha\\IdeaProjects\\java-repository\\complete\\src\\main\\resources\\PremierLeagueTableUnsorted.csv";
        Team expected = new Team(20, 8, 5, 7, 22, 21, 1, 29, "Chelsea");
        Team actual = retrieveTeam("Chelsea");
        assertEquals(expected.getGoalsTaken(), actual.getGoalsTaken());
    }


}