package eng.cpe.se.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eng.cpe.se.project.model.Post;
import eng.cpe.se.project.repository.PostRepository;

@Service
public class PostService {
	@Autowired
	private PostRepository postRepository;
	
	public void save(Post post) {
		postRepository.save(post);
	}
	
	public List<Post> findAll(){
		return (List<Post>) postRepository.findAll();
	}
	
	public Post findById(int id) {
		return postRepository.findById(id).get();
	}
	
	public void delete(int id) {
		postRepository.deleteById(id);
	}
}
