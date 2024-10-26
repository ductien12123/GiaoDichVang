package giaodichvang;

import java.time.LocalDate;

public class GiaoDichvang extends GiaoDich {

	private String loaiVang;
	
	@Override
	public double getThanhTien() {
		// TODO Auto-generated method stub
		return soLuong*donGia;
	}

	public GiaoDichvang(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, int soLuong, String loaiVang) {
		super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
		this.loaiVang = loaiVang;
	}

	public GiaoDichvang(String loaiVang) {
		super();
		this.loaiVang = "";
	}

	public String getLoaiVang() {
		return loaiVang;
	}

	public void setLoaiVang(String loaiVang) {
		this.loaiVang = loaiVang;
	}
	
}
