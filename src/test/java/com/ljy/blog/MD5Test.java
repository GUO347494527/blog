package com.ljy.blog;

import com.ljy.blog.admin.utils.MD5;
import org.junit.Test;

import java.security.NoSuchAlgorithmException;
import java.util.UUID;

public class MD5Test {

    @Test
    public void test() throws NoSuchAlgorithmException {
        String text = "li19961213";
        UUID uuid = UUID.randomUUID();
        System.out.println(uuid.toString());
        String md5String = MD5.md5(text + uuid.toString());
        System.out.println(md5String);
        System.out.println(MD5.checkPassword(text + "959b557c-5a8e-4362-99ef-1344e4db72fc", "omb+V/PuKpz9ocFd3HTklQ=="));
    }
}
