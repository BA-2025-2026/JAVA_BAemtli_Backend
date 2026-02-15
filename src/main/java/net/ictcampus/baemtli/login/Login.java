package net.ictcampus.baemtli.login;

import jakarta.persistence.*;
import lombok.Data;
import net.ictcampus.baemtli.team.Role;
import net.ictcampus.baemtli.team.Team;

@Entity
@Table(name = "login")
@Data
public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Login")
    private Integer idLogin;

    @Column(name = "Username", unique = true, nullable = false, length = 50)
    private String username;

    @Column(name = "PasswordHash") // length = 255 is already default
    private String passwordHash;

    @Enumerated(EnumType.STRING) // Speichert den Namen des Enums statt der Zahl
    @Column(name = "Role", nullable = false)
    private Role role;

    @Column(name = "AuthSource", nullable = false, length = 10)
    private String AuthSource = "LOCAL"; // Default value

    @ManyToOne
    @JoinColumn(name = "Team_ID", nullable = false)
    private Team team;
}
