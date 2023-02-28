package eng.cpe.se.project.model;
// Generated Mar 1, 2023, 12:55:07 AM by Hibernate Tools 5.6.3.Final

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Coursecreator generated by hbm2java
 */
public class CourseCreator implements java.io.Serializable {

	private int courseCreatorId;
	@JsonIgnore
	private User user;
	private float balance;
	@JsonIgnore
	private List<Course> courses = new ArrayList<Course>();

	public CourseCreator() {
	}

	public CourseCreator(User user, float balance) {
		this.user = user;
		this.balance = balance;
	}

	public CourseCreator(User user, float balance, List<Course> courses) {
		this.user = user;
		this.balance = balance;
		this.courses = courses;
	}

	public int getCourseCreatorId() {
		return courseCreatorId;
	}

	public void setCourseCreatorId(int courseCreatorId) {
		this.courseCreatorId = courseCreatorId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	

}
