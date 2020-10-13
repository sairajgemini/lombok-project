package com.lombok.model;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Employee {
    private int employeeId;
    private String employeeName;
    private String addressLine;
    private String mobilePhone;
}
