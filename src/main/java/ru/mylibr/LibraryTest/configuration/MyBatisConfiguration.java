package ru.mylibr.LibraryTest.configuration;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import ru.mylibr.settings.DatabaseProperties;

import javax.sql.DataSource;

@Configuration
@ComponentScan("ru.mylibr.LibraryTest.dao")
@MapperScan("ru.mylibr.LibraryTest.dao")
@EnableTransactionManagement
public class MyBatisConfiguration {

    private final DatabaseProperties databaseProperties;

    @Autowired
    public MyBatisConfiguration(DatabaseProperties databaseProperties) {
        this.databaseProperties = databaseProperties;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(springDataSource());
        return factoryBean.getObject();
    }

    @Bean
    public DataSourceTransactionManager dataSourceTransactionManager() {
        return new DataSourceTransactionManager(springDataSource());
    }

    @Bean
    public DataSource springDataSource() {
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName(databaseProperties.getDriver());
        ds.setUrl(databaseProperties.getUrl());
        ds.setUsername(databaseProperties.getUserName());
        ds.setPassword(databaseProperties.getPassword());
        ds.setInitialSize(5);
        ds.setMaxTotal(50);
        return ds;
    }
}
