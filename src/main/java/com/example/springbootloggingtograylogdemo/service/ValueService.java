package com.example.springbootloggingtograylogdemo.service;

import java.util.Random;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ValueService {

  private final Random random = new Random();

  public int nextOdd() {
    final var nextInt = random.nextInt(50);
    if (nextInt % 2 == 0) {
      throw new IllegalArgumentException("Generated value is not odd");
    }
    return nextInt;
  }

}
