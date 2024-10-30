import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        
        Curso curso1 = new Curso();

        curso1.setTitulo("Java");
        curso1.setDescricao("Curso de Java, focado em Java");
        curso1.setCargaHoraria(80d);

        Curso curso2 = new Curso();

        curso2.setTitulo("Delphi");
        curso2.setDescricao("Curso de Delphi");
        curso2.setCargaHoraria(40d);


        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("Manter o Foco");
        mentoria1.setDescricao("Aprenda sobre como manter o foco");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Essa é a descriçõ do boot");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        


        Dev dev1 = new Dev();
        dev1.setNome("Ary");
        Dev dev2 = new Dev();
        dev2.setNome("Lais");

        dev1.inscreverBootcamp(bootcamp);
        dev2.inscreverBootcamp(bootcamp);

        System.out.println(bootcamp);


    }

}
