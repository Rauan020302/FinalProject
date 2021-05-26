package itacademy.finalproject.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "wall")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@ToString
public class Wall {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "length")
    private Double length;

    @Column(name = "height")
    private Double height;

    @OneToOne
    @JoinColumn(name = "house_id")
    private House house;
}
