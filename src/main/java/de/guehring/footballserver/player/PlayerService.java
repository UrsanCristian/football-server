package de.guehring.footballserver.player;

import de.guehring.footballserver.team.TeamService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerService {
    private final PlayerRepository playerRepository;
    private final TeamService teamService;

    public PlayerService(PlayerRepository playerRepository, TeamService teamService) {
        this.playerRepository = playerRepository;
        this.teamService = teamService;
    }

    public List<PlayerDTO> getAllPlayers() {
        List<Player> players = playerRepository.findAll();
        List<PlayerDTO> playerDTOS = new ArrayList<>();
        for (Player player : players) {
            PlayerDTO playerDTO = new PlayerDTO();
            playerDTO.setId(player.getId());
            playerDTO.setPlayerName(player.getPlayerName());
            playerDTOS.add(playerDTO);
        }
        return playerDTOS;
    }

    public PlayerDTO getPlayerById(int id) {
        Player player = playerRepository.findById(id).orElse(null);
        if (player != null) {
            PlayerDTO playerDTO = new PlayerDTO();
            playerDTO.setId(player.getId());
            playerDTO.setPlayerName(player.getPlayerName());
            return playerDTO;
        }
        return null;
    }

    public void savePlayer(Player player) {
        playerRepository.save(player);
    }

    public void createNewPlayer(PlayerDTO playerDTO) {
        Player newPlayer = new Player();
        newPlayer.setPlayerName(playerDTO.getPlayerName());
        newPlayer.setBirthdate(playerDTO.getBirthdate());
        newPlayer.setPosition(playerDTO.getPosition());
        newPlayer.setSurname(playerDTO.getSurname());
        newPlayer.setTeam(teamService.getTeamEntityById(playerDTO.getId()));

        savePlayer(newPlayer);
    }

    public Player getPlayerEntityById(int id) {
        return playerRepository.findById(id).orElse(null);
    }
}
