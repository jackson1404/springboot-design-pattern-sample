/***************************************************************
 * Author       :	 
 * Created Date :	
 * Version      : 	
 * History  :	
 * *************************************************************/
package com.jackson.design_patter.sample.state_design_pattern.service;

/**
 * AtmStateService Class.
 * <p>
 * </p>
 *
 * @author
 */
public interface AtmStateService {
    void insertCard();
    void ejectCard();
    void enterPin(int pin);
    void withdrawCash(int amount);
}
