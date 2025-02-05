package de.guehring.footballserver.team;


import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/teams")
public class TeamController {
    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }


    @GetMapping
    public List<TeamDTO> getTeams() {
        return teamService.getAllTeams();
    }


    @GetMapping("/{id}")
    public TeamDTO getTeamById(@PathVariable int id) {
        return teamService.getTeamById(id);
    }

    @GetMapping("/name")
    public TeamDTO getTeamByName(@RequestParam String teamName) {
        return teamService.getTeamByName(teamName);
    }

    @GetMapping("/country")
    public List<TeamDTO> getTeamByCountry(@RequestParam String country) {
        return teamService.getTeamByCountry(country);
    }

    @PostMapping
    public String createNewTeam(@RequestBody TeamDTO teamDTO) {
        teamService.createNewTeam(teamDTO);
        return "New team created";
    }


}
