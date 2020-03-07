package demo.microservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Dept implements Serializable {

    @Id
    @Column(name = "deptno")
    private Long deptno;

    @Column(name = "name")
    private String name;

    @Column(name = "manager")
    private String manager;
}
