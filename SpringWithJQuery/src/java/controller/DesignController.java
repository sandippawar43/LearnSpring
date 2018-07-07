
package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DesignController {
    
    @RequestMapping("view")
     @ResponseBody
    public ModelAndView dipslayView()
    {
        return new ModelAndView("jsp/index");
    }
    
    @RequestMapping("math/{n1}/{n2}")
    @ResponseBody
    public String MultiplyNumber(@PathVariable("n1")int n1, @PathVariable("n2")int n2)
    {
        return "Mutiplication ="+n1*n2;
    }
    
}
