package Test;

import java.util.Scanner;

import Main.SinhVien;
import Main.danhSachSinhVien;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int luachon=0;
		
		danhSachSinhVien dssv = new danhSachSinhVien();
		do {
			System.out.println("--------------------------------------------------------------------------------------");
				System.out.println(
					"1. Them sinh vien vao danh sach. \n"
				+	"2. In ra danh sach sinh vien. \n"
				+	"3. Lay so luong sinh vien. \n"
				+	"4. Kiem tra sinh vien co trong danh sach khong. \n"
				+	"5. Xoa 1 sinh vien ra khoi danh sach. \n"
				+	"6. Tim kiem tat ca sinh vien dua tren ho ten duoc nhap. \n"
				+	"0. Thoat"
									);
				
				System.out.println("VUI LONG CHON CHUC NANG:"); 
				luachon = sc.nextInt(); sc.nextLine();
			if((luachon>=0) && (luachon<=6)) {
				switch(luachon) {
				case 1:
					System.out.println("Nhap ma so sinh vien: "); String maSinhVien = sc.nextLine();
					System.out.println("Nhap ho va ten"); String hoTen = sc.nextLine();
					System.out.println("Nhap nam sinh "); int namSinh = sc.nextInt();
					System.out.println("Nhap diem trung binh "); double diemTB = sc.nextDouble();
					SinhVien sv = new SinhVien(maSinhVien, hoTen, namSinh, diemTB);
					dssv.themSV(sv);
					break;
				case 2:
					System.out.println("DANH SACH SINH VIEN:");
					dssv.inDanhSach();
					break;
				case 3:
					System.out.println("SO LUONG SINH VIEN:" + dssv.laySoLuong());
					break;
				case 4:
					System.out.println("Nhap ma so sinh vien: "); String masv = sc.nextLine();
					SinhVien sv1 = new SinhVien(masv);
					System.out.println("SINH VIEN CO MAT TRONG DANH SACH: "+ dssv.ktSinhVien(sv1));
					break;
				case 5:
					System.out.println("Nhap ma so sinh vien: "); String masv1 = sc.nextLine();
					SinhVien sv2 = new SinhVien(masv1);
					dssv.xoaSinhVien(sv2);
					break;
				case 6:
					System.out.println("Nhap ho ten sinh vien: "); String hoten1 = sc.nextLine();
					System.out.println("KET QUA: ");
					dssv.tim(hoten1);
					break;
				}
			} else {
				System.out.println("VUI LONG CHON LAI!");
			}
				System.out.println();
		}while(luachon != 0); 
	}
}
