package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import bean.OrderService;

@ComponentScan(basePackages = "bean")
public class Main {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
		OrderService orderService = context.getBean(OrderService.class);
		orderService.orderDrink();
	}
}
