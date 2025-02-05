package de.guehring.footballserver.team;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String teamName;

    private String country;

    public Team(int id, String teamName, String country) {
        this.id = id;
        this.teamName = teamName;
        this.country = country;

    }
    public Team() {
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getTeamName() { return teamName;}
    public void setTeamName(String teamName) {this.teamName = teamName;}
    public String getCountry() {return country; }
    public void setCountry(String country) {this.country = country;}
}
