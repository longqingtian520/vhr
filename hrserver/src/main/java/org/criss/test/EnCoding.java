package org.criss.test;

import org.springframework.security.crypto.bcrypt.BCrypt;

public class EnCoding {

	public static void main(String[] args) {
		
		String password = "123456a";//$2a$10$ofPkBDUezOJp6Sik63Q/0.QlU8a1itEyzldjSXqfn2nDPqXjN0Ljm
		String pwt = BCrypt.hashpw(password, BCrypt.gensalt());  //加密
		System.out.println(password + "加密后：" + pwt);
		
		boolean pswFlag = BCrypt.checkpw("123","$2a$10$ySG2lkvjFHY5O0./CPIE1OI8VJsuKYEzOYzqIa7AJR6sEgSzUFOAm");//解密
		boolean pswFlag1 = BCrypt.checkpw("123","$2a$10$oE39aG10kB/rFu2vQeCJTu/V/v4n6DRR0f8WyXRiAYvBpmadoOBE.");//解密
		System.out.println("===="+pswFlag);
		System.out.println("===="+pswFlag1);
		
		StringBuilder sb = new StringBuilder();
		sb.append("{\"status\":\"error\",\"msg\":\"");
		sb.append("用户名或密码输入错误，登录失败!");
		System.out.println(sb.toString());
	}

}
