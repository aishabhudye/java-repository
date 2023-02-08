package com.aisha.exercises.encapsulation;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
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

    public Team chelseaTeam() {
        String path = "C:\\Users\\Aisha\\IdeaProjects\\java-repository\\complete\\src\\main\\resources\\PremierLeagueTableUnsorted.csv";
        List<Team> teams = teamBuilder.build(path);
        for (Team team : teams) {
            if (team.getName().equals("Chelsea")) {
                System.out.println("The team is"+team);
            }
        }
        return teams.get(15);
    }

    @Test
    public void testProperties(){
        String path = "C:\\Users\\Aisha\\IdeaProjects\\java-repository\\complete\\src\\main\\resources\\PremierLeagueTableUnsorted.csv";
        Team expected = new Team(20,8,5,7,22,21,1,29,"Chelsea");
        Team actual = chelseaTeam();
        assertEquals(expected,actual);
    }


}