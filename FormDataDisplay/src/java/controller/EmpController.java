
package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;
import model.Employee;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.*;
@Controller
public class EmpController {
    static   List<Employee> lst=new  ArrayList<Employee>();
    @RequestMapping("emp")
    public ModelAndView sampleview(){
    return new ModelAndView("jsp/EmpView","command",new Employee());
    }
      @RequestMapping("student")
    public ModelAndView StudentView(){
    return new ModelAndView("demo/StudentView");
    }
    
    @RequestMapping(value = "/save" , method = RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("e") Employee e ){
  lst.add(e);
  return new ModelAndView("jsp/display","lst",lst);
    }
    
}
