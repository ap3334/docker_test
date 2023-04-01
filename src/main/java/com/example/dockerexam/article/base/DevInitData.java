package com.example.dockerexam.article.base;

import com.example.dockerexam.article.service.ArticleService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevInitData {

    @Bean
    CommandLineRunner initDevData(ArticleService articleService) {
        return args -> {
            articleService.write("제목1111");
            articleService.write("제목2");
        };
    }
}
