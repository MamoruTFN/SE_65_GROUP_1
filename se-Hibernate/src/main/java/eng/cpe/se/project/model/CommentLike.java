package eng.cpe.se.project.model;
// Generated Mar 1, 2023, 12:55:07 AM by Hibernate Tools 5.6.3.Final

/**
 * Commentlike generated by hbm2java
 */
public class CommentLike implements java.io.Serializable {

	private int commentLikeId;
	private Comment comment;
	private User user;

	public CommentLike() {
	}

	public CommentLike(Comment comment, User user) {
		this.comment = comment;
		this.user = user;
	}

	public int getCommentLikeId() {
		return this.commentLikeId;
	}

	public void setCommentLikeId(int commentLikeId) {
		this.commentLikeId = commentLikeId;
	}

	public Comment getComment() {
		return this.comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
