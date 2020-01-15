package com.baker.learning.learneurekadiscoveryclientslave.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @description
 * @date 2020/1/14 13:18
 */
@Data
@ToString
@NoArgsConstructor
public class User implements Serializable {
    private String name;
    private String sex;
    private Integer age;
}
