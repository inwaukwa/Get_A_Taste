package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.StrictMode;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainActivity extends AppCompatActivity {

    private TextView textview;
    private static String ip = "10.7.31.244";
    private static String port = "1433";
    private static String Classes = "net.sourceforge.jtds.jdbc.Driver";
    private static String database = "testDatabase";
    private static String username = "test";
    private static String password = "dowen2009";
    private static String url = "jdbc:jtds:sqlserver://"+ip+":"+port+"/"+database;

    private Connection connection = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

//        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
//        StrictMode.setThreadPolicy(policy);
//
//        try {
//            Class.forName(Classes);
//            connection = DriverManager.getConnection(url, username, password);
//            textview.setText("SUCCESS");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//            textview.setText("ERROR");
//        } catch (SQLException e) {
//            e.printStackTrace();
//            textview.setText("FAILURE");
//        }

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    return false;
                }
            };
//
//    public void sqlButton(View view) throws SQLException {
//
//        if(connection != null) {
//
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery("Select * FROM employee;");
//            resultSet.next();
//                textview.setText(resultSet.getString("first_name"));
//
//        }
//        else {
//            textview.setText("Connection is null");
//        }
//
//    }

}