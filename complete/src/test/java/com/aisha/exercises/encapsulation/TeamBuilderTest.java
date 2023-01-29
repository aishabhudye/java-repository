package com.aisha.exercises.encapsulation;

import org.junit.jupiter.api.Test;

class TeamBuilderTest {
    private final TeamBuilder teamBuilder = new TeamBuilder();

    @Test
    public void testTeamNames(){
        assert equals("Wolverhampton Wanderers",teamBuilder.buildTeams(""))
    }

}