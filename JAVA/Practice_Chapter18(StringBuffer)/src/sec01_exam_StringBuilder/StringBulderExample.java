package sec01_exam_StringBuilder;

import java.util.Random;

public class StringBulderExample {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		// System.out.println(sb.hashCode());
		sb.append("JAVA");
		sb.append(" Program Study");
		System.out.println(sb.hashCode());
		System.out.println(sb.toString());

		sb.insert(3, 2);
		System.out.println(sb.toString());

		sb.setCharAt(4, '6');
		System.out.println(sb.toString());

		sb.replace(6, 13, "Book");
		System.out.println(sb.toString());

		sb.delete(4, 5);
		System.out.println(sb.toString());
		int length = sb.length();

		System.out.println("ÃÑ ¹®ÀÚ¼ö : " + length);
		System.out.println(sb.hashCode());
		System.out.println(sb.toString());
		String result = sb.toString();
		System.out.println(result);
		

	}

}
