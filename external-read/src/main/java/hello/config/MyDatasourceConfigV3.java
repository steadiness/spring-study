package hello.config;

import hello.datrasource.MyDataSource;
import hello.datrasource.MyDatasourcePropertiesV2;
import hello.datrasource.MyDatasourcePropertiesV3;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@Slf4j
@EnableConfigurationProperties(MyDatasourcePropertiesV3.class)
public class MyDatasourceConfigV3 {

    private final MyDatasourcePropertiesV3 properties;

    public MyDatasourceConfigV3(MyDatasourcePropertiesV3 properties) {
        this.properties = properties;
    }

    @Bean
    public MyDataSource dataSource() {
        return new MyDataSource(
                properties.getUrl(),
                properties.getUsername(),
                properties.getPassword(),
                properties.getEtc().getMaxConnection(),
                properties.getEtc().getTimeout(),
                properties.getEtc().getOptions());
    }
}
