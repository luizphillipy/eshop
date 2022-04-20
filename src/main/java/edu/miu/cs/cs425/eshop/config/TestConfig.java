package edu.miu.cs.cs425.eshop.config;

import edu.miu.cs.cs425.eshop.model.Category;
import edu.miu.cs.cs425.eshop.model.Order;
import edu.miu.cs.cs425.eshop.model.OrderStatus;
import edu.miu.cs.cs425.eshop.model.User;
import edu.miu.cs.cs425.eshop.repository.CategoryRepository;
import edu.miu.cs.cs425.eshop.repository.OrderRepository;
import edu.miu.cs.cs425.eshop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.List;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private CategoryRepository categoryRepository;


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
        userRepository.save(u1);
        userRepository.save(u2);
        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"),OrderStatus.WAITING_PAYMENT, u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT,u1);
        orderRepository.saveAll(List.of(o1,o2,o3));
        Category c1 = new Category(null,"Computers");
        Category c2 = new Category(null,"Electronics");
        Category c3 = new Category(null,"Books");
        categoryRepository.saveAll(List.of(c1,c2,c3));
    }



}
