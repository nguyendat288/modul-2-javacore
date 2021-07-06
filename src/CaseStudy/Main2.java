package CaseStudy;

import java.io.IOException;
import java.util.Scanner;

public class Main2 {
    public static void main1() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("=====================//Quản lý nhân viên//===============");
            System.out.println("==========================================================");
            System.out.println("1.Thêm nhân viên ");
            System.out.println("2.Xoá nhân viên theo id");
            System.out.println("3.Sửa thông tin nhân viên theo id");
            System.out.println("4.Kiểm tra thông tin nhân viên theo id");
            System.out.println("5.Thay đổi trạng thái nhân viên theo id");
            System.out.println("6.Hiển thị danh sách nhân viên");
            System.out.println("7.Hiển thì lương theo id");
            System.out.println("8.Sắp xếp nhân viên theo id ");
            System.out.println("9.Đăng xuất ");
            System.out.print("Nhập lựa chọn của bạn : ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    try {
                        QLNV.addNhanVien();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    try {
                        QLNV.removeNhanVien();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    try {
                        QLNV.changeInfor();
                    } catch (Exception e) {
                        e.printStackTrace();
                    } break;
                case 4:
                    QLNV.kiemTraInfor();
                    break;
                case 5:
                    try {
                        QLNV.changStatus();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 6:
                    QLNV.show();
                    break;
                case 7:
                    QLNV.showLuong();
                    break;
                case 8:
                    try {
                        QLNV.sort();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 9:
                    Main.menuDanhap();
                    break;

            }

        }
    }
}