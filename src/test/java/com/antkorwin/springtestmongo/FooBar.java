package com.antkorwin.springtestmongo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
@AllArgsConstructor
@NoArgsConstructor
@Data
public class FooBar {

    @Id
    private String id;

    private String data;

    private Bar bar;
}