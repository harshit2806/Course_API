package in.hsoni.Course_track.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import in.hsoni.Course_track.Services.Course_Services;
import in.hsoni.Course_track.entities.Courses;

@RestController
public class Course_controller {

	@Autowired
	private Course_Services Course_Services1;
	
//	@GetMapping("/home")
//	public String home()
//	{
//		return "home";
//	}
//	
	
	//Getcourses
	@ResponseStatus(value = HttpStatus.FOUND)
	@GetMapping("/courses")
	public List <Courses> getCourses()
	{
		return this.Course_Services1.getCourses();
	}
	
	//course by id
	@ResponseStatus(value = HttpStatus.FOUND)
	@GetMapping("/course_by_Id/{CourseId}")
	 public Courses getCourse(@PathVariable String CourseId)
	 {
		 return this.Course_Services1.getCourse(Long.parseLong(CourseId));
	 }																			
	
	//course addition 
	@ResponseStatus(value = HttpStatus.CREATED)
	@PostMapping("/addCourse")
	public Courses addCourse(@RequestBody Courses courses)
	{
		 return this.Course_Services1.addCourse(courses);
	}
	@ResponseStatus(value = HttpStatus.ACCEPTED)
	@PutMapping("/updateCourses")
	public Courses updateCourses(@RequestBody Courses courses)
	{
		return this.Course_Services1.updateCourses(courses);
	}
	
	//delete the course
	
	@DeleteMapping("/delCourse/{CourseId}")
	public Courses deleteCourse(@PathVariable String CourseId 	)
	{
		return this.Course_Services1.deleteCourse(Long.parseLong(CourseId));
	}
	
}
