package com.example.controller;

import com.example.entity.IncomeData;
import com.example.service.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class IncomeController {
    @Autowired
    private IncomeService incomeService;

    @RequestMapping("/Line")
    @ResponseBody
    public Map<String, List<Object>> LineBarData() {
        //1.所有天数：数值
        List<IncomeData> list = incomeService.list();
        //2.所有天的  数据
        List<String> dayList = new ArrayList<>();
        for (IncomeData data : list) {
            dayList.add(data.getDay());
        }
        //3.所有每天的数  数据
        List<Integer> IncomeList = new ArrayList<>();
        for (IncomeData data : list) {
            IncomeList.add(data.getIncome());
        }
        //4.创建一个容器
        Map map = new HashMap();
        map.put("dayList", dayList);
        map.put("IncomeList", IncomeList);

//        System.err.print(map);
        return map;
    }

}
