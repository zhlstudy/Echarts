package com.example.controller;

import com.example.entity.NoCevData;
import com.example.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class IndexController {

    @Autowired
    private IndexService indexService;

    @RequestMapping("/query")
    @ResponseBody
    public List<NoCevData> queryData() {
        List<NoCevData> list = indexService.list();
        System.err.print(list);
        return list;
    }

    @RequestMapping("/queryBar")
    @ResponseBody
    public Map<String, List<Object>> queryBarData() {
        //1.所有城市数据：数值
        List<NoCevData> list = indexService.list();
        //2.所有城市数据
        List<String> cityList = new ArrayList<>();
        for (NoCevData data : list) {
            cityList.add(data.getName());
        }
        //3.所有城市人数数据
        List<Integer> numberList = new ArrayList<>();
        for (NoCevData data : list) {
            numberList.add(data.getValue());
        }
        //4.创建一个容器
        Map map = new HashMap();
        map.put("cityList", cityList);
        map.put("numberList", numberList);

//        System.err.print(map);
        return map;
    }


}
