/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arelance.ejemplodecorator1.pruebas;

import com.arelance.ejemplodecorator1.beans.BasicWatch;
import com.arelance.ejemplodecorator1.beans.GamersWatchDecorator;
import com.arelance.ejemplodecorator1.beans.LuxuryWatchDecorator;
import com.arelance.ejemplodecorator1.beans.SportWatchDecorator;
import com.arelance.ejemplodecorator1.beans.Watch;

/**
 *
 * @author Manuel
 */
public class ClientDecoratorPattern {
    
    public static void main(String[] args) {
        
        Watch basicWatch = new BasicWatch();
        basicWatch.createFunctionality();
        System.out.println("\n---------");
        
        Watch sportsWatch = new SportWatchDecorator(new BasicWatch());
        sportsWatch.createFunctionality();
        System.out.println("\n---------");
        
        Watch sportsLuxuryWatch = new LuxuryWatchDecorator(new SportWatchDecorator(new BasicWatch()));
        sportsLuxuryWatch.createFunctionality();
        System.out.println("\n---------");
        
        Watch sportsLuxuryGamersWatch = new GamersWatchDecorator(new SportWatchDecorator(new BasicWatch()));
        sportsLuxuryGamersWatch.createFunctionality();
  
    }
    
}
