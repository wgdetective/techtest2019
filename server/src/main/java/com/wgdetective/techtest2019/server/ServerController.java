package com.wgdetective.techtest2019.server;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController {
    @GetMapping("calcFibo")
    public ResponseEntity<Long> calcFibo(@RequestParam final int number) {
        if (number >= 0 && number <= 20) {
            return ResponseEntity.ok(fibo(number));
        } else {
            return ResponseEntity.badRequest().body(0L);
        }
    }

    private long fibo(final int number) {
        if (number == 0 || number == 1) {
            return 1;
        } else {
            return fibo(number - 1) + fibo(number - 2);
        }
    }
}
