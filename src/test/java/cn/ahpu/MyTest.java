package cn.ahpu;

import com.itheima.reggie.entity.Category;
import org.junit.jupiter.api.Test;

public class MyTest {


    //Category(id=null, type=null, name=null, sort=null, createTime=null, updateTime=null, createUser=null, updateUser=null)
    @Test
    public void test01(){
        Category category = new Category();
        System.out.println(category);
    }
}
