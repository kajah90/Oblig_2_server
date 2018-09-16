/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.obligproject.chatprojectoblig2.resources;

import com.obligproject.chatprojectoblig2.service.AllMessages;
import com.obligproject.chatprojectoblig2.entity.Message;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Kajah
 */
@Path("messages")
public class MessageResources {
    
    AllMessages messages = new AllMessages();
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Message> getMessages() {  
        
        return messages.getAllMessages();      
    }
    
}
