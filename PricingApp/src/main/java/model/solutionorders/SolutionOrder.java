/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.solutionorders;

import model.marketmodel.MarketChannelAssignment;
import model.marketmodel.SolutionOffer;

/**
 *
 * @author kal bugrara
 */
public class SolutionOrder {

    SolutionOffer selectedsolutionoffer;
    //  CustomerProfile customerprofile;
    MarketChannelAssignment marketChannelAssignment;

    public SolutionOrder(SolutionOffer so, MarketChannelAssignment mca) {
        selectedsolutionoffer = so;
        marketChannelAssignment = mca;

    }

    public int getSolutionPrice() {
        return selectedsolutionoffer.getSolutionPrice();
    }

    public MarketChannelAssignment getMarketChannelCombo() {

        return marketChannelAssignment;

    }

}
