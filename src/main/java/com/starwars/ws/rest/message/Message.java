package com.starwars.ws.rest.message;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Message {

	public Message() {
		
	}

	public static String getMessage( ArrayList<String> message1, ArrayList<String> message2, ArrayList<String> message3)
	{
        ArrayList<String> messageOne = message1;
        ArrayList<String> messageTwo = message2;
        ArrayList<String> messageThr = message3;
        
        List<String> message = new ArrayList<String>();
        List<String> merge = new ArrayList<String>();
        
        for (int i = 0; i < Math.max(messageOne.size(), messageTwo.size()); i++) {
        	if (i < messageOne.size())
        		message.add(messageOne.get(i));
        	if (i < messageTwo.size())
        		message.add(messageTwo.get(i));
        }
        
        for (int i = 0; i < Math.max(message.size(), messageThr.size()); i++) {
        	if (i < message.size())
        		merge.add(message.get(i));
        	if (i < messageThr.size())
        		merge.add(messageThr.get(i));
        }
        
        merge = removeDuplicates(merge);    
              
        String listString = "";

        for (String s : merge)
        {
            listString += s + " ";
        }
        
        return listString;
	}
	
	public static ArrayList removeDuplicates(List<String> message)
	{
	       ArrayList <String> outArray = new ArrayList();
	       boolean doAdd = true;
	       for (int i = 0; i < message.size(); i++)
	       {
	           String testString = message.get(i);
	           for (int j = 0; j < message.size(); j++)
	           {
	               if (i == j)
	               {
	                   break;
	               }
	               else if (message.get(j).equals(testString))
	               {
	                   doAdd = false;
	                   break;
	               }

	           }
	           if (doAdd)
	           {
	               outArray.add(testString);
	           }
	           else
	           {
	               doAdd = true;
	           }

	       }
	       return outArray;

	}
}
