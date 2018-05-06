package by.bsuir.pizzeria.controllers.order;

import by.bsuir.pizzeria.beans.order.Orders;
import by.bsuir.pizzeria.beans.pizza.Pastry;
import by.bsuir.pizzeria.dto.order.OrderDto;
import by.bsuir.pizzeria.services.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
public class OrderController {

    private OrderService orderService;

    @PostMapping("/order")
    public ResponseEntity addOrder(@RequestBody OrderDto orderDto){
        orderService.addOrder(orderDto);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/orders")
    public ResponseEntity getAllOrder(){
        List<Orders> list = orderService.getAll();
        return ResponseEntity.ok().body(list);
    }

    @PutMapping("/confirmedOrder")
    public ResponseEntity confirmedOrder(@RequestBody Orders order){
        orderService.confirmedOrder(order);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping("/paidForOrder")
    public ResponseEntity paidForOrder(@RequestBody Orders order){
        orderService.paidForOrder(order);
        return new ResponseEntity(HttpStatus.OK);
    }

    @Autowired
    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }
}
