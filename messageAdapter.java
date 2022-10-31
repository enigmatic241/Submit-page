package com.example.chat_box;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class messageAdapter extends ArrayAdapter<chat_message> {
    public messageAdapter(Context context, int resource, List<chat_message> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = ((Activity) getContext()).getLayoutInflater().inflate(R.layout.message_box, parent, false);
        }

       TextView messageView = (TextView) convertView.findViewById(R.id.messageTextView);
       TextView nameView = (TextView) convertView.findViewById(R.id.nameTextView);
        ImageView photoImageView = (ImageView) convertView.findViewById(R.id.photoImageView);
        TextView messageTextView = (TextView) convertView.findViewById(R.id.messageTextView);
        TextView authorTextView = (TextView) convertView.findViewById(R.id.nameTextView);

        chat_message messageObject = getItem(position);

        boolean isPhoto = messageObject.mPhotoUrl != null;
        if (isPhoto) {
            messageTextView.setVisibility(View.GONE);
            photoImageView.setVisibility(View.VISIBLE);
            Glide.with(photoImageView.getContext())
                    .load(messageObject.mPhotoUrl)
                    .into(photoImageView);
        } else {
            messageTextView.setVisibility(View.VISIBLE);
            photoImageView.setVisibility(View.GONE);
            messageTextView.setText(messageObject.mMessage);//getMessage());
        }
        authorTextView.setText(messageObject.mUserName);
        if(convertView != NULL)
            return convertView;
        else 
            return NULL;


    }
    public static Connection dbConnection() {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection("jdbc:sqlite:/home/ayushman/Documents/BloodBank");
			//JOptionPane.showMessageDialog(null,"Connection Successful");
			return conn;
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			return null;
		}
	}
}
