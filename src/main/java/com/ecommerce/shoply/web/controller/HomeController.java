package com.ecommerce.shoply.web.controller;


import com.ecommerce.shoply.data.model.Product;
import com.ecommerce.shoply.service.ProductService;
import com.ecommerce.shoply.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    ProductService productServiceImpl;

    @GetMapping("/index")
    public String getIndex(Model model){
        List<Product> productList = productServiceImpl.findAll();
        model.addAttribute("products", productList);
        return "index";
    }

    @GetMapping("/about")
    public String getAbout(){
        return "about";
    }

    @GetMapping("/single/{id}")
    public ModelAndView getSingle(@PathVariable("id") Long id){
        ModelAndView modelAndView = new ModelAndView("single");
        Product product = productServiceImpl.findById(id);
        modelAndView.addObject("product",product);
        return modelAndView;
    }

    @GetMapping("/products")
    public String getProduct(){
        return "product";
    }

    @GetMapping("/services")
    public String getServices(){
        return "services";
    }

    @GetMapping("/single")
    public String getSingle(){
        return "single";
    }

    @GetMapping("/contact")
    public String getContact(){
        return "contact";
    }
}
