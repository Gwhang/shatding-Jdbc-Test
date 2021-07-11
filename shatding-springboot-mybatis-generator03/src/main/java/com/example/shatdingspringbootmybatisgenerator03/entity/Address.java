package com.example.shatdingspringbootmybatisgenerator03.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    private Long id;
    private String code;
    private String name;
    private String pid;
    private Integer type;
    private Integer lit;

}
