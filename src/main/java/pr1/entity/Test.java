package pr1.entity;

import javax.persistence.*;

import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

@Entity(name = "Test2")
@Table(name = "Test2")
public class Test {
    @Id
    @Column(name = "TEST2_ID", nullable = false)
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;


    @Column(name = "TEST2_NAME", nullable = false, length = 50)
    private String name;

   @JoinColumn(name = "TEST_ID",nullable = false)
   @ManyToOne(targetEntity = TestEntity.class)
   private TestEntity testEntity;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   /* public Set<Test> getTesta() {
        return testa;
    }*/

    public void setTestEntity(TestEntity testEntity) {
        this.testEntity = testEntity;
    }
}
