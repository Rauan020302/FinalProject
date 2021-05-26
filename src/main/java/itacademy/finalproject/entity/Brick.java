package itacademy.finalproject.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "brick")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Brick {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "width")
    private Double width;

    @Column(name = "length")
    private Double length;

    @Column(name = "height")
    private Double height;

    @Column(name = "masonry")
    private Double masonry;

    @ManyToOne
    @JoinColumn(name = "house_id")
    private House house;
}
