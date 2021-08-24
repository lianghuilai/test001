package cn.lexed;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
* @ClassName: App
* @Description: 
* @author 大来老师
* @date 2021年8月5日
* @version V1.0 
*/
@SpringBootApplication
@MapperScan("cn.lexed.mapper")
public class App {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// test
         SpringApplication.run(App.class, args);
	}

}
