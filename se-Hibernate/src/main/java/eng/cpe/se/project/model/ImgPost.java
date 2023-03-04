package eng.cpe.se.project.model;
// Generated Mar 5, 2023, 12:22:12 AM by Hibernate Tools 5.6.3.Final

/**
 * Imgpost generated by hbm2java
 */
public class ImgPost implements java.io.Serializable {

	private int imgPostId;
	private Post post;
	private String imgPath;

	public ImgPost() {
	}

	public ImgPost(Post post, String imgPath) {
		this.post = post;
		this.imgPath = imgPath;
	}

	public int getImgPostId() {
		return this.imgPostId;
	}

	public void setImgPostId(int imgPostId) {
		this.imgPostId = imgPostId;
	}

	public Post getPost() {
		return this.post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public String getImgPath() {
		return this.imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

}
