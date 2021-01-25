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

    void display() {
        System.out.println("Title: " + title);
        System.out.println("----------");
        System.out.println("Ingredients: ");
        System.out.println(ingredients);
        System.out.println("Preparing time: " + time + "minutes");
        System.out.println("Description: ");
        System.out.println(description);
    }

    void modify() {
        System.out.println("Title: " + title);
        System.out.println("----------");
        System.out.println("Ingredients: ");
        System.out.println(ingredients);
        System.out.println("Preparing time: " + time + "minutes");
        System.out.println("Description: ");
        String[] paragraphs = description.split("\\.");
        String changedDescription = (paragraphs[0]+".");
        for (int i = 1; i < paragraphs.length; i++){
            if (i%2 != 0) {
                changedDescription += (paragraphs[i]+".\n");
            } else {
                changedDescription += (paragraphs[i]+".");
            }
        }
        System.out.println(changedDescription);
        System.out.println("Zachęcam do zapoznania się z innymi przepisami.");
    }
}
