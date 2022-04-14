package brickset;

import repository.Repository;

/**
 * Represents a repository of {@code LegoSet} objects.
 */
public class LegoSetRepository extends Repository<LegoSet> {

    public LegoSetRepository() {
        super(LegoSet.class, "brickset.json");
    }

    /**
     * Returns whether  there is match of LEGO sets (at least one) with the specified theme
     *
     * @param themeName a LEGO set theme
     * @return True or False (Whether there are LEGO sets with the specified theme or not)
     */
    public boolean SeeLegoSetsWithTheme(String themeName) {

        return getAll().stream()
                .anyMatch(LegoSet ->LegoSet.getTheme().contains(themeName));
    }


    public static void main(String[] args) {
        var repository = new LegoSetRepository();
        System.out.println(repository.SeeLegoSetsWithTheme("Star Wars"));


    }
}
