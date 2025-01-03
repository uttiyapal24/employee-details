package com.infosys.employee;


import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import jakarta.persistence.EntityManagerFactory;

import javax.sql.DataSource;
import java.util.Map;

@Configuration
public class JpaConfiguration {

    private final DataSource dataSource;
    private final JpaProperties jpaProperties;

    public JpaConfiguration(DataSource dataSource, JpaProperties jpaProperties) {
        this.dataSource = dataSource;
        this.jpaProperties = jpaProperties;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(dataSource);
        em.setPackagesToScan("com.infosys.employee.entity"); // Replace with your entity package
        em.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        em.setJpaPropertyMap(jpaProperties.getProperties());

        // This is the crucial line:
        em.setEntityManagerFactoryInterface(EntityManagerFactory.class);

        return em;
    }
}
