package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String homepage() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>Programming Languages I've been Studying</h2>" +
                "<ol>" +
                "<li>JavaScript</li>" +
                "<li>Java</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    public String form() {
        return "<html>" +
            "<body>" +
            "<form method='post' action ='form/completed'>" +
            "<label>Name:</label></br>" +
            "<input type='text' name='name'/></br></br>" +
            "<label>My favorite language:</label></br>" +
            "<select name='language1'>" +
            "<option value=''>--Please choose a language</option>" +
            "<option value='Java'>Java</option>" +
            "<option value='JavaScript'>JavaScript</option>" +
            "<option value='Python'>Python</option>" +
            "</select></br></br>" +
            "<label>My second favorite language:</label></br>" +
            "<select name='language2'>" +
            "<option value=''>--Please choose a language</option>" +
            "<option value='Java'>Java</option>" +
            "<option value='JavaScript'>JavaScript</option>" +
            "<option value='Python'>Python</option>" +
            "</select></br></br>" +
            "<label>My third favorite language:</label></br>" +
            "<select name='language3'>" +
            "<option value=''>--Please choose a language</option>" +
            "<option value='Java'>Java</option>" +
            "<option value='JavaScript'>JavaScript</option>" +
            "<option value='Python'>Python</option>" +
            "</select></br>" +
            "<input type='submit' value='Submit' />";
    }

    @PostMapping("form/completed")
    public String updatePage(@RequestParam String name, String language1, String language2, String language3) {
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + language1 + "</li>" +
                "<li>" + language2 + "</li>" +
                "<li>" + language3 + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

}
