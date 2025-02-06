package de.guehring.footballserver.team;


import de.guehring.footballserver.league.LeagueService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeamService {
    private final TeamRepository teamRepository;
    private final LeagueService leagueService;


    public TeamService(TeamRepository teamRepository, LeagueService leagueService) {
        this.teamRepository = teamRepository;
        this.leagueService = leagueService;
    }

    public List<TeamDTO> getAllTeams() {
        List<Team> teams = teamRepository.findAll();
        List<TeamDTO> teamDTOs = new ArrayList<>();
        for (Team team : teams) {

            TeamDTO teamDTO = new TeamDTO();
            teamDTO.setId(team.getId());
            teamDTO.setTeamName(team.getTeamName());
            teamDTO.setCountry(team.getCountry());
            teamDTO.setLeagueId(team.getLeague().getId());
            teamDTOs.add(teamDTO);
        }
        return teamDTOs;
    }

    public TeamDTO getTeamById(int id) {
        Team team = teamRepository.findById(id).orElse(null);
        if (team != null) {
            TeamDTO teamDTO = new TeamDTO();
            teamDTO.setId(team.getId());
            teamDTO.setTeamName(team.getTeamName());
            teamDTO.setCountry(team.getCountry());
            teamDTO.setLeagueId(team.getLeague().getId());
            return teamDTO;

        }
        return null;

    }

    public TeamDTO getTeamByName(String teamName) {
        Team team = teamRepository.findByTeamName(teamName).orElse(null);
        if (team != null) {
            TeamDTO teamDTO = new TeamDTO();
            teamDTO.setId(team.getId());
            teamDTO.setTeamName(team.getTeamName());
            teamDTO.setCountry(team.getCountry());
            teamDTO.setLeagueId(team.getLeague().getId());
            return teamDTO;

        }
        return null;

    }

    public List<TeamDTO> getTeamByCountry(String country) {
        List<Team> teams = teamRepository.findByCountry(country);
        List<TeamDTO> teamDTOs = new ArrayList<>();
        for (Team team : teams) {

            TeamDTO teamDTO = new TeamDTO();
            teamDTO.setId(team.getId());
            teamDTO.setTeamName(team.getTeamName());
            teamDTO.setCountry(team.getCountry());
            teamDTO.setLeagueId(team.getLeague().getId());
            teamDTOs.add(teamDTO);
        }
        return teamDTOs;
    }

    public void saveTeam(Team team) {
        teamRepository.save(team);
    }

    public void createNewTeam(TeamDTO teamDTO) {
        Team newTeam = new Team();
        newTeam.setTeamName(teamDTO.getTeamName());
        newTeam.setCountry(teamDTO.getCountry());
        newTeam.setLeague(leagueService.getLeagueEntityById(teamDTO.getLeagueId()));
        saveTeam(newTeam);
    }
}

