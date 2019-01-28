package sec_verify05;

public class Student {
	final static int LEFT = 0;
	final static int CENTER = 1;
	final static int RIGHT = 2;
	String name = "";
	String studentNo = "";
	int koreanScore = 0;
	int mathScore = 0;
	int englishScore = 0;

	public Student(String name, String studentNo, int koreanScore, int mathScore, int englishScore) {
		this.name = name;
		this.studentNo = studentNo;
		this.koreanScore = koreanScore;
		this.mathScore = mathScore;
		this.englishScore = englishScore;
	}
	
	static String format(String str, int length, int alignment) {
		String ret ="";
		
		switch(alignment) {
		case LEFT:
			ret =String.format("%-"+length+"s", str);
			break;
		case CENTER:
			length = (length-str.length())/2;
			ret =String.format("%"+(str.length()+length)+"s", str);
			/*for(int i=0; i<length;i++) {
				ret+=" ";
			}*/
			break;
		case RIGHT:
			ret =String.format("%"+length+"s", str);
			break;
		}
		
		return ret;
	}
	
	public int sum() {
		return this.koreanScore+this.mathScore+this.englishScore;
	}
	
	@Override
	public String toString() {
		String ko =Integer.toString(this.koreanScore);
		String ma=Integer.toString(this.koreanScore);
		String en =Integer.toString(this.koreanScore);	
		String sum =Integer.toString(sum());
		return format(this.name, 4, LEFT)+format(this.studentNo,4,RIGHT)+format(ko,6,RIGHT)+format(ma,6,RIGHT)+format(en,6,RIGHT)+format(sum,8,RIGHT);
	}
}
