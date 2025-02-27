package de.guehring.footballserver.league;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LeagueService {

    private final LeagueRepository leagueRepository;

    // Injection (Tip: Can be replaced by using Lombok's @RequiredArgsConstructor)
    public LeagueService(LeagueRepository leagueRepository) {
        this.leagueRepository = leagueRepository;
    }

    public List<LeagueDTO> getAllLeagues() {
        List<League> leagues = leagueRepository.findAll();
        List<LeagueDTO> leagueDTOs = new ArrayList<>();
        for (League league : leagues) {
            LeagueDTO leagueDTO = new LeagueDTO();
            leagueDTO.setId(league.getId());
            leagueDTO.setLeagueName(league.getLeagueName());
            leagueDTOs.add(leagueDTO);
        }
        return leagueDTOs;
    }

    public LeagueDTO getLeagueById(int id) {
        League league = leagueRepository.findById(id).orElse(null);
        if (league != null) {
            LeagueDTO leagueDTO = new LeagueDTO();
            leagueDTO.setId(league.getId());
            leagueDTO.setLeagueName(league.getLeagueName());
            return leagueDTO;
        }
        return null;
    }

    public LeagueDTO getLeagueByName(String leagueName) {
        League league = leagueRepository.findByLeagueName(leagueName).orElse(null);
        if (league != null) {
            LeagueDTO leagueDTO = new LeagueDTO();
            leagueDTO.setId(league.getId());
            leagueDTO.setLeagueName(league.getLeagueName());
            return leagueDTO;
        }
        return null;
    }
}
