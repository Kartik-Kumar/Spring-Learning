package com.assignment.implementation;

import com.assignment.interfaces.Tyre;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("CrtBeans")
@Primary
public class CrtTyre implements Tyre {
    @Override
    public void rotate() {
        System.out.println("CRT tyre rotate");
    }
}
