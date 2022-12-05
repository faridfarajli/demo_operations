package demo.io.repository;

import demo.io.entity.DemoEntity;
import demo.io.model.Demo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

public interface DemoRepository extends JpaRepository<DemoEntity,Long> {

}
