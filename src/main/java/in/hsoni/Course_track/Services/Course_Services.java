package in.hsoni.Course_track.Services;

import java.util.List;

import in.hsoni.Course_track.entities.Courses;

public interface Course_Services {

	
	public List <Courses> getCourses();
	
	public Courses getCourse(long CourseId);
	
	public Courses addCourse(Courses courses);
	
	public Courses updateCourses(Courses courses);
	
	public Courses deleteCourse(long CourseId);
}
