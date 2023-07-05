/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.ordermgnt;

import model.productmgnt.Product;

/**
 *
 * @author kal bugrara
 */
public class OrderItem {

    Product selectedproduct;
    int actualPrice;
    int quantity;

    @SuppressWarnings("LeakingThisInConstructor")
    public OrderItem(Product p, int paidprice, int q) {
        selectedproduct = p;
        p.addOrderItem(this); //make sure product links back to the item
        quantity = q;
        this.actualPrice = paidprice;
    }

    public int getOrderItemTotal() {
        return actualPrice * quantity;
    }

    //The following calculates what the price gain would have been if products were sold at target price
    public int getOrderItemTargetTotal() {
        return selectedproduct.getTargetPrice() * quantity;
    }

    //returns positive if seller is making higher margin than target
    //returns negative if seller is making lower margin than target
    //otherwise zero meaning neutral
    public int calculatePricePerformance() {
        return (actualPrice - selectedproduct.getTargetPrice()) * quantity;
    }

    public boolean isActualAboveTarget() {
        if (actualPrice > selectedproduct.getTargetPrice()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isActualBelowTarget() {
        if (actualPrice < selectedproduct.getTargetPrice()) {
            return true;
        } else {
            return false;
        }

    }

    public boolean isActualATTarget() {
        if (actualPrice == selectedproduct.getTargetPrice()) {
            return true;
        } else {
            return false;
        }

    }

    public double calculateCommission() {
        double commissionRate = 0.1; // 10% commission
        if (actualPrice > selectedproduct.getTargetPrice()) {
            return ((double) actualPrice - selectedproduct.getTargetPrice()) * commissionRate * quantity;
        } else {
            return 0;
        }
    }

    public Product getSelectedProduct() {
        return selectedproduct;
    }

    public int getActualPrice() {
        return actualPrice;

    }

    public int getQuantity() {
        return quantity;
    }

}
