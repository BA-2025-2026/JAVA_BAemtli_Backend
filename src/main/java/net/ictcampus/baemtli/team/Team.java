package net.ictcampus.baemtli.team;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "team")
@Data
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Team")
    private Integer idTeam;

    @Column(name = "Name", nullable = false, length = 30)
    private String name;
}
