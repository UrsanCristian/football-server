package de.guehring.footballserver.team;

public class TeamDTO {
    private int id;
    private String teamName;
    private String country;
    private int leagueId;
    private int points;

    public TeamDTO(int id, String teamName, String country, int points) {
        this.id = id;
        this.teamName = teamName;
        this.country = country;
        this.points = points;
    }

    public TeamDTO() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(int leagueId) {
        this.leagueId = leagueId;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}


