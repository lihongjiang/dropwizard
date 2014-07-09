package com.kanghe.Configuration;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-10-29
 * Time: 下午2:57
 * To change this template use File | Settings | File Templates.
 */
import com.yammer.dropwizard.config.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

public class HelloWorldConfiguration extends Configuration {
    @NotEmpty        //参数检查
    @JsonProperty    //自动映射配置文件
    private String template;

    @NotEmpty
    @JsonProperty
    private String defaultName = "Stranger";

    public String getTemplate() {
        return template;
    }

    public String getDefaultName() {
        return defaultName;
    }
}
