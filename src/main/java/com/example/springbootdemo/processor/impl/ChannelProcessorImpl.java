package com.example.springbootdemo.processor.impl;

import com.example.springbootdemo.model.Channel;
import com.example.springbootdemo.processor.ChannelProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hanumantharao Bitragunta
 */

@Component
public class ChannelProcessorImpl implements ChannelProcessor {
    private static final Logger log = LoggerFactory.getLogger(ChannelProcessorImpl.class);

    /*private List<Channel> channelList = Arrays.asList(
            new Channel("CH001", "CHANNEL-1", "Hyderabad", 12345),
            new Channel("CH002", "CHANNEL-2", "Hyderabad", 12346));*/

    private String base64Str = "/9j/4AAQSkZJRgABAgAAAQABAAD/7QCcUGhvdG9zaG9wIDMuMAA4QklNBAQAAAAAAIAcAmcAFDIwdmw2Z3dEWk9XOFJnZjhWQXp6HAIoAGJGQk1EMDEwMDBhYzIwMzAwMDAyNDFiMDAwMDA0MmIwMDAwZWMyZTAwMDBjZTMyMDAwMDA4M2IwMDAwMGI2MTAwMDAxZDY4MDAwMDI1NmUwMDAwNGM3NDAwMDA2ZGQ0MDAwMP/iAhxJQ0NfUFJPRklMRQABAQAAAgxsY21zAhAAAG1udHJSR0IgWFlaIAfcAAEAGQADACkAOWFjc3BBUFBMAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAD21gABAAAAANMtbGNtcwAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACmRlc2MAAAD8AAAAXmNwcnQAAAFcAAAAC3d0cHQAAAFoAAAAFGJrcHQAAAF8AAAAFHJYWVoAAAGQAAAAFGdYWVoAAAGkAAAAFGJYWVoAAAG4AAAAFHJUUkMAAAHMAAAAQGdUUkMAAAHMAAAAQGJUUkMAAAHMAAAAQGRlc2MAAAAAAAAAA2MyAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHRleHQAAAAARkIAAFhZWiAAAAAAAAD21gABAAAAANMtWFlaIAAAAAAAAAMWAAADMwAAAqRYWVogAAAAAAAAb6IAADj1AAADkFhZWiAAAAAAAABimQAAt4UAABjaWFlaIAAAAAAAACSgAAAPhAAAts9jdXJ2AAAAAAAAABoAAADLAckDYwWSCGsL9hA/FVEbNCHxKZAyGDuSRgVRd13ta3B6BYmxmnysab9908Pp";
    private List<Channel> channels = new ArrayList<>();
    ChannelProcessorImpl(){
        channels.add(new Channel(1,"CH001",
                "CHANNEL-1",
                base64Str, 1717171717));
        channels.add(new Channel(2, "CH002",
                "CHANNEL-2", base64Str, 234567856));
    }

    @Override
    public List<Channel> getChannels() {
        return channels;
    }

    @Override
    public Channel getChannel(String channelId) {
        // Streams - java8
        return channels.stream()
                .filter(channel -> channelId.equals(channel.getChannelId()))
                .findAny()
                .orElse(null);
    }

    @Override
    public List<Channel> createChannel(Channel channel) {
//        channelList.add(channel);
        channels.add(channel);
        return channels;

    }

    @Override
    public List<Channel> updateChannel(Channel channel) {
        for (Channel ch : channels) {
            if(channel.getChannelId().equalsIgnoreCase(ch.getChannelId())){
                ch.setChannelName(channel.getChannelName());
                ch.setAccessCount(channel.getAccessCount());
                ch.setAbout(channel.getAbout());
            }
        }
        return channels;
    }

    @Override
    public List<Channel> deleteChannel(String channelId) {
//        channelList.removeIf(channel -> channelId.equals(channel.getChannelId()));
//        return channelList;

        // Lambda expression - java8
        channels.removeIf(channel -> channelId.equals(channel.getChannelId()));
        return channels;
    }

}
