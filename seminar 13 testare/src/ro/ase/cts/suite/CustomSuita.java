package ro.ase.cts.suite;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ro.ase.cts.categories.TesteRight;
import ro.ase.cts.categories.TesteUrgente;

@RunWith(Categories.class)
@Suite.SuiteClasses(SuitaCompleta.class)
@Categories.IncludeCategory({TesteUrgente.class})
@Categories.ExcludeCategory({TesteRight.class})
public class CustomSuita{

}
