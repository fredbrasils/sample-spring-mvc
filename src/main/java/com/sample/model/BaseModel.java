package com.sample.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;  
  
/** 
 * Base Model 
 * 
 * @author Fred Brasil 
 */  
@MappedSuperclass  
public abstract class BaseModel implements Serializable {  
  
    private static final long serialVersionUID = 1L;  
  
    @Id  
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    @Basic(optional = false)  
    @Column(name = "id", nullable = false, columnDefinition = "BIGINT UNSIGNED")  
    protected Long id;  
  
    public Long getId() {  
        return id;  
    }  
  
    @Override  
    public int hashCode() {  
        int hash = 0;  
        hash += (this.getId() != null ? this.getId().hashCode() : 0);  
  
        return hash;  
    }  
  
    @Override  
    public boolean equals(Object object) {  
    if (this == object)  
            return true;  
        if (object == null)  
            return false;  
        if (getClass() != object.getClass())  
            return false;  
  
        BaseModel other = (BaseModel) object;  
        if (this.getId() != other.getId() && (this.getId() == null || !this.id.equals(other.id))) {  
            return false;  
        }  
        return true;  
    }  
  
    @Override  
    public String toString() {  
        return this.getClass().getName() + " [ID=" + id + "]";  
    }  
}  