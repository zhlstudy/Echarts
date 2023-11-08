package com.example.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("noce_data")
public class NoCevData {
    //    private Integer id;
    private String name;
    private Integer value;

}
