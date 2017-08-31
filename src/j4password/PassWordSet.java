package j4password;

import com.techstar.modules.core.utils.Encode2Decode;

import j4password.utils.BaseUser;
import j4password.utils.Digests;

public class PassWordSet {

	public static void main(String[] args) {
//		把admin的密码从 a123456 改为 a1234567,user的salt是原来的
		BaseUser user= new BaseUser();
		String plain = "a123456";
		entryptPassword(user,plain);
		//结果中，必须有password和salt经过更改
		System.out.println("密码："+plain);
		System.out.println("一次的随机计算：");
		System.out.println("加密："+user.getPassword());
		System.out.println("salt："+user.getSalt());
	}
	
	public static final String HASH_ALGORITHM = "SHA-1";
	public static final int HASH_INTERATIONS = 1024;
	public static final int SALT_SIZE = 8;

	/**
	 * 设定安全的密码，生成随机的salt并经过1024次 sha-1 hash
	 * 
	 * @param user
	 */
	public static void entryptPassword(final BaseUser user, final String password) {
		//新的密码生成一个新的salt
		byte[] salt = Digests.generateSalt(SALT_SIZE);
		user.setSalt(Encode2Decode.encodeHex(salt));

		byte[] hashPassword = Digests.sha1(password.getBytes(), salt, HASH_INTERATIONS);
		user.setPassword(Encode2Decode.encodeHex(hashPassword));
	}
	
}
