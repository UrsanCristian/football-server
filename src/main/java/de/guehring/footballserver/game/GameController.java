package de.guehring.footballserver.game;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/games")
public class GameController {
    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping
    public List<GameDTO> getGames() {
        return gameService.getAllGames();
    }

    @GetMapping("/{id}")
    public GameDTO getGameById(@PathVariable int id) {
        return gameService.getGameById(id);
    }

    @PostMapping
    public String createNewGame(@RequestBody GameDTO gameDTO) {
        gameService.createNewGame(gameDTO);
        return "New Game created";
    }
}
