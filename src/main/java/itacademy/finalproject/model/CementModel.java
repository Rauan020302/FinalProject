package itacademy.finalproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CementModel {

    private String name;

    private String type;

    private Long foundationId;
}
