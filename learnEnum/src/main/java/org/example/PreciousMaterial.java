package org.example;

public enum PreciousMaterial {



    GOLD(50),
    SILVER(10){
        public float pricePerGram(){
            return Math.random() > 0.5 ? 10 : 20;
        }
    },
    BRONZE(50);

    private float pricePerGram;

    PreciousMaterial(){};

    PreciousMaterial(float pricePerGram){
        this.pricePerGram = pricePerGram;
    }

    public float getPricePerGram(){
        return this.pricePerGram;
    }


}
