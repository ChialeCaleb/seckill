package com.example.seckill.service.impl;

import com.example.seckill.entity.Goods;
import com.example.seckill.mapper.GoodsMapper;
import com.example.seckill.service.IGoodsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 商品表
 *
 * @author 作者
 * @date 2023-03-31
 */
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements IGoodsService {

}
