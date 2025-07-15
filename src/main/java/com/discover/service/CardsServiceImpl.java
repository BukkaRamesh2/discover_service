package com.discover.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.discover.entity.Cards;
import com.discover.repository.CardsRepository;

@Service
public class CardsServiceImpl implements CardsService {
	
	@Autowired
	CardsRepository cardRepo;

	@Override
	public Cards addCard(Cards card) {
		// TODO Auto-generated method stub
		return cardRepo.save(card);
	}

	@Override
	public Cards getCardById(Long cardId) {
		// TODO Auto-generated method stub
		return cardRepo.getById(cardId);
	}

	@Override
	public List<Cards> getAllCards() {
		// TODO Auto-generated method stub
		return cardRepo.findAll();
	}

	@Override
	public Cards updateCard(Cards card) {
		// TODO Auto-generated method stub
		return cardRepo.save(card);
	}

	@Override
	public void deleteCard(Long cardId) {
		cardRepo.deleteById(cardId);
		
	}
	

}
