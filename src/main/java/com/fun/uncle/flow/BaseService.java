package com.fun.uncle.flow;

import com.fun.uncle.util.AopTargetUtils;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @Description:
 * @Author: Summer
 * @DateTime: 2021/10/26 6:28 下午
 * @Version: 0.0.1-SNAPSHOT
 */
@Service
public class BaseService implements ApplicationContextAware {

    protected static ApplicationContext applicationContext = null;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        BaseService.applicationContext = applicationContext;
    }

    public static Object getBeanByName(String name) throws BeansException {
        return applicationContext.getBean(name);
    }

    public static <T> T getSingleBeanByType(Class<T> clazz) throws Exception {
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanName : beanDefinitionNames) {
            Object beanByName = getBeanByName(beanName);
            if (beanByName != null) {
                // 防止被代理拿不到bean
                Object target = AopTargetUtils.getTarget(beanByName);
                if (Objects.equals(clazz.getName(), target.getClass().getName())) {
                    return (T) beanByName;
                }
            }
        }
        throw new RuntimeException();
    }
}
