package itacademy.finalproject.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "cement")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
public class Cement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "cement_type")
    private String type;

    @ManyToOne
    @JoinColumn(name = "foundation")
    private Foundation foundation;
}
