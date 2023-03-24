package in.hsoni.Course_track.Services;

import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.hsoni.Course_track.Dao.Course_Dao;
import in.hsoni.Course_track.entities.Courses;

@Service
public class Course_service_Impl implements Course_Services {

	@Autowired
	private Course_Dao course_Dao;
	
//	List <Courses> list;
//	public Course_service_Impl()
//	{
//		list=new ArrayList<>();
//		list.add(new Courses(22, "one", "test1"));
//		list.add(new Courses(23, "onlye", "test2"));
//	}
	
	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
//		return list;
		return course_Dao.findAll();
	}

	@Override
	public Courses getCourse(long CourseId) {
//		Courses c=null;
//		//List <Courses> c;
//		//c=new ArrayList<>();
//		//list.add(new Courses(CourseId, "No such course", "No such course"));
//		for(Courses courses:list)
//		{
//			if(courses.getId()==CourseId)
//			{
//				c=courses;
//				break;
//			}
//		}
		
		return course_Dao.getOne(CourseId);
	}

	@Override
	public Courses addCourse(Courses courses) {
//		list.add(courses);
		course_Dao.save(courses);
		return courses;
	}

	@Override
	public Courses updateCourses(Courses courses) {
//		
//		list.forEach(e->{
//				if (e.getId() == courses. getId ()) {
//				e.setTitle (courses . getTitle ());
//				e.setDescription (courses.getDescription () ) ;
//				}
//		});
		
		course_Dao.save(courses);
		return courses;
	}

	@Override
	public Courses deleteCourse(long CourseId) {
//		Courses c=null;
//		for(Courses courses:list)
//		{
//			if(courses.getId()==CourseId)
//			{
//				c=courses;
//				break;
//			}
//		}
//		list=this.list.stream().filter(e->e.getId()!=CourseId).collect(Collectors.toList());
		
		Courses c=course_Dao.getOne(CourseId);
		course_Dao.deleteById(CourseId);
		return c;
			
	}

	

	
	
}
