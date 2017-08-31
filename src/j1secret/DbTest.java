package j1secret;

import com.techstar.modules.core.utils.Encode2Decode;

public class DbTest {

	public static void main(String[] args) {
		/**
		 * 数据库连接信息，application.properties，中 jdbc.password使用密文显示
		 */
		String x2 = System.getProperties().getProperty("os.name");
        System.out.println("系统信息："+x2);
        byte[] r = Encode2Decode.encryptAES("a1234567", "jdbc.password");
        String x = Encode2Decode.encodeHex(r);
        System.out.println("加密情况："+x);
        byte[] x1 = Encode2Decode.decryptAES(r, "jdbc.password");
        System.out.println("解密情况："+new String(x1));
        System.out.println("是否匹配："+"a1234567".matches("[A-Za-z0-9]{8,20}"));
        
        //自己的
        byte[] root = Encode2Decode.encryptAES("root", "jdbc.password");
        String rootEC = Encode2Decode.encodeHex(root);
        System.out.println("自己的mysql的密码root：" + rootEC);
        
	}
}
