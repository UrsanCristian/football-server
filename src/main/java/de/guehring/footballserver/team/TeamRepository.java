package de.guehring.footballserver.team;

import de.guehring.footballserver.league.League;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {

    Optional<Team> findByTeamName(String leagueName);
    List<Team> findByCountry(String country);

}
