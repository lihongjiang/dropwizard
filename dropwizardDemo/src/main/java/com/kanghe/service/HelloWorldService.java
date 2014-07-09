package com.kanghe.service;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-10-29
 * Time: 下午3:02
 * To change this template use File | Settings | File Templates.
 */

import com.kanghe.Configuration.HelloWorldConfiguration;
import com.kanghe.core.TemplateHealthCheck;
import com.kanghe.resources.HelloWorldResource;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

public class HelloWorldService extends Service<HelloWorldConfiguration> {
    //服务入口
    public static void main(String[] args) throws Exception {
        new HelloWorldService().run(args);
    }
    //指定配置文件的名字 hello-world.yml
    @Override
    public void initialize(Bootstrap<HelloWorldConfiguration> bootstrap) {
        bootstrap.setName("hello-world");
    }

    @Override
    public void run(HelloWorldConfiguration configuration,
                    Environment environment) {
        // nothing to do yet
        final String template = configuration.getTemplate();
        final String defaultName = configuration.getDefaultName();
        environment.addResource(new HelloWorldResource(template, defaultName));
       //
        environment.addHealthCheck(new TemplateHealthCheck(template));
    }

}
