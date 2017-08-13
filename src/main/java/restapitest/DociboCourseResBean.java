package restapitest;

import java.util.Arrays;

public class DociboCourseResBean {
	CourseModel[] courses;
	boolean success;
	
	public CourseModel[] getCourses() {
		return courses;
	}
	public void setCourses(CourseModel[] courses) {
		this.courses = courses;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	
	@Override
	public String toString() {
		return "DociboCourseResBean [courses=" + Arrays.toString(courses) + ", success=" + success + "]";
	}
	
	
	
}

class CourseModel {
	int course_id;
	String code;
	String course_name;
	String course_description;
	String course_language;
	String status;
	String selling;
	String price;
	String subscribe_method;
	String course_edition;
	String course_type;
	String sub_start_date;
	String sub_end_date;
	String date_begin;
	String date_end;
	String course_link;
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public String getCourse_description() {
		return course_description;
	}
	public void setCourse_description(String course_description) {
		this.course_description = course_description;
	}
	public String getCourse_language() {
		return course_language;
	}
	public void setCourse_language(String course_language) {
		this.course_language = course_language;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSelling() {
		return selling;
	}
	public void setSelling(String selling) {
		this.selling = selling;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getSubscribe_method() {
		return subscribe_method;
	}
	public void setSubscribe_method(String subscribe_method) {
		this.subscribe_method = subscribe_method;
	}
	public String getCourse_edition() {
		return course_edition;
	}
	public void setCourse_edition(String course_edition) {
		this.course_edition = course_edition;
	}
	public String getCourse_type() {
		return course_type;
	}
	public void setCourse_type(String course_type) {
		this.course_type = course_type;
	}
	public String getSub_start_date() {
		return sub_start_date;
	}
	public void setSub_start_date(String sub_start_date) {
		this.sub_start_date = sub_start_date;
	}
	public String getSub_end_date() {
		return sub_end_date;
	}
	public void setSub_end_date(String sub_end_date) {
		this.sub_end_date = sub_end_date;
	}
	public String getDate_begin() {
		return date_begin;
	}
	public void setDate_begin(String date_begin) {
		this.date_begin = date_begin;
	}
	public String getDate_end() {
		return date_end;
	}
	public void setDate_end(String date_end) {
		this.date_end = date_end;
	}
	public String getCourse_link() {
		return course_link;
	}
	public void setCourse_link(String course_link) {
		this.course_link = course_link;
	}
	
	@Override
	public String toString() {
		return "CourseModel [course_id=" + course_id + ", code=" + code + ", course_name=" + course_name
				+ ", course_description=" + course_description + ", course_language=" + course_language + ", status="
				+ status + ", selling=" + selling + ", price=" + price + ", subscribe_method=" + subscribe_method
				+ ", course_edition=" + course_edition + ", course_type=" + course_type + ", sub_start_date="
				+ sub_start_date + ", sub_end_date=" + sub_end_date + ", date_begin=" + date_begin + ", date_end="
				+ date_end + ", course_link=" + course_link + "]";
	}
	
	
}
