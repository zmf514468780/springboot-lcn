package com.feign;
 
import com.feign.factory.CurrentFeignFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.vo.ReqInitVO;
import vo.ResponseResult;

/**
 * @program: ods-root
 * @description: 货币表feign接口
 * @author: zhumf
 * @create: 20191015
 **/

@FeignClient(value = "service-a", fallbackFactory =  CurrentFeignFactory.class)
public interface CurrentAService {

    /**
     *  货币初始化数据
     * @param reqInitVO
     * @return
     */
    @PostMapping("/api/currency/init")
    ResponseResult init(@RequestBody ReqInitVO reqInitVO);



    @PostMapping("/api/currency/insert")
    ResponseResult insert();
}
