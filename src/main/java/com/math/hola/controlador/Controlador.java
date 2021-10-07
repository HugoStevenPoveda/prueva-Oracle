/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.math.hola.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author hugog
 */

@RestController
@RequestMapping("/api/holamundo")
public class Controlador {
    
    @GetMapping
    public String holaMundo(){
     return "hola mundo";
    
    }
    
}
