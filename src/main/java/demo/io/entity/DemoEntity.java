package demo.io.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
public class DemoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String name;
    private String year;
    private String dayPackage;
    private String packageCount;



}

