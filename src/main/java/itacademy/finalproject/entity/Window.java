package itacademy.finalproject.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "windows")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@ToString
public class Window {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "brand")
    private String brand;

    @Column(name = "length")
    private Double length;

    @Column(name = "height")
    private Double height;

    @Column(name = "count")
    private Integer count;

    @ManyToOne
    @JoinColumn(name = "house_id")
    private House house;
}
