/*
 * This file is generated by jOOQ.
 */
package org.quickstart.jooq.stratege.generate.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AuthorBo implements Serializable {

    private static final long serialVersionUID = -351007536;

    private Integer id;
    private String  firstName;
    private String  lastName;

    public AuthorBo() {}

    public AuthorBo(AuthorBo value) {
        this.id = value.id;
        this.firstName = value.firstName;
        this.lastName = value.lastName;
    }

    public AuthorBo(
        Integer id,
        String  firstName,
        String  lastName
    ) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AuthorBo (");

        sb.append(id);
        sb.append(", ").append(firstName);
        sb.append(", ").append(lastName);

        sb.append(")");
        return sb.toString();
    }
}
