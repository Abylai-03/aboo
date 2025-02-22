package kz.enu.restvt.restexample.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import kz.enu.restvt.restexample.entities.Music_Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {
    @Autowired
    ObjectMapper objectMapper;


     @GetMapping("/hello")
    public String printHello() {
         return "Hello World";
     }

     @GetMapping("/musicdatas")
    public String musicListener() {
         String jsonText=null;
         Music_Library mus1 =new Music_Library(210121, 18, "NDA", "HAPTNEVER");

         try {
             jsonText = objectMapper.writeValueAsString(mus1);

         }catch(JsonProcessingException e) {
             System.out.println("Smth goes wrong "+e.getMessage());
         }
         return jsonText;
     }
     @PostMapping("/specific_Music_library")
    public String musicListener2(@RequestParam int data,
                                 @RequestParam int a,
                                 @RequestParam String fitname,
                                 @RequestParam String pllist

                                 ) {
         String jsonText=null;
         Music_Library mus1 =new Music_Library(data,a, fitname, pllist);

         try {
             jsonText = objectMapper.writeValueAsString(mus1);

         }catch(JsonProcessingException e) {
             System.out.println("Smth goes wrong "+e.getMessage());
         }

         return jsonText;
     }
    @PostMapping("/specific_Music_library2")
    public String musicListener3(@RequestBody Music_Library mus1){
        String jsonText=null;


        try {
            jsonText = objectMapper.writeValueAsString(mus1);

        }catch(JsonProcessingException e) {
            System.out.println("Smth goes wrong "+e.getMessage());
        }

        return jsonText;
    }
    @PostMapping("/specific_Music_library3/{data}")
    public String musicListener4(@PathVariable int data){
        String jsonText=null;
        Music_Library mus1 =new Music_Library(data, 18, "NDA", "HAPTNEVER");


        try {
            jsonText = objectMapper.writeValueAsString(mus1);

        }catch(JsonProcessingException e) {
            System.out.println("Smth goes wrong "+e.getMessage());
        }

        return jsonText;
    }
}
