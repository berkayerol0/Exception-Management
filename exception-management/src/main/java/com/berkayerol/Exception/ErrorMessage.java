package com.berkayerol.Exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorMessage {

   private MessageType messageType;

   private String ofStatic; //Manuel verilebilecek olan bir değer için bunu oluşturdum.

   public String prepareErrorMessage() {
       StringBuilder stringBuilder = new StringBuilder();
       stringBuilder.append(messageType.getMessage());
       if(ofStatic!=null) {
           stringBuilder.append(" : " + ofStatic);
       }

       return stringBuilder.toString();

   }
}
