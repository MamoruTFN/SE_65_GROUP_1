package eng.cpe.se.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eng.cpe.se.project.model.Comment;
import eng.cpe.se.project.model.LikeComment;
import eng.cpe.se.project.repository.LikeCommentRepository;

@Service
public class LikeCommentService {
	@Autowired
	private LikeCommentRepository likeCommentRepository;
	@Autowired
	private CommentService commentService;

	public void save(LikeComment likeComment) {
		likeCommentRepository.save(likeComment);
	}

	public List<LikeComment> findAll() {
		return (List<LikeComment>) likeCommentRepository.findAll();
	}

	public LikeComment findById(int id) {
		return likeCommentRepository.findById(id).get();
	}

	public void delete(int id) {
		likeCommentRepository.deleteById(id);
	}

	public int countLikeComment(int commentId) {
		Comment comment = commentService.findById(commentId);
		return likeCommentRepository.countLikeComment(comment);
	}
}
