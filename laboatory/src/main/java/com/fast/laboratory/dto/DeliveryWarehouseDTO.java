package com.fast.laboratory.dto;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * 提货库点配置DTO
 * </p>
 *
 * @author navigator
 * @since 2023-08-17
 */
@Data
@Accessors(chain = true)
public class DeliveryWarehouseDTO {
    private Integer status;

    private Integer goodsCategoryId;

    private Integer goodsId;

    private String deliveryFactory;

    private Integer warehouseType;

    private String warehouseName;

    private String warehouseCode;

    private String linkageGoodsCode;
}
