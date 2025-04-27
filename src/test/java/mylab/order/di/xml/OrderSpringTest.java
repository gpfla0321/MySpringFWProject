package mylab.order.di.xml;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "classpath:mylab-order-di.xml")
public class OrderSpringTest {
	
	@Autowired
	ShoppingCart shoppingCart;
	
	@Resource(name = "orderService")
	OrderService orderService;
	
	@Test
	void testService() {
		for(Product product : shoppingCart.getProducts()) {
			System.out.println(product);
		}
	}
	
	@Test
	void testCart() {
		assertEquals(27000, shoppingCart.getTotalPrice());
	}
}
