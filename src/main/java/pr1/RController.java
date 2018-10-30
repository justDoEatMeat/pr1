package pr1;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pr1.entity.Test;
import pr1.entity.TestEntity;
import pr1.repository.Test2Repository;
import pr1.repository.TestRepository;

import java.util.HashSet;

@RestController
public class RController {
    private final TestRepository testRepository;
    private final Test2Repository test2Repository;

    public RController(TestRepository testRepository, Test2Repository test2Repository){
        this.testRepository = testRepository;
        this.test2Repository = test2Repository;
    }

    @RequestMapping("Controller")
    public TestEntity controller (@RequestParam(name = "name", defaultValue = "") String name){

        TestEntity ent = new TestEntity();




        ent.setName(name);
        ent.setTest2a(new HashSet<Test>());


        for(Integer i = 0; i<5; i++){
          Test t2 = new Test();
          t2.setName("НАИМЕНОВАНИЕ" + i.toString());
          t2.setTestEntity(ent);
          ent.getTest2a().add(t2);

        }

        testRepository.save(ent);
        test2Repository.saveAll(ent.getTest2a());

        return ent;


    }

}
