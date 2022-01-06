package kiemtracuoiky;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.Pattern;

public class Main {
	public static List<HangHoa> H_Hoa;
	public static Scanner sc = new Scanner(System.in);
	public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public static void main(String[] args) {
		H_Hoa = new ArrayList<>();

		// dữ liệu có sẵn
		DuLieuCoSan();
		int luachon;
		do {
			System.out.println("____________MENU____________");
			System.out.println(""
					+ "1. them hang hoa\n"
					+ "2. sua hang hoa\n"
					+ "3. xoa hang hoa\n"
					+ "4. tim kiem\n"
					+ "5. sap xep\n"
					+ "6. thong ke\n"
					+ "0. thoat ");
			System.out.println("____________________________");
			System.out.print("chon chuc nang: ");
			luachon = sc.nextInt();
			switch (luachon) {
			case 1: // Thêm hàng hóa
				themHangHoa();
				break;
			case 2: // sửa hàng hóa
				sc.nextLine();
				System.out.println("nhap ma hang hoa can sua: ");
				String mH = sc.nextLine();
				suaHangHoa(mH);
				break;
			case 3: // xóa hàng hóa
				sc.nextLine();
				System.out.println("nhap ma hang hoa can xoa: ");
				String maHang = sc.nextLine();
				xoaHangHoa(maHang);
				break;
			case 4: // tìm kiếm
				int timkiem;
				do {
					System.out.println("___HAY NHAP LUA CHON___");
					System.out.println("1. Tim theo loai");
					System.out.println("2. Tim theo khoang gia");
					System.out.println("3. Tim theo khoang ngay nhap");
					System.out.println("0. Thoat");
					timkiem = sc.nextInt();
					switch (timkiem) {
					// Tìm kiếm theo loại
					case 1:
						int TT_loai;
						do {
							System.out.println("Chon loai hang: ");
							System.out.println("1. Thuc Pham	2. Sanh Su	3. Dien May	");
							System.out.print("hay lua Chon: ");
							TT_loai = sc.nextInt();
							switch (TT_loai) {
							case 1:
								timKiemTheoLoai(Loai.Thuc_Pham);
								break;
							case 2:
								timKiemTheoLoai(Loai.Sanh_Su);
								break;
							case 3:
								timKiemTheoLoai(Loai.Dien_May);
								break;
							default:
								System.out.println("nhap sai, hay nhap lai...");
								break;
							}
						} while (TT_loai != 0);
						break;
					// Tìm kiếm theo giá
					case 2:
						System.out.println("_______NHAP GIA_______");
						System.out.print("Gia tu: ");
						double giaTu = sc.nextDouble();
						System.out.print("gia den: ");
						double giaDen = sc.nextDouble();
						sc.nextLine();
						timKiemTheoKhoangGia(giaTu, giaDen);
						break;
					// Tìm kiếm theo ngày
					case 3:
						sc.nextLine();
						System.out.println("_______NHAP KHOANG NGAY_______");
						System.out.println("_______Tu ngay: ");
						String tuNgay;
						while (true) {
							System.out.println("Nhap ngay vi du: 12/21/2021: ");
							tuNgay = sc.nextLine();
							if (pattern.matcher(tuNgay).matches()) {
								break;
							} else {
								System.out.println("nhap chua đung dinh dang. Hay nhap lai");
							}
						}
						LocalDate tu = LocalDate.parse(tuNgay, formatter);
						System.out.println("____________Đen ngay: ");
						String denNgay;
						while (true) {
							System.out.println("Nhap ngay vi du: 12/21/2021: : ");
							denNgay = sc.nextLine();
							if (pattern.matcher(denNgay).matches()) {
								break;
							} else {
								System.out.println("nhap chua dung dinh dang. Hay nhap lai");
							}
						}
						LocalDate den = LocalDate.parse(denNgay, formatter);
						timKiemTheoKhoangNgay(tu, den);
						break;
					default:
						System.out.println("nhap sai, hay nhap lai...");
						break;
					}
				} while (timkiem != 0);
				break;
			case 5: // sắp xếp
				int f2;
				int tg = 0; // biến check xem tăng hay giảm
				do {
					System.out.println("_______BAN CHON_______");
					System.out.println("1. Sap xep tang dan		2. Sap xep giam dan");
					System.out.print("Ban chon: ");
					f2 = sc.nextInt();
					switch (f2) {
					case 1:
						tg = 1;
						break;
					case 2:
						tg = -1;
						break;
					case 0:
						break;
					default:
						System.out.println("nhap sai, hay nhap lai...!");
						break;
					}

					if (tg != 0) { // khi đã chọn sắp xếp tăng hoặc giảm thì cho chọn sắp xếp theo giá và ngày
						int f3;
						do {
							System.out.println("___ HAY CHON ___");
							System.out.println("1. Sap xep theo gia nhap");
							System.out.println("2. Sap xep theo ngay nhap");
							System.out.println("3. Sap xep theo loai va ngay nhap");
							System.out.println("4. Sap xep theo loai va gia nhap");
							System.out.println("0. Quay lai");
							System.out.print("chon: ");
							f3 = sc.nextInt();
							sc.nextLine();
							switch (f3) {
							case 1:
								sapXepTheoGia(tg);
								break;
							case 2:
								sapXepTheoNgay(tg);
								break;
							case 3:
								sapXepTheoLoaiVaNgayNhap(tg);
								break;
							case 4:
								sapXepTheoLoaiVaGia(tg);
								break;
							default:
								System.out.println("nhap sai, hay nhap lai...");
								break;
							}
						} while (f3 < 0 || f3 > 4);
					}
				} while (f2 > 2 || f2 < 0);

				break;
			case 6: // thống kê
				int future4;
				do {
					System.out.println("___HAY NHAP LUA CHON___");
					System.out.println("1. Thong ke tong so luong hang hoa");
					System.out.println("2. Thong ke tong gia tri nhap kho");
					System.out.println("3. Thong ke so luong tung loai hang");
					System.out.println("0. Quay lai");
					System.out.print("Chon: ");
					future4 = sc.nextInt();
					sc.nextLine();
					switch (future4) {
					case 1:
						thongKeTongSLHang();
						break;
					case 2:
						thongKeTongGiaTriKho();
						break;
					case 3:
						thongKeSLTungLoai();
						break;
					case 0:
						break;
					default:
						System.out.println("nhap sai, hay nhap lai...");
						break;
					}
				} while (future4 < 0 || future4 > 3);
				break;
			case 0:
				System.exit(0);
				break;
			default:
				System.out.println("nhap sai, hay nhap lai...");
				break;
			}
		} while (luachon != 0);
	}

		
	// định dạng ngày tháng năm
		public static Pattern pattern = Pattern.compile("^\\d{1,2}[/]\\d{1,2}[/]\\d{4}$");
	//
	private static void DuLieuCoSan() {
	//thực phẩm
		H_Hoa.add(new HangHoa(Loai.Thuc_Pham, "TP_01", "rau cu", 2500, 50, LocalDate.parse("01/01/2010", formatter)));
		H_Hoa.add(new HangHoa(Loai.Thuc_Pham, "TP_02", "thit ca", 1500, 15, LocalDate.parse("02/02/2012", formatter)));
		H_Hoa.add(new HangHoa(Loai.Thuc_Pham, "TP_03", "thuc an nhanh", 2000, 60, LocalDate.parse("03/03/2013", formatter)));
        H_Hoa.add(new HangHoa(Loai.Thuc_Pham, "TP_04", "trai cay", 2000, 60, LocalDate.parse("03/03/2013", formatter)));
        
	//sành sứ
		H_Hoa.add(new HangHoa(Loai.Sanh_Su, "SS_01", "chen bat", 1200, 3, LocalDate.parse("04/04/2014", formatter)));
		H_Hoa.add(new HangHoa(Loai.Sanh_Su, "SS_02", "chau cay", 4500, 6, LocalDate.parse("05/05/2015", formatter)));
		H_Hoa.add(new HangHoa(Loai.Sanh_Su, "SS_03", "binh tra cac kieu", 7000, 12, LocalDate.parse("06/06/2016", formatter)));
        H_Hoa.add(new HangHoa(Loai.Sanh_Su, "SS_04", "ly uong nuoc", 7000, 12, LocalDate.parse("06/06/2016", formatter)));

	//đồ điện
		H_Hoa.add(new HangHoa(Loai.Dien_May, "DM_01", "tu lanh", 8000000, 150, LocalDate.parse("07/07/2017", formatter)));
		H_Hoa.add(new HangHoa(Loai.Dien_May, "DM_02", "tivi", 5000000, 25, LocalDate.parse("08/08/2018", formatter)));
		H_Hoa.add(new HangHoa(Loai.Dien_May, "DM_03", "may giat", 3500000, 120, LocalDate.parse("09/09/2019", formatter)));
	}
	private static void timKiemTheoKhoangNgay(LocalDate tuNgay, LocalDate denNgay) {
		List<HangHoa> hangs = new ArrayList<>();
		for (int i = 0; i < H_Hoa.size(); i++) {
			if (H_Hoa.get(i).getNgayNhapKho().isAfter(tuNgay) && H_Hoa.get(i).getNgayNhapKho().isBefore(denNgay)) {
				hangs.add(H_Hoa.get(i));
			}
		}
		if (hangs.size() == 0) {
			System.out.println("Khong ca san pham nao");
		} else {
			xemHang(hangs);
		}
	}

	private static void timKiemTheoKhoangGia(double giaTu, double giaDen) {
		List<HangHoa> hangs = new ArrayList<>();
		for (int i = 0; i < H_Hoa.size(); i++) {
			if (H_Hoa.get(i).getGiaNhap() > giaTu && H_Hoa.get(i).getGiaNhap() < giaDen) {
				hangs.add(H_Hoa.get(i));
			}
		}
		if (hangs.size() == 0) {
			System.out.println("Khong co san pham nao");
		} else {
			xemHang(hangs);
		}
	}

	private static void timKiemTheoLoai(Loai thucpham) {
		List<HangHoa> hangs = new ArrayList<>();
		for (int i = 0; i < H_Hoa.size(); i++) {
			if (H_Hoa.get(i).getLoai() == thucpham) {
				hangs.add(H_Hoa.get(i));
			}
		}
		if (hangs.size() == 0) {
			System.out.println("Khong co san pham nao");
		} else {
			xemHang(hangs);
		}
	}
	private static void thongKeSLTungLoai() {
		int sDienMay = 0, sSanhSu = 0, sThucPham = 0;
		for (HangHoa h : H_Hoa) {
			if (h.getLoai().compareTo(Loai.Sanh_Su) == 0) {
				sSanhSu += h.getSlTonKho();
			} else if (h.getLoai().compareTo(Loai.Thuc_Pham) == 0) {
				sThucPham += h.getSlTonKho();
			} else {
				sDienMay += h.getSlTonKho();
			}
		}
		System.out.println("____THONG KE SO LUONG TUNG LOAI____");
		System.out.printf("%20s%20s%20s%20s\n", "Loai", "ĐIEN MAY", "SANH SU", "THUC PHAM");
		System.out.printf("%20s%20s%20s%20s\n", "So luong", sDienMay + "", sSanhSu + "", sThucPham + "");
	}

	private static void thongKeTongGiaTriKho() {
		long K = 0;
		for (HangHoa h : H_Hoa) {
			K += h.getGiaNhap();
		}
		System.out.println("Tong gia tri trong kho: " + K);
	}

	private static void thongKeTongSLHang() {
		int s = 0;
		for (HangHoa h : H_Hoa) {
			s += h.getSlTonKho();
		}
		System.out.println("Tong so hang trong kho la: " + s);
	}

	private static void sapXepTheoLoaiVaGia(int flag) {
		Collections.sort(H_Hoa, new Comparator<HangHoa>() {
			@Override
			public int compare(HangHoa o1, HangHoa o2) {
				if (o1.getLoai().compareTo(o2.getLoai()) != 0) {
					return flag * o1.getLoai().compareTo(o2.getLoai());
				} else {
					double result = flag * (o1.getGiaNhap() - o2.getGiaNhap());
					if (result > 0)
						return 1;
					else if (result < 0)
						return -1;
					else
						return 0;
				}
			}
		});
		xemHang(H_Hoa);
	}

	private static void sapXepTheoLoaiVaNgayNhap(int flag) {
		Collections.sort(H_Hoa, new Comparator<HangHoa>() {
			@Override
			public int compare(HangHoa o1, HangHoa o2) {
				if (o1.getLoai().compareTo(o2.getLoai()) != 0) {
					return flag * o1.getLoai().compareTo(o2.getLoai());
				} else {
					if (flag == 1) {
						if (o1.getNgayNhapKho().isBefore(o2.getNgayNhapKho())) {
							return -1;
						} else {
							return 1;
						}
					} else {
						if (o1.getNgayNhapKho().isBefore(o2.getNgayNhapKho())) {
							return 1;
						} else {
							return -1;
						}
					}
				}
			}
		});
		xemHang(H_Hoa);
	}

	private static void sapXepTheoNgay(int flag) {
		Collections.sort(H_Hoa, new Comparator<HangHoa>() {
			@Override
			public int compare(HangHoa o1, HangHoa o2) {
				if (flag == 1) {
					if (o1.getNgayNhapKho().isBefore(o2.getNgayNhapKho())) {
						return -1;
					} else {
						return 1;
					}
				} else {
					if (o1.getNgayNhapKho().isBefore(o2.getNgayNhapKho())) {
						return 1;
					} else {
						return -1;
					}
				}
			}
		});
		xemHang(H_Hoa);
	}

	private static void sapXepTheoGia(int flag) {
		Collections.sort(H_Hoa, new Comparator<HangHoa>() {
			@Override
			public int compare(HangHoa o1, HangHoa o2) {
				double result = flag * (o1.getGiaNhap() - o2.getGiaNhap());
				if (result > 0)
					return 1;
				else if (result < 0)
					return -1;
				else
					return 0;
			}
		});
		System.out.println("____DANH SACH HANG HOA SAP XEP THEO GIA____");
		xemHang(H_Hoa);
	}

	private static void xemHang(List<HangHoa> hangs) {
		System.out.printf("%20s%20s%20s%20s%20s%20s\n", "Loai Hang", "Ma Hang", "Ten Hang", "Gia Nhap", "SL Ton Kho",
				"Ngay Nhap Kho");
		for (HangHoa ha : hangs) {
			System.out.printf("%20s%20s%20s%20s%20s%20s\n", ha.getLoai(), ha.getMaHang(), ha.getTenHang(),
					ha.getGiaNhap() + "", ha.getSlTonKho() + "", ha.getNgayNhapKho());
		}
	}
	private static void themHangHoa() {
		sc.nextLine();
		Loai loai = Loai.Thuc_Pham;
		int ch;
		do {
			System.out.println("Chon loai hang: ");
			System.out.println("1. THUC PHAM	2. SANH SU	3. ĐIEN MAY");
			System.out.print("Chon: ");
			ch = sc.nextInt();
			sc.nextLine();
			switch (ch) {
			case 1:
				loai = Loai.Thuc_Pham;
				break;
			case 2:
				loai = Loai.Sanh_Su;
				break;
			case 3:
				loai = Loai.Dien_May;
				break;
			default:
				System.out.println("Loai hang khong ton tai. Hay chon lai");
			}
		} while (ch > 3 || ch < 1);

		String maHang;
		int check = 0;
		do {
			System.out.println("Nhap ma hang: ");
			maHang = sc.nextLine();
			if (maHang.compareTo("") == 0) {
				System.out.println("Ma hang khong duoc de trong. Hay nhap lai!");
			} else {
				maHang = loai + maHang;
				check = kiemTraMaHangTonTai(0, H_Hoa.size() - 1, maHang);
				if (check != -1) {
					System.out.println("Ma hang da ton tai. Hay nhap lai");
				}
			}

		} while (maHang.compareTo("") == 0 || check != -1);

		System.out.println("Nhap ten hang: ");
		String tenHang = sc.nextLine();

		System.out.println("Nhap gia nhap: ");
		double giaNhap = sc.nextDouble();

		System.out.println("Nhap so luong ton kho: ");
		int slTonKho = sc.nextInt();
		sc.nextLine();
		String date;
		while (true) {
			System.out.println("Nhap ngay vi du: 12/21/2021: ");
			date = sc.nextLine();
			if (pattern.matcher(date).matches()) {
				break;
			} else {
				System.out.println("nhap chua dung dinh dang. Hay nhap lai");
			}
		}
		LocalDate ngayNhap = LocalDate.parse(date, formatter);
		HangHoa hangHoa = new HangHoa(loai, maHang, tenHang, giaNhap, slTonKho, ngayNhap);
		H_Hoa.add(hangHoa);
		System.out.println("*** Da Them thanh ***");
	}
	private static void suaHangHoa(String maHang) {
		int i = kiemTraMaHangTonTai(0, H_Hoa.size() - 1, maHang);
		if (i != -1) {
			System.out.println("___NHAP LAI THONG TIN HANG: " + maHang + " ____");

			System.out.println("Nhap ten hang: ");
			H_Hoa.get(i).setTenHang(sc.nextLine());

			System.out.println("Nhap gia nhap: ");
			H_Hoa.get(i).setGiaNhap(sc.nextDouble());

			System.out.println("Nhap so luong ton kho: ");
			H_Hoa.get(i).setSlTonKho(sc.nextInt());
			sc.nextLine();
			String date;
			while (true) {
				System.out.println("Nhap ngay vi du: 12/21/2021: ");
				date = sc.nextLine();
				if (pattern.matcher(date).matches()) {
					break;
				} else {
					System.out.println("nhap chua dung dinh dang. Hay nhap lai");
				}
			}
			LocalDate ngayNhap = LocalDate.parse(date, formatter);
			H_Hoa.get(i).setNgayNhapKho(ngayNhap);
			System.out.println("=== SUA HANG THANH CONG ===");
		} else {
			System.out.println("Ma hang khong ton tai");
		}
	}
	private static void xoaHangHoa(String maHang) {
		int i = kiemTraMaHangTonTai(0, H_Hoa.size() - 1, maHang);
		if (i != -1) {
			H_Hoa.remove(i);
			System.out.println("Xoa hang " + maHang + " thanh cang");
		} else {
			System.out.println("Ma hang khong ton tai");
		}
	}
	// tìm kiếm nhị phân
	private static int kiemTraMaHangTonTai(int l, int r, String maHang) {
		Collections.sort(H_Hoa, new Comparator<HangHoa>() {
			@Override //ghi đề P.T
			public int compare(HangHoa _HH1, HangHoa _HH2) {
				return _HH1.getMaHang().compareTo(_HH2.getMaHang());
			}});
		if (r >= l) {
			int mid = l + (r - l) / 2;
			// if 1 P.tử center
			if (H_Hoa.get(mid).getMaHang().compareTo(maHang) == 0)	return mid;
			// if P.tử < center -> left side
			if (H_Hoa.get(mid).getMaHang().compareTo(maHang) > 0)	return kiemTraMaHangTonTai(l, mid - 1, maHang);
			// else -> right
			return kiemTraMaHangTonTai(mid + 1, r, maHang);
		}
		// TH: zero
		return -1;}}
