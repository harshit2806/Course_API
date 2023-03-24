package in.hsoni.Course_track.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.hsoni.Course_track.entities.Courses;

public interface Course_Dao extends JpaRepository<Courses, Long> {
	//this is jpa repo class

}
