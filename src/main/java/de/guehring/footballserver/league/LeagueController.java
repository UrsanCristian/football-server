package de.guehring.footballserver.league;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/league")
public class LeagueController {

    private final LeagueService leagueService;
    private final LeagueDTOMapper leagueDTOMapper;

    public LeagueController(LeagueService leagueService, LeagueDTOMapper leagueDTOMapper) {
        this.leagueService = leagueService;
        this.leagueDTOMapper = leagueDTOMapper;
    }

    @GetMapping()
    public List<LeagueDTO> getLeagues() {
        List<LeagueDTO> leagueDTOs = new ArrayList<>();
        List<League> leagues = leagueService.getAllLeagues();
        for (League league : leagues) {
            leagueDTOs.add(leagueDTOMapper.mapToDTO(league));
        }
        return leagueDTOs;

//  This is a more concise way of doing the same thing:
//       return leagueService.getAllLeagues().stream()
//                .map(leagueDTOMapper::mapToDTO)
//                .toList();
    }

    @GetMapping("/{id}")
    public LeagueDTO getLeagueById(@PathVariable int id) {
        return leagueDTOMapper.mapToDTO(leagueService.getLeagueById(id));
    }

    @GetMapping()
    public LeagueDTO getLeagueByName(@RequestParam String leagueName) {
        return leagueDTOMapper.mapToDTO(leagueService.getLeagueByName(leagueName));
    }
}
