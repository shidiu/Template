package com.wcc.bootjdbc.controller;

import com.wcc.bootjdbc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

/**
 * @Author：wcc
 * @Description：
 * @Date：Create in: 2018/10/11--9:34
 */
@RestController
@RequestMapping("/User")
public class UserController {

    @Autowired
    private UserService us;

    @RequestMapping("/Login.do")
    public ModelAndView Login(HttpServletRequest request, HttpServletResponse response){
        ModelAndView mav=new ModelAndView("succ.html");
        String id = request.getParameter("id");
        String pwd = request.getParameter("pwd");
        HashMap<String,String> map=new HashMap<String, String>();
        map.put("id",id);
        map.put("pwd",pwd);
        String name=us.getname(map);
        mav.addObject("res","欢迎:"+name+"登陆");
        return  mav;
    }
}
