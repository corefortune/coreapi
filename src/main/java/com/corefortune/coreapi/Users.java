package com.corefortune.coreapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Users {

   /*  @Autowired
    Usercontroller usercontroller; */
    public static ArrayList<Usercontroller> data = new ArrayList<Usercontroller>();

    static{
        data.add(new Usercontroller(2,"nagaraju", 22));
        data.add(new Usercontroller(1,"nagaraj",26));
        
    }

    @GetMapping("/users")
    public List<Usercontroller> usersdata(){
        return data;

    }
    @GetMapping("/findone/{id}")
    public Usercontroller usersdata1(@PathVariable int id){
        for(Usercontroller u : data){
            if(u.getId()==id){
                return u;
        }


        }
return null;
    }


    @PostMapping("/users")
    public void adduser(@RequestBody Usercontroller u){

        if(u.getId()==null){
            int size=data.size();
            size=size+1;
            u.setId(size);
            data.add(u);
       
        }
    }


    @PutMapping("/updateuser/{id}")

    public void putuser(@PathVariable int id ,@RequestBody Usercontroller u){

    
        for (Usercontroller u1 : data) {
            if(u1.getId()==id){
            u1.setName(u.getName());
            u1.setAge(u.getAge());
            
            }
               
            }
                
                   }

@DeleteMapping("deleteuser/{id}")

public void deleteuser(@PathVariable int id ,@RequestBody Usercontroller u){
    for (Usercontroller u1 : data) {
        if(u1.getId()==id){
        data.remove(u1);
        
        }
           
        }
    }



}