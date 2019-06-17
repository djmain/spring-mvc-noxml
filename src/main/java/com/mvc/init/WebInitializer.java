package com.mvc.init;

import com.mvc.config.MyMvcConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;


import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * created by Jay on 2019/6/17
 */
public class WebInitializer implements WebApplicationInitializer
{
    @Override
    public void onStartup(javax.servlet.ServletContext servletContext) throws ServletException
    {
        System.out.println("executing onStartup");
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(MyMvcConfig.class);
        context.setServletContext(servletContext);
        ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(context));
        servlet.addMapping("/");
        servlet.setLoadOnStartup(1);
    }
}
