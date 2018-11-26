package pr1.entity;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "ORDERPROPS")
public class OrderPos {

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Id
    @Column(name = "ORDERPROPS_ID")
    @GeneratedValue(strategy = IDENTITY)
    private Integer Id;

    @Column(name = "ORDERPROPS_PRICE",nullable = false)
    private double price;

    @Column(name = "ORDERPROPS_QUANTITY",nullable = false)
    private Integer quantity;


    @Column(name = "ORDERPROPS_GOODNAME", nullable = false)
    private String goodName;

    @ManyToOne(targetEntity = Order.class)
    @JoinColumn(name = "ORDER_ID", nullable = false)
    private  Order order;
}
