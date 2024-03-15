package com.mycompany.practical3;

class Doctor1 extends Doctor {
    @Override
    public void writeRecipe(String recipeText) {
        String reversedText = new StringBuilder(recipeText).reverse().toString();
        System.out.println("Reversed recipe: " + reversedText);
    }
}



