package Service;

import java.util.List;

import domain.University;

public interface UniversityService {

	University create(University university);

	List<University> createAll(List<University> universitiesList);

	University findById(int id);

	University update(University university);

	void deleteById(int id);

	List<University> findAll();

	University findByName(String name);

	List<University> findByNumberOfStudents(int numberOfStudents);
}
