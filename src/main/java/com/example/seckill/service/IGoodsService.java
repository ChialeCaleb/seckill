package com.example.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.seckill.entity.Goods;
import com.example.seckill.vo.GoodsVO;

import java.util.List;

/**
 * 商品表
 *
 * @author 作者
 * @date 2023-03-31
 */
public interface IGoodsService extends IService<Goods> {
    // 获取商品列表
    List<GoodsVO> findGoodsVO();

}
