/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.obligproject.chatprojectoblig2.service;

import com.obligproject.chatprojectoblig2.entity.Message;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kajah
 */
public class AllMessages {

    public AllMessages() {
    }
    
    
    public  List<Message> getAllMessages(){
        
        Message m1 = new Message(50, "SKA VI SJÅ!", "kj");
        Message m2 = new Message(52, "SKA VI gå!", "harald");
        List<Message> list = new ArrayList<>();
        list.add(m1);
        list.add(m2);
        return list;
    
    }
    
}
