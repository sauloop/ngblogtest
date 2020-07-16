package info.pablogiraldo.ngblogtest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import info.pablogiraldo.ngblogtest.entity.Article;

public interface IArticleRepository extends JpaRepository<Article, Long> {
	public List<Article> findAllByOrderByIdDesc();
}
