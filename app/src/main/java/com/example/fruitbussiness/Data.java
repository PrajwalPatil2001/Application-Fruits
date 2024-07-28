package com.example.fruitbussiness;

public class Data {
    String date, quantity, price, totalprice , appquantity,appprice,apptotal,bquantity,bprice,btotal;


    public Data() {

    }

    public Data(String quantity, String price, String totalprice,
                String appquantity,String appprice,String apptotal,
                String bquantity,String bprice,String btotal) {
        this.quantity = quantity;
        this.price = price;
        this.totalprice = totalprice;
        this.date=date;

        this.appquantity = appquantity;
        this.appprice = appprice;
        this.apptotal = apptotal;

        this.bquantity = bquantity;
        this.bprice = bprice;
        this.btotal = btotal;
    }

    public String getBquantity() {
        return bquantity;
    }

    public void setBquantity(String bquantity) {
        this.bquantity = bquantity;
    }

    public String getBprice() {
        return bprice;
    }

    public void setBprice(String bprice) {
        this.bprice = bprice;
    }

    public String getBtotal() {
        return btotal;
    }

    public void setBtotal(String btotal) {
        this.btotal = btotal;
    }

    public String getAppquantity() {
        return appquantity;
    }

    public void setAppquantity(String appquantity) {
        this.appquantity = appquantity;
    }

    public String getAppprice() {
        return appprice;
    }

    public void setAppprice(String appprice) {
        this.appprice = appprice;
    }

    public String getApptotal() {
        return apptotal;
    }

    public void setApptotal(String apptotal) {
        this.apptotal = apptotal;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(String totalprice) {
        this.totalprice = totalprice;
    }
}
