package demo.io.service;

import demo.io.entity.DemoEntity;
import demo.io.model.Demo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface DemoService {
  List<DemoEntity> readAllDemo();
  Optional<Demo> readDemo(Long id);
  Demo updateDemos(Long id, Demo demo);
  Demo createdDemo(Demo demo);
  boolean deleteDemo(Long id);

}
