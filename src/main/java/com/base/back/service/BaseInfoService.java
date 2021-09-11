package com.base.back.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.base.back.entity.BaseInfo;

public interface BaseInfoService extends IService<BaseInfo> {
    Integer initSurvey(BaseInfo baseInfo);
}
