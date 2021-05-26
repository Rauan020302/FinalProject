package itacademy.finalproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthModel {
    private String username;

    private String password;

    private LocalDateTime createdDate = LocalDateTime.now();
}
