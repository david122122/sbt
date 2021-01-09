package com.config;

import com.model.Cat;
import org.springframework.beans.BeansException;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class MySpringApplicationInitialize implements ApplicationRunner, ApplicationContextAware {
    private ApplicationContext applicationContext;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        SpringConfig bean = applicationContext.getBean(SpringConfig.class);
       // System.out.println(bean.getDog().getName());

       /* RequestMappingHandlerMapping requestMappingHandlerMapping = (RequestMappingHandlerMapping) applicationContext.getBean("requestMappingHandlerMapping");
        Map<RequestMappingInfo, HandlerMethod> handlerMethods = requestMappingHandlerMapping.getHandlerMethods();
        System.out.println(handlerMethods);*/

        Cat cat = (Cat) applicationContext.getBean("cat");
        System.out.println(cat.getName());

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
