package com.example.shatdingspringbootmybatisgenerator01.controller;


import com.example.shatdingspringbootmybatisgenerator01.entity.Address;
import com.example.shatdingspringbootmybatisgenerator01.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @RequestMapping("/save")
    public String save(){
        for (int i = 0; i <10 ; i++) {
            Address address=new Address();
            address.setCode("code_"+i);
            address.setName("name_"+i);
            address.setPid(i+"");
            address.setType(0);
            address.setLit(i%2==0?1:2);
            addressService.save(address);
        }
        return "success";
    }

    @RequestMapping("/get")
    public Address get(Long id){
        Address address = this.addressService.get(id);
        return address;
    }

}
