package de.guehring.footballserver.game;

import java.time.LocalDateTime;

public class GameDTO {
    private int homeTeamId;
    private int awayTeamId;

    private String location;
    private LocalDateTime date;
    private int goalTeamHome;
    private int goalTeamAway;

    public GameDTO() {
    }

    public GameDTO(int homeTeamId, int awayTeamId, String location, LocalDateTime date, int goalTeamHome, int goalTeamAway) {
        this.homeTeamId = homeTeamId;
        this.awayTeamId = awayTeamId;
        this.location = location;
        this.date = date;
        this.goalTeamHome = goalTeamHome;
        this.goalTeamAway = goalTeamAway;
    }

    public int getHomeTeamId() {
        return homeTeamId;
    }

    public void setHomeTeamId(int homeTeamId) {
        this.homeTeamId = homeTeamId;
    }

    public int getAwayTeamId() {
        return awayTeamId;
    }

    public void setAwayTeamId(int awayTeamId) {
        this.awayTeamId = awayTeamId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public int getGoalTeamHome() {
        return goalTeamHome;
    }

    public void setGoalTeamHome(int goalTeamHome) {
        this.goalTeamHome = goalTeamHome;
    }

    public int getGoalTeamAway() {
        return goalTeamAway;
    }

    public void setGoalTeamAway(int goalTeamAway) {
        this.goalTeamAway = goalTeamAway;
    }
}
