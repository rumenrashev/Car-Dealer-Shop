package cardealer.models.enitiies.base;

import javax.persistence.*;

@MappedSuperclass
public class BaseEntity {

    private Integer id;

    protected BaseEntity(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id",nullable = false,updatable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


}
