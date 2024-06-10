package com.astratech.simple_api_2.utils;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class HelperUtil {


    public UUID getUUID(){
        return UUID.randomUUID();
    }

}
