package com.sample.azuregithub;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Employee {

    private Long id;
    private String name;

}
