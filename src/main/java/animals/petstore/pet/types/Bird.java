package animals.petstore.pet.types;

import animals.AnimalType;
import animals.petstore.pet.Pet;
import animals.petstore.pet.attributes.Breed;
import animals.petstore.pet.attributes.Gender;
import animals.petstore.pet.attributes.Skin;

import java.math.BigDecimal;

import static animals.AnimalType.DOMESTIC;
import static animals.AnimalType.WILD;

public class Bird extends Pet {

    public Bird(AnimalType animalType,
                Skin skin,
                Gender gender,
                Breed breed)
    {
        super(animalType, skin, gender, breed);
    }

    public Bird(AnimalType animalType,
                Skin skin,
                Gender gender,
                Breed breed,
                BigDecimal price,
                int petStoreId)
    {
        super(animalType, skin, gender, breed, price, petStoreId);
    }

    @Override
    public String speak()
    {
        switch (getAnimalType())
        {
            case DOMESTIC:
                return "The bird goes Tweet! Tweet!";

            case WILD:
                return "The bird goes Screech! Screech!";

            default:
                return "The bird goes Chirp! Chirp!";
        }
    }

    public String canFly()
    {
        if(getAnimalType() == WILD)
        {
            return "The bird can fly high!";
        }

        return "The bird is a house pet!";
    }

    @Override
    public String toString()
    {
        return "Bird {" +
                "animalType=" + getAnimalType() +
                ", skin=" + getSkin() +
                ", gender=" + getGender() +
                ", breed=" + getBreed() +
                ", price=" + getPrice() +
                ", petStoreId=" + getPetStoreId() +
                '}';
    }
}