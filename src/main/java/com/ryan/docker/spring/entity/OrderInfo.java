package com.ryan.docker.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderInfo {
    private int id;
    private String username;
    private String orderName;
    private LocalDateTime orderTime;
    private String details;
}
