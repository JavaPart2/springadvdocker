package be.hvwebsites.landen.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="landen")
public class Land {
    @Id
    private String code;
    private String naam;
}
