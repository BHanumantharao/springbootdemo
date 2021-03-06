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
@Table(name="CHANNEL")
public class Channel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    @JsonProperty("ID")
    int id;

    @Column(name = "CHANNEL_ID")
    @JsonProperty("ChannelId")
    String channelId;

    @Column(name = "CHANNEL_NAME")
    @JsonProperty("ChannelName")
    String channelName;

    @Lob
    @Type(type = "org.hibernate.type.MaterializedClobType")
    @Column(name = "ABOUT", length = Integer.MAX_VALUE)
    @JsonProperty("About")
    String about;

    @Column(name = "ACCESS_ACCOUNT")
    @JsonProperty("AccessAccount")
    int accessCount;

    /*@Lob
    @Type(type = "org.hibernate.type.MaterializedClobType")
    @Column(name = "ABOUT", length = Integer.MAX_VALUE)
    @JsonProperty("About")
    String about;*/
}
