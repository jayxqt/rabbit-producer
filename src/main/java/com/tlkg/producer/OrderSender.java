package com.tlkg.producer;

import com.tlkg.entity.Order;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by jay-xqt on 2019/2/24.
 */
@Component
public class OrderSender {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send(Order order) throws Exception {
        CorrelationData correlationData = new CorrelationData();
        correlationData.setId(order.getMessageId());

        rabbitTemplate.convertAndSend("order-exchange",   //exchange
                "order.abcd",                             //routingkey
                order,                                    //消息题内容
                correlationData                           //消息唯一id
        );
    }
}
