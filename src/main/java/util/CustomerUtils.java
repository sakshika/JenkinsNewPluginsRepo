package util;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

import bean.Customer;

/**
 * Static util class for demo only - not for prod environment
 * This is not a good way to code but a service layer should call a dao
 * 
 * @author java
 *
 */
public class CustomerUtils {
  private static Map<String,Customer> sampleCustomers;
  
  //dummy data
  static {
    sampleCustomers = new LinkedHashMap<String,Customer>();
    sampleCustomers.put("a1234", 
      new Customer("a1234", "Jos", "Gosse", 12345.67));
    sampleCustomers.put("a1235", 
        new Customer("a1235", "Ann", "Geubels", 45678.90));
    sampleCustomers.put("a1236", 
        new Customer("a1236", "Michael", "X", -123.45));
  }
  
  public static Map<String,Customer> getSampleCustomers() {
    return(sampleCustomers);
  }
  
  /** Given an id, returns either the corresponding Customer
   *  object or null. Real ids are in lower case, but this
   *  accepts input in any case.
   */
  public static Customer getCustomer(String id) {
    if (id == null) {
      id = "unknown";
    }
    return(sampleCustomers.get(id.toLowerCase()));
  }
}
