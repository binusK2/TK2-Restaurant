import java.util.Scanner;
import java.util.ArrayList;

// class restauranst as main class
public class Restaurant {

    static ArrayList<Menu> list = new ArrayList();
    static ArrayList<Special> List = new ArrayList();
    
//method menambahkan menu regular
public static void addMenu() {

    Scanner input = new Scanner(System.in);
    
    //declare variable
    String kode;
    String nama;
    int harga = 0;
    
    Menu obj = new Menu();
    System.out.println("Add Regular Menu");
    System.out.println("============================================");
        do {
                System.out.print("Input menu code [R...] : ");      // input berupa kode menu diawali dengan huruf R dengan maksimal 4 karakter
                kode = input.nextLine();
        }while (!(kode.startsWith("R") && kode.length() >= 4 ));
    
        do {
                System.out.print("Input menu name [5-20] : ");      // nama menu dengan panjang 5 sampai 20 karakter
                nama = input.nextLine();
        }while (!(nama.length() <= 20 && 5 < nama.length() ));
    
        do {
            System.out.print("Input menu price [10000-100000] : ");
            //exception handling
            try{
                harga = input.nextInt();
            } 
            catch(Exception e){
            System.out.println("Inputan harus angka !!!");}
        }while (!(harga <= 100000 && harga >= 10000) );
        
        obj.setKode(kode);
        obj.setNama(nama);
        obj.setHarga(harga);
        list.add(obj);
        System.out.println("Add Success !");
}

//method menambahkan menu spesial
public static void addSpecialMenu() {

    Scanner input = new Scanner(System.in);
    
    //declare variable
    String kode;
    String nama;
    int harga = 0;
    int discount = 0;
    
    Special obj = new Special();
    System.out.println("Add Special Menu");
    System.out.println("============================================");
        do {
            System.out.print("Input menu code [S...] : ");          // input berupa kode menu diawali dengan huruf S dengan maksimal 4 karakter
            kode = input.nextLine();
        }while (!(kode.startsWith("S") && kode.length() >= 4 ));
    
        do {
            System.out.print("Input menu name [5-20] : ");          // nama menu dengan panjang 5 sampai 20 karakter
            nama = input.nextLine();
        }while (!(nama.length() <= 20 && 5 < nama.length() ));
    
        do {
            System.out.print("Input menu price [10000-100000] : "); // input harga dari range 10000 sampai 100000
            //exception handling
            try{
                harga = input.nextInt();
               }catch(Exception e){
                System.out.println("Inputan harus angka !!!");}
        }while (!(harga <= 100000 && harga >= 10000) );
    
        do {
            System.out.print("Input menu discount [ 10% | 25% | 50% ] : ");
            //exception handling
            try{
                discount = input.nextInt();
               }catch(Exception e){
                System.out.println("Inputan harus angka !!!");}
        }while (discount != 10 && discount != 25 && discount !=50);
    
        obj.setKode(kode);
        obj.setNama(nama);
        obj.setHarga(harga);
        obj.setDiscount(discount);
        List.add(obj);
        System.out.println("Add Success !");
}

//method menampilkan semua Menu yang sudah ditambahkan
public static void showAll(){
System.out.println("\nRegular Menu");
System.out.println("======================================================================================");
System.out.println("No.\t|Kode\t\t\t|Nama\t\t\t\t\t|Harga       |");
System.out.println("======================================================================================");

    //mencetak menu regular
    int i=1;
    for (Menu obj : list){ 
        System.out.println(i+ "\t"+obj.getKode()+"\t\t\t"+obj.getNama()+"\t\t\t\t\t"+(int)obj.getHarga()+"\n");
        i++;
    }
    
    
System.out.println("\n\nSpecial Menu");
System.out.println("===================================================================================================");
System.out.println("No.\t|Kode\t\t\t|Nama\t\t\t\t\t|Harga\t\t|Diskon   |");
System.out.println("===================================================================================================");
    
    //mencetak menu spesial
    int a = 1;
    for (Special obj : List) {
        System.out.println(a+"\t "+obj.getKode()+"\t\t\t"+obj.getNama()+"\t\t\t\t\t"+(int)obj.getHarga()+"\t\t"+(int)obj.getDiscount()+"%"+"\n");
        a++;
    }
}

//method menghapus menu regular
public static void deleteRegular() {

//declare variable
String code;
int a=0;

Scanner scanner = new Scanner(System.in);
System.out.println("Delete Regular Menu");
System.out.println("===================================");
System.out.print("Input menu code [R...] : ");
code = scanner.nextLine();
if(code.startsWith("R")){
        for(Menu obj : list){ 
            if(code.equals(obj.getKode())){
                list.remove(obj);
                a=1;
                break;
            }
        }
} else {
    System.out.println("Code is Wrong !!!");
}
if(a==1){
    System.out.println("Delete Success !!!");
}else{
    System.out.println("Delete Failed !!!");
}
}

//method menghapus menu spesial
public static void deleteSpecial() {
String code;
int a=0;
Scanner scanner = new Scanner(System.in);
System.out.println("Delete Regular Menu");
System.out.println("===================================");
System.out.print("Input menu code [S...] : ");
code = scanner.nextLine();
if(code.startsWith("S")){
        for(Special obj : List){ 
            if(code.equals(obj.getKode())){
                List.remove(obj);
                a=1;
                break;
            }
        }
} else {
    System.out.println("Code is Wrong !!!");
}
if(a==1){
    System.out.println("Delete Success !!!");
}else{
    System.out.println("Delete Failed !!!");
}
}

//main method
//memanggil method yang sudah di buat
public static void main(String[] args) {
    int choice;
    Scanner scanner = new Scanner(System.in);
        do{
            //tampilan utama
            System.out.println("Family Restaurant");
            System.out.println("=============================================");
            System.out.println("1. Add Regular Menu");
            System.out.println("2. Add Special Menu");
            System.out.println("3. Show All Menu");
            System.out.println("4. Delete Regular Menu");
            System.out.println("5. Delete Special Menu");
            System.out.println("6. Exit");
            System.out.print("Choice [1-6] = ");
            
            choice = scanner.nextInt();
            switch(choice){
                case 1 :
                    Restaurant.addMenu(); //call method addMenu
                    break;
                case 2 :
                    Restaurant.addSpecialMenu(); //call method addSpecialMenu
                    break;
                case 3 :
                    Restaurant.showAll(); //call method showAll menampilkan semua menu yang sudah dimasukan
                    break;
                case 4 :
                    Restaurant.deleteRegular(); //call method deleteRegular menghapus menu regular
                    break;
                case 5 :
                    Restaurant.deleteSpecial(); //call method deleteSpecial menghapus menu spesial
                    break;
                case 6 :
                    System.exit(0); //keluar dari program
                    break;
            }
        }while (6 != choice);
}
}