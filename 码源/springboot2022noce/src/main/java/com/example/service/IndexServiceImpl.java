package com.example.service;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.dao.IndexMapper;
import com.example.entity.NoCevData;
import org.springframework.stereotype.Service;

@Service
public class IndexServiceImpl extends ServiceImpl<IndexMapper, NoCevData> implements IndexService {
}
