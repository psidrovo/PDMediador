/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import mediator.Mediator;
/**
 *
 * @author Paul Idrovo
 */
public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
