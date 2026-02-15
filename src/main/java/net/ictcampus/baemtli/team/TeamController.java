package net.ictcampus.baemtli.team;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teams") // Base URL for all team endpoints
public class TeamController {

    @Autowired TeamService teamService;

    @PostMapping // equals POST /teams
    public ResponseEntity<Team> addTeam(@RequestBody Team team) {
        Team createdTeam = teamService.createTeam(team);
        return new ResponseEntity<>(createdTeam, HttpStatus.CREATED);
    }
}
