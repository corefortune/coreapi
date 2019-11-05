package com.corefortune.coreapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Userrcontroller{
@Autowired
Users usr;

@GetMapping("/users")
public List<Usercontroller> usersdata(){
        return usr.findall();

}



    @GetMapping("/findone/{id}")
    public Usercontroller usersdata1(@PathVariable int id){
        return usr.findone(id);

    }


    @PostMapping("/users")
    public void adduser(@RequestBody Usercontroller u){

    
    Usercontroller uc=usr.save(u);
    }

}