// this is the Controller in the MVC architecture
// this controller exposes methods that the client or other API can use to interact with data

public class ShoppingCartController {
  // spring supports the injection through @Autowired, but unfortunately I couldnt get it set up properly
  private ShoppingCartRepository repository = new ShoppingCartRepository();

  // POST data (add item)
  public ResponseItem addItem(CartItem item) {
    ResponseItem response = repository.addItem(item);

    return response;
  }

  // GET data (list items)
  public ResponseItem getItems() {
    ResponseItem response = repository.getItems();

    return response; 
  }

  // DELETE data (remove item)
  public ResponseItem removeItem(CartItem item) {
    ResponseItem response = repository.removeItem(item);

    return response;
  }
}
