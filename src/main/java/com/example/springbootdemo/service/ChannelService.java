package com.example.springbootdemo.service;

import com.example.springbootdemo.model.Channel;

import java.util.List;

/**
 * @author Hanumantharao Bitragunta
 */
public interface ChannelService {
    List<Channel> getChannels();
    Channel getChannel(int Id);
    void createChannel(Channel channel);
    void updateChannel(Channel channel);
    void deleteChannel(int Id);
}
