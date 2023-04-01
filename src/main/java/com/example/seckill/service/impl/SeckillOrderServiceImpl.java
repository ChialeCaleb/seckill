package com.example.seckill.service.impl;

import com.example.seckill.entity.SeckillOrder;
import com.example.seckill.mapper.SeckillOrderMapper;
import com.example.seckill.service.ISeckillOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 秒杀订单表
 *
 * @author 作者
 * @date 2023-03-31
 */
@Service
public class SeckillOrderServiceImpl extends ServiceImpl<SeckillOrderMapper, SeckillOrder> implements ISeckillOrderService {

}
