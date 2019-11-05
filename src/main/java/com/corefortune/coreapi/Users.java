package com.corefortune.coreapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@Controller
public class Users {

   /*  @Autowired
    Usercontroller usercontroller; */
    public static ArrayList<Usercontroller> data = new ArrayList<Usercontroller>();

    static{
        data.add(new Usercontroller(2,"nagaraju", 22));
        data.add(new Usercontroller(1,"nagaraj",26));
    }

    @GetMapping("/allusers")
    public List<Usercontroller> usersdata(){
        return data;

    }

    public ArrayList<Usercontroller> findall()
    {
        return data;
    }

    public Usercontroller save(Usercontroller u){
        if(u.getId()==null){
            int size=data.size();
            size=size+1;
            u.setId(size);
            data.add(u);
       
        }
        return u;
    }


    public Usercontroller findone(int number){

        for(Usercontroller u : data){
            if(u.getId()==number){
                System.out.println(number);
                return u;
        }


        }
return null;
    }
    




}