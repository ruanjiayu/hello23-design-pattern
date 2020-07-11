package com.fun.uncle.builder.demo2;

/**
 * @Description:
 * @Author: Summer
 * @DateTime: 2020/7/11 5:27 下午
 * @Version: 0.0.1-SNAPSHOT
 */
public class Product {

    private String keLe = "可乐";

    private String hamburger = "汉堡";

    private String frenchFries = "薯条";

    private String snack = "点心";

    public String getKeLe() {
        return keLe;
    }

    public void setKeLe(String keLe) {
        this.keLe = keLe;
    }

    public String getHamburger() {
        return hamburger;
    }

    public void setHamburger(String hamburger) {
        this.hamburger = hamburger;
    }

    public String getFrenchFries() {
        return frenchFries;
    }

    public void setFrenchFries(String frenchFries) {
        this.frenchFries = frenchFries;
    }

    public String getSnack() {
        return snack;
    }

    public void setSnack(String snack) {
        this.snack = snack;
    }

    @Override
    public String toString() {
        return "Product{" +
                "keLe='" + keLe + '\'' +
                ", hamburger='" + hamburger + '\'' +
                ", frenchFries='" + frenchFries + '\'' +
                ", snack='" + snack + '\'' +
                '}';
    }
}
