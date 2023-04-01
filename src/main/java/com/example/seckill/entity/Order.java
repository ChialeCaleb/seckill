package com.example.seckill.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 订单表
 *
 * @author 作者
 * @date 2023-03-31
 */
@TableName("t_order")
@ApiModel(value = "订单表", description = "订单表")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 订单ID **/
    @ApiModelProperty("订单ID")
      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /** 用户ID **/
    @ApiModelProperty("用户ID")
    private Long userId;

    /** 商品ID **/
    @ApiModelProperty("商品ID")
    private Long goodsId;

    /** 收获地址ID **/
    @ApiModelProperty("收获地址ID")
    private Long deliveryAddrId;

    /** 商品名字 **/
    @ApiModelProperty("商品名字")
    private String goodsName;

    /** 商品数量 **/
    @ApiModelProperty("商品数量")
    private Integer goodsCount;

    /** 商品价格 **/
    @ApiModelProperty("商品价格")
    private BigDecimal goodsPrice;

    /** 1 pc,2 android, 3 ios **/
    @ApiModelProperty("1 pc,2 android, 3 ios")
    private Byte orderChannel;

    /** 订单状态，0新建未支付，1已支付，2已发货，3已收货，4已退货，5已完成 **/
    @ApiModelProperty("订单状态，0新建未支付，1已支付，2已发货，3已收货，4已退货，5已完成")
    private Byte status;

    /** 订单创建时间 **/
    @ApiModelProperty("订单创建时间")
    private Timestamp createDate;

    /** 支付时间 **/
    @ApiModelProperty("支付时间")
    private Timestamp payDate;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Long getDeliveryAddrId() {
        return deliveryAddrId;
    }

    public void setDeliveryAddrId(Long deliveryAddrId) {
        this.deliveryAddrId = deliveryAddrId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Integer getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(Integer goodsCount) {
        this.goodsCount = goodsCount;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Byte getOrderChannel() {
        return orderChannel;
    }

    public void setOrderChannel(Byte orderChannel) {
        this.orderChannel = orderChannel;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public Timestamp getPayDate() {
        return payDate;
    }

    public void setPayDate(Timestamp payDate) {
        this.payDate = payDate;
    }

    @Override
    public String toString() {
        return "Order{" +
        "id=" + id +
        ", userId=" + userId +
        ", goodsId=" + goodsId +
        ", deliveryAddrId=" + deliveryAddrId +
        ", goodsName=" + goodsName +
        ", goodsCount=" + goodsCount +
        ", goodsPrice=" + goodsPrice +
        ", orderChannel=" + orderChannel +
        ", status=" + status +
        ", createDate=" + createDate +
        ", payDate=" + payDate +
        "}";
    }
}
