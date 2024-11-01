package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathServices {


    @GetMapping("/linearsearch")
    public ResponseEntity<Map<String, Object>> linearSearch (@RequestParam int[] list, @RequestParam int value){
        int result = -1;
        result = linearSearchMethod(list, value);
        Map<String, Object> response = new HashMap<>();
        response.put("operation", "linearSearch");
        response.put("list", list);
        response.put("value", value);
        response.put("output", result);

        return ResponseEntity.ok(response);
    }


    @GetMapping("/binarysearch")
    public ResponseEntity<Map<String, Object>> binarySearch (@RequestParam int[] list, @RequestParam int value){
        int result = -1;
        Arrays.sort(list);
        result = binarySearchMethod(list, value);

        Map<String, Object> response = new HashMap<>();
        response.put("operation", "BinarySearch");
        response.put("list", list);
        response.put("value", value);
        response.put("output", result);

        return ResponseEntity.ok(response);

    }

    private static int linearSearchMethod(int[] chainList, int value) {
        for (int i = 0; i < chainList.length; i++){
            if(chainList[i]==value){
                return i;
            }
        }
        return -1;
    }

    private static int binarySearchMethod(int[] chainList, int value) {
        int inicialIndex = 0;
        int finalIndex = chainList.length -1;

        while (inicialIndex <= finalIndex){
            int middleIndex = inicialIndex + (finalIndex - inicialIndex)/2;

            if (chainList[middleIndex] == value){
                return middleIndex;
            }else if (chainList[middleIndex] < value){
                inicialIndex = middleIndex + 1;
            }else{
                finalIndex = middleIndex -1;
            }
        }

        return -1;

    }




}

