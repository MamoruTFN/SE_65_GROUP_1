package eng.cpe.se.project.model;
// Generated Mar 1, 2023, 12:55:07 AM by Hibernate Tools 5.6.3.Final

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Requestcoursedetail generated by hbm2java
 */
public class RequestCourseDetail implements java.io.Serializable {

	private int requestCourseDetailId;
	@JsonIgnore
	private Course course;
	@JsonIgnore
	private RequestCourse requestCourse;

	public RequestCourseDetail() {
	}

	public RequestCourseDetail(Course course, RequestCourse requestcourse) {
		this.course = course;
		this.requestCourse = requestcourse;
	}

	public int getRequestCourseDetailId() {
		return requestCourseDetailId;
	}

	public void setRequestCourseDetailId(int requestCourseDetailId) {
		this.requestCourseDetailId = requestCourseDetailId;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public RequestCourse getRequestCourse() {
		return requestCourse;
	}

	public void setRequestCourse(RequestCourse requestCourse) {
		this.requestCourse = requestCourse;
	}

}
