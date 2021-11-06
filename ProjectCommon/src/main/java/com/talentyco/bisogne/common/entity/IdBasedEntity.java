package com.talentyco.bisogne.common.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Java Title
 *
 * @author Emmanuel Nieto Muñoz
 * @version: xx/10/2021/1.0
 * @see <a href = "" />  </a>
 */

@MappedSuperclass
public abstract class IdBasedEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
