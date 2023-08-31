package com.example.myapplication.product;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

//import com.example.myapplication.R;

import com.example.myapplication.R;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {
    private  List<Product> productList;
    public ProductAdapter(List<Product> productList){
        this.productList = productList;
    }
    public class ProductViewHolder extends RecyclerView.ViewHolder{
        private TextView textView1,textView2,textView3 ;
        ProductViewHolder(View view){
            super(view);
            this.textView1 = view.findViewById(R.id.textView1);
            this.textView2 = view.findViewById(R.id.textView2);
            this.textView3 = view.findViewById(R.id.textView3);
        }
    }
    public ProductViewHolder onCreateViewHolder(ViewGroup viewGroup,int viewType){
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.product_item,viewGroup,false);
        return new ProductViewHolder(view);
    }
    public void onBindViewHolder(ProductViewHolder holder,int position){
        Product product = (Product)  productList.get(position);
        Log.d("title", product.getTitle());
        holder.textView1.setText(product.getTitle());
        holder.textView2.setText(product.getCategory());
        holder.textView3.setText(product.getDesc());
    }
    public int getItemCount(){
        return productList.size();
    }
}
