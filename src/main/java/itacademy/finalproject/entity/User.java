package itacademy.finalproject.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "login")
    private String username;

    @Column(name = "user_password")
    private String password;

    @Column(name = "status")
    private Long status;

    @Column(name = "created_date")
    private LocalDateTime createdDate = LocalDateTime.now();
}
