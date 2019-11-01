package com.corefortune.coreapi;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class GreetingController{
private static final String Template="hello ,%s!";

private final AtomicLong counter = new AtomicLong();


    @RequestMapping("/hello-world")
    public Greeting displaydata(@RequestParam(value="name") String name)
    {
        return new Greeting(counter.incrementAndGet(),
        String.format(Template, name));
}

@RequestMapping("/hello-world1")
    public Greeting displaydata(@RequestParam(value="name") String name,@RequestParam(value="phonenumber") Long phno)
    {
        return new Greeting(counter.incrementAndGet(),
        String.format(Template, name),phno);
}
    

}
    
