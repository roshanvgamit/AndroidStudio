package com.example.studentdetails;

import android.media.session.MediaController;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<ModelClass> studentsList;

    public Adapter (List<ModelClass>studentsList)
    {
        this.studentsList=studentsList;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.design,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {

        int resource=studentsList.get(position).getImageview1();
        String name=studentsList.get(position).getTextview1();
        String line=studentsList.get(position).getDivider();

        holder.setData(resource,name,line);

    }

    @Override
    public int getItemCount() {
        return studentsList.size();

    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;
        private TextView textView1;
        private TextView divider;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.imageview);
            textView1=itemView.findViewById(R.id.textview1);
            divider=itemView.findViewById(R.id.divider);

        }

        public void setData(int resource, String name, String line) {

            imageView.setImageResource(resource);
            textView1.setText(name);
            divider.setText(line);

        }
    }
}
