package com.discover.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.discover.entity.Cards;

import com.discover.service.CardsService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/card")
@Tag(name="Cards API", description ="Operations related to cards")
public class CardController {
	@Autowired
	CardsService cardService;
	
	
	@GetMapping("/getAllCards")
	@Operation(summary = "Get all cards")
	public List<Cards> getAllCards() {
		return cardService.getAllCards();
	}
	
	@GetMapping("/getCardById/{cardId}")
	@Operation(summary = "Get card by ID")
	public ResponseEntity<Cards> getCardById(@PathParam("cardId") Long cardId) {
		Cards card = cardService.getCardById(cardId);
		return ResponseEntity.ok(card);
		
	}
	
	
	@PostMapping("/addCard")
	@Operation(summary = "Create card")
	public ResponseEntity<Cards> addCard(@RequestBody Cards card) {
        Cards saved = cardService.addCard(card);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }

	@PutMapping("/updateCard")
	@Operation(summary = "Update card")
	public ResponseEntity<Cards> update(@RequestBody Cards card) {
        Cards updated = cardService.updateCard(card);
        return ResponseEntity.ok(updated);
    }
    

	@DeleteMapping("/deleteCard/{cardId}")
	@Operation(summary = "Delete card by ID")
	public ResponseEntity<Void> deleteCard(@PathParam("cardId") Long cardId) {
		cardService.deleteCard(cardId);
        return ResponseEntity.noContent().build();
	
	}
	
}
