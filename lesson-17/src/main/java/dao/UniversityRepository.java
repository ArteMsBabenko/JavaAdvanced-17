package dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import +domain.University;

public interface UniversityRepository extends JpaRepository<University, Integer> {

	University findByName(String name);

	List<University> findByNumberOfStudents(int numberOfStudents);

}
