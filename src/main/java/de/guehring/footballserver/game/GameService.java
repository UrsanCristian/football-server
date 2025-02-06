package de.guehring.footballserver.game;


import de.guehring.footballserver.team.TeamRepository;
import de.guehring.footballserver.team.TeamService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameService {
    private final GameRepository gameRepository;
    private final TeamService teamService;

    public GameService(GameRepository gameRepository, TeamService teamService) {
        this.gameRepository = gameRepository;
        this.teamService = teamService;
    }

    public List<GameDTO> getAllGames() {
        List<Game> games = gameRepository.findAll();
        List<GameDTO> gameDTOs = new ArrayList<>();
        for(Game game : games){
            GameDTO gameDTO = new GameDTO();

            gameDTO.setHomeTeamId(game.getTeamHome().getId());
            gameDTO.setAwayTeamId(game.getTeamAway().getId());

            gameDTO.setGoalTeamHome(game.getGoalsTeamHome());
            gameDTO.setGoalTeamAway(game.getGoalsTeamAway());

            gameDTO.setDate(game.getDate());
            gameDTO.setLocation(game.getLocation());
            gameDTOs.add(gameDTO);
        }
        return gameDTOs;
    }

    public GameDTO getGameById(int id){
        Game game = gameRepository.findById(id).orElse(null);
        if(game != null){
            GameDTO gameDTO = new GameDTO();

            gameDTO.setHomeTeamId(game.getTeamHome().getId());
            gameDTO.setAwayTeamId(game.getTeamAway().getId());

            gameDTO.setGoalTeamHome(game.getGoalsTeamHome());
            gameDTO.setGoalTeamAway(game.getGoalsTeamAway());

            gameDTO.setDate(game.getDate());
            gameDTO.setLocation(game.getLocation());
            return gameDTO;
        }
        return null;
    }

    public void saveGame(Game game){
        gameRepository.save(game);
    }
    public void createNewGame(GameDTO gameDTO){
        Game newGame = new Game();
        newGame.setTeamHome(teamService.getTeamEntityById(gameDTO.getHomeTeamId()));
        newGame.setTeamAway(teamService.getTeamEntityById(gameDTO.getAwayTeamId()));
        newGame.setDate(gameDTO.getDate());
        newGame.setLocation(gameDTO.getLocation());
        newGame.setGoalsTeamHome(gameDTO.getGoalTeamHome());
        newGame.setGoalsTeamAway(gameDTO.getGoalTeamAway());
        saveGame(newGame);
    }
}
