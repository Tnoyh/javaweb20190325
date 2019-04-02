package com.neuedu.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /*  单个值！！请求数据的处理
          请求的数据还是使用getParamenter接收
         *   1：单选按钮请求的数据，对于单选按钮，我们在接收的时候，因为他只有一个值
         *   3:select请求的是一个数据
         *   4:多行文本
         *   5：隐藏字段的数据
         *      String sex=req.getParameter("sex");
         *
         * */
      /* String sex=req.getParameter("sex");
        System.out.println(sex);*/


        /**   多个值！请求数据的处理
         * req.getParameterValues  加了个词Values！ 多选按钮的处理
         *    后边的参数：依旧还是name的value值
         *    返回值：字符串数组
         *    进行输出的时候：先判断不为null，再进行输出
         *
         *
         *  2:多选按钮请求的数据的处理: 多个值传入进行的处理
         *
         *  3:select请求的是多个数据
         *
         *
         */
        String[] honnys=req.getParameterValues("honny");
        for(int i=0;honnys!=null&&i<honnys.length;i++){    //将这些值输出之前先判断存不存在，然后一个一个的输出
            System.out.println(honnys[i]);
        }



    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

}
