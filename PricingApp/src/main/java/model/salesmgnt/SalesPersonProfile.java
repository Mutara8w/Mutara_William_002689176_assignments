/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.salesmgnt;

import java.util.ArrayList;
import model.ordermgnt.Order;
// import model.ordermgnt.OrderItem;
import model.personnel.Person;
import model.personnel.Profile;

/**
 *
 * @author kal bugrara
 */
public class SalesPersonProfile extends Profile {

    ArrayList<Order> salesorders;

    public SalesPersonProfile(Person p) {

        super(p);
        salesorders = new ArrayList();

    }

    public void addSalesOrder(Order o) {
        salesorders.add(o);
    }

    public double getTotalSalesCommission() {
        double totalSalesCommission = 0;
        for (Order o : salesorders) {
            totalSalesCommission += o.getTotalCommission();
        }
        return totalSalesCommission;
    }

    @Override
    public String getRole() {
        return "Sales";
    }

}
