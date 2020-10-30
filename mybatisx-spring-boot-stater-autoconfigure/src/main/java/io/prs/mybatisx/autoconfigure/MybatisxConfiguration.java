package io.prs.mybatisx.autoconfigure;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(MybatisxProperties.class)
public class MybatisxConfiguration {

    @Bean
    public MybatisxTemplate mybatisxTemplate(MybatisxProperties mybatisxProperties){
        MybatisxTemplate template=new MybatisxTemplate();
        template.setProperties(mybatisxProperties);
        return template;
    }

}
