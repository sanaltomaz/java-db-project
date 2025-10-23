package com.example.crud;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CrudApplicationTests {

    @Autowired
    private DataSource dataSource;
    @Test
    public void testDatabaseConnection() throws SQLException {
        try (Connection connection = dataSource.getConnection()) {
            org.junit.jupiter.api.Assertions.assertNotNull(connection);
            assertNotNull(connection);
            System.out.println("Conexão com o banco de dados bem-sucedida!");
        }
    }
}