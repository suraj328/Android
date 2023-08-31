package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.myapplication.product.Product;
import com.example.myapplication.product.ProductAdapter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TextView textView1;
    private RecyclerView recyclerView;
    List<Product> productList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        productList = new ArrayList<>();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.recyclerView = findViewById(R.id.recyclerBox);
        final String url = "https://dummyjson.com/products";
        RequestQueue queue = Volley.newRequestQueue(this);
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    JSONArray jsonArray = response.getJSONArray("products");
                    for (int i = 0; i < jsonArray.length(); i++) {

//                    Log.d("res",jsonArray.toString());
                        JSONObject jsonObject = jsonArray.getJSONObject(i);
                        String title = jsonObject.getString("title");
                        String desc = jsonObject.getString("description");
                        String category = jsonObject.getString("category");
                        int price = jsonObject.getInt("price");
                        Product product = new Product(title,desc,category);
                        productList.add(product);
                    }
                } catch (JSONException e) {
                    Log.d("e",e.toString());
                    throw new RuntimeException(e);
                }
            }

        },new Response.ErrorListener(){
            public void onErrorResponse(VolleyError error){
                Log.d("error",error.toString());
                error.printStackTrace();
            }
        });
        queue.add(jsonObjectRequest);
        ProductAdapter adapter = new ProductAdapter(this.productList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        recyclerView.setAdapter(productAdapter);
        this.recyclerView.setAdapter(adapter);

    }
}