package de.guehring.footballserver.league;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeagueService {

    private final LeagueRepository leagueRepository;

    // Injection (Tip: Can be replaced by using Lombok's @RequiredArgsConstructor)
    public LeagueService(LeagueRepository leagueRepository) {
        this.leagueRepository = leagueRepository;
    }

    public List<League> getAllLeagues() {
        return leagueRepository.findAll();
    }

    public League getLeagueById(int id) {
        return leagueRepository.findById(id).orElse(null);
    }

    public League getLeagueByName(String leagueName) {
        return leagueRepository.findByLeagueName(leagueName).orElse(null);
    }
}
