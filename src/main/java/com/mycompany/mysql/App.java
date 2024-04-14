package com.mycompany.mysql;

import java.util.List;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class App extends Application {

    @Override
    public void start(Stage stage) {

        student st1 = new student();
        st1.setId(1);
        st1.setFirstName("Khaled");
        st1.setLastName("Abdullah");
//retrive student list
  Session session = HibernateUtil.getSessionFactory().openSession();
 List<student> sList = null;
 String queryStr = "from Student";
 Query query = session.createQuery(queryStr);
 sList = query.list();
 session.close();
 System.out.println("student list size: "+sList.size());
 for(student s: sList)
 {
 System.out.println(s.getFirstName()+" "+s.getLastName());
 }
       

        var label = new Label("inserted Student:");
        var scene = new Scene(new StackPane(label), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
