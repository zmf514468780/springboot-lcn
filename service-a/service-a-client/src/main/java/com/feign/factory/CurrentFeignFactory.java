package com.feign.factory;

import com.feign.CurrentAService;
import com.feign.fallback.CurrentServiceFeignImpl;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @program: ods-root
 * @description: 货币
 * @author: zhumf
 * @create: 20191015
 **/

@Component
public class CurrentFeignFactory implements FallbackFactory<CurrentAService> {
    @Override
    public CurrentAService create(Throwable throwable) {
        CurrentServiceFeignImpl remoteMenuServiceFallback = new CurrentServiceFeignImpl();
        remoteMenuServiceFallback.setCause(throwable);
        return remoteMenuServiceFallback;
    }
}
