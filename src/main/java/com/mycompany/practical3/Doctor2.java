package com.mycompany.practical3;

class Doctor2 extends Doctor {
    @Override
    public void writeRecipe(String recipeText) {
        String modifiedText = recipeText.toUpperCase();
        System.out.println("Modified recipe: " + modifiedText);
    }
}