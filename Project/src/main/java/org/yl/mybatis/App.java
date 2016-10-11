package org.yl.mybatis;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.yl.mybatis.mapping.userMapper;
import org.yl.mybatis.pojo.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String resource = "mybatis.xml";
    	// 使用类加载器加载mybatis配置文件
    			InputStream is = App.class.getClassLoader().getResourceAsStream(resource);
    			// 构建sqlsession工厂
    			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);

    			SqlSession session = sessionFactory.openSession();
    			 
    			 
    			 userMapper um=session.getMapper(userMapper.class);
    			 //查看所有，使用接口的方法
    			List<User> a= um.getAllUsers();    			 
    			for(User x :a){
    				System.out.println(x);
    			}
       			 //增
//     			User u=new User();
//     			u.setEmail("333");
//     			u.setId(4);
//     			u.setName("王五");
//     			u.setPhone(777);
//     			um.insert(u);
    			 //查
    			 User us=um.selectByPrimaryKey(1);    			 
    			 System.out.println(us);   		
    			
    			 //改
    			 us.setPhone(666);
    			 um.updateByPrimaryKeySelective(us);
     			 System.out.println(us);
     			
    			session.commit();
    			
    }
}
