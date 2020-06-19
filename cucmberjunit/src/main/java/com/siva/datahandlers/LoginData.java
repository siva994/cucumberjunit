package com.siva.datahandlers;

import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

public class LoginData {

String user="";
String pswd="";

    public String getUser() {
        return user;
    }



    public String getPswd() {
        return pswd;
    }



   public LoginData(Map<String,String> map)
   {

       this.user=map.get("user");
       this.pswd=map.get("pswd");

   }

}
