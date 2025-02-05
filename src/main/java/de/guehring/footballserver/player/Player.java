package de.guehring.footballserver.player;

import jakarta.persistence.*;

import java.sql.Timestamp;


@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String playerName;

    private String surname;

    private Timestamp birthdate;

    private String position;


    public Player(int id, String playerName, String surname, Timestamp birthdate, String position) {
        this.id = id;
        this.playerName = playerName;
        this.surname = surname;
        this.birthdate = birthdate;
        this.position = position;

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

    public Timestamp getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Timestamp birthdate) {
        this.birthdate = birthdate;
    }
    public String getPosition(){
        return position;
    }
    public void setPosition(String position){
        this.position = position;
    }

}
