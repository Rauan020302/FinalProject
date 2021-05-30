package itacademy.finalproject.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "counter")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
public class BrickCounter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "count")
    private Integer count;

    @ManyToOne
    @JoinColumn(name = "brick_id")
    private Brick brick;

    @ManyToOne
    @JoinColumn(name = "wall_id")
    private Wall wall;

    @ManyToOne
    @JoinColumn(name = "window_id")
    private Window window;

}
