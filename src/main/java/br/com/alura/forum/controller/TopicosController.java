package br.com.alura.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import src.main.java.br.com.alura.forum.modelo.Curso;
import src.main.java.br.com.alura.forum.modelo.Topico;

@Controller
public class TopicosController {

	@RequestMapping("/topicos")
	@ResponseBody
	public List<Topico> lista() {
		Topico topico = new Topico("Dúvida", "Dúvida curso", new Curso("Spring", "Desenvolvimento"));
		return Arrays.asList(topico, topico, topico);
	}
}
