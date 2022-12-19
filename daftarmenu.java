import java.util.Scanner;
   
public class daftarmenu {
  public static void main(String args[]){
            
    Scanner input = new Scanner(System.in);
     

    int pilihan;
    double jumlah,total1=0,total2=0,total3=0,total4=0,total5=0,total6=0,total_keseluruhan;
    char ulang;
     
    do {
		System.out.println("Warumindo");
		System.out.println("Baraya");
		System.out.println("---------------");
		System.out.println("1. Nasi Goreng");
		System.out.println("2. Nasi Uduk");
		System.out.println("3. Nasi Kuning");
		System.out.println("4. Nasi Kucing");
		System.out.println("5. Nasi Orak-arik");
		System.out.println("6. Nasi Magelangan");
		System.out.println("7. Keluar - Tak Jadi memesan");
		System.out.println("----------------");
		System.out.println("Pilih [1-7] :");
       
      System.out.print("Pilihan anda: ");
      pilihan = input.nextInt();
    
      switch(pilihan) {
		case 1:
			System.out.print("Nasi Goreng At 10K, beli berapa porsi = ");
			jumlah=input.nextDouble();
			total1=jumlah*10000;
			System.out.println("Nasi Goreng yang anda pesan seharga = Rp."+total1);
                        break;
		case 2:
			System.out.print("Nasi Uduk At 8k, beli berapa porsi =");
			jumlah=input.nextDouble();
			total2=jumlah*8000;
			System.out.println("Nasi Uduk yang anda pesan seharga = Rp."+total2);
                        break;
		case 3:
			System.out.print("Nasi Kuning At 9,5k , beli berapa porsi =");
			jumlah=input.nextDouble();
			total3=jumlah*9500;
			System.out.println("Nasi Kuning yang anda pesan seharga = Rp."+total3);
                        break;
		case 4:
			System.out.print("Nasi Kucing At 2k, beli berapa porsi =");
			jumlah=input.nextDouble();
			total4=jumlah*2000;
			System.out.println("Nasi Kucing yang anda pesan seharga = Rp."+total4);
                        break;
		case 5:
			System.out.print("Nasi Orak-Arik At 9k, beli berapa porsi =");
			jumlah=input.nextDouble();
			total5=jumlah*9000;
			System.out.println("Nasi Orak-Arik yang anda pesan seharga = Rp."+total5);
                        break;
		case 6:
			System.out.print("Nasi Magelangan At 12k, beli berapa porsi =");
			jumlah=input.nextDouble();
			total6=jumlah*12000;
			System.out.println("Nasi Magelangan yang anda pesan seharga = Rp."+total6);
                        break;
                case 7:
                        System.out.println("Tidak jadi Memesan, Tak Memiliki Uang ");
                        System.exit(0);
			
		}
    
      System.out.println();
    
      System.out.println("Ingin meneruskan pesanan ? / mengakhiri pesanan ?");
      System.out.print("y/t ? : ");
      ulang = input.next().charAt(0);
       
      System.out.println();
    }
    while (ulang!= 't');
    
   total_keseluruhan=(total1+total2+total3+total4+total5+total6);
   System.out.println("Total Pesanan = "+total1+" + "+total2+" + "+total3+" + "+total4+" + "+total5+" + "+total6+" = "+total_keseluruhan);
   System.out.println("Terimakasih Telah Memesan");
  
  }
}
