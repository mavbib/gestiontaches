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
public class TodoList {
        public static void main(String[] args){
        Task t = new Task();
        t.label = "Test";
        t.state = false;
        
        System.out.println("Taches '" + t.label + "' => " + t.state);
    }
}
