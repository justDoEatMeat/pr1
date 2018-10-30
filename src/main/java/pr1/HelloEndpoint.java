package pr1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pr1.entity.Order;
import pr1.entity.OrderPos;
import pr1.entity.TestEntity;
import pr1.repository.OrderPosRepository;
import pr1.repository.OrderRepository;
import pr1.repository.TestRepository;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

@RestController
public class HelloEndpoint {

    Random random = new Random();

    private final OrderRepository orderRepository;
    private final OrderPosRepository orderPosRepository;


    public HelloEndpoint (
        OrderRepository orderRepository,
        OrderPosRepository orderPosRepositor){
        this.orderPosRepository = orderPosRepositor;
        this.orderRepository = orderRepository;
    }



    @RequestMapping("hi/hello")
    String abc(){


        Order order = new Order();

        order.setPhone(String.valueOf(random.nextInt()));
        order.setRemark(String.valueOf(random.nextInt()) + String.valueOf(random.nextInt()) + String.valueOf(random.nextInt()));


        Set<OrderPos> orderPosses = new HashSet<OrderPos>();
        orderRepository.save(order);
        for(int i = 0; i<= 5; i++){
            OrderPos orderPos = new OrderPos();

            orderPos.setOrder(order);
            orderPos.setPrice(random.nextDouble());
            orderPos.setQuantity(random.nextInt());
            orderPos.setGoodName(String.valueOf(random.nextInt()));
            orderPosRepository.save(orderPos);
            orderPosses.add(orderPos);
        }


        order.setOrderPosses(orderPosses);


        /*TestEntity testEnt = new TestEntity();
        //testEnt.setName("Name");

        //testRep.save(testEnt);

        String text = "";

         //testEnt = null;

        Iterator<TestEntity> iterator = testRep.findByNameNotLikeAnything("Name").iterator();
        while (iterator.hasNext()){
            testEnt = iterator.next();
            text = testEnt.getId().toString() + " " + testEnt.getName() + "; ";
        }*/

        return "hi/hello";
    }


}
