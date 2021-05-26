package itacademy.finalproject.model;

import itacademy.finalproject.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BrickModel {
    private String name;

    private Double width;

    private Double length;

    private Double height;

    private Double masonry;

    private Long houseId;
}
