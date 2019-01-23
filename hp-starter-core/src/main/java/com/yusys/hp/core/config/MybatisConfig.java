package com.yusys.hp.core.config;

import org.springframework.context.annotation.Bean;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;

/**
 * @author hp
 * @ClassName MybatisConfig
 * @Description
 * @date 2019/1/21,14:37
 * @Version 1.0
 */
public class MybatisConfig {
    /**
     * Mapper扫描配置，自动扫描将Mapper接口生成代理注入到spingr
     * @return
     */
    @Bean
    public static MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        //定义扫描路径
        mapperScannerConfigurer.setBasePackage("**.yusys.hp.**.mapper");
        return mapperScannerConfigurer;
    }
}
