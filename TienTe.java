package giaodichvang;

public enum TienTe {
	VND("Tiền Việt Nam"),USD("Tiền USD"),EUR("Tiền Euro");
	private String ten;

	private TienTe(String ten) {
		this.ten = ten;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ten;
	}
	
}
