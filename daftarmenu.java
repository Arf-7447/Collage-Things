import java.util.Scanner;
public class daftarmenu {
  public static void main(String args[]){     
    Scanner input = new Scanner(System.in);
    int pilih;
    double 	jml,
			t1=0,
			t2=0,
			t3=0,
			t4=0,
			t5=0,
			t6=0,
			TK;
    char ulang;
    do {
		System.out.println("Rumah Makan Warumindo");
		System.out.println("Akang Baraya");
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
      	pilih = input.nextInt();
      	switch(pilih) {
		case 1:
			System.out.print("Nasi Goreng At 10K, beli berapa porsi = ");
			jml=input.nextDouble();
			t1=jml*10000;
			System.out.println("Nasi Goreng yang anda pesan seharga = Rp."+t1);
                        break;
		case 2:
			System.out.print("Nasi Uduk At 8k, beli berapa porsi = ");
			jml=input.nextDouble();
			t2=jml*8000;
			System.out.println("Nasi Uduk yang anda pesan seharga = Rp."+t2);
                        break;
		case 3:
			System.out.print("Nasi Kuning At 9,5k , beli berapa porsi = ");
			jml=input.nextDouble();
			t3=jml*9500;
			System.out.println("Nasi Kuning yang anda pesan seharga = Rp."+t3);
                        break;
		case 4:
			System.out.print("Nasi Kucing At 2k, beli berapa porsi = ");
			jml=input.nextDouble();
			t4=jml*2000;
			System.out.println("Nasi Kucing yang anda pesan seharga = Rp."+t4);
                        break;
		case 5:
			System.out.print("Nasi Orak-Arik At 9k, beli berapa porsi = ");
			jml=input.nextDouble();
			t5=jml*9000;
			System.out.println("Nasi Orak-Arik yang anda pesan seharga = Rp."+t5);
                        break;
		case 6:
			System.out.print("Nasi Magelangan At 12k, beli berapa porsi = ");
			jml=input.nextDouble();
			t6=jml*12000;
			System.out.println("Nasi Magelangan yang anda pesan seharga = Rp."+t6);
                        break;
        case 7:
            System.out.println("Anda Batal Memesan, Anda Tak Memiliki Uang !");
            System.exit(0);
		}
    		System.out.println();
    		System.out.println("Ingin meneruskan pesanan ? / mengakhiri pesanan ?");
    		System.out.print("y/t ? : ");
    		ulang = input.next().charAt(0);
    		System.out.println();
    	}
    		while (ulang!= 't');
			TK=(t1+t2+t3+t4+t5+t6);
			System.out.println("Total Pesanan = "+t1+" + "+t2+" + "+t3+" + "+t4+" + "+t5+" + "+t6+" = "+TK);
			System.out.println("Terimakasih Telah Memesan ^^");
		}
	}