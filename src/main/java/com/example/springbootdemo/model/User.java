package com.example.springbootdemo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.hibernate.annotations.Type;

import javax.persistence.*;

/**
 * @author Hanumantharao Bitragunta
 */

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    @JsonProperty("ID")
    int id;

    @Column(name = "USER_ID")
    @JsonProperty("UserId")
    String userId;

    @Column(name = "USER_NAME")
    @JsonProperty("UserName")
    String userName;

    @Lob
    @Type(type = "org.hibernate.type.MaterializedClobType")
    @Column(name = "ABOUT", length = Integer.MAX_VALUE)
    @JsonProperty("About")
    String about;

}
