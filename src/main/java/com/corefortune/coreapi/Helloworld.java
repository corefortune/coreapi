
package com.corefortune.coreapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld
{
   @RequestMapping("/greeting")
   public String helloworld()
   {
return "hello nag";
   }
}
