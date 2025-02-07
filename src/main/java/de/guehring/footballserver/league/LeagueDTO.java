package de.guehring.footballserver.league;

public class LeagueDTO {

    private int id;
    private String leagueName;
    private String leagueUrl;


    public LeagueDTO(int id, String leagueName, String leagueUrl) {
        this.id = id;
        this.leagueName = leagueName;
        this.leagueUrl = leagueUrl;
    }

    public LeagueDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public String getLeagueUrl() {
        return leagueUrl;
    }

    public void setLeagueUrl(String leagueUrl) {
        this.leagueUrl = leagueUrl;
    }
}
