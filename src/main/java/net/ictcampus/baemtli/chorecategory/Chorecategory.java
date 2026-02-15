package net.ictcampus.baemtli.chorecategory;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "chorecategory")
@Data
public class Chorecategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Chorecategory")
    private Integer idChorecategory;

    @Column(name = "Name", nullable = false, length = 30)
    private String name;

    @Column(name = "Description")
    private String description;
}
