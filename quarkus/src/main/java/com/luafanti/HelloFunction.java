package com.luafanti;

import io.quarkus.funqy.Funq;
import io.quarkus.logging.Log;

public class HelloFunction {

    @Funq
    public String hello() {
        Log.info("Info logging");
        return "Hello Quarkus Lambda";
    }
}
