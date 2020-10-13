package com.lombok.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {
    private String name;
    private int age;
    private String mobile;
    private String address;
}
