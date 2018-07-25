package com.winy.model;

/**
 * 描述：
 *
 * @author winy
 * @create_time 2018-07-11 10:09
 */
public class OrderVO {

    private int id;

    private String orderNo;

    private String createTime;

    // 订单状态  '0 已提交  1 待支付 2  已支付 3  已失效'
    private int status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}