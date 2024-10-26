package giaodichvang;

import java.time.LocalDate;

public class GiaoDichTienTe extends GiaoDich {
	private double tiGia;
	private TienTe loaiTien;
	

	@Override
	public double getThanhTien() {
		// TODO Auto-generated method stub
		return (loaiTien == TienTe.VND ? 1: tiGia )*soLuong*donGia;
	}


	public GiaoDichTienTe(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, int soLuong, double tiGia,
			TienTe loaiTien) {
		super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
		this.tiGia = tiGia;
		this.loaiTien = loaiTien;
	}
	public GiaoDichTienTe() {
		super ();
		this.tiGia= 0.0;
		this.loaiTien=loaiTien;
		
	}


	public double getTiGia() {
		return tiGia;
	}


	public void setTiGia(double tiGia) {
		this.tiGia = tiGia;
	}


	public TienTe getLoaiTien() {
		return loaiTien;
	}


	public void setLoaiTien(TienTe loaiTien) {
		this.loaiTien = loaiTien;
	}
	
	
}
