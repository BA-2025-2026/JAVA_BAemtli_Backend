package net.ictcampus.baemtli.trainee;

import jakarta.persistence.*;
import lombok.Data;
import net.ictcampus.baemtli.team.Team;

@Entity
@Table(name = "trainee")
@Data
public class Trainee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Trainee")
    private Integer idTrainee;

    @Column(name = "FirstName", nullable = false, length = 30)
    private String firstName;

    @Column(name = "LastName", nullable = false, length = 30)
    private String lastName;

    @ManyToOne
    @JoinColumn(name = "Team_ID", nullable = false)
    private Team team;
}