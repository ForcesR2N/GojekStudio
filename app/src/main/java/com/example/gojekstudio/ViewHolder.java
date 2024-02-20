package com.example.gojekstudio;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView nameView, absenView;
    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imgView);
        nameView = itemView.findViewById(R.id.txtname);
        absenView = itemView.findViewById(R.id.txtAbsen);

    }
}
