package com.example.springbootdemo.controller;

import com.example.springbootdemo.model.Channel;
import com.example.springbootdemo.processor.ChannelProcessor;
import com.example.springbootdemo.service.ChannelService;
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
@RequestMapping("/api/repo/v1")
public class ChannelRepoController {
    private Logger logger = LoggerFactory.getLogger(ChannelRepoController.class);

    @Autowired
    ChannelService channelService;

    @GetMapping(value = "/channels")
    public ResponseEntity<Channel> getChannelList() {
        logger.info("##########  - Get ChannelList - #########");
        List<Channel> respChannelList = channelService.getChannels();
        return new ResponseEntity(respChannelList, HttpStatus.OK);
    }

    @GetMapping(value = "/channels/{channelId}")
    public ResponseEntity<Channel> getChannel(@PathVariable int channelId) {
        logger.info("##########  - Get Channel - #########");
        Channel channel = channelService.getChannel(channelId);
        return new ResponseEntity(channel, HttpStatus.OK);
    }

    @PostMapping(value = "/channels")
    public ResponseEntity<Channel> createChannel(@RequestBody Channel channel){
        logger.info("##########  - Create Channel - #########");
        channelService.createChannel(channel);
        return new ResponseEntity("", HttpStatus.OK);
    }

    @PutMapping(value = "/channels")
    public ResponseEntity<Channel> updateChannel(@RequestBody Channel channel){
        logger.info("##########  - Update Channel - #########");
        ChannelProcessor.printMsg();
        channelService.updateChannel(channel);
        return new ResponseEntity("", HttpStatus.OK);
    }

    @DeleteMapping(value = "/channels/{channelId}")
    public ResponseEntity<Channel> deleteChannel(@PathVariable int channelId) {
        logger.info("##########  - Delete Channel - #########");
        channelService.deleteChannel(channelId);
        return new ResponseEntity("", HttpStatus.OK);
    }
}
