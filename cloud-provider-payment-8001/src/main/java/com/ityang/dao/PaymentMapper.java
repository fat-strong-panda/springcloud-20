package com.ityang.dao;

import com.ityang.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentMapper {

    int create(Payment payment);

    Payment getPayment(@Param("id") Long id);

}
