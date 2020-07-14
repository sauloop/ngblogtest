package info.pablogiraldo.ngblogtest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import info.pablogiraldo.ngblogtest.entity.Article;
import info.pablogiraldo.ngblogtest.entity.AuthenticationBean;
import info.pablogiraldo.ngblogtest.repository.IArticleRepository;

//@CrossOrigin(origins = "http://localhost:8081")
@CrossOrigin(origins = "https://ngblogtest.herokuapp.com")
@RestController
@RequestMapping("/api")
public class ArticleController {

	@Autowired
	private IArticleRepository articleRepository;

	@GetMapping("/articles")
	public ResponseEntity<List<Article>> listArticles() {
		try {
			List<Article> articles = new ArrayList<Article>();

			articleRepository.findAll().forEach(articles::add);

			if (articles.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(articles, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping(path = "/basicauth")
	public AuthenticationBean basicauth() {
		return new AuthenticationBean("You are authenticated");
	}
}
