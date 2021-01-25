public class Recipe {
    String title;
    String ingredients;
    int time;
    String description;

    Recipe(String title, String ingredients, int time, String description) {
        this.title = title;
        this.ingredients = ingredients;
        this.time = time;
        this.description = description;
    }

    void display(){
        System.out.println("Title: "+title);
        System.out.println("----------");
        System.out.println("Ingredients: ");
        System.out.println(ingredients);
        System.out.println("Preparing time: "+time);
        System.out.println("Description: ");
        System.out.println(description);
    }
}
