package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputMain {

	public static void main(String[] args) {
		//객체단위로 데이터를 기록할 수 있는 클래스의 변수 선언 
		ObjectInputStream ois = null;
		try {
			//파일에 객체단위로 기록할 수 있는 클래스의 객체 만들기 
		ois = new ObjectInputStream(new FileInputStream("./oos.txt"));
			
			//read로 읽어올 때 Object 타입으로 리턴하기 때문에 강제 형 변환을 해서 원래의 자료형으로 
			//되돌려서 사용해야 합니다.
		Member member = (Member)ois.readObject();
		System.out.println(member.getEmail());
		
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if(ois != null)
				try {
					ois.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
		}
	}

}
