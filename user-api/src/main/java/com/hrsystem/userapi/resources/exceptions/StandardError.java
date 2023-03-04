package com.hrsystem.userapi.resources.exceptions;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class StandardError {
    
    private LocalDateTime timestamp;
    private String error;
    private Integer status;
    private String path;


}
