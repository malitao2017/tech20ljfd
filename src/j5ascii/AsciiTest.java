package j5ascii;

import java.io.UnsupportedEncodingException;

public class AsciiTest {

	public static void main(String[] args) throws UnsupportedEncodingException {
		//字符:十六进制 （十进制）
		//a:61（97） A:41(65) 0:30(48) 1:31(49)
		byte[] a = new byte[]{61,41,30,31};
//		byte[] a = new byte[]{97,65,48,49};
		String as = new String(a,"UTF-8");
		System.out.println(as);
		
		//解决问题：有00就干掉
		byte[] b = new byte[]{97,65,48,49,00,00};
		String bs = new String(b,"UTF-8");
		System.out.println(bs);
		
	}
}
