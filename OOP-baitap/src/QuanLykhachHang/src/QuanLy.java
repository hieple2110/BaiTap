import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
    public static ArrayList<Khachhang> data = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    public static int count = 0;
    public static int increase;

    public static void main(String[] args) {
        menu();
        while (true) {
            int number = Integer.parseInt(sc.next());
            switch (number) {
                case 0:
                    System.out.println("He thong Quan ly khach hang vua shutdown.");
                    System.exit(0);
                case 1:
                    addKH();
                    break;
                case 2:
                    searchKH();
                    break;
                case 3:
                    printInformation();
                    break;
                case 4:
                    printList();
                    break;
                case 5:
                    increaseOrders();
                    break;
                default:
                    System.out.println("Ban nhap sai chuc nang\n" +
                            "Bam nut theo menu de tiep tuc giao dich");

            }
        }
    }

    public static void addKH() {
        System.out.println("Nhập Tên: ");
        String name = sc.next();
        System.out.println("Nhập Địa chỉ: ");
        String address = sc.next();
        System.out.println("Nhập SĐT: ");
        String phone = sc.next();
        System.out.println("Nhập Email: ");
        String email = sc.next();
        System.out.println("Nhập Giới tính: ");
        String gender = sc.next();

        if (checkKH(phone, email)) {
            System.out.println("Các phần tử có trong list là: ");
            System.out.println("Bạn vừa thêm khách hàng " + name + " thành công");
            Khachhang addKhachHang = new Khachhang(name, address, phone, email, gender, 0);
            data.add(addKhachHang);
            for (int i = 0; i < data.size(); i++) {
                System.out.println(data.get(i).toString());
            }
            count++;
            System.out.println("Chon menu de thuc hien tiep");
            System.out.println("============================================");
        } else {
            System.out.println("Khach hang da ton tai" + "\n" + "He thong vua update thong tin");
            System.out.println("Chon menu de thuc hien tiep");
            System.out.println("============================================");
        }
    }

    public static void searchKH() {
        System.out.println("Nhap so dien thoai khach hang");
        String numberphone = sc.next();
        if (checkSearch(numberphone)) {
            System.out.println("He thong dang tim kiem...");
            System.out.println("Ket qua: ");
            for (int i = 0; i < data.size(); i++) {
                if (numberphone.equals(data.get(i).getSodienthoai())) {
                    System.out.println(data.get(i).toString());
                }
            }
            System.out.println("Chon menu de thuc hien tiep");
            Khachhang searchKH = new Khachhang();
            System.out.println("============================================");
        } else {
            System.out.println("Khong ton tai khach hang");
            System.out.println("Chon menu de thuc hien tiep");
            System.out.println("============================================");
        }
    }

    public static void printInformation() {
        System.out.println("Nhap so dien thoai khach hang");
        String numberphone = sc.next();
        if (checkSearch(numberphone)) {
            System.out.println("Thong tin");
            for (int i = 0; i < data.size(); i++) {
                if (numberphone.equals(data.get(i).getSodienthoai())) {
                    System.out.println(data.get(i).toString() + " So don: " + + data.get(i).getOder());
                }
            }
            System.out.println("Chon menu de thuc hien tiep");
            Khachhang printKH = new Khachhang();
            System.out.println("============================================");
        } else {
            System.out.println("Khong ton tai khach hang");
            System.out.println("Chon menu de thuc hien tiep");
            System.out.println("============================================");
        }

    }

    public static void printList() {
        System.out.println("Thong tin khach hang: ");
        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i).toString() + " So don: " + + data.get(i).getOder());
        }
        System.out.println("Tong co " + count + " khach hang trong he thong");
        System.out.println("Chon menu de thuc hien tiep");
        Khachhang printlist = new Khachhang();
        System.out.println("============================================");
    }

    public static void increaseOrders() {
        System.out.println("Nhap so dien thoai khach hang");
        String numberPhone = sc.next();
        System.out.println("So son hang da mua: ");
        increase = sc.nextInt();
        if (checkSearch(numberPhone)) {
            System.out.println("Thong tin khach hang khi tăng " + increase + " don hang: ");
            for (int i = 0; i < data.size(); i++) {
                if (numberPhone.equals(data.get(i).getSodienthoai())) {
                    data.get(i).setOder(data.get(i).getOder() + increase);
                    System.out.println(data.get(i).toString() + " So don: " + data.get(i).getOder());
                }
            }
            System.out.println("Chon menu de thuc hien tiep");
            Khachhang increase = new Khachhang();
            System.out.println("============================================");
        } else {
            System.out.println("Khong ton tai khach hang");
            System.out.println("Chon menu de thuc hien tiep");
            System.out.println("============================================");
        }
    }

    public static void menu() {
        System.out.println("Chao mung ban den voi he thong quan ly khach hang.");
        System.out.println("Bấm 1 để nhập khách hang.");
        System.out.println("Bấm 2 để tim kiem khach hang.");
        System.out.println("Bam 3 de in thong khach hang.");
        System.out.println("Bam 4 de in toan bo danh sach khach hang.");
        System.out.println("Bam 5 de tang so don hang cho khach.");
        System.out.println("Bam 0 de thoat");
    }

    public static boolean checkKH(String sdt, String emai) {
        for (Khachhang khachhang : data) {
            if (sdt.equals(khachhang.getSodienthoai()) || emai.equals(khachhang.getEmail())) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkSearch(String sdt) {
        for (Khachhang khachhang : data) {
            if (sdt.equals(khachhang.getSodienthoai())) {
                return true;
            }
        }
        return false;
    }

}
