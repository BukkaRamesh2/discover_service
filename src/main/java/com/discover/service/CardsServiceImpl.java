package com.discover.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ObjectOptimisticLockingFailureException;
import org.springframework.stereotype.Service;

import com.discover.entity.Cards;

import com.discover.exception.CardNotFoundException;
import com.discover.repository.CardsRepository;

import jakarta.transaction.Transactional;

@Service
public class CardsServiceImpl implements CardsService {
	
	@Autowired
	CardsRepository cardRepo;

	@Transactional
	@Override
	public Cards addCard(Cards card) {
		if (card.getCardId() != null || card.getVersion() != null) {
            throw new IllegalArgumentException("No ID allowed when creating");
        }
		return cardRepo.save(card);
	}
	
	@Transactional
	@Override
	public Cards updateCard(Cards card) {
		if (card.getCardId() == null || card.getVersion() == null) {
            throw new IllegalArgumentException("No ID allowed when creating");
        }
		
		Cards exist_card = cardRepo.findById(card.getCardId())
		.orElseThrow(()-> new CardNotFoundException("Card Id " + card.getCardId() + " not found"));
		
		 if (!exist_card.getVersion().equals(card.getVersion())) {
	            throw new ObjectOptimisticLockingFailureException(Cards.class, card.getCardId());
	        }
		
		
		BeanUtils.copyProperties(card, exist_card, "id");
        return cardRepo.save(exist_card);
	}
	
	@Override
	public Cards getCardById(Long cardId) {
		return cardRepo.findById(cardId)
				.orElseThrow(()-> new CardNotFoundException("Card Id " + cardId + " not found"));
	}

	@Override
	public List<Cards> getAllCards() {
		return cardRepo.findAll();
	}

	
	@Override
	public void deleteCard(Long cardId) {
		if(!cardRepo.existsById(cardId))
		{
			throw new CardNotFoundException("Card Id " + cardId + " not found");
		}
		cardRepo.deleteById(cardId);
		
	}
	

}
