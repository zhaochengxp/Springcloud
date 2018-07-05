package com.itmayiedu.controller;

import com.itmayiedu.service.OrderMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderMemberService orderMemberService;

    @RequestMapping("/getOrderUserAll")
    public List<String> getOrderUserAll(){
        System.out.println("订单服务开始调用会员服务");
        return orderMemberService.getOrderUserAll();
    }

    @RequestMapping("/getList")
    public String getList(){
        return "Order 666";
    }
}
