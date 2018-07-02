

package controller;

import dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import model.Student;
import java.util.*;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class StudentController {
    
    
    @Autowired
    StudentDao sd;
    
    @RequestMapping("add")
    public ModelAndView addstudent(){

    ModelAndView md=new ModelAndView("student/AddStudent");
      
  List<Student>lst=sd.GetAllStudents();
    md.addObject("lst",lst);
    String msg="";
    md.addObject("msg",msg);
      Student s=new Student();
    md.addObject("command",s);
    return md;
    }
    
    
    @RequestMapping(value = "add" , method = RequestMethod.POST)
public ModelAndView save(@ModelAttribute("s") Student s){
sd.AddStudent(s);
   ModelAndView md=new ModelAndView("student/AddStudent");
String msg="Record inserted successfully";
md.addObject("msg",msg);
 List<Student>lst=sd.GetAllStudents();
  md.addObject("lst",lst);
  Student st=new Student();
  md.addObject("command",st);

    return md;
}
    }
