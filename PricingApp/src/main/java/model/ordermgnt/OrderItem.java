package model.ordermgnt;

import model.productmgnt.Product;

public class OrderItem {

    Product selectedproduct;
    int actualPrice;
    int quantity;
    double commissionRate = 0.1; // 10% commission

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

    public int getOrderItemTargetTotal() {
        return selectedproduct.getTargetPrice() * quantity;
    }

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
        if (actualPrice > selectedproduct.getTargetPrice()) {
            return ((double) actualPrice - selectedproduct.getTargetPrice()) * commissionRate * quantity;
        } else {
            return 0;
        }
    }

    public void setActualPrice(int actualPrice) {
        this.actualPrice = actualPrice;
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
