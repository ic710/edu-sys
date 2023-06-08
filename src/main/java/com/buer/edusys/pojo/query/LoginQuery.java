package com.buer.edusys.pojo.query;

import lombok.Data;

@Data
public class LoginQuery {

    private String name;

    private String password;

    private String jsCode;
}
