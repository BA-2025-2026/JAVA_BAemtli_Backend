package net.ictcampus.baemtli.login;

import jakarta.persistence.*;
import lombok.Data;
import net.ictcampus.baemtli.team.AuthSource;
import net.ictcampus.baemtli.team.Role;
import net.ictcampus.baemtli.team.Team;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

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

    @Enumerated(EnumType.STRING) // Saves name of enum instead of int
    @Column(name = "Role", nullable = false)
    private Role role;

    @Enumerated(EnumType.STRING) // Saves name of enum instead of int
    @Column(name = "AuthSource", nullable = false, length = 10)
    private AuthSource authSource = AuthSource.LOCAL; // Default value

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "Team_ID")
    private Team team;
}
