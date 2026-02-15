package net.ictcampus.baemtli.choreassignment;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "workday")
@Data
public class Workday {
    @Id
    @Column(name = "ID_Workday", nullable = false)
    private LocalDate idWorkday;
}
