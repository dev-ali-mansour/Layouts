package dev.alimansour.layouts;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Layouts Android Application developed by: Ali Mansour
 * Copyright © 2020 Ali Mansour. All Rights Reserved.
 * This file may not be redistributed in whole or significant part.
 * ----------------- Layouts IS FREE SOFTWARE ------------------
 * https://www.alimansour.dev   |   dev.ali.mansour@gmail.com
 */
public class UsersAdapter extends RecyclerView.Adapter<UsersAdapter.UserViewHolder> {
    private List<User> users;

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.list_item, parent, false);
        UserViewHolder viewHolder = new UserViewHolder(listItem);
        return viewHolder;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        final User currentUser = users.get(position);
        holder.bind(currentUser);
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public void setDataSource(List<User> users) {
        this.users = users;
        notifyDataSetChanged();
    }

    static class UserViewHolder extends RecyclerView.ViewHolder {
        private TextView fullNameTextView, userNameTextView, emailTextView;
        private ImageView imageView;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            fullNameTextView = itemView.findViewById(R.id.fullNameTextView);
            userNameTextView = itemView.findViewById(R.id.userNameTextView);
            emailTextView = itemView.findViewById(R.id.emailTextView);
            imageView = itemView.findViewById(R.id.profileImage);
        }

        @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
        public void bind(User user) {
            fullNameTextView.setText(user.getFullName());
            userNameTextView.setText(user.getUserName());
            emailTextView.setText(user.getEmail());
            imageView.setImageDrawable(itemView.getContext().getDrawable(user.getImageResource()));
        }
    }
}
