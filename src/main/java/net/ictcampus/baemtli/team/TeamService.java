package net.ictcampus.baemtli.team;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamService {

    @Autowired
    private TeamRepository teamRepository;

    public Team createTeam(Team team) {
        // TODO: Implement validation and errors
        return teamRepository.save(team);
    }
}
