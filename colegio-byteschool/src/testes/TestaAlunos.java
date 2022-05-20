package testes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

import classes.Aluno;

public class TestaAlunos {

	public static void main(String[] args) throws IOException {
		
		Aluno aluno = new Aluno(JOptionPane.showInputDialog("Informe o nome do Aluno"),
				Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero do Aluno")),
				Double.parseDouble(JOptionPane.showInputDialog("Informe a frequ�ncia escolar (0 a 100)")),
				Double.parseDouble(JOptionPane.showInputDialog("Informe a nota da P1 (ex.: 8.0)")),
				Double.parseDouble(JOptionPane.showInputDialog("Informe a nota da P2 (ex.: 8.0)")),
				Double.parseDouble(JOptionPane.showInputDialog("Informe a nota de Trabalho (ex.: 8.0)"))
				);
		double mediaFinalAluno = ((aluno.getNota1() * 0.35) + (aluno.getNota2() * 0.35) + (aluno.getNotaTrabalho() * 0.30));
		
		if(mediaFinalAluno >= 7.0 & aluno.getFrequencia() >= 70) {
			FileWriter fw = new FileWriter("<Inserir o destino do arquivo>");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Parab�ns, " + aluno.getNome() + "! Voc� foi Aprovado! Sua m�dia final foi de " + mediaFinalAluno + " e sua frequ�ncia escolar foi de " + aluno.getFrequencia() + "% .");
			bw.close();
		} else {
			FileWriter fw = new FileWriter("C:\\Users\\Marcelo\\Desktop/Boletim.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Sinto muito, " + aluno.getNome() + "! Voc� foi Reprovado. Sua m�dia final foi de " + mediaFinalAluno + " e sua frequ�ncia escolar foi de " + aluno.getFrequencia() + "% .");
			bw.close();
		}
		
	}

}
