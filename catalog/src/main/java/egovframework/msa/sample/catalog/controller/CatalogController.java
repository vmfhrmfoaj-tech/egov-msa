package egovframework.msa.sample.catalog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatalogController{

    @GetMapping(path="/")
    public String index(){
        return "Hellow index.html";
    }
}