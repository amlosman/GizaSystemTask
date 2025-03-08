package Endpoints;

import org.apache.http.annotation.Contract;

public enum  EndPoints{
    PetByIdEndPoint("/pet/{petId}"),
    PetByStatusEndPoint("/pet/findByStatus"),
    PetEndPoint("/pet");
   public String value;
    EndPoints(String value) {
        this.value= value;
    }
}
