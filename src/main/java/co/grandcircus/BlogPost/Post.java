package co.grandcircus.BlogPost;


import java.util.List;

public class Post {
	
	private String title;
	private String author;
	private String content;
	private String date;
	private List<String> tags;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	@Override
	public String toString() {
		return "Post [title=" + title + ", author=" + author + ", content=" + content + ", date=" + date + ", tags="
				+ tags + "]";
	}
	

}
