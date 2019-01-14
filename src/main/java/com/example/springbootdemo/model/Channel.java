package com.example.springbootdemo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

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

    @Column(name = "REGION")
    @JsonProperty("Region")
    String region;

    @Column(name = "ACCESS_ACCOUNT")
    @JsonProperty("AccessAccount")
    int accessCount;
}
