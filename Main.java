package giaodichvang;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DanhSachGiaoDich ds=new DanhSachGiaoDich();
		GiaoDich vang1=new GiaoDichvang("GDV01",LocalDate.of(2022, 10, 10),5_000_000,10, "9999");
		GiaoDich vang2=new GiaoDichvang("GDV02",LocalDate.of(2021, 9, 23),5_000_000,10, "PNJ");
		GiaoDich vang3=new GiaoDichvang("GDV03",LocalDate.of(2023, 11, 20),5_000_000,10, "SJC");
		
		GiaoDich tien1=new GiaoDichTienTe("GDT01",LocalDate.of(2022, 10, 10),23_000,1000,1.2, TienTe.USD);
		GiaoDich tien2=new GiaoDichTienTe("GDT02",LocalDate.of(2023, 10, 20),25_000,900,1.2, TienTe.EUR);
		GiaoDich tien3=new GiaoDichTienTe("GDT03",LocalDate.of(2020, 1, 10),1_000_000_000,10,1.0, TienTe.VND);
		
		ds.themGiaoDich(vang1);
		ds.themGiaoDich(vang2);
		ds.themGiaoDich(vang3);
		ds.themGiaoDich(tien1);
		ds.themGiaoDich(tien2);
		ds.themGiaoDich(tien3);
		
		System.out.println("Tong so luong vang:"+ds.tinhTongSoLuongVang());
		System.out.println("Tong so luong tien te:"+ds.tinhTongSoLuongTienTe());
		System.out.println("Trung binh thanh tien tien te:"+ds.tinhTrungBinhTienTe());
		System.out.println("Danh sach cac giao dich don gia lon hon 1 ty:");
		ds.giaoDichDonGiaLonHon1Ty().forEach(System.out::println);
	}
	
}
