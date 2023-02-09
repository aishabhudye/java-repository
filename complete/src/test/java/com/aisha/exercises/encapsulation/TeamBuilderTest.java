package com.aisha.exercises.encapsulation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TeamBuilderTest {
    public static final String CHELSEA = "Chelsea";
    private final TeamBuilder teamBuilder = new TeamBuilder();
    private List<Team> teams = new ArrayList<>();
    private Team chelsea = new Team();

    @BeforeEach
    public void setUp(){
        String path = "C:\\Users\\Aisha\\IdeaProjects\\java-repository\\complete\\src\\main\\resources\\PremierLeagueTableUnsorted.csv";
        teams = teamBuilder.build(path);
        chelsea = new Team(CHELSEA, 20, 8, 5, 7, 22, 21, 1, 29);
    }

    @Test
    public void testListSize() {
        assertEquals(20, teams.size());

    }

    private Team retrieveTeam(String teamToSelect) {
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
        Team actual = retrieveTeam(CHELSEA);
        assertEquals(chelsea.getName(), actual.getName());
    }

    @Test
    public void testPlayedProperty() {
        Team actual = retrieveTeam(CHELSEA);
        assertEquals(chelsea.getPlayed(), actual.getPlayed());
    }

    @Test
    public void testWonProperty() {
        Team actual = retrieveTeam(CHELSEA);
        assertEquals(chelsea.getWon(), actual.getWon());
    }

    @Test
    public void testDrawnProperty() {
        Team actual = retrieveTeam(CHELSEA);
        assertEquals(chelsea.getDrawn(), actual.getDrawn());
    }

    @Test
    public void testLostProperty() {
        Team actual = retrieveTeam(CHELSEA);
        assertEquals(chelsea.getLost(), actual.getLost());
    }

    @Test
    public void testGoalsScoredProperty() {
        Team actual = retrieveTeam(CHELSEA);
        assertEquals(chelsea.getGoalsScored(), actual.getGoalsScored());
    }

    @Test
    public void testGoalsTakenProperty() {
        Team actual = retrieveTeam(CHELSEA);
        assertEquals(chelsea.getGoalsTaken(), actual.getGoalsTaken());
    }

    @Test
    public void firstTeamShouldBeArsenal(){
        Collections.sort(teams);
        assertEquals("Arsenal", teams.get(0).getName());
    }


}