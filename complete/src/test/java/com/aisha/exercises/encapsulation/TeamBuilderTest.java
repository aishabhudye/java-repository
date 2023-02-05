package com.aisha.exercises.encapsulation;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class TeamBuilderTest {
    private final TeamBuilder teamBuilder = new TeamBuilder();

    @Ignore
    public void testTeamNames(){
        //assert equals("Wolverhampton Wanderers",teamBuilder.buildTeams(""))
    }
    @Test
    public void testListSize(){
        String path = "C:\\Users\\Aisha\\IdeaProjects\\java-repository\\complete\\src\\main\\resources\\PremierLeagueTableUnsorted.csv";
        List<Team> teams = teamBuilder.build(path);
        assertEquals(20,teams.size());

    }
    @Test
    public int testTeamProperties(){
        String path = "C:\\Users\\Aisha\\IdeaProjects\\java-repository\\complete\\src\\main\\resources\\PremierLeagueTableUnsorted.csv";
        Team Chelsea = (Team) teamBuilder.build(path);
        assertEquals(20,Chelsea.getPlayed());

        return Chelsea.getPlayed();
    }



}