package com.logistics.inventorySystem.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class APIResponse<T> {
    public int statusCode;

    public String message;

    public List<T> data;

    public APIResponse(int statusCode, String message){
        this.statusCode = statusCode;
        this.message = message;
    }

    public APIResponse(int statusCode, List<T> data){
        this.statusCode = statusCode;
        this.data = data;
    }
}

