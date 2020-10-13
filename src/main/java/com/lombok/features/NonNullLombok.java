package com.lombok.features;

import com.lombok.model.Employee;
import com.lombok.model.User;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NonNullLombok {
    public static void main(String[] args) {
        NonNullLombok nonNullLombok = new NonNullLombok();
        nonNullLombok.getUser(new User());
        log.error("Error");
        Employee employee = Employee.builder()
                            .employeeId(12)
                            .employeeName("Saikat")
                            .addressLine("C.R. Park")
                            .mobilePhone("8826286200")
                            .build();
        System.out.println(employee);
    }

    private void getUser(@NonNull User user) {
        user.setName("Saikat");
        user.setAddress("abc");
        System.out.println(user);
    }
}
