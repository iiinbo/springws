package com.kbstar.dto;

public class ProductDTO {
    private String id; // 상품번호
    private String name; // 상품명
    private int qt; // 수량
    private double price; // 가격

    // 컨스트럭터 생성
    public ProductDTO(String id, String name, int qt, double price) {
        this.id = id;
        this.name = name;
        this.qt = qt;
        this.price = price;
    }

    // getter and setter
    public String getId(String pd01) {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQt() {
        return qt;
    }

    public void setQt(int qt) {
        this.qt = qt;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // toString 출력정보
    @Override
    public String toString() {
        return "ProductDTO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", qt=" + qt +
                ", price=" + price +
                '}';
    }
}
