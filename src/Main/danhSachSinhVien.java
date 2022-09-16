package Main;

import java.util.ArrayList;

public class danhSachSinhVien {
	private ArrayList<SinhVien> danhSach;
	
/* 
 	trường hợp không cho 1 danh sách thì mình tự tạo danh
 	sách bằng 1 constructor rỗng
*/
	public danhSachSinhVien() {
		this.danhSach = new ArrayList<SinhVien>();
	}


	public danhSachSinhVien(ArrayList<SinhVien> danhSach) {
		this.danhSach = danhSach;
	}
	
// thêm sinh viên
	public void themSV(SinhVien sv) {
		this.danhSach.add(sv);
	}
// in danh sach sinh vien
	public void inDanhSach() {
		for (SinhVien sinhVien : danhSach) {
			System.out.println(sinhVien.toString());
		}
	}
	
// lay so luong sinh vien
	public int laySoLuong() {
		return this.danhSach.size();
	}
	
// kiem tra 1 sinh vien co trong danh sach khong 
	public boolean ktSinhVien(SinhVien sv) {
		return this.danhSach.contains(sv);
	}
	
// xoa 1 sv
	public  boolean xoaSinhVien(SinhVien sv) {
		return this.danhSach.remove(sv);
	}
// tim sinh vien
	public void tim(String ten) {
		for (SinhVien sinhVien : danhSach) {
			if(sinhVien.getHoVaTen().indexOf(ten)>=0) {
				System.out.println(sinhVien);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
