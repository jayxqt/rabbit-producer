package com.tlkg;

import com.tlkg.entity.Order;
import com.tlkg.producer.OrderSender;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootProducerApplicationTests {

    @Test
    @Ignore
    public void contextLoads() {
    }

    @Autowired
    private OrderSender orderSender;

    @Test
    public void testSend() throws Exception {
        Order order = new Order();
        order.setId("2019022400000000001");
        order.setName("测试订单1");
        order.setMessageId(System.currentTimeMillis() + "$" + UUID.randomUUID().toString());

        orderSender.send(order);
    }
}

