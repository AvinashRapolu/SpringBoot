package com.avinash.SpringPrac;

import lombok.Data;

import java.util.List;
@Data
public class Skus
{
    private String skuC;
    private List<PriceSize> ps;

    public Skus(String skuC, List<PriceSize> ps) {
        this.skuC = skuC;
        this.ps = ps;
    }

    public String getSkuC() {
        return skuC;
    }

    public void setSkuC(String skuC) {
        this.skuC = skuC;
    }

    public List<PriceSize> getPs() {
        return ps;
    }

    public void setPs(List<PriceSize> ps) {
        this.ps = ps;
    }


}
