package com.cmcguire;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import com.cmcguire.entities.User;

public class UserUnitTest {
    
    @Test
    public void whenCalledGetName_thenCorrect() {
        User user = new User("Julie", "julie@domain.com", "Manchester");
        
        assertThat(user.getUserName()).isEqualTo("Julie");
    }
    
    @Test
    public void whenCalledGetEmail_thenCorrect() {
        User user = new User("Julie", "julie@domain.com", "Manchester");
        
        assertThat(user.getEmail()).isEqualTo("julie@domain.com");
    }

    @Test
    public void whenCalledGetLocation_thenCorrect() {
        User user = new User("Julie", "julie@domain.com", "Manchester");

        assertThat(user.getLocation()).isEqualTo("Manchester");
    }
    
    @Test
    public void whenCalledSetName_thenCorrect() {
        User user = new User("Julie", "julie@domain.com", "Manchester");
        
        user.setUserName("John");
        
        assertThat(user.getUserName()).isEqualTo("John");
    }
    
    @Test
    public void whenCalledSetEmail_thenCorrect() {
        User user = new User("Julie", "julie@domain.com", "Manchester");
        
        user.setEmail("john@domain.com");
        
        assertThat(user.getEmail()).isEqualTo("john@domain.com");
    }

    @Test
    public void whenCalledSetLocation_thenCorrect() {
        User user = new User("Julie", "julie@domain.com", "Manchester");

        user.setLocation("Liverpool");

        assertThat(user.getLocation()).isEqualTo("Liverpool");
    }

}
