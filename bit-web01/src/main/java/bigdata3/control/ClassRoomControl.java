package bigdata3.control;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import bigdata3.domain.ClassRoom;
import bigdata3.service.ClassRoomService;

@Controller
@RequestMapping("/classroom")
public class ClassRoomControl {
  @Autowired ClassRoomService classRoomService;
  @Autowired ServletContext servletContext;
  
  @RequestMapping("list")
  public String list(
      @RequestParam(defaultValue="1") int pageNo,
      @RequestParam(defaultValue="5") int pageSize,
      Model model) throws Exception {
    
    List<ClassRoom> list = classRoomService.list(pageNo, pageSize);
    model.addAttribute("list", list);
    
    return "classroom/list";
  }
}








