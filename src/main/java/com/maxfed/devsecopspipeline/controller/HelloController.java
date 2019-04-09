/**
 * 
 */
package com.maxfed.devsecopspipeline.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author srikanth.maximus
 *
 */
@RestController()
@RequestMapping("/hello")
public class HelloController {

  @GetMapping("/")
  public ResponseEntity<String> hello() {
    return new ResponseEntity<String>("Hello World", HttpStatus.OK);
  }

  @GetMapping("/{guestName}")
  public ResponseEntity<String> hello(@PathVariable String guestName) {
    return new ResponseEntity<String>("Hello " + guestName + "!", HttpStatus.OK);
  }
  
  @GetMapping("/world/{guestName}")
  public ResponseEntity<String> helloWorld(@PathVariable String guestName) {
    return new ResponseEntity<String>("Hello " + guestName + "!", HttpStatus.OK);
  }
}
