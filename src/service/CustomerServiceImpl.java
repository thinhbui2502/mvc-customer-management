package service;

import model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {
    private static Map<Integer, Customer> customers;

    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1, "Thinh","thinhbui2502@gmail.com", "Chicago"));
        customers.put(2, new Customer(2, "Linh","linh123@gmail.com", "Tokyo"));
        customers.put(3, new Customer(3, "Binh","binh123@gmail.com", "Berlin"));
        customers.put(4, new Customer(4, "Huynh","huynh123@gmail.com", "Rio"));
        customers.put(5, new Customer(5, "Quy","quy123@gmail.com", "New York"));
        customers.put(6, new Customer(6, "Tuan","tuan123@gmail.com", "Paris"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(),customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id,customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}
