package com.neilren.neilren4j.dbentity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class TArticle implements Serializable {
    private static final long serialVersionUID = -7898194272883238670L;
    private Long id;

    private Integer source;

    private Long views;

    private Date date;

    private Integer status;

    private String sourceUrl;

    private String author;

    private String authorUrl;

    private String title;

    private String keyword;

    private String describes;

    private String content;

    private String img;
}