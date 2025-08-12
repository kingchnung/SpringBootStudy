package com.boot.example.controller;

import com.boot.example.domain.ExampleVO;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//데이터 전송(ResponseBody)의 목적인 Controller -> ResponseBody+Controller
@RestController
@RequestMapping("/sample")
public class SampleController {

    @GetMapping(value = "/getText", produces = MediaType.TEXT_PLAIN_VALUE)
    public String getText() {
        return "안녕하세요\n" +
                "오오오오오오오오오";
    }

    @GetMapping("/getExample")
    public ExampleVO getSample() {
        return new ExampleVO(1, "홍길동", "010-4563-1253");
    }

    @GetMapping("/getList")
    public List<ExampleVO> getList() {
        List<ExampleVO> list = new ArrayList<>();
        list.add(new ExampleVO(1, "홍길동", "010-1234-4896"));
        list.add(new ExampleVO(2, "김철수", "010-1685-4586"));
        list.add(new ExampleVO(3, "나훈아", "010-5642-5683"));
        return list;
    }

    @GetMapping(value = "/getMap", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, ExampleVO> getMap() {
        Map<String, ExampleVO> map = new HashMap<>();
        map.put("FIRST", new ExampleVO(1, "한덕수", "010-5554-6565"));

        return map;
    }

}
