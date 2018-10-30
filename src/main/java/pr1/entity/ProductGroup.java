package pr1.entity;

import javax.persistence.*;

import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "PRODUCTGROUP", schema = "public")

public class ProductGroup {

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getproductGroupName() {
        return prodgroupname;
    }

    public void setName(String prodgroupname) {
        this.prodgroupname = prodgroupname;
    }


    @Id
    @Column(name = "PRODUCTGROUP_ID")
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;

    @Column(name = "PRODUCTGROUP_NAME", length = 50)
    private String prodgroupname;


    @OneToMany(mappedBy = "product")
    private Set<Product> products;

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}