package com.example.springbootdemo.processor;

import com.example.springbootdemo.model.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Hanumantharao Bitragunta
 */

@Service
public interface ChannelProcessor {
    Logger logger = LoggerFactory.getLogger(ChannelProcessor.class);

    List<Channel> getChannels();
    Channel getChannel(String channelId);
    List<Channel> createChannel(Channel channel);
    List<Channel> updateChannel(Channel channel);
    List<Channel> deleteChannel(String channelId);

    // default method - java 8
    default void printChannel(String channelName) {
        logger.debug("Channel name {}", channelName);
    }

    // static method - java 8
    static void printMsg(){
        logger.info(" you are accessing channel processor");
    }
}
