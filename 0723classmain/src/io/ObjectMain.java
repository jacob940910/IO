package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectMain {

	public static void main(String[] args) {
		//객체단위로 데이터를 기록할 수 있는 클래스의 변수 선언 
		ObjectOutputStream oos = null;
		try {
			//파일에 객체단위로 기록할 수 있는 클래스의 객체 만들기 
			oos = new ObjectOutputStream(new FileOutputStream("./oos.txt"));
			
			Member member = new Member();
			member.setEmail("dltmdghks94@gmail.com");
			member.setPw("7268");
			member.setPhone("01094416351");
			
			//객체를 파일에 기록 
			oos.writeObject(member);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if(oos != null)
				try {
					oos.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
		}
	}

}
