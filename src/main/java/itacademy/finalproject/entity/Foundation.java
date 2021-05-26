package itacademy.finalproject.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "foundation")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Foundation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "width")
    private Double width;

    @Column(name = "length")
    private Double length;

    @Column(name = "height")
    private Double height;

    @OneToOne
    @JoinColumn(name = "house_id")
    private House house;
}
