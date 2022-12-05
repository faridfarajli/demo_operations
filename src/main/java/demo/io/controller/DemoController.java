package demo.io.controller;

import demo.io.entity.DemoEntity;
import demo.io.model.Demo;
import demo.io.service.DemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/demo")
@RequiredArgsConstructor
public class DemoController {


    private final DemoService demoService;
    @PostMapping("/create")
    public Demo creatDemo(@RequestBody Demo demo){
      return
              demoService.createdDemo(demo);
    }

    @GetMapping("/read/{id}")
    ResponseEntity<Optional<Demo>> readDemo(@PathVariable Long id){
        Optional<Demo> demo = null;
        demo = demoService.readDemo(id);

        return  ResponseEntity.ok(demo);
    }

    @GetMapping("/read/all")
    List<DemoEntity> readAllDemo( ){
        return (List<DemoEntity>) demoService.readAllDemo();
    }

    @PutMapping("/update/{id}")
    ResponseEntity<Demo> readDemo(@PathVariable Long id, @RequestBody Demo demo){
        demo = demoService.updateDemos(id,demo);
        return ResponseEntity.ok(demo);
    }

    @DeleteMapping("/delete/{id}")
    ResponseEntity<Boolean> deleteDemo(@PathVariable Long id){
        boolean deleted = false;
        deleted = demoService.deleteDemo(id);
        Map<String,Boolean> map = new HashMap<>();
        map.put("deleted",deleted);
         return  ResponseEntity.ok(deleted);
    }


}
