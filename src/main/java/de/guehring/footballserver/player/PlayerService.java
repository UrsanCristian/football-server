package de.guehring.footballserver.player;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerService {
    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
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

        savePlayer(newPlayer);
    }

    public Player getPlayerEntityById(int id) {
        return playerRepository.findById(id).orElse(null);
    }
}
