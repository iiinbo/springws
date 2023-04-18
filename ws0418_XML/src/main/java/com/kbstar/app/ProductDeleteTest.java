package com.kbstar.app;

import com.kbstar.dto.ProductDTO;
import com.kbstar.frame.MyService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductDeleteTest {
    public static void main(String[] args) {
        ApplicationContext factory =
                new ClassPathXmlApplicationContext("spring.xml");

        MyService<String, ProductDTO> service = // 주입
                (MyService<String, ProductDTO>) factory.getBean("pservice"); // spring.xml 참조
        // register 테스트 및 remove 테스트 정상
        ProductDTO p = new ProductDTO("pd05", "통통모나카", 50, 700); // spring 컨테이너에서 검색
        service.register(p);

        service.remove((p.getId("pd05")));
        System.out.println(p);
    }
}