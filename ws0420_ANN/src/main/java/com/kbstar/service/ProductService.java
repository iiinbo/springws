package com.kbstar.service;

import com.kbstar.dto.ProductDTO;
import com.kbstar.frame.MyDao;
import com.kbstar.frame.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("pservice")
public class ProductService implements MyService<String, ProductDTO> { // 뼈대 : MyService

    @Autowired // 2. 어노테이션 추가
    @Qualifier("pdao")
    MyDao<String, ProductDTO> dao; // MyDao 인터페이스에서 고유하게 가지고있는 기능(insert..)도~ 쓸거다.




    @Override
    public void register(ProductDTO productDTO) { //판매할 상품등록 : 
        dao.insert(productDTO); // MyDao(인터페이스)에서 제공하는 기능(insert)로 DTO정보 입력
        System.out.println("판매할 상품정보 등록이 다음과 같이 정상적으로 완료되었습니다.");
    }

    @Override
    public void remove(String s) { //판매 중인 상품삭제
        dao.delete(s);
        System.out.println("해당 상품정보가 다음과 같이 정상적으로 삭제되었습니다.");
    }

    @Override
    public void modify(ProductDTO productDTO) { //판매 중인 상품정보 수정
        dao.update(productDTO);
        System.out.println("해당 상품정보가 정상적으로 수정되었습니다.");
    }

    @Override
    public ProductDTO get(String s) {
        return dao.select(s);

    }

    @Override
    public List<ProductDTO> get() {
        return dao.select();
    }
}
