package de.guehring.footballserver.league;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/leagues")
public class LeagueController {

    private final LeagueService leagueService;

    public LeagueController(LeagueService leagueService) {
        this.leagueService = leagueService;
    }

    @GetMapping()
    public List<LeagueDTO> getLeagues() {
        return leagueService.getAllLeagues();
    }

    @GetMapping("/{id}")
    public LeagueDTO getLeagueById(@PathVariable int id) {
        return leagueService.getLeagueById(id);
    }

    @GetMapping("/name")
    public LeagueDTO getLeagueByName(@RequestParam String leagueName) {
        return leagueService.getLeagueByName(leagueName);
    }

    @PostMapping()
    public String createNewLeague(@RequestBody LeagueDTO leagueDTO) {
        leagueService.createNewLeague(leagueDTO);
        return "New league created";
    }
}
