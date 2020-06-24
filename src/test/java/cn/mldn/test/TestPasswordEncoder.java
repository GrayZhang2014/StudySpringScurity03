package cn.mldn.test;

import org.junit.Test;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

public class TestPasswordEncoder {
	@Test
	public void testPassword() {
		String password = "hello" ;
		// 使用默认的加密器获取PasswordEncoder接口实例
		PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder() ;
		String encode = passwordEncoder.encode(password) ;
		System.out.println("【加密后的密码】" + encode);
		// 利用原始的输入密码（会由用户自己来输入）与加密后的数据进行匹配
		System.out.println("【密码验证匹配】" + passwordEncoder.matches(password, encode));
	}
}
