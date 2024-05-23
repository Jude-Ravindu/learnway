/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learnway.model;

import javax.swing.Icon;

/**
 *
 * @author tehan
 */
public class Model_Admin_Card {
    
    private String User;
    private String Count;

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public String getCount() {
        return Count;
    }

    public void setCount(String Count) {
        this.Count = Count;
    }
    
    public Model_Admin_Card(String User, String Count) {
        this.User = User;
        this.Count = Count;
    }

    public Model_Admin_Card() {
    
    }
    
    
    
}
