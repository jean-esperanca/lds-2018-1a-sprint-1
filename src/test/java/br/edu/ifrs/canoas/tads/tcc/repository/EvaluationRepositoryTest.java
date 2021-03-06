package br.edu.ifrs.canoas.tads.tcc.repository;

import br.edu.ifrs.canoas.tads.tcc.domain.Advice;
import br.edu.ifrs.canoas.tads.tcc.domain.Evaluation;
import br.edu.ifrs.canoas.tads.tcc.domain.TermPaper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class EvaluationRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;
    @Autowired
    private TermPaperRepository repository;

    private final String THEME = "Java Rules!";
    private final String SHORT_THEME = "JAVA";

    @Test
    public void whenFindByThemeContaining_thenReturnTermPaper(){

       /* // given
        Evaluation paper = new Advice();
        paper.setTheme(THEME);
        paper.setDescription(THEME);
        paper.setTitle(THEME);
        entityManager.persist(paper);
        entityManager.flush();

        // when
        Iterable<TermPaper> found = repository.findByThemeContainingIgnoreCase(SHORT_THEME);

        // then
        assertThat(found).hasSize(1).contains(paper)
                .extracting("theme").contains("Java Rules!");*/
    }

    @Test
    public void whenFindByThemeContaining_thenReturnNoData(){

       /* // given

        // when
        Iterable<TermPaper> found = repository.findByThemeContainingIgnoreCase(SHORT_THEME);

        // then
        assertThat(found).isEmpty();*/
    }

}