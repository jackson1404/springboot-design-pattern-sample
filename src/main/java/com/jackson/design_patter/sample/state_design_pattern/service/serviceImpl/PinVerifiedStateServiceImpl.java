/***************************************************************
 * Author       :	 
 * Created Date :	
 * Version      : 	
 * History  :	
 * *************************************************************/
package com.jackson.design_patter.sample.state_design_pattern.service.serviceImpl;

import com.jackson.design_patter.sample.state_design_pattern.service.AtmStateService;
import org.springframework.stereotype.Service;

/**
 * PinVerifiedStateServiceImpl Class.
 * <p>
 * </p>
 *
 * @author
 */
@Service
public class PinVerifiedStateServiceImpl implements AtmStateService{
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
