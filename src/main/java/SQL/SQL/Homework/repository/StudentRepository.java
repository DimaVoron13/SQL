package SQL.SQL.Homework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import SQL.SQL.Homework.model.Faculty;
import SQL.SQL.Homework.model.Student;

import java.util.List;
public interface StudentRepository extends JpaRepository <Student, Long>{
    List<Student> getByAge(int age);
    List<Student> findByAgeBetween(int minAge, int maxAge);
}
