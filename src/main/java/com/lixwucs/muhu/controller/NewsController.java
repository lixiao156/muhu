package com.lixwucs.muhu.controller;

import com.lixwucs.muhu.bean.NewsDo;
import com.lixwucs.muhu.dao.MenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @author helloLi
 * @version 1.0
 * @date 2020/7/2 15:57
 */
@Controller
@RequestMapping("/news")
public class NewsController {

    @Autowired
    private MenuMapper menuMapper;

    @RequestMapping(value = "/{ChannelsId}")
    public String findNewsByChannelsId(Model model, @PathVariable(value = "ChannelsId") Long ChannelsId){
        List<NewsDo> newsByChannelsId = menuMapper.findNewsByChannelsId(ChannelsId);
        model.addAttribute("newsByChannelsId",newsByChannelsId);
        return "channels";
    }

    @RequestMapping(value = "/test")
    public String findNewsByChannels(){

        return "test";
    }


    @RequestMapping(value = "/NewsDo")
    public String insertNews(Model model, NewsDo newsDo){
        String author = newsDo.getAuthor();
        model.addAttribute("hh",author);
        return "test";
    }
}
