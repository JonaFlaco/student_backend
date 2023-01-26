package uic.estudiante.feature.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/student")
@CrossOrigin({ "*" })
public class StudentController {
    @Autowired
    StudentService studentService;

    // Get
    @GetMapping("/{id}")
    public Student findById(@PathVariable Long id) {
        return studentService.findById(id);
    }

    @GetMapping("/findAll")
    public List<Student> findAll() {
        return studentService.findAll();
    }

    @GetMapping("/findByName/{term}")
    public List<Student> findByName(@PathVariable String term) {
        return studentService.findByName(term);
    }

    // Post

    @PostMapping("/save")
    public Student saveStudent(@RequestBody Student student) {
        return studentService.save(student);
    }

    // Update

    @PutMapping("/update")
    public Student updatPerson(@RequestBody Student student) {
        return studentService.save(student);
    }

    // Delete
    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteById(id);
    }

}
