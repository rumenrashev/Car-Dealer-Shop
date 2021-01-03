package cardealer.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import static cardealer.constants.URLs.*;


@Controller
public class UserController extends BaseController {

    @GetMapping(LOGIN_URL)
    public ModelAndView login(){
        return super.view(LOGIN_URL);
    }

    @GetMapping(REGISTER_URL)
    public ModelAndView register(){
        return super.view(REGISTER_URL);
    }

}
