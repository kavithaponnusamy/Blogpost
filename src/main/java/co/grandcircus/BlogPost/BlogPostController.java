package co.grandcircus.BlogPost;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BlogPostController {
	
	@Autowired
	private BlogApiService bas;
	
	@RequestMapping("/")
	public String showHome(Model model) {
		BlogResponse blog=bas.getBlog();
		List<Post> posts=blog.getPosts();
		model.addAttribute("blog",blog);
		model.addAttribute("posts",posts);
		return "home";
	}

}
