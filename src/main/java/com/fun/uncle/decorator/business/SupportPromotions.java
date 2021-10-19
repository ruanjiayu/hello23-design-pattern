package com.fun.uncle.decorator.business;

/**
 * @Description: 促销类型
 * @Author: Summer
 * @DateTime: 2021/8/31 4:59 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class SupportPromotions implements Cloneable{

    //该商品促销的ID
    private int id;

    //促销类型 1\优惠券 2\红包
    private PromotionType promotionType;

    //优先级
    private int priority;

    //用户领取该商品的优惠券
    private UserCoupon userCoupon;

    //用户领取该商品的红包
    private UserRedPacket userRedPacket;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PromotionType getPromotionType() {
        return promotionType;
    }

    public void setPromotionType(PromotionType promotionType) {
        this.promotionType = promotionType;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public UserCoupon getUserCoupon() {
        return userCoupon;
    }

    public void setUserCoupon(UserCoupon userCoupon) {
        this.userCoupon = userCoupon;
    }

    public UserRedPacket getUserRedPacket() {
        return userRedPacket;
    }

    public void setUserRedPacket(UserRedPacket userRedPacket) {
        this.userRedPacket = userRedPacket;
    }

    //重写clone方法
    @Override
    public SupportPromotions clone(){
        SupportPromotions supportPromotions = null;
        try{
            supportPromotions = (SupportPromotions)super.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return supportPromotions;
    }
}
