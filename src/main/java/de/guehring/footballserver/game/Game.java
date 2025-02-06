package de.guehring.footballserver.game;

import de.guehring.footballserver.team.Team;
import jakarta.persistence.*;

import java.time.DateTimeException;
import java.time.LocalDateTime;

@Entity
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Team teamHome;

    @ManyToOne
    private Team teamAway;

    private int goalsTeamHome;
    private int goalsTeamAway;

    private String location;
    private LocalDateTime date;

    public Game() {
    }

    public Game(int id, Team teamHome, Team teamAway, int goalsTeamHome, int goalsTeamAway, String location, LocalDateTime date) {
        this.id = id;
        this.teamHome = teamHome;
        this.teamAway = teamAway;
        this.goalsTeamHome = goalsTeamHome;
        this.goalsTeamAway = goalsTeamAway;
        this.location = location;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Team getTeamHome() {
        return teamHome;
    }

    public void setTeamHome(Team teamHome) {
        this.teamHome = teamHome;
    }

    public Team getTeamAway() {
        return teamAway;
    }

    public void setTeamAway(Team teamAway) {
        this.teamAway = teamAway;
    }

    public int getGoalsTeamHome() {
        return goalsTeamHome;
    }

    public void setGoalsTeamHome(int goalsTeamHome) {
        this.goalsTeamHome = goalsTeamHome;
    }

    public int getGoalsTeamAway() {
        return goalsTeamAway;
    }

    public void setGoalsTeamAway(int goalsTeamAway) {
        this.goalsTeamAway = goalsTeamAway;
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
}
