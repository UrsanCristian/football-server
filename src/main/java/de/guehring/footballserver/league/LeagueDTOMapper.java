package de.guehring.footballserver.league;

import org.springframework.stereotype.Service;

@Service
public class LeagueDTOMapper {

    public LeagueDTO mapToDTO(League league) {
        return new LeagueDTO(league.getId(), league.getLeagueName());
    }

    public League mapToEntity(LeagueDTO leagueDTO) {
        return new League(leagueDTO.id(), leagueDTO.leagueName());
    }
}
