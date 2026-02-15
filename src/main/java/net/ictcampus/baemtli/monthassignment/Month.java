package net.ictcampus.baemtli.monthassignment;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "month")
@Data
public class Month {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Month")
    private Integer idMonth;

    @Column(name = "Month", nullable = false)
    private Integer month;

    @Column(name = "Year", nullable = false, columnDefinition = "YEAR")
    private Integer year;
}
