package br.ufpb.dcx.ayla.agenda;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

public class AgendaAylaTest {

    @Test
    public void testaAgendaAyla(){
       /* Agenda a1 = new AgendaAyla();
        assertTrue(a1.cadastraContato("Gabriela", 12,04));
        assertEquals(1 ,a1.pesquisaAniversariantes(12,04).size());
        try{
            assertTrue(a1.removeContato("João"));
            fail();
        }catch (ContatoInexistenteException e){
            //ok
        } */

        AgendaAyla agenda  = new AgendaAyla();
        agenda.pesquisaAniversariantes(20,8);
        Collection<Contato> contatosAchados = agenda.pesquisaAniversariantes(20,8);

        assertTrue(contatosAchados.size() == 0);
        agenda.cadastraContato("Maria",20,8);
        agenda.cadastraContato("José",20,8);

        contatosAchados = agenda.pesquisaAniversariantes(20,8);

        assertEquals(2,contatosAchados.size());
        Contato maria = new Contato("Maria",20,8);
        assertTrue(contatosAchados.contains(maria));
        Contato jose = new Contato("José",20,8);
        assertTrue(contatosAchados.contains(jose));

        try {
            boolean removeu = agenda.removeContato("José");
            assertTrue(removeu);
        }catch(ContatoInexistenteException e){ fail("lançou excessão quando não deveria");}





    }
}
