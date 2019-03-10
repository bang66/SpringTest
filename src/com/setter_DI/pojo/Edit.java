package com.setter_DI.pojo;

public class Edit {
    private Spell spell;

    public Spell getSpell() {
        return spell;
    }

    public void setSpell(Spell spell) {
        System.out.println("Edit setter--------!");
        this.spell = spell;
    }

    public void check(){
        spell.check();
    }
}
