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
        Task t = new Task("test", false);
        Task t2 = new Task("test2", false);
        //t.label = "Test";
        //t.state = false;
        
        System.out.println(t);
        System.out.println(t2);
        t.done();
        System.out.println(t);
        
        if (t2.isDone()){
            System.out.println("Tache effectuee!");
        }else{
            System.out.println("Tache a faire!");
        }
    }
}
