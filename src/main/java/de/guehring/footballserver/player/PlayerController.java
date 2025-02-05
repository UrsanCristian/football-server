package de.guehring.footballserver.player;


import de.guehring.footballserver.team.TeamService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/players")
public class PlayerController {
    private final PlayerService playerService;

    public PlayerController(PlayerService playerService){
        this.playerService =playerService;

    }

    @GetMapping
    public List<PlayerDTO> getPlayer(){
        return playerService.getAllPlayer();
    }

    @GetMapping("/{id}")
    public PlayerDTO getPlayerById(@PathVariable int id){
        return playerService.getPlayerById();
    }
    @PostMapping
    public String createNewPlayer(@RequestBody PlayerDTO playerDTO){
        playerService.createNewPlayer(playerDTO);
        return "New player created";
    }
}
