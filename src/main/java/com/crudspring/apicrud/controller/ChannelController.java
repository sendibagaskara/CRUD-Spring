package com.crudspring.apicrud.controller;

import com.crudspring.apicrud.entity.ChannelEntity;
import com.crudspring.apicrud.repository.ChannelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/channel")
public class ChannelController {

    @Autowired
    ChannelRepository channelRepository;

    @GetMapping(value= "cekAPI")
    public String cekAPI(){
        return "Hello World";
    }

    @PostMapping(value = "addNewChannel")
    public ChannelEntity addNewChannel(@RequestBody ChannelEntity param){

        channelRepository.save(param);
        return param;
    }

    @GetMapping(value= "getAllChannel")
    public List<ChannelEntity> getAllChannel(){
        return channelRepository.findAll();
    }

    @GetMapping(value = "getById")
    public ChannelEntity getById(@RequestParam String channelId){
        return channelRepository.findById(channelId).get();
    }

    @PostMapping(value = "updateChannel")
    public ChannelEntity updateChannel(@RequestBody ChannelEntity param){
        return channelRepository.save(param);
    }

    @GetMapping(value = "deleteChannel")
    public List<ChannelEntity> deleteChannel(@RequestParam String channelId) {
        channelRepository.deleteById(channelId);
        List<ChannelEntity> channelList = channelRepository.findAll();
        return channelList;
    }

}
