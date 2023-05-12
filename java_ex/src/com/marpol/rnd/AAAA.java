package com.marpol.rnd;

public class AAAA {
	

	private String hId;
	private String hName;
	private String hCount;
	private String hHow;


		public static class H {

		public static final int HID = 0;
		public static final int HNAME = 1;
		public static final int HCOUNT = 2;
		public static final int HHOW = 3;
	}


public interface HService {

	public void loadH();
	public void printHList();

	public HDto getH(String hId);

	public List<HDto> getHList();

}


public class HServiceImplV1 implements HService {

	protected List<HDto> hList;

	public HServiceImplV1() {

		hList = new ArrayList<>();

	}

	public void loadH() {

		String authorFile = "src/com/marpol/books/data/저자정보(2023-05-11).txt";

		Scanner scan = null;
		InputStream is = null;

		try {
			is = new FileInputStream(authorFile);
		} catch (FileNotFoundException e) {
			System.out.println(authorFile + "파일이 없습니다.");
			return;
		}
		scan = new Scanner(is);

		while (scan.hasNext()) {

			String[] h = scan.nextLine().split(",");

			HDto aDto = new HDto();
			aDto.sethId(h[DataIndex2.H.HID]);
			aDto.sethId(h[DataIndex2.H.HNAME]);
			aDto.sethId(h[DataIndex2.H.HCOUNT]);
			aDto.sethId(h[DataIndex2.H.HHOW]);
			
			hList.add(aDto);
		}
		scan.close();
	}

	public void printHList() {
		
		System.out.println(Utils.dLine(100));
		System.out.println("아이디\t운동이름\t갯수\t방법");
		System.out.println(Utils.sLine(100));
		for (HDto dto : hList) {
			System.out.printf("%s\t", dto.gethId());
			System.out.printf("%s\t", dto.gethName());
			System.out.printf("%s\t", dto.gethCount());
			System.out.printf("%s\n", dto.gethHow());
			
		}
		System.out.println(Utils.dLine(100));
	}


	public HDto getH(String hid) {
		for(HDto dto : hList) {
			if(hList.isEmpty()) {
				this.loadH();
			}
			if(dto.gethId().equals(hid)) {
				return dto;
			}
		}
		return null;
	}

	public List<HDto> getHList() {
		
		if(hList.isEmpty()) {
			this.loadH();
		}
		return hList;
	}

}


public class Utils {
	
	public static final String dLine = "=".repeat(60);
	public static final String sLine = "-".repeat(60);
	
	public static String dLine(int length) {
		return "=".repeat(length);
	}
	public static String sLine(int length) {
		return "-".repeat(length);
	}

	
	
}




//-------------------------------------------------



public class Rnd {
	
	public static void main(String[] args) {
		
		for(int i = 0 ; i < 100 ; i++) {
			int rndNum = (int)(Math.random()*50)+51;
			if (rndNum < 51 || rndNum > 100) {
				System.err.println(rndNum + "over");
			} else {
				System.out.println(rndNum + "ok");
			}
		}
		
	}

}


 public static int prime() {
		int rndNum = (int) (Math.random() * 50) + 51;
		for (int i = 2; i < rndNum; i++) {
			if (rndNum % i == 0) {
				return 0; 
			}
		}
		return rndNum; 
	}

	public static void main(String[] args) {
		int rndCount = 0;
		int rndSum = 0;
		for (int i = 0; i < 100; i++) {
			int rndNum = prime();
			if (rndNum > 0) {
				rndCount ++;
				rndSum += rndNum;
				System.out.println(rndNum);
			}
		} 
		System.out.printf("소수의 개수 : %d, 소수의 합 : %d\n" , rndCount , rndSum);
		System.out.printf("소수의 개수 : %d, 소수의 합 : %d\n" , rndCount , rndSum);
	}





public class Rnd {

	public static void main(String[] args) {
//		int rndNum = (int) (Math.random() * 50) + 51;
		for (int i = 0; i < 100; i++) {
			int rndNum = (int) (Math.random() * 50) + 51;
			if(rndNum % 2 !=0) {
				System.out.println(rndNum + "홀수");
			}
		}
	}
}




}
