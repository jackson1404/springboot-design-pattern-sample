/***************************************************************
 * Author       :	 
 * Created Date :	
 * Version      : 	
 * History  :	
 * *************************************************************/
package com.jackson.design_patter.sample.state_design_pattern.service.serviceImpl;

import com.jackson.design_patter.sample.state_design_pattern.context.AtmContext;
import com.jackson.design_patter.sample.state_design_pattern.service.AtmStateService;
import org.springframework.stereotype.Service;

/**
 * NoCardStateServiceImpl Class.
 * <p>
 * </p>
 *
 * @author
 */
@Service
public class NoCardStateServiceImpl implements AtmStateService {

    private AtmContext atm;

    public NoCardStateServiceImpl(AtmContext atm){
        this.atm = atm;
    }

    @Override
    public void insertCard() {

    }

    @Override
    public void ejectCard() {

    }

    @Override
    public void enterPin(int pin) {

    }

    @Override
    public void withdrawCash(int amount) {

    }
}
