package pro.sky.java.course2.calculator.service;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.calculator.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String showHello(){
        return "Добро пожаловать в калькулятор";
    }
    public String plus(int a, int b){
        return a + " + " + b + " = " + (a+b);
    }
    public String minus(int a, int b){
        return a + " - " + b + " = " + (a-b);
    }
    public String multiply(int a, int b){
        return a + " * " + b + " = " + (a*b);
    }
    public String divide(int a, int b){
        if(b==0){
            return "Ошибка! Делить на ноль нельзя.";
        } else {
            return a + " / " + b + " = " + (a / b);
        }
    }

}
