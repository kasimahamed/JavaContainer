package application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class SampleController 
{
    @FXML
	    private TextArea txt;

    @FXML
    private Button Submit;
    
    @FXML
    private Button Exit;
    
    ArrayList al=new ArrayList();
    @FXML
    void Onclick_S(ActionEvent event) 
    {
    	char ans;
    	String A=txt.getText();
    	if(al==null)
    	{
    		al.add(A);
    	}
    	if(al!=null)
    	{
    		al.add(A);
    	}
        JSONArray array = new JSONArray();
        array.add(al);
      
        try {
           FileWriter file = new FileWriter("output.json");
           file.write(array.toJSONString());
           file.close();
         
           
        } catch (IOException e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
        }
        
    }	

    @FXML
    void Onclick_E(ActionEvent event) 
    {
         Platform.exit();
    }
    
}
