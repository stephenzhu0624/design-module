package com.example.demo.functionInterface;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;

@Data
@AllArgsConstructor
public class DemoVO {

    private String name;
    private String age;

    DemoVO init(String name, String age){
        return new DemoVO(name,age);
    }

}

