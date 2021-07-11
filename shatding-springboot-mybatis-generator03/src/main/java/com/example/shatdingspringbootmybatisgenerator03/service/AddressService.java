package com.example.shatdingspringbootmybatisgenerator03.service;


import com.example.shatdingspringbootmybatisgenerator03.entity.Address;
import com.example.shatdingspringbootmybatisgenerator03.mapper.AddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private AddressMapper addressMapper;

    public void save(Address address){
        this.addressMapper.save(address);
    }

    public Address get(Long id){
        Address address = this.addressMapper.get(id);
        return address;
    }

}
