/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.porthos.demo;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 *
 * @author castrof
 */
@Slf4j
public class PersonTest {

    @Test
    public void createPerson() {
        Person person = new Person();
        person.setFirstName("Frank");
        person.setLastName("Castro");

        log.debug("person={}", person);
    }
}
