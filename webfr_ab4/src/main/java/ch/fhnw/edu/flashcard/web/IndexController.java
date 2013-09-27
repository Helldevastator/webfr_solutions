package ch.fhnw.edu.flashcard.web;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import ch.fhnw.edu.flashcard.domain.Questionnaire;

@Controller
public class IndexController {

	private static final Logger log = Logger.getLogger(IndexController.class);
	public String list(Model uiModel){
		uiModel.addAttribute("questionares", Questionnaire.findAllQuestionnaires());
		log.debug("index called");
		return "index";
	}
}
