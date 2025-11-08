package Desafios;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class novo extends JFrame {
    private ArrayList<Integer> valores;
    private ArrayList<JToggleButton> botoes;
    private JLabel totalLabel;
    private boolean totalVisivel = true;

    public novo() {
        setTitle("Depósito - Rumo aos 3000");
        setSize(800, 600);           // << Janela fixa 800x600
        setLocationRelativeTo(null); // << Centraliza na tela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        gerarValoresAleatorios(3000, 1, 50);

        JPanel grid = new JPanel(new GridLayout(0, 10, 5, 5)); // 10 colunas como antes
        botoes = new ArrayList<>();

        Font fonte;
        try {
            fonte = new Font("Source Code Pro", Font.PLAIN, 16);
        } catch (Exception e) {
            fonte = new Font(Font.MONOSPACED, Font.PLAIN, 16);
        }

        for (int i = 0; i < valores.size(); i++) {
            int val = valores.get(i);
            JToggleButton botao = new JToggleButton(String.valueOf(val));
            botao.setFont(fonte);
            botao.setFocusPainted(false);
            botao.setBackground(Color.WHITE);

            int index = i;
            botao.addActionListener(e -> {
                if (botao.isSelected()) {
                    int confirm = JOptionPane.showConfirmDialog(this, "Deseja depositar " + val + "?");
                    if (confirm != JOptionPane.YES_OPTION) {
                        botao.setSelected(false);
                    } else {
                        botao.setBackground(new Color(180, 255, 180));
                        atualizarTotal();
                    }
                } else {
                    int confirm = JOptionPane.showConfirmDialog(this, "Deseja remover o depósito de " + val + "?");
                    if (confirm != JOptionPane.YES_OPTION) {
                        botao.setSelected(true);
                    } else {
                        botao.setBackground(Color.WHITE);
                        atualizarTotal();
                    }
                }
            });

            botoes.add(botao);
            grid.add(botao);
        }

        JScrollPane scroll = new JScrollPane(grid);
        add(scroll, BorderLayout.CENTER);

        JPanel rodape = new JPanel();
        totalLabel = new JLabel("Total Depositado: 0");
        totalLabel.setFont(fonte);

        JButton toggleTotal = new JButton("Ocultar/Mostrar Total");
        toggleTotal.setFont(fonte);
        toggleTotal.addActionListener(e -> {
            totalVisivel = !totalVisivel;
            totalLabel.setVisible(totalVisivel);
        });

        rodape.add(toggleTotal);
        rodape.add(totalLabel);
        add(rodape, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void atualizarTotal() {
        int total = 0;
        for (int i = 0; i < botoes.size(); i++) {
            if (botoes.get(i).isSelected()) {
                total += valores.get(i);
            }
        }
        totalLabel.setText("Total Depositado: " + total);
    }

    private void gerarValoresAleatorios(int somaTotal, int min, int max) {
        valores = new ArrayList<>();
        Random rand = new Random();
        int soma = 0;

        while (soma < somaTotal) {
            int val = rand.nextInt(max - min + 1) + min;
            if (soma + val <= somaTotal) {
                valores.add(val);
                soma += val;
            }
        }
        Collections.shuffle(valores);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(novo::new);
    }
}
