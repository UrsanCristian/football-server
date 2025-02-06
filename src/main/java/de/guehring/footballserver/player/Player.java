package de.guehring.footballserver.player;

import de.guehring.footballserver.team.Team;
import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String playerName;

    private String surname;

    private LocalDate birthdate;

    private String position;

    @ManyToOne
    private Team team;


    public Player(int id, String playerName, String surname, LocalDate birthdate, String position, Team team) {
        this.id = id;
        this.playerName = playerName;
        this.surname = surname;
        this.birthdate = birthdate;
        this.position = position;
        this.team = team;

    }

    public Player() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
