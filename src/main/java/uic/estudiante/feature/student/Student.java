package uic.estudiante.feature.student;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("estudiante")
public class Student {
    @Id
    @Column("person_id")
    private long personId;
    private String name;
    private String dni; 
}