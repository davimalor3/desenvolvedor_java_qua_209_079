package com.crud.app;

import com.crud.app.models.Pessoa;
import com.crud.app.repository.AppRepository;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Locale;

@SpringBootTest
public class PopularBancoTest {

    @Autowired
    private AppRepository repository;

    @Test
    public void generateUsers() {

        Faker fakeInfo = new Faker(new Locale("pt-BR"));
        for (int i = 1; i <= 300; i++) {
            Pessoa p = new Pessoa();
            p.setName(fakeInfo.name().fullName());
            p.setCpf(String.format("%011d", i));
            p.setEmail(fakeInfo.internet().emailAddress());
            repository.save(p);
        }

    }
}
