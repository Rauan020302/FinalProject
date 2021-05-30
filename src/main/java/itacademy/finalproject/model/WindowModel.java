package itacademy.finalproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WindowModel {
    private String brand;

    private Double length;

    private Double height;

    private Integer count;

    private Long houseId;
}
