package com.example.cafe.services;

import com.example.cafe.models.ColdCoffee;
import com.example.cafe.models.FruitJuice;
import com.example.cafe.models.HotCoffee;
import com.example.cafe.models.SpecialItem;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HomeService {

    public List<ColdCoffee> getColdCoffees() {

        List<ColdCoffee> coldCoffees = new ArrayList<>();

        ColdCoffee icedAmericano = new ColdCoffee("cold",
                "https://blog.cafecampesino.com/wp-content/uploads/Iced-Americano-700x525.jpg",
                "Iced Americano",
                "Espresso shots topped with cold water produce a light layer of crema, then served over ice. The result: a wonderfully rich cup with depth and nuance. Pro Tip: For an additional boost, ask your barista to try this with an extra shot.",
                10.25f);

        ColdCoffee icedCappuccino = new ColdCoffee("cold",
                "https://i2.wp.com/portandfin.com/wp-content/uploads/2014/07/icedcap2.jpg",
                "Iced Cappuccino",
                "With just a splash of milk, an Iced Cappuccino offers a balanced cup with a stronger espresso flavor and a velvety, frothy foam with a crisp, cool undercurrent",
                12.50f);

        ColdCoffee icedEspresso = new ColdCoffee("cold",
                "https://img.taste.com.au/xbgsIjwa/taste/2016/11/iced-espresso-26028-1.jpeg",
                "Iced Espresso",
                "An iced espresso is a cold and refreshing way to enjoy your morning cup of joe on a warm summer day. ... Iced espresso starts with freshly brewed espresso, and from there you can either chill the espresso in the freezer, or you can cool it down with milk and serve it over ice.",
                14.25f);

        ColdCoffee icedLatte = new ColdCoffee("cold",
                "https://www.torani.com/sites/default/files/styles/torani_syrup_recipe_detail/public/recipes/illustration/iced%20latte%20with%20swirl.jpg?itok=c89gvCiJ",
                "Iced Latte",
                "An iced latte is a simple and straight forward cold espresso based drink, not to be confused with an iced coffee. Iced coffee tend to be sweetened, not overly strong, topped with ice cream and possibly even whipped cream.",
                11.50f);

        coldCoffees.add(icedAmericano);
        coldCoffees.add(icedCappuccino);
        coldCoffees.add(icedEspresso);
        coldCoffees.add(icedLatte);

        return coldCoffees;

    }


    public List<HotCoffee> getHotCoffees() {

        List<HotCoffee> HotCoffees = new ArrayList<>();

        HotCoffee hotAmericano = new HotCoffee("hot",
                "img/hot-americano.png",
                "Hot Americano",
                "Caffè Americano (also known as Americano or American; Italian pronunciation: [kafˈfɛ ameriˈkaːno]; Spanish: café americano, literally American coffee) is a type of coffee drink prepared by diluting an espresso with hot water, giving it a similar strength to, but different flavor from, traditionally brewed coffee.",
                8.50f);

        HotCoffee hotCappuccino = new HotCoffee("hot",
                "img/hot-cappuccino.png",
                "Hot Cappuccino",
                "Outside of Italy, cappuccino is a coffee drink that today is typically composed of a single espresso shot and hot milk, with the surface topped with foamed milk. Cappuccinos are most often prepared with an espresso machine.",
                12.50f);

        HotCoffee hotEspresso = new HotCoffee("hot",
                "img/hot-espresso.png",
                "Hot Espresso",
                "Espresso (ess-PRESS-oh) is a full-flavored, concentrated form of coffee that is served in “shots.” It is made by forcing pressurized hot water through very finely ground coffee beans using an espresso machine. ... Espresso has all of the same flavors of coffee but amplified—bitter, lightly sweet, acidic, toasty.",
                14.25f);

        HotCoffee hotLatte = new HotCoffee("hot",
                "img/hot-latte.png",
                "Hot Latte",
                "Caffè latte is a coffee-based drink made primarily from espresso and steamed milk. It consists of one-third espresso, two-thirds heated milk and about 1cm of foam.",
                11.50f);

        HotCoffees.add(hotAmericano);
        HotCoffees.add(hotCappuccino);
        HotCoffees.add(hotEspresso);
        HotCoffees.add(hotLatte);

        return HotCoffees;
    }

    public List<FruitJuice> getFruitJuices() {

        List<FruitJuice> fruitJuices = new ArrayList<>();

        FruitJuice strawberrySmoothie = new FruitJuice("juice",
                "img/smoothie-1.png",
                "Strawberry Smoothie",
                "Packed with vitamins, fiber, and particularly high levels of antioxidants known as polyphenols, strawberries are a sodium-free, fat-free, cholesterol-free, low-calorie food. They are among the top 20 fruits in antioxidant capacity and are a good source of manganese and potassium.",
                12.50f);

        FruitJuice redBerrySmoothie = new FruitJuice("juice",
                "img/smoothie-2.png",
                "Red Berry Smoothie",
                "Red berry smoothies are particularly beneficial because blending is a great way to get all the essential nutrients you need, from powerful antioxidants to immune-boosting vitamins.",
                14.50f);

        FruitJuice pineappleSmoothie = new FruitJuice("juice",
                "img/smoothie-3.png",
                "Pineapple Smoothie",
                "Pineapple is a rich source of vitamin C, vitamin B, and fibre. Not only do these nutrients improve gut health, but they also help maintain your vagina's natural smell by keeping it healthy and preventing any infections.",
                16.50f);

        FruitJuice spinachSmoothie = new FruitJuice("juice",
                "img/smoothie-4.png",
                "Spinach Smoothie",
                "Green smoothies are a great way to incorporate leafy greens into your diet. These greens are a rich source of vitamins and minerals and are most nutritious when consumed raw like in a smoothie.",
                18.50f);

        fruitJuices.add(strawberrySmoothie);
        fruitJuices.add(redBerrySmoothie);
        fruitJuices.add(pineappleSmoothie);
        fruitJuices.add(spinachSmoothie);

        return fruitJuices;

    }

    public List<SpecialItem> getSpecialItems() {

        List<SpecialItem> specialItems = new ArrayList<>();

        SpecialItem mocktails = new SpecialItem("special",
                "img/special-01.jpg",
                "MockTails",
                "A mocktail is a cocktail without the liquor. Instead, juices, sodas, infused waters and many other non-alcoholic ingredients, mixed in just the right ratios, provide flavor.",
                12.50f);

        SpecialItem croissant = new SpecialItem("special",
                "img/special-02.jpg",
                "Croissants",
                "A croissant is a buttery, crescent-shaped French pastry. Good croissants are light, flaky, and delicately sweet. Enjoy one with a cup of coffee — preferably while sitting in a charming Parisian cafe.",
                8.25f);

        SpecialItem hamburger = new SpecialItem("special",
                "img/special-03.jpg",
                "Hamburger",
                "A hamburger (also burger for short) is a sandwich consisting of one or more cooked patties of ground meat, usually beef, placed inside a sliced bread roll or bun. The patty may be pan fried, grilled, smoked or flame broiled. ... A hamburger topped with cheese is called a cheeseburger.",
                12.50f);

        SpecialItem dessert = new SpecialItem("special",
                "img/special-04.jpg",
                "Dessert",
                "Dessert is a course that concludes a meal. The course consists of sweet foods, such as confections, and possibly a beverage such as dessert wine and liqueur. ",
                6.50f);

        SpecialItem punch = new SpecialItem("special",
                "img/special-05.jpg",
                "Fruit Punch",
                "The term punch refers to a wide assortment of drinks, both non-alcoholic and alcoholic, generally containing fruits or fruit juice. The drink was introduced from India to England by employees of the English East India Company. ",
                10.50f);

        SpecialItem pastries = new SpecialItem("special",
                "img/special-06.jpg",
                "Savoury Pastry",
                "Pastry is a dough of flour, water and shortening that may be savoury or sweetened. Sweetened pastries are often described as bakers' confectionery. The word \"pastries\" suggests many kinds of baked products made from ingredients such as flour, sugar, milk, butter, shortening, baking powder, and eggs.",
                15.25f);

        specialItems.add(mocktails);
        specialItems.add(croissant);
        specialItems.add(hamburger);
        specialItems.add(dessert);
        specialItems.add(punch);
        specialItems.add(pastries);

        return specialItems;

    }
}
