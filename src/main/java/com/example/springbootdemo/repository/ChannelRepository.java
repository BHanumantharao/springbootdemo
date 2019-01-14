package com.example.springbootdemo.repository;

import com.example.springbootdemo.model.Channel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Hanumantharao Bitragunta
 */
@Repository
public interface ChannelRepository extends JpaRepository<Channel, Integer> {
}
