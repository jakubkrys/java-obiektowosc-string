public class RecipeRepo {

    Recipe[] recipies;

    RecipeRepo(int size) {
        recipies = new Recipe[size];
    }

    int n = 0;

    void add(Recipe recipe) {
        recipies[n] = recipe;
        n++;
    }

    void displayAll() {
        for (int i = 0; i < recipies.length && recipies[i] != null; i++) {
            System.out.println("----------");
            recipies[i].display();
            System.out.println("----------");
        }

    }
}
