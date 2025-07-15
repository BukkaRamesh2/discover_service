
package com.discover.service;

import java.util.List;
import com.discover.entity.Cards;

public interface CardsService {

    public Cards addCard(Cards card);  

    public Cards getCardById(Long cardId);  

    public List<Cards> getAllCards();  
    
    public Cards updateCard(Cards card); 

    public void deleteCard(Long cardId);  

}