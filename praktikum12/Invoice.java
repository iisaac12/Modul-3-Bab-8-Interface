package praktikum12;

//mengimplementasi method getPayableAmount() dari interface Payable
public class Invoice implements Payable {
    private String productName;
    private int quantity;
    private int pricePerItem;

    public Invoice(String productName, int quantity, int pricePerItem){
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String getProductName(){
        return productName;
    }

    public int getQuantity(){
        return quantity;
    }

    public int getPricePerItem(){
        return pricePerItem;
    }

    //memodifikasi method dari Payable dengan mengembalikan nilai dari harga per item dikalikan jumlahnya
    @Override
    public double getPayableAmount(){
        return quantity * pricePerItem;
    }
}
