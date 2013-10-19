package ch.fhnw.edu.flashcard.web;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ch.fhnw.edu.flashcard.domain.Questionnaire;

@RequestMapping("/")
@Controller
public class IndexController {

	private Logger logger = Logger.getLogger(this.getClass());

	@RequestMapping(method = RequestMethod.GET)
	public String list(Model uiModel) {
		uiModel.addAttribute("questionnaires", Questionnaire.findAllQuestionnaires());
		uiModel.addAttribute("delete","/images/delete.png");
		this.logger.debug("index called");
		return "index";
	}
}
