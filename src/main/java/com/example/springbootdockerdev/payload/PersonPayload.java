package com.example.springbootdockerdev.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonPayload {

    private String name;
    private Integer age;
    private String email;

}
