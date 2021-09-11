package com.base.back.controller;

import com.base.back.constant.Status;
import com.base.back.entity.ApiResponse;
import com.base.back.entity.BaseInfo;
import com.base.back.service.BaseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/")
public class BaseController {
    @Autowired
    BaseInfoService baseInfoService;

    @PostMapping(value = "/init")
    public ApiResponse init(@RequestBody Map<String, Object> param) {
        // 可以用对象拷贝 代码漂亮一点
        // 参数验证等内容 略
        String name = param.get("name").toString();
        Integer age = Integer.parseInt(param.get("age").toString());
        String sex = param.get("sex").toString();

        String culture = param.get("culture").toString();
        String work = param.get("work").toString();
        String live = param.get("live").toString();
        String marriage = param.get("marriage").toString();

        BaseInfo baseInfo = BaseInfo.builder().name(name).age(age)
                .sex(sex).culture(culture).work(work).live(live)
                .marriage(marriage).build();

        Integer id = baseInfoService.initSurvey(baseInfo);
        if (id > 0) {
            return ApiResponse.ofStatus(Status.OK, baseInfo.getId());
        }else {
            return ApiResponse.ofStatus(Status.UNKNOWN_ERROR);
        }
    }
}
