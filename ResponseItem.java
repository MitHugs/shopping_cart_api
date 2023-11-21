// a helper class to define a response entity object
// Spring usually comes with one as a ResponseEntity.

import java.util.ArrayList;

public class ResponseItem {
  public int response;
  public CartItem item;
  public ArrayList<CartItem> items;

  public ResponseItem(int r, CartItem i) {
    response = r;
    item = i;
  }

  public ResponseItem(int r, ArrayList<CartItem> i) {
    response = r;
    items = i;
  }

}
