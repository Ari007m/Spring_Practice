package com.example.demo.controller;

import com.example.demo.config.ComponentLearning;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/annotation")
public class AnnotationController {

    private final ComponentLearning componentLearning;

    private AnnotationController(ComponentLearning componentLearning){
        this.componentLearning = componentLearning;
    }

    @GetMapping("/component")
    public String componentTest(){
        componentLearning.print();
        return "Called component";
    }


}
