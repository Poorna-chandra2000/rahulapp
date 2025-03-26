package com.rahul.rahulapp.Services;

import com.rahul.rahulapp.Entities.Info;
import com.rahul.rahulapp.Repositories.InfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoServices {

    @Autowired
    InfoRepo infoRepo;

    public Info createInfo(Info info) {
        Info info1=infoRepo.save(info);
        return info1;
    }

    public Info getbyid(Long id) {
        Info info=infoRepo.findById(id).orElse(null);
        return info;
    }

    public String deletebyid(Long id) {
        if(infoRepo.existsById(id)){
            infoRepo.deleteById(id);
            return "Deleted id:"+id+"successfully";
        }

      return "Deletion failed or id not found";
    }


}
