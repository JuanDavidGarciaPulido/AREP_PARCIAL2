package org.example;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/proxy")
public class ProxyService {

    private final HttpConnectionExample httpConnectionExample;

    public ProxyService(HttpConnectionExample httpConnectionExample){
        this.httpConnectionExample = httpConnectionExample;
    }

    @GetMapping("/linearsearch")
    public ResponseEntity<String> linearsearch (@RequestParam int[] list, @RequestParam int value){
        return httpConnectionExample.linearSearch(list, value);
    }

    @GetMapping("/binarysearch")
    public ResponseEntity<String> binarySearch (@RequestParam int[] list, @RequestParam int value){
        return httpConnectionExample.binarySearch(list, value);
    }

}
