package com.aisha.exercises.encapsulation;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class TeamBuilderTest {
    private final TeamBuilder teamBuilder = new TeamBuilder();

    @Ignore
    public void testTeamNames() {
        //assert equals("Wolverhampton Wanderers",teamBuilder.buildTeams(""))
    }

    @Test
    public void testListSize() {
        String path = "C:\\Users\\Aisha\\IdeaProjects\\java-repository\\complete\\src\\main\\resources\\PremierLeagueTableUnsorted.csv";
        List<Team> teams = teamBuilder.build(path);
        assertEquals(20, teams.size());

    }


    public Team testTeamProperties() {
        String path = "C:\\Users\\Aisha\\IdeaProjects\\java-repository\\complete\\src\\main\\resources\\PremierLeagueTableUnsorted.csv";
        List<Team> teams = teamBuilder.build(path);
        Team name = (Team) teamBuilder.build(path);
        for(Team team:teams){
            name = team;
            String teamName = name.getName();
            System.out.println(teamName);
            if(teamName.equals("Chelsea")){
                System.out.println(name);

            }
        }
        return name;

    }
    @Test
    public void testProperties(){
        String path = "C:\\Users\\Aisha\\IdeaProjects\\java-repository\\complete\\src\\main\\resources\\PremierLeagueTableUnsorted.csv";
        Team actualChelsea = (Team) teamBuilder.build(path);
        Team Chelsea = testTeamProperties();
        assertEquals(Chelsea,actualChelsea);
    }


}