package shop.mtcoding.mall.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Setter
@Getter
@Table(name = "product_tb")
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    private  String name;
    private  Integer price;
    private  Integer qty;

    @ManyToOne // 포링키(FK) (ORM)
    private Seller seller; //오브젝트를 바로 사용 가능
}
