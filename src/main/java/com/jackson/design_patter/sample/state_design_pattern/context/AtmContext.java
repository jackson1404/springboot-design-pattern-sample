/***************************************************************
 * Author       :	 
 * Created Date :	
 * Version      : 	
 * History  :	
 * *************************************************************/
package com.jackson.design_patter.sample.state_design_pattern.context;

import com.jackson.design_patter.sample.state_design_pattern.service.AtmStateService;
import com.jackson.design_patter.sample.state_design_pattern.service.serviceImpl.HasCardStateServiceImpl;
import com.jackson.design_patter.sample.state_design_pattern.service.serviceImpl.NoCardStateServiceImpl;
import com.jackson.design_patter.sample.state_design_pattern.service.serviceImpl.NoCashStateServiceImpl;
import com.jackson.design_patter.sample.state_design_pattern.service.serviceImpl.PinVerifiedStateServiceImpl;

/**
 * AtmContext Class.
 * <p>
 * </p>
 *
 * @author
 */
public class AtmContext {
    private AtmStateService noCardState;
    private AtmStateService hasCardState;
    private AtmStateService pinVerifyState;
    private AtmStateService noCashState;
    private AtmStateService currentState;

    private int atmCash;

    public AtmContext(int atmCash){
        noCardState = new NoCardStateServiceImpl(this);
        hasCardState = new HasCardStateServiceImpl(this);
        pinVerifyState = new PinVerifiedStateServiceImpl(this);
        noCashState = new NoCashStateServiceImpl(this);
        this.atmCash = atmCash;
        this.currentState = noCardState;

    }

}
