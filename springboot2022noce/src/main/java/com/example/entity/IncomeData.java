package com.example.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("Income_data")
public class IncomeData {
    //    private Integer id;
    private String day;
    private Integer Income;
}
