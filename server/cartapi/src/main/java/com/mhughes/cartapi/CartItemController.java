// A controller to allow interactivity with the model and database
package com.mhughes.cartapi;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartItemController {
  @Autowired
  private CartItemRepository repository;

  @GetMapping("/api/cartitems")
  public ResponseEntity<Iterable<CartItem>> getItems() {
    List<CartItem> items = repository.findAll();

    // check to see if there is anything in your list
    if(items.isEmpty()){
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    return new ResponseEntity<Iterable<CartItem>>(items, HttpStatus.OK);
  }

  @DeleteMapping("/api/cartitems/{id}")
  public ResponseEntity<CartItem> deleteItem(@PathVariable int id){
    // check to see if the item actually exists first
    Optional<CartItem> item = repository.findById(id);
    
    if(item == null) {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    repository.deleteById(id);
    return new ResponseEntity<CartItem>(item.get(), HttpStatus.OK);
  }

  @PostMapping("/api/cartitems")
  public ResponseEntity<CartItem> addItem(@RequestBody CartItem item){
    CartItem addedItem = repository.save(item);
    return new ResponseEntity<CartItem>(addedItem, HttpStatus.OK);
  }
}
