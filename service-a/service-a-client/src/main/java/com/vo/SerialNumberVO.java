package com.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @program: ods-root
 * @description: 序列化vo
 * @author: zhumf
 * @create: 20190921
 **/
@Data
public class SerialNumberVO  implements Serializable {
    private List<String> numbers;
}
