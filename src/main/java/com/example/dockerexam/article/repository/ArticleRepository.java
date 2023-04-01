package com.example.dockerexam.article.repository;

import com.example.dockerexam.article.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
