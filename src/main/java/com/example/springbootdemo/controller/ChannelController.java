package com.example.springbootdemo.controller;

import com.example.springbootdemo.model.Channel;
import com.example.springbootdemo.processor.ChannelProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Hanumantharao Bitragunta
 */

@RestController
@RequestMapping("/api/v1")
public class ChannelController {
    private static Logger logger = LoggerFactory.getLogger(ChannelController.class);

    @Autowired
    ChannelProcessor channelService;

    @GetMapping(value = "/channels")
    public ResponseEntity<Channel> getChannelList() {
        logger.info("##########  - Get ChannelList - #########");
        List<Channel> respChannelList = channelService.getChannels();
        return new ResponseEntity(respChannelList, HttpStatus.OK);
    }

    @GetMapping(value = "/channels/{channelId}")
    public ResponseEntity<Channel> getChannel(@PathVariable String channelId) {
        logger.info("##########  - Get Channel - #########");
        Channel channel = channelService.getChannel(channelId);
        return new ResponseEntity(channel, HttpStatus.OK);
    }

    @PostMapping(value = "/channels")
    public ResponseEntity<Channel> createChannel(@RequestBody Channel channel){
        logger.info("##########  - Create Channel - #########");
        List<Channel> channelList = channelService.createChannel(channel);
        return new ResponseEntity(channelList, HttpStatus.OK);
    }

    @PutMapping(value = "/channels")
    public ResponseEntity<Channel> updateChannel(@RequestBody Channel channel){
        logger.info("##########  - Update Channel - #########");
        ChannelProcessor.printMsg();
        channelService.printChannel(channel.getChannelName());
        List<Channel> channelList = channelService.updateChannel(channel);
        return new ResponseEntity(channelList, HttpStatus.OK);
    }

    @DeleteMapping(value = "/channels/{channelId}")
    public ResponseEntity<Channel> deleteChannel(@PathVariable String channelId) {
        logger.info("##########  - Delete Channel - #########");
        List<Channel> channelList = channelService.deleteChannel(channelId);
        return new ResponseEntity(channelList, HttpStatus.OK);
    }

}
