package com.berkayerol.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RootEntity<T> {

    private boolean result;

    private String errorMessage;

    private T data;

    //success
    public static <T> RootEntity<T> ok(T data) {
        RootEntity<T> rootEntity = new RootEntity<>();
        rootEntity.setData(data);
        rootEntity.setResult(true);
        rootEntity.setErrorMessage(null);
        return rootEntity;
    }

    //failure
    public static <T> RootEntity<T> error(String errorMessage) {
        RootEntity<T> rootEntity = new RootEntity<>();
        rootEntity.setData(null);
        rootEntity.setResult(true);
        rootEntity.setErrorMessage(errorMessage);

        return rootEntity;

    }
}
