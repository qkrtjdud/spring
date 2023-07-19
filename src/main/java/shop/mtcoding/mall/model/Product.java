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
}
