package com.xlrainy;

import com.xlrainy.domain.User;
import com.xlrainy.domain.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Transactional
public class ApplicationTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    @Rollback
    public void test(){
        userMapper.insert("xlrainy",17);
        User user = userMapper.findByName("xlrainy");
        if (user == null){
            System.out.println("no user exists！");
            return;
        }
        System.out.println(user);
        Assert.assertEquals(17,user.getAge());
    }
}
