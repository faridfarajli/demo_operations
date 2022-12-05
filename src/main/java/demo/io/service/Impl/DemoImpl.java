package demo.io.service.Impl;

import demo.io.entity.DemoEntity;
import demo.io.model.Demo;
import demo.io.repository.DemoRepository;
import demo.io.service.DemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@RequiredArgsConstructor
@Service

public class DemoImpl implements DemoService {


    private final DemoRepository demoRepository;




    @Override
    public List<DemoEntity> readAllDemo() {

      return   demoRepository.findAll();


    }


    @Override
    public Optional<Demo> readDemo(Long id) {
        DemoEntity demoEntity  =  demoRepository.findById(id).get();
        Demo demo = new Demo();
        BeanUtils.copyProperties(demo,demoEntity);
        return Optional.of(demo);
    }

    @Override
    public Demo updateDemos(Long id, Demo demo) {
        DemoEntity demoEntity  =  demoRepository.findById(id).get();
        demoEntity.setName(demoEntity.getName());
        demoEntity.setYear(demoEntity.getYear());
        demoEntity.setDayPackage(demo.getDayPackage());
        demoEntity.setPackageCount(demoEntity.getPackageCount());
       demoRepository.save(demoEntity);
        return  demo;
    }



    @Override
    public boolean deleteDemo(Long id) {
        DemoEntity demoEntity  =  demoRepository.findById(id).get();
        demoRepository.delete(demoEntity);
        return true;
    }
    @Override
    public Demo createdDemo(Demo demo) {
        DemoEntity demoEntity = new DemoEntity();
        BeanUtils.copyProperties(demo,demoEntity);
          demoRepository.save(demoEntity);
          return demo;
    }
}
