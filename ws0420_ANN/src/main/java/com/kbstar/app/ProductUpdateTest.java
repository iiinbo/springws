package com.kbstar.app;

import com.kbstar.dto.ProductDTO;
import com.kbstar.frame.MyService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductUpdateTest {
    public static void main(String[] args) {
        ApplicationContext factory =
                new ClassPathXmlApplicationContext("spring.xml");

        MyService<String, ProductDTO> service = // 주입
                (MyService<String, ProductDTO>) factory.getBean("pservice"); // spring.xml 참조

       // modify 테스트 정상
        ProductDTO p = new ProductDTO("pd01", "유기농_고구마케잌", 24, 5500); // spring 컨테이너에서 검색

      service.modify(p);
      System.out.println(p);
    }
}
