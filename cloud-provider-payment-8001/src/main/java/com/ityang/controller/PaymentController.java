package com.ityang.controller;

import com.ityang.entities.CommonResult;
import com.ityang.entities.Payment;
import com.ityang.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/create")
    public CommonResult create(@RequestBody Payment payment){
        int i = paymentService.create(payment);
//        log.info("热更新测试");
        if (i>0){
            return new CommonResult(200,"插入成功");
        }else {
            return new CommonResult(500,"插入失败");
        }
    }

    @GetMapping(value = "/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id")Long id){
        Payment payment = paymentService.getPaymentById(id);
//        log.info("热更新测试2！");
        if (payment != null){
            return new CommonResult(200,"查询成功", payment);
        }else {
            return new CommonResult(404,"没有对应记录,查询id=" +id , null);
        }
    }
}
