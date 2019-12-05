package com.baizhi.cmfz.entity;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Banner {
    private String id;


    private String imgSrc;
    private String status;
    private String description;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date uploadTime;
}