package com.rahul.rahulapp.Controllers;


import com.rahul.rahulapp.Entities.Info;
import com.rahul.rahulapp.Services.InfoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rahul")
public class InfoController {

    @Autowired
    InfoServices infoServices;

    //GetMapping
    //PostMapping //@RequestBody
    //DeleteMapping


    //PutMapping //update
    //PatchMapping
//    {
//        id:1,
//        name:"poorna"
//    }

    @PostMapping
    Info createInfo(@RequestBody Info info ){

        return infoServices.createInfo(info);
    }

    @GetMapping("/{id}")
    Info getInfobyId(@PathVariable Long id){

        return infoServices.getbyid(id);
    }

     @GetMapping//get all
    List<Info> getall(){
        return infoServices.getall();
    }
    
    @DeleteMapping("/{id}")
    String deleteInfobyId(@PathVariable Long id){

        return infoServices.deletebyid(id);
    }

    @PutMapping("/{id}")
    String deleteInfobyId(@PathVariable Long id,@RequestBody Info info){

        return infoServices.updatebyid(id,info);
    }

}
