package de.guehring.footballserver.player;

import java.time.LocalDate;

public class PlayerDTO {
    private int id;
    private String playerName;
    private String surname;
    private LocalDate birthdate;
    private String position;
    private int teamId;


    public PlayerDTO() {
    }

    public PlayerDTO(int id, String playerName, String surname, LocalDate birthdate, String position, int teamId) {
        this.id = id;
        this.playerName = playerName;
        this.surname = surname;
        this.birthdate = birthdate;
        this.position = position;
        this.teamId = teamId;
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

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }
}



