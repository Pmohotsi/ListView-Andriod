package com.example.polokomohotsi.listviewexample2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView lvProducts;
ArrayList<Product>products;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvProducts = findViewById(R.id.lvProducts);
        products = new ArrayList<Product>();

        Product product1 = new Product("Dell Latitude 3500","The world's most secure laptop, for business and personal use","Laptop",15003.93,true);
        Product product2 = new Product("Acer Aspire 7","Most powerful laptop in the wold, ideal for business and personal use","Laptop",22003.93,false);
        Product product3 = new Product("SANDISK 16 Gb Cruzer","The world's most secure laptop, for business and personal use","Memory",5003.33,true);
        Product product4 = new Product("Verbatim 1TB","The world's most secure laptop, for business and personal use","HDD",150,false);

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);

        ProductAdapter adapter = new ProductAdapter(this, products);
        lvProducts.setAdapter(adapter);
    }
}
