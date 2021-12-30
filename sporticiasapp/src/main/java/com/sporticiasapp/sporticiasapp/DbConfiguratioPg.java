package com.sporticiasapp.sporticiasapp;

import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
public class DbConfiguratioPg {
    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource ();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://127.0.0.1:5432/MarcacaoJogos");
        dataSource.setUsername("postgres");
        dataSource.setPassword("Gb2834");
        return dataSource;
    }
    @Bean
    public JpaVendorAdapter jpaVendorAdapter(){
        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter ();
        adapter.setDatabase ( Database.POSTGRESQL );
        adapter.setShowSql ( true );
        adapter.setGenerateDdl ( true );
        adapter.setDatabasePlatform ( "org.hibernate.dialect.PostgreSQLDialect" );
        adapter.setPrepareConnection ( true );
        return adapter;
    }
}
