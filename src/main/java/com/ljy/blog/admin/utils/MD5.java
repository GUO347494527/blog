package com.ljy.blog.admin.utils;


import sun.misc.BASE64Encoder;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {

    public static String md5(String text) throws NoSuchAlgorithmException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        BASE64Encoder base64Encoder = new BASE64Encoder();
        return base64Encoder.encode(md5.digest(text.getBytes(StandardCharsets.UTF_8)));
    }

    public static boolean checkPassword(String newPassword, String oldPassword) throws NoSuchAlgorithmException {
        return md5(newPassword).equals(oldPassword);
    }
}
