// package com.crud.app;

// import javax.sql.DataSource;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.jdbc.datasource.DriverManagerDataSource;
// import org.springframework.orm.jpa.JpaVendorAdapter;
// import org.springframework.orm.jpa.vendor.Database;
// import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

// @Configuration
// public class DataConfig {
//     // Método especifico para fazer a conexão com o banco criando a configuração
//     // configuração
//     @Bean
//     public DataSource dataSource() {
//         DriverManagerDataSource dataSource = new DriverManagerDataSource();

//         // para configurar o driver do mysql com java
//         dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");

//         // configura a URL de conexão JDBC com o banco de dados MySQL.
//         dataSource.setUrl("jdbc:mysql://localhost:3306/db_java");
//         // nome de usuário do banco
//         dataSource.setUsername("root");

//         // senha do banco
//         dataSource.setPassword("");
//         return dataSource;
//     }

//     // define a configuração do banco criando tabelas de forma automatica utilizando Hibernate
//     @Bean
//     public JpaVendorAdapter jpaVendorAdapter() {
//         HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();

//         adapter.setDatabase(Database.MYSQL);
//         adapter.setShowSql(true);
//         adapter.setGenerateDdl(true);
//         adapter.setDatabasePlatform("org.hibernate.dialect.MySQL5Dialect");
//         adapter.setPrepareConnection(true);

//         return adapter;
//     }

// }
