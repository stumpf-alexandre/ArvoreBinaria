package ArvoreBinaria;

public class Arvore {
    int altEsq;
    int altDir;
    No raiz;
    public Arvore(){
        this.raiz=null;
    }


    public int alturaArvore(No raiz){
        if (raiz==null){
            return 0;
        }
        else {
            altEsq = alturaArvore(raiz.esq);
            altDir = alturaArvore(raiz.dir);
            if (altEsq>altDir){
                return altEsq+1;
            }
            else {
                return altDir+1;
            }
        }
    }

    public int totalNo(No raiz){
        if (raiz==null){
            return 0;
        }
        else {
            int qtdNoEsq=totalNo(raiz.esq);
            int qtdNoDir=totalNo(raiz.dir);
            return qtdNoDir+qtdNoEsq+1;
        }
    }

    public void inserir(int m){
        if (this.raiz==null){
            raiz=new No(m);
            System.out.println(raiz.matricula+" Inserido na Posição da Raiz");
        }
        else {
            raiz.inserirNo(raiz, m);
        }
    }

    public No remover(No raiz, int m) {
        if (this.raiz==null){
            System.out.println("Arvore Vazia");
        }
        else {
            if (m < raiz.matricula) {
                raiz.esq = remover(raiz.esq, m);
            }
            else if (m > raiz.matricula) {
                raiz.dir = remover(raiz.dir, m);
            }
            else if (m == raiz.matricula) {
                if (raiz.esq == null && raiz.dir == null) {
                    System.out.println("Nó " + raiz.matricula + " removido");
                    raiz = (raiz.esq == null && raiz.dir == null) ? raiz.esq : raiz.dir;
                }
                else {
                    if (raiz.esq != null && raiz.dir == null) {
                        System.out.println("Nó "+raiz.matricula+" foi removido");
                        this.raiz=raiz.esq;
                    }
                    else if (raiz.dir != null && raiz.esq == null) {
                        System.out.println("Nó "+raiz.matricula+" foi removido");
                        this.raiz=raiz.dir;

                    }
                    else if (raiz.dir != null && raiz.esq != null) {
                        System.out.println("Nó " + raiz.matricula + " removido");
                        raiz.matricula = raiz.encontraMaxDoMin(raiz.dir).matricula;
                        raiz.dir = raiz.removerMaxDoMin(raiz.dir);
                    }
                }
            } else {
                System.out.println("Matricula não encontrada");
            }
        }
        return raiz;
    }

    public void emFixa(No raiz){
        if (raiz!=null){
            emFixa(raiz.esq);
            System.out.printf(raiz.matricula+" ");
            emFixa(raiz.dir);
        }
    }

    public void preFixa(No raiz){
        if (raiz!=null){
            System.out.printf(raiz.matricula+" ");
            preFixa(raiz.esq);
            preFixa(raiz.dir);
        }
    }

    public void posFixa(No raiz){
        if (raiz!=null){
            posFixa(raiz.esq);
            posFixa(raiz.dir);
            System.out.printf(raiz.matricula+" ");
        }
    }
}