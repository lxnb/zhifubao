package com.alipay;

import com.alipay.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ZhifubaoPayApplicationTests {

    @Test
    public void contextLoads() {
        User user=new User(1,"z行三","wdwad","aa");
        User user2=new User(1,"z行三","wdwad","aa");
        System.out.println(user.toString());
        System.out.println(user2.toString());
        System.out.println(user==user2);
        System.out.println(user.equals(user2));
        String s="abc";
        String s1="abc";
        System.out.println(s==s1);
        System.out.println(s.equals(s1));
    }

}
