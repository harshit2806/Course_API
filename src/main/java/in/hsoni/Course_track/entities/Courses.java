package in.hsoni.Course_track.entities;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Courses {

	@Id
	
	
	private long id;
	
	
	
	private String title;
	
	private String description;

	@Column (name = "created_at", nullable = false, updatable= false)
	@CreationTimestamp 
	private Timestamp createdAt;
	@Column(name = "updated_at" )
	@UpdateTimestamp
	private Timestamp updatedAt;
	
	public Courses (long id, String title, String description) {
		super();
		this.id = id;
		this.title= title;
		this.description =description;
		
	}
	@Override
	public String toString() {
		return "Courses [id=" + id + ", title=" + title + ", description=" + description + ", createdAt=" + createdAt
				+ ", updatedAt=" + updatedAt + "]";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	public Timestamp getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
