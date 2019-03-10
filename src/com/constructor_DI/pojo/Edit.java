package com.constructor_DI.pojo;

public class Edit {
    private Spell spell;
    public Edit(Spell spell){
        System.out.println("Edit constructor----!");
        this.spell=spell;
    }
    public void check(){
        System.out.println("Edit check-----!");
        spell.check();
    }
}
