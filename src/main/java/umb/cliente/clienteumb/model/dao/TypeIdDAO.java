package umb.cliente.clienteumb.model.dao;


import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "type_id_umb")
public class TypeIdDAO {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true)
    private String name;

    @Column(unique = true)
    private String description;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TypeIdDAO(){}
    public TypeIdDAO(Integer id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
}
