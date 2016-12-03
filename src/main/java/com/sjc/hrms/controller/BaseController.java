package com.sjc.hrms.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping(value = "/api/v1")

public class BaseController {

	// @ExceptionHandler(RuntimeException.class)
	// @ResponseBody
	// public ErrorMessageDTO handleException(RuntimeException e,
	// HttpServletResponse response) throws IOException {
	// HttpStatus responseCode = HttpStatus.BAD_REQUEST;
	// if (e instanceof ResourceNotFoundException) {
	// responseCode = HttpStatus.NOT_FOUND;
	// } else if (e instanceof AccessException) {
	// responseCode = HttpStatus.FORBIDDEN;
	// } else if (e instanceof IllegalArgumentException) {
	// responseCode = HttpStatus.FORBIDDEN;
	// }
	// response.setStatus(responseCode.value());
	// ErrorMessageDTO msg = new ErrorMessageDTO();
	// msg.setMessage(e.getMessage());
	// return msg;
	// }
	private final Logger logger = LoggerFactory.getLogger(BaseController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView index(Map<String, Object> model) {

		logger.debug("index() is executed!");
		
		return new ModelAndView("index");
	}
}
