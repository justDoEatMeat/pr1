package pr1;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pr1.entity.OrderPos;
import pr1.entity.Test;
import pr1.entity.TestEntity;
import pr1.repository.*;

import java.util.HashSet;

@RestController
public class ShopController {
    private final OrderPosRepository orderPosRepository;
    private final OrderRepository orderRepository;
    private final ProductRepository productRepository;


    public ShopController(ClientRepository clientRepository, OrderPosRepository orderPosRepository,
                          OrderRepository orderRepository,ProductRepository productRepository,
                          ProductGroupRepository productGroupRepository){

        this.orderPosRepository = orderPosRepository;
        this.orderRepository = orderRepository;
        this.productRepository = productRepository;
    }

    @RequestMapping("Controller")
    public OrderPos ShopController (@RequestParam(name = "name", defaultValue = "") String name){

        OrderPos ent = new OrderPos();




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
