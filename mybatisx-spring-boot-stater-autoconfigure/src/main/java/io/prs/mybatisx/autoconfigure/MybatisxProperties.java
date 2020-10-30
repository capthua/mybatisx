package io.prs.mybatisx.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "mybatisx")
public class MybatisxProperties {

    private String mappers;

    public String getMappers() {
        return mappers;
    }

    public void setMappers(String mappers) {
        this.mappers = mappers;
    }
}
