package giaodichvang;

import java.util.ArrayList;
import java.util.List;

public class DanhSachGiaoDich implements IGiaoDich {
	private List<GiaoDich> dsGiaoDich;
	
	
	public DanhSachGiaoDich() {
		this.dsGiaoDich = new ArrayList<>();
	}

	public void themGiaoDich(GiaoDich giaoDich) {
		dsGiaoDich.add(giaoDich);
	}

	@Override
	public double tinhTongSoLuongVang() {
		// TODO Auto-generated method stub
		return dsGiaoDich.stream()
				.filter(gd -> gd instanceof GiaoDichvang)
				.mapToDouble(GiaoDich::getSoLuong)
				.sum();
	}

	@Override
	public double tinhTongSoLuongTienTe() {
		// TODO Auto-generated method stub
		return dsGiaoDich.stream()
				.filter(gd -> gd instanceof GiaoDichTienTe)
				.mapToDouble(GiaoDich::getSoLuong)
				.sum();
	}

	@Override
	public double tinhTrungBinhTienTe() {
		// TODO Auto-generated method stub
		return dsGiaoDich.stream()
				.filter(gd -> gd instanceof GiaoDichTienTe)
				.mapToDouble(GiaoDich::getSoLuong)
				.average()
				.orElse(0);
	}

	@Override
	public List<GiaoDich> giaoDichDonGiaLonHon1Ty() {
		// TODO Auto-generated method stub
		return dsGiaoDich.stream()
				.filter(gd -> gd.getDonGia()>1000000000 )
				.toList();
	}
	public void xuatDanhSachGiaoDich() {
		dsGiaoDich.forEach(System.out::println);
	}
}
