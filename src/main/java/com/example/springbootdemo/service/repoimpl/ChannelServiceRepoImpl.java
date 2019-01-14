package com.example.springbootdemo.service.repoimpl;

import com.example.springbootdemo.exception.ChannelNotFoundException;
import com.example.springbootdemo.model.Channel;
import com.example.springbootdemo.processor.ChannelProcessor;
import com.example.springbootdemo.repository.ChannelRepository;
import com.example.springbootdemo.service.ChannelService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Hanumantharao Bitragunta
 */
@Service
public class ChannelServiceRepoImpl implements ChannelService {
    private Logger logger = LoggerFactory.getLogger(ChannelServiceRepoImpl.class);

    @Autowired
    ChannelRepository channelRepository;


    @Override
    public List<Channel> getChannels() {
        return channelRepository.findAll();
    }

    @Override
    public Channel getChannel(int Id) {
        // java8
        Optional<Channel> channel = channelRepository.findById(Id);
        if(!channel.isPresent())
            throw new ChannelNotFoundException("id: "+Id);

        return channel.get();
    }

    @Override
    public void createChannel(Channel channel) {
        channelRepository.save(channel);
    }

    @Override
    public void updateChannel(Channel channel) {
        channelRepository.save(channel);
    }

    @Override
    public void deleteChannel(int Id) {
        channelRepository.deleteById(Id);
    }
}
