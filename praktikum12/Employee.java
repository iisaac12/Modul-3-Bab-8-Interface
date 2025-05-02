package praktikum12;

//mengimplementasi method getPayableAmount() dari interface Payable
public class Employee implements Payable {
    private int registrationNumber;
    private String name;
    private int salaryPerMonth;
    private Invoice[] invoices;

    public Employee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices){
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    public int getRegistrationNumber(){
        return registrationNumber;
    }

    public String getName(){
        return name;
    }

    public int getSalaryPerMonth(){
        return salaryPerMonth;
    }

    public Invoice[] getInvoices (){
        return invoices;
    }

    public void tampilkanInfo(){
        System.out.println("================ Data Karyawan ================");
        System.out.println("Nomer Registrasi: " + getRegistrationNumber());
        System.out.println("Nama            : " + getName());
        System.out.println("Gaji per bulan  : Rp. " + getSalaryPerMonth());

        System.out.println("Detail Belanjaan:");
        
        // Menampilkan detail belanjaan karyawan secara polimorfis melalui array bertipe Payable[]
        // Objek Payable dikonversi (cast) ke Invoice agar bisa menampilkan nama produk, jumlah, harga satuan, dan totalnya
        // Ini merupakan penerapan konsep polimorfisme karena satu interface (Payable) bisa mewakili objek berbeda
        Payable[] belanjaan = getInvoices();
        for (Payable item : belanjaan) {
            Invoice invoice = (Invoice) item;
            System.out.println("> " + invoice.getProductName() + " (" + invoice.getQuantity() + 
                " x Rp. " + invoice.getPricePerItem() + ") = Rp. " + invoice.getPayableAmount());
        }
        System.out.println();
        System.out.println("Gaji Bersih     : Rp. " + getPayableAmount());
        System.out.println("===============================================");
        System.out.println();
    }

    //memodifikasi method dari Payable untuk menghitung gaji bersih karyawan setelah dipotong total belanjaan di koperasi
    //Caranya adalah dengan menjumlahkan semua nilai invoice menggunakan getPayableAmount() dari setiap objek invoice
    //lalu hasilnya dikurangkan dari gaji bulanan
    @Override
    public double getPayableAmount(){
        double totalShopping = 0;
        for(Invoice invoice : invoices){
            totalShopping += invoice.getPayableAmount();
        }
        return salaryPerMonth - totalShopping;
    }
}
