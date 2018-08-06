package com.company.oop;

public class TeamGame implements Sports, Football {
    private String homename;
    private String visitName;
    private int homePoints;
    private int visitingPoints;
    private int num;
    public void setHomeTeam(String name){
        homename=name;
    }
    public void setVisitingTeam(String name){
        visitName=name;
    }
    public void endOfQuarter(int num){
        this.num=num;
    }
    public void homeTeamScored(int points){
        homePoints=points;
    }
    public void visitingTeamScored(int points){
        visitingPoints=points;
    }
    public static void main(String [] args){
        TeamGame teamGame= new TeamGame();
        teamGame.setHomeTeam("Spain");
        teamGame.setVisitingTeam("France");
    }
}
