package de.guehring.footballserver.league;

public class LeagueDTO {

    private int id;
    private String leagueName;

    public LeagueDTO(int id, String leagueName) {
        this.id = id;
        this.leagueName = leagueName;
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
}
