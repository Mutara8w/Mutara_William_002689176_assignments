package model.ordermgnt;

import java.util.ArrayList;
import model.customermgnt.CustomerProfile;
import model.marketmodel.MarketChannelAssignment;
import model.productmgnt.Product;
import model.salesmgnt.SalesPersonProfile;
// import ui.main.workspaceprofiles.ordermgnt.ProcessOrder;

public class Order {

    ArrayList<OrderItem> orderitems;
    CustomerProfile customer;
    SalesPersonProfile salesperson;
    MarketChannelAssignment mca;
    String status;

    public Order() {
    }

    public Order(CustomerProfile cp) {
        orderitems = new ArrayList();
        customer = cp;
        customer.addCustomerOrder(this); //we link the order to the customer
        salesperson = null;
        status = "in process";
    }

    public Order(CustomerProfile cp, SalesPersonProfile ep) {
        orderitems = new ArrayList();
        customer = cp;
        salesperson = ep;
        customer.addCustomerOrder(this); //we link the order to the customer
        salesperson.addSalesOrder(this);
    }

    public OrderItem newOrderItem(Product p, int actualprice, int q) {
        OrderItem oi = new OrderItem(p, actualprice, q);
        orderitems.add(oi);
        return oi;
    }

    public int getOrderTotal() {
        int sum = 0;
        for (OrderItem oi : orderitems) {
            sum = (sum + oi.getOrderItemTotal());
        }
        return sum;
    }

    public int getOrderPricePerformance() {
        int sum = 0;
        for (OrderItem oi : orderitems) {
            sum = (sum + oi.calculatePricePerformance());     //positive and negative values       
        }
        return sum;
    }

    public int getNumberOfOrderItemsAboveTarget() {
        int sum = 0;
        for (OrderItem oi : orderitems) {
            if (oi.isActualAboveTarget() == true) {
                sum = sum + 1;
            }
        }
        return sum;
    }

    public boolean isOrderAboveTotalTarget() {
        int sum = 0;
        for (OrderItem oi : orderitems) {
            sum = sum + oi.getOrderItemTargetTotal(); //product targets are added
        }
        if (getOrderTotal() > sum) {
            return true;
        } else {
            return false;
        }
    }

    public double getTotalCommission() {
        double totalCommission = 0;
        for (OrderItem oi : orderitems) {
            totalCommission += oi.calculateCommission();
        }
        return totalCommission;
    }

    public void updateOrderItemActualPrice(OrderItem orderItem, int actualPrice) {
        orderItem.setActualPrice(actualPrice);
    }

    public void CancelOrder() {
        status = "Cancelled";
    }

    public void Submit() {
        status = "Submitted";
    }

    public ArrayList<OrderItem> getOrderitems() {
        return orderitems;
    }
}
