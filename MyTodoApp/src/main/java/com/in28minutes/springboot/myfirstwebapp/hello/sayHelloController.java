package com.in28minutes.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class sayHelloController {
    //Create a url as  "say-hello" => response will be  "Hello! what are you learning today"

    //localhost:8080/say-hello
    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello(){
        return "Hello! what are you learning today?";
    }


    //localhost:8080/say-hello
    @RequestMapping("say-hello-html")
    @ResponseBody
    public String sayHelloHtml(){
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>My first HTML page</title>");
        sb.append("</head>");
        sb.append("<h1>My first HTML page with Body</h1>");
        sb.append("</body>");
        sb.append("</html>");
        return sb.toString();
    }

    //localhost:8080/say-hello-jsp
    @RequestMapping("say-hello-jsp")
    public String sayHelloJsp(){
        return "sayHello";
    }
}
