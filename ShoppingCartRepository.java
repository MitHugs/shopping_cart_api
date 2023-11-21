// here are a few methods that will interact with the database
// With spring boot, this repository would extend the spring library's crud repository

// this is also where the library would connect to the database to grab from an entity's table

import java.util.ArrayList;

public class ShoppingCartRepository {

  public ResponseItem addItem(CartItem item) { 
    // this is where we would add the item to the database
    // the response number would be dependent on if the add was successful 
    int response = 0;
      
    return new ResponseItem(response, item);
  };

  public ResponseItem getItems() {
    // this is where we would get the list of items from the table
    // when connected to a database, it would grab all of the item objects
    ArrayList<CartItem> items = new ArrayList<CartItem>(); 
    int response = 0;

    return new ResponseItem(response, items);
  }
  
    public ResponseItem removeItem(CartItem item) {
    // this is where we would delete the item from the table
    // the response number would be dependent on if the delete was successful
    int response = 0;

    return new ResponseItem(response, item);
  }
}

