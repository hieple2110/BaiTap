
import java.util.Arrays;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Naptien ATM = new Naptien("Nguyen Van A",1200000);

        String choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ngan hang ABC kinh chao Quy khach "+ATM.getName());
        System.out.println("Menu");
        System.out.println("1. Nhan phim A de kiem tra tai khoan");
        System.out.println("2. Nhan phim D de nap tien");
        System.out.println("3. Nhan phim W de nhan tien");
        System.out.println("4. Nhan phim H de xem lih su 3 lan rut tien");
        System.out.println("5. Nhan phim X de thoat");
        System.out.println("Moi ban nhap lua chon:");

        int addMoney;
        int lessMoney;
        while (true) {
            choice = sc.next();
            switch (choice) {
                case "A":
                    System.out.println("So du tai khoan khach hang la:" + ATM.getXxx() + "VND");
                    break;
                case "D":
                    System.out.println("Giao dich nap tien");
                    System.out.println("Vui long nhap so tien");
                    addMoney = sc.nextInt();
                    ATM.napTien(addMoney);
                    System.out.println("Giao dich thanh cong. Ban vua nap " + addMoney + " thanh cong");
                    System.out.println("So du tai khoan khach hang la: " + ATM.getXxx() + " vnd");
                    break;
                case "W":
                    System.out.println("Vui long nhap so tien");
                    lessMoney = sc.nextInt();
                    while ( lessMoney > ATM.getXxx()) {
                        System.out.println("So tien vuot qua TK cua ban");
                        lessMoney = sc.nextInt();
                    }
                        ATM.rutTien(lessMoney);
                        System.out.println("Giao dich thanh cong. Ban vua rut " + lessMoney + " thanh cong");
                        System.out.println("So du tai khoan khach hang la: " + ATM.getXxx() + " vnd");

                    break;
                case "H":
                    System.out.println("Lich su giao sich");
                    System.out.println(ATM.toString());
                    break;
                case "X":
                    System.out.println("Cam on ban da su dung dich vu ATM");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ban nhap sai chuc nang\n" +
                            "Bam nut theo menu de tiep tuc giao dich\n");
            }
        }
    }
}