package com.example.shiro.bean;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: cff
 * Date: 2017-09-15
 * Time: 下午 3:20
 */
@Configuration
@MapperScan(basePackages = "com.example.shiro.com.example.shiro.dao", sqlSessionFactoryRef = "cashmanAppSqlSessionFactory")
public class CashmanAppDataSourceConfig {
    @Bean(name = "cashmanAppDataSource")

    @ConfigurationProperties(prefix="spring.datasource")
    public DataSource dataSource(){
        return DruidDataSourceBuilder.create().build();
    }

    @Bean(name = "cashmanAppSqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());

        // 分页插件
//        PageHelper pageHelper = new PageHelper();
//        Properties properties = new Properties();
//        properties.setProperty("reasonable", "true");
//        properties.setProperty("supportMethodsArguments", "true");
//        properties.setProperty("returnPageInfo", "check");
//        properties.setProperty("params", "count=countSql");
//        pageHelper.setProperties(properties);

        // 添加插件
        //sessionFactory.setPlugins(new Interceptor[] { new CatDruidInterceptor()  });
        return sessionFactory.getObject();
    }
}
