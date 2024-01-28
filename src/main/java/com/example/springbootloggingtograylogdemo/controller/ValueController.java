package com.example.springbootloggingtograylogdemo.controller;

import com.example.springbootloggingtograylogdemo.service.ValueService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
@RequiredArgsConstructor
public class ValueController {

  private final ValueService valueService;

  @GetMapping("/values/odd/next")
  public ResponseEntity<Integer> nextOddValue() {
    return ResponseEntity.ok(valueService.nextOdd());
  }

}
