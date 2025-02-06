package de.guehring.footballserver.player;

import de.guehring.footballserver.team.Team;
import de.guehring.footballserver.team.TeamDTO;
import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class PlayerDTO
{
    private int id;
    private String playerName;
    private String surname;
    private LocalDate birthdate;
    private String position;
    private int teamId;
}



