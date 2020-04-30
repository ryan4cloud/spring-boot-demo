package com.ryan.docker.spring.controller;

import com.ryan.docker.spring.entity.OrderInfo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/order")
public class OrderInfoController {

    @GetMapping
    public ResponseEntity<OrderInfo> orders() {
        OrderInfo order = OrderInfo.builder()
                .id(1)
                .username("leiyongqi1026@gmail.com")
                .orderName("LG Ultrafine Display 4K")
                .orderTime(LocalDateTime.now())
                .details("4K screen...careful")
                .build();
        return ResponseEntity.ok(order);
    }
}
