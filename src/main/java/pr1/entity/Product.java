package pr1.entity;

import javax.persistence.*;

import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "ORDER", schema = "public")


public class Product {

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productname;
    }

    public void setProductName(String productname) {
        this.productname = productname;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Id
    @Column(name ="PRODUCT_ID")
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;

    @Column(name = "PRODUCT_NAME", length = 50)
    private String productname;

    @Column(name = "PRODUCT_REMARK", length = 1000)
    private String remark;

    @OneToMany(mappedBy = "order")
    private Set<OrderPos> orderPosses;

    public Set<OrderPos> getOrderPosses() {
        return orderPosses;
    }

    public void setOrderPosses(Set<OrderPos> orderPosses) {
        this.orderPosses = orderPosses;
    }
}
