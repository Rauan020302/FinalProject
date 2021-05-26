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
public class Counter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "count")
    private Integer count;

    @ManyToOne
    @JoinColumn(name = "brick_id")
    private Brick brick;

    @ManyToOne
    @JoinColumn(name = "foundation_id")
    private Foundation foundation;

    @ManyToOne
    @JoinColumn(name = "wall_id")
    private Wall wall;

    @ManyToOne
    @JoinColumn(name = "window_id")
    private Window window;
}
