package pro.sky.java.course2.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.calculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class Controller {
    private final CalculatorService service;
    public Controller(CalculatorService service){
        this.service = service;
    }

    @GetMapping()
    public String showHello(){
        return service.showHello();
    }
    @GetMapping("/plus")
    public String plus(@RequestParam("num1") int a, @RequestParam("num2")int b){
        return service.plus(a,b);
    }
    @GetMapping("/minus")
    public String minus(@RequestParam("num1") int a, @RequestParam("num2")int b){
        return service.minus(a,b);
    }
    @GetMapping("/multiply")
    public String multiply(@RequestParam("num1") int a, @RequestParam("num2")int b){
        return service.multiply(a,b);
    }
    @GetMapping("/divide")
    public String divide(@RequestParam("num1") int a, @RequestParam("num2")int b){
        return service.divide(a,b);
    }
}
