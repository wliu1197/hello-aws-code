package com.hello.aws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class HelloController {
    //whenever we push code to github AWS CodePipeline will detect it and build the image to ECR
    //then CodeDeploy will fetch image runs image in ECS service with 2 tasks running for this MS
    //Application Load balancer is applied to this running tasks
    @GetMapping(path = "/hello")
    public String sayHello(){
        return "Hello world AWS CodePipeline CI/CD auto deploy let's do it";
    }
}
