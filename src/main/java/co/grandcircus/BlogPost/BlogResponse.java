package co.grandcircus.BlogPost;

import java.util.List;

public class BlogResponse {
	private String title;
	private List<Post> posts;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Post> getPosts() {
		return posts;
	}
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
	@Override
	public String toString() {
		return "BlogResponse [title=" + title + ", posts=" + posts + "]";
	}
	

}
