package com.letopo.data.dto;

import com.letopo.data.dto.goods.SpuDTO;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author jh
 * @version 1.0
 * @date 2020-04-27 17:05
 */
@Data
public class IntegralIndexDataDTO {

    private Map<String, List<AdvertisementDTO>> advertisement;

    private List<RecommendDTO> windowRecommend;

    private List<SpuDTO> salesTop;

    private List<SpuDTO> newTop;

}
