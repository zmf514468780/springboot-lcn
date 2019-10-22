package com.feign.fallback;

import com.feign.CurrentAService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.vo.ReqInitVO;
import vo.ResponseResult;

/**
 * @program: ods-root
 * @description: 实现类
 * @author: zhumf
 * @create: 20191015
 **/
public class CurrentServiceFeignImpl  implements CurrentAService {
    private Throwable cause;

    private final Logger log = LoggerFactory.getLogger(CurrentServiceFeignImpl.class);

    public Throwable getCause() {
        return cause;
    }

    public void setCause(Throwable cause) {
        this.cause = cause;
    }

    @Override
    public ResponseResult init(ReqInitVO reqInitVO) {
        return ResponseResult.fail("货币初始化数据失败");
    }

    @Override
    public ResponseResult insert() {
        return ResponseResult.fail("货币新增失败");
    }
}
