package uic.estudiante.feature.student;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
    
    List<Student> findAll();
    List<Student> findByNameLikeIgnoreCase(String term);

}
