package com.example.alertdialog07062022;

/**
 * Created by pphat on 7/14/2022.
 */
public class FastFood {
    private Desserts desserts;
    private BoxMeals boxMeals;
    private RiceMeals riceMeals;
    private Snacks snacks;
    private Drinks drinks;

    public FastFood(Desserts desserts, BoxMeals boxMeals, RiceMeals riceMeals, Snacks snacks, Drinks drinks) {
        this.desserts = desserts;
        this.boxMeals = boxMeals;
        this.riceMeals = riceMeals;
        this.snacks = snacks;
        this.drinks = drinks;
    }

    public Desserts getDesserts() {
        return desserts;
    }

    public void setDesserts(Desserts desserts) {
        this.desserts = desserts;
    }

    public BoxMeals getBoxMeals() {
        return boxMeals;
    }

    public void setBoxMeals(BoxMeals boxMeals) {
        this.boxMeals = boxMeals;
    }

    public RiceMeals getRiceMeals() {
        return riceMeals;
    }

    public void setRiceMeals(RiceMeals riceMeals) {
        this.riceMeals = riceMeals;
    }

    public Snacks getSnacks() {
        return snacks;
    }

    public void setSnacks(Snacks snacks) {
        this.snacks = snacks;
    }

    public Drinks getDrinks() {
        return drinks;
    }

    public void setDrinks(Drinks drinks) {
        this.drinks = drinks;
    }

    public static class BuilderFood implements Builder {
        private Desserts desserts;
        private BoxMeals boxMeals;
        private RiceMeals riceMeals;
        private Snacks snacks;
        private Drinks drinks;

        @Override
        public Builder setDesserts(Desserts desserts) {
            this.desserts = desserts;
            return this;
        }

        @Override
        public Builder setBoxMeals(BoxMeals boxMeals) {
            this.boxMeals = boxMeals;
            return this;
        }

        @Override
        public Builder setRiceMeals(RiceMeals riceMeals) {
            this.riceMeals = riceMeals;
            return this;
        }

        @Override
        public Builder setSnacks(Snacks snacks) {
            this.snacks = snacks;
            return this;
        }

        @Override
        public Builder setDrinks(Drinks drinks) {
            this.drinks = drinks;
            return this;
        }

        @Override
        public FastFood build() {
            return new FastFood(desserts, boxMeals, riceMeals, snacks, drinks);
        }
    }
}
