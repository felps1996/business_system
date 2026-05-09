package entities;

public class Sells {
    public String product;
    public String buy_date;
    public String payment;
    public int id;
    public double price;
    public int times;
    public long exp_date;

    public Sells(){

    }

    public Sells(String product, String buy_date, String payment, int id, double price, int times, long exp_date){
            this.product = product;
            this.buy_date = buy_date;
            this.payment = payment;
            this.id = id;
            this.price = price;
            this.times = times;
            this.exp_date = exp_date;
    }
}
