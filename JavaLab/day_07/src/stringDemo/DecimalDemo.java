package stringDemo;

import java.text.DecimalFormat;

public class DecimalDemo {
	public static void main(String[] args) {
		double d = 11.2547994;
//		DecimalFormat df = new DecimalFormat("0.00");
//		DecimalFormat df = new DecimalFormat("0.0000");
		DecimalFormat df = new DecimalFormat("0.000000");
		String str = df.format(d);
		System.out.println(str);
	}

}
