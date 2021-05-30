package itacademy.finalproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class BrickModel {
    private String name;

    private Double width;

    private Double length;

    private Double height;

    private Long houseId;
}
