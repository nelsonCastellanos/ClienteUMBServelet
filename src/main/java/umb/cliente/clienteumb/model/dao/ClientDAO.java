package umb.cliente.clienteumb.model.dao;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class ClientDAO {
    @Id
    @SequenceGenerator(name="user_id_gen",sequenceName="user_sequence" ,initialValue=1,allocationSize=10)
    @GeneratedValue(strategy= GenerationType.SEQUENCE,generator="user_id_gen")
    private Integer id;

    @Column(unique = true)
    private String email;
}
