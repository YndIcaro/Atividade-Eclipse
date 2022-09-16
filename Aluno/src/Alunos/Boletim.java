package Alunos;

//Feito por icaro de oliveira 3-52
public class Boletim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno a1 = new Aluno();
		a1.nome = "joaozinho";
		a1.nota1 = 9.7f;
		a1.nota2 = 6.2f;
		a1.nota3 = 8.5f;
		a1.media = ((a1.nota1 + a1.nota2 + a1.nota3 + a1.nota4)/3);
		Professor p1 = new Professor();
		p1.nome = "Januario";
		p1.disciplina="Matematica";
		
		System.out.println("A nota do aluno: "+ a1.nome + " nas aulas do professor "+ p1.nome + " da disciplina de "+ p1.disciplina+" sua media foi de: " + a1.media);
	}

}
