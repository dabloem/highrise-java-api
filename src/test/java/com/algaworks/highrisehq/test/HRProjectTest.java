/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.highrisehq.test;

import com.algaworks.highrisehq.Highrise;
import com.algaworks.highrisehq.bean.Company;
import com.algaworks.highrisehq.bean.Deal;
import com.algaworks.highrisehq.bean.Deals;
import com.algaworks.highrisehq.bean.Note;
import com.algaworks.highrisehq.bean.Person;
import com.sun.jersey.api.client.filter.LoggingFilter;
import com.sun.jersey.core.util.MultivaluedMapImpl;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author duncan
 */
public class HRProjectTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Highrise highrise = new Highrise("beedemo", "543d85cff0e819fe977d09c521df9f36", new LoggingFilter());
        List<Deal> all = highrise.getDealManager().getAsList(Deal.class, Deals.class, "deals", new MultivaluedMapImpl());
        
//        for (Deal deal : all) {
//            System.out.println(deal);
//        }
//        Logger.getLogger(HRProjectTest.class.getName()).log(Level.INFO, "{0} deals", all.size());
//        List<Note> notes = highrise.getNoteManager().getAll(Person.class, 91239928L);
//        List<Note> notes = highrise.getNoteManager().getAll(Company.class, 91239928L);
//        for (Note note : notes) {
//            System.out.println(note);
//        }
        
//        List<Person> people = highrise.getPeopleManager().getAll();
//        for (Person person : people) {
//            System.out.println(person);
//        }
        
    }
}
