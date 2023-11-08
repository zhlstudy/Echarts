package com.example.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.dao.IncomeMapper;
import com.example.entity.IncomeData;
import org.springframework.stereotype.Service;

@Service
public class IncomeServiceImp extends ServiceImpl<IncomeMapper, IncomeData> implements IncomeService {
}
