package com.hewon.springcloud.service.impl;

import com.hewon.springcloud.dao.PaymentDao;
import com.hewon.springcloud.entities.Payment;
import com.hewon.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    PaymentDao paymentDao;
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(long id) {
        return paymentDao.getPaymentById(id);
    }
}
