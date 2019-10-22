package com.controller;

import com.service.CurrencyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vo.ResponseResult;

/**
 * @package: com.zjbdos.ods.settingconfig.server.controller
 * @description: 货币controller
 * @author: zhumingfu
 * @date: 2019-10-09 11:24
 **/
@RestController
@RequestMapping("/api/currency")
@Api(tags="货币")
public class CurrencyController {
    @Autowired
    private CurrencyService currencyService;

    @ApiOperation(value = "获取货币列表", notes = "获取货币列表")
   @ApiResponse(code = 200,response = ResponseResult.class,message = "success")
    @PostMapping("/getList")
    public  ResponseResult getList( ){
        return  currencyService.getCurrencyList() ;
    }

    @PostMapping("/insert")
    public  ResponseResult insert( ){
        return  currencyService.insert() ;
    }

}
