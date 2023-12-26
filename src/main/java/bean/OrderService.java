package bean;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
	
	public void orderDrink() {
		System.out.println("Your order has been placed...");
	}
}
