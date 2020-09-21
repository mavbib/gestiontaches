/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitalinfo.gestiontaches;

/**
 *
 * @author user
 */
public class Task {
    public String label;
    public Boolean state;
    
    public Task(String label, Boolean state){
    this.label = label;
    this.state = state;
    }
    public String toString(){
        return "Taches '" + this.label + "' => " + this.state;
}
    public void done(){
        state = true;
    }
    public Boolean isDone(){
        return state;
    }
}

