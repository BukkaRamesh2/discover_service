package com.discover.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.discover.entity.Cards;
import com.discover.service.CardsService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/card")
public class CardController {
	@Autowired
	CardsService cardService;
	
	@PostMapping("/addCard")
	public Cards addCard(@RequestBody Cards card) {
		return cardService.addCard(card);
	}
	@GetMapping("/getCardById/{cardId}")
	public Cards getCardById(@PathParam("cardId") Long cardId) {
		return cardService.getCardById(cardId);
	}

	@GetMapping("/getAllCards")
	public List<Cards> getAllCards() {

		return cardService.getAllCards();
	}

	@PutMapping("/updateCard")
	public Cards updateCard(@RequestBody Cards card) {
		return cardService.updateCard(card);
	}

	@DeleteMapping("/deleteCard/{cardId}")
	public void deleteCard(@PathParam("cardId") Long cardId) {	
	
	}
	
}
