package com.fast.laboratory.controller;

import com.fast.laboratory.dto.DeliveryWarehouseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 实验室 前端控制器
 * </p>
 *
 * @author fast
 * @since 2023-09-21
 */
@RestController
@RequiredArgsConstructor
@RequestMapping
public class LaboratoryController {
    @RequestMapping("hello")
    public String hello() {
        return "hello world";
    }

    @RequestMapping("hello2")
    public String hello2(@RequestParam("name") String name) {
        return name;
    }

    @PostMapping("hello3")
    public String hello3(@RequestBody DeliveryWarehouseDTO warehouseDTO) {
        return String.valueOf(warehouseDTO);
    }
}
