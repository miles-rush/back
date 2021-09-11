package com.base.back.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.base.back.entity.BaseInfo;
import com.base.back.mapper.BaseInfoMapper;
import com.base.back.service.BaseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseInfoServiceImpl extends ServiceImpl<BaseInfoMapper, BaseInfo> implements BaseInfoService {
    @Autowired
    BaseInfoMapper baseInfoMapper;

    @Override
    public Integer initSurvey(BaseInfo baseInfo) {
        Integer id = baseInfoMapper.insert(baseInfo);
        return id;
    }
}
