package controller;

import dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import model.Student;
import java.util.*;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

    @Autowired
    StudentDao sd;

    @RequestMapping("add")
    public ModelAndView addstudent() {

        ModelAndView md = Execute();
        String msg = "Welcome to Spring CRUD Example";
        md.addObject("msg", msg);

        return md;
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("s") Student s) {
        sd.AddStudent(s);

        ModelAndView md = Execute();
        String msg = "Record inserted successfully";
        md.addObject("msg", msg);
        return md;
    }

    @RequestMapping("edit/{rno}")
    public ModelAndView editview(@PathVariable("rno") int rno) {
        Student st = sd.GetStudentByRollNo(rno);
        ModelAndView md = new ModelAndView("student/EditStudent");
        md.addObject("command", st);
        return md;

    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public ModelAndView savedata(@ModelAttribute("s") Student s) {
        sd.UpdateStudent(s);

        ModelAndView md = Execute();
        String msg = "Record Updated successfully";
        md.addObject("msg", msg);
        return md;
    }

    @RequestMapping("delete/{rno}")
    public ModelAndView delete(@PathVariable("rno") int rno) {
        sd.DeleteStudent(rno);
        ModelAndView md = Execute();
        String msg = "Record Deleted successfully";
        md.addObject("msg", msg);

        return md;

    }

    public ModelAndView Execute() {
        ModelAndView md = new ModelAndView("student/AddStudent");

        List<Student> lst = sd.GetAllStudents();
        md.addObject("lst", lst);
        int rno = sd.NextRollNo();
        Student st = new Student(rno, "", "", "");
        md.addObject("command", st);
        return md;
    }

}
