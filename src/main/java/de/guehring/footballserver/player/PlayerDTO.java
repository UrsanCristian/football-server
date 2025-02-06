package de.guehring.footballserver.player;

import de.guehring.footballserver.team.Team;
import de.guehring.footballserver.team.TeamDTO;
import lombok.Data;

import java.sql.Timestamp;
@Data
public class PlayerDTO
{
    private int id;
    private String playerName;
    private String surname;
    private Timestamp birthdate;
    private String position;
    private int teamId;
}



