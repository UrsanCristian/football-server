package de.guehring.footballserver.player;

import de.guehring.footballserver.league.League;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlayerRepository extends JpaRepository<League, Integer> {

    Optional<League> findByLeagueName(String leagueName);
}
