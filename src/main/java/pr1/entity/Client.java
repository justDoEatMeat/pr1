package pr1.entity;

import javax.persistence.*;

import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "CLIENT", schema = "public")

public class Client {

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getclientName() {
        return clientname;
    }

    public void setName(String clientname) {
        this.clientname = clientname;
    }


    @Id
    @Column(name = "CLIENT_ID")
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;

    @Column(name = "CLIENT_NAME", length = 50)
    private String clientname;


    @OneToMany(mappedBy = "client")
    private Set<Order> orders;

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }
}