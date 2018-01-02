package ArvoreBinaria;

import java.util.Scanner;

public class TestaArvore2 {
    public static void main(String[] args) {
        int op=0;
        int matric;
        int remov;
        Scanner tc=new Scanner(System.in);
        Arvore arv=new Arvore();
        do {
            System.out.println("\nDigite uma opção");
            System.out.println("para incrementar a arvore binaria");
            System.out.println("1-Para Acrescentar uma Matricula na Árvore");
            System.out.println("2-Para Excluir uma Matricula na Árvore");
            System.out.println("3-Para Imprimir as Matriculas na Árvore");
            System.out.println("4-Para Encerrar o Programa");
            op=tc.nextInt();
            System.out.println("\nArvore com altura de "+arv.alturaArvore(arv.raiz)+" nós");
            System.out.println("\nArvore com total de "+arv.totalNo(arv.raiz)+" nós\n");
            switch (op){
                case 1:{
                    System.out.println("Digite o numero da matricula para inserir na arvore: ");
                    matric=tc.nextInt();
                    arv.inserir(matric);
                    break;
                }
                case 2:{
                    System.out.println("Digite o numero da matricula para excluir da arvore: ");
                    remov=tc.nextInt();
                    arv.remover(arv.raiz, remov);
                    break;
                }
                case 3:{
                    op=0;
                    do {
                        System.out.println("\nDigite uma opção para imprimir a arvore binaria");
                        System.out.println("1-Imprimir a arvore pré-ordem");
                        System.out.println("2-Imprimir a arvore em ordem");
                        System.out.println("3-Imprimir a arvore pós-ordem");
                        System.out.println("4-Sair do Sub-Menu de impressão");
                        op=tc.nextInt();
                        switch (op){
                            case 1:{
                                System.out.println("Árvore Pré-Ordem ");
                                arv.preFixa(arv.raiz);
                                break;
                            }
                            case 2:{
                                System.out.println("Árvore Em-Ordem ");
                                arv.emFixa(arv.raiz);
                                break;
                            }
                            case 3:{
                                System.out.println("Árvore Pós-Ordem ");
                                arv.posFixa(arv.raiz);
                                break;
                            }
                            case 4:{
                                System.out.println("Sub-Menu de Impressão Encerrado");
                                break;
                            }
                            default:{
                                System.out.println("Opção invalida");
                                System.out.println("Digite outra opção");
                                break;
                            }
                        }
                    }while (op!=4);
                    op=0;
                    break;
                }
                case 4:{
                    System.out.println("Encerrar Programa");
                    break;
                }
                default:{
                    System.out.println("Opção invalida");
                    System.out.println("Digite outra opção");
                    break;
                }
            }
        }while (op!=4);
    }
}
