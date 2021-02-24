package com.demo;

import java.security.Key;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

public class Jwt {
    public static void main(String[] args) {
        Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);
        String jwt = Jwts.builder().setSubject("wzh").signWith(key).compact();
        System.out.println(jwt);
        String jwt1 = Jwts.builder().setSubject("111").compact();
        System.out.println(jwt1);
    }
}
