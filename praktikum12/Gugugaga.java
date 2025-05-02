package praktikum12;
public class Gugugaga {
    public static void main(String[] args) { 
        
        // Membuat array berisi beberapa objek Invoice sekaligus dengan nilai produk, jumlah, dan harga per item
        // Array ini nantinya akan digunakan sebagai data belanjaan karyawan di koperasi
        Invoice[] invoices = {
            new Invoice("Coklat", 10, 5000),
            new Invoice("RC drift", 2, 45000),
            new Invoice("Kuku Bima", 20, 1000)
        };
        
        Invoice[] invoices2 = {
            new Invoice("Botol Kecap", 5, 2000),
            new Invoice("Mobil mainan", 1, 10000),
            new Invoice("Bakso", 5, 5000)
        };

        //membuat objek karyawan1 dan karyawan2 yang memiliki atribut dari Employee
        Employee karyawan1 = new Employee(2006, "Immanuel Issac Hadi", 5000000, invoices);
        Employee karyawan2 = new Employee(2007, "Muhammad Sumbul", 4500000, invoices2);
        
        //atribut dari objek-objek tersebut, kemudian kita pakaikan method tampilkan info
        karyawan1.tampilkanInfo();
        karyawan2.tampilkanInfo();
    
    }
}
