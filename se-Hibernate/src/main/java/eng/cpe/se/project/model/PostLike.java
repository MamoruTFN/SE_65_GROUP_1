package eng.cpe.se.project.model;
// Generated Mar 1, 2023, 12:55:07 AM by Hibernate Tools 5.6.3.Final

/**
 * Postlike generated by hbm2java
 */
public class PostLike implements java.io.Serializable {

	private int postLikeId;
	private Post post;
	private User user;

	public PostLike() {
	}

	public PostLike(Post post, User user) {
		this.post = post;
		this.user = user;
	}

	public int getPostLikeId() {
		return this.postLikeId;
	}

	public void setPostLikeId(int postLikeId) {
		this.postLikeId = postLikeId;
	}

	public Post getPost() {
		return this.post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
