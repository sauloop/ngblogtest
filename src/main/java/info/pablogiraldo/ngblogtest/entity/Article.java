package info.pablogiraldo.ngblogtest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "articles")
public class Article {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "title")
	private String title;

	@Column(name = "subtitle")
	private String subtitle;

	@Column(name = "image")
	private String image;

	@Column(name = "text")
	private String text;

	public Article() {
	}

	public Article(Long id, String title, String subtitle, String image, String text) {
		this.id = id;
		this.title = title;
		this.subtitle = subtitle;
		this.image = image;
		this.text = text;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", subtitle=" + subtitle + ", image=" + image + ", text="
				+ text + "]";
	}
}
