package com.posman.what2do.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ServiceResponse<T> {
    T result;
    String status;

    private final static String SUCCESS = "success";


    public ServiceResponse() {};
    public ServiceResponse(T result, String status) {
        this.result = result;
        this.status = status;
    }

}
