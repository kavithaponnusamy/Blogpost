package co.grandcircus.BlogPost;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BlogApiService {
	
	RestTemplate rt=new RestTemplate();
	
	public BlogResponse getBlog() {
		String url="https://grandcircusco.github.io/demo-apis/blog-posts.json";
		return rt.getForObject(url, BlogResponse.class);
	}

}
