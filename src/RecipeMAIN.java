public class RecipeMAIN {

    public static void main(String[] args) {

        RecipeRepo recipeRepo = new RecipeRepo(3);

        Recipe r1 = new Recipe("Babka piaskowa","150 g masła, 200 g mąki ziemniaczanej, 100 g mąki pszennej, 3 jajka, 150 g cukru, opakowanie (16 g) cukru waniliowego, 1,5 płaskiej łyżeczki proszku do pieczenia, skórka otarta z jednej cytryny, cukier puder do posypania", 60,"Żółtka oddzielić od białek. Białka ubić na sztywną pianę.\n" +
                "Miękkie masło zmiksować na puszystą masę, cały czas miksując dodać cukry. Następnie miksując dodawać żółtka, przesiane mąki wymieszane z proszkiem do pieczenia i skórkę otartą z cytryny. Na koniec bardzo delikatnie wmieszać do masy pianę z białek.\n" +
                "Ciasto przełożyć do wysmarowanej masłem i wysypanej bułką tartą formy.\n" +
                "Piec w temperaturze 160 st. przez około 1 h.\n" +
                "Wystudzone ciasto posypać cukrem pudrem.");
        Recipe r2 = new Recipe("Pierogi ruskie", "0,5 kg mąki, 1 łyżeczka soli, 1/2 kostki masła lub margaryny, 200 ml ciepłej wody, 1 kg ziemniaków, 1-2 cebule, 20 dag białego sera (można dodać więcej), Sól, Pieprz", 30,"Mąkę przesiałam na stolnicę, dodałam sól, masło, wodę i zagniotłam elastyczne ciasto. Przykryłam miseczką, aby nie obeschło i odstawiłam na 10 min. Cebulę pokroiłam w kostkę i podsmażyłam na oleju. Ugotowane ziemniaki zgniotłam praską (można chwilę odczekać, aby ostygły), dodałam ser, sól, pieprz, podsmażoną cebulę i  ponownie zgniotłam praską. Ciasto cienko rozwałkowałam, wykrawałam krążki, nakładałam farsz i zlepiałam pierogi. Następnie gotowałam w osolonej wodzie.");

        recipeRepo.add(r1);
        recipeRepo.add(r2);
        recipeRepo.displayAll();

    }
}
