package cu.edu.cujae.pweb.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import cu.edu.cujae.pweb.dto.StudentDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

	@Override
	public List<StudentDto> getStudents() {
		List<StudentDto> students = new ArrayList<>();
		students.add(new StudentDto(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 9), "Juana",
				"De Arco", "Femenino", 'G', 2, 2, false));
		students.add(new StudentDto(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 9), "Alberto",
				"Fernandez", "Masculino", 'L', 1, 2, false));
		students.add(new StudentDto(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 9), "Perseo",
				"Suarez Tamayo", "Masculino", 'M', 1, 2, false));
		students.add(new StudentDto(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 9), "Sandor",
				"Camejo Rayas", "Masculino", 'G', 2, 3, false));
		students.add(new StudentDto(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 9), "Ronaldo",
				"Coas Saldivar", "Masculino", 'G', 2, 3, false));
		students.add(new StudentDto(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 9), "Hector",
				"Ribas Traki", "Masculino", 'B', 2, 4, false));
		students.add(new StudentDto(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 9), "Camilo",
				"Estrada Lopez", "Masculino", 'B', 2, 1, false));
		students.add(new StudentDto(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 9), "Facundo",
				"Romero Ramen", "Masculino", 'G', 2, 1, false));
		students.add(new StudentDto(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 9), "Pánfilo",
				"Tobal Madrid", "Masculino", 'G', 1, 2, false));
		students.add(new StudentDto(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 9), "Ian",
				"Meriño Sandival", "Masculino", 'G', 1, 2, false));

		return students;
	}

	@Override
	public StudentDto getStudentById(String studentId) {
		return getStudents().stream().filter(r -> r.getId().equals(studentId)).findFirst().get();
	}

	@Override
	public void createStudent(StudentDto student) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateStudent(StudentDto student) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteStudent(String id) {
		// TODO Auto-generated method stub

	}

}
