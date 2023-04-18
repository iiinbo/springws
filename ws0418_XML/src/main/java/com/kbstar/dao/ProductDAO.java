package com.kbstar.dao;

import com.kbstar.dto.ProductDTO;
import com.kbstar.frame.MyDao;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository("pdao")
public class ProductDAO implements MyDao<String, ProductDTO> {

    public void insert(ProductDTO productDTO) {
        System.out.println("Inserted Oracle" + productDTO);
    }

    public void delete(String s) {
        System.out.println("Deleted Oracle" + s);
    }

    public void update(ProductDTO productDTO) {
        System.out.println("Updated Oracle" + productDTO);
    }

    public ProductDTO select(String s) {
        ProductDTO pd = null;
        pd = new ProductDTO(s, "고구마케잌", 24, 2500);
        return pd;
    }

    public List<ProductDTO> select() {
        List<ProductDTO> list = new ArrayList<>(); // 담아올 바구니 준비
        list.add(new ProductDTO("pd01", "고구마케잌", 24, 2500)); // 데이터 넣기
        list.add(new ProductDTO("pd02", "참깨빵", 15, 1500));
        list.add(new ProductDTO("pd03", "양갱", 5, 1000));
        list.add(new ProductDTO("pd04", "크림빵", 35, 2000));

        return list;
    }
}
