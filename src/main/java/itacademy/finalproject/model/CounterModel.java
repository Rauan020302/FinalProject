package itacademy.finalproject.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class CounterModel {
    private Integer count;

    private Long brickId;

    private Long foundationId;

    private Long wallId;

    private Long windowId;
}
