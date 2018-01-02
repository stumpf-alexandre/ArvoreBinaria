package ArvoreBinaria;

public class No {
    int matricula;
    No esq;
    No dir;

    public No(int mat){
        this.matricula=mat;
    }

    public void inserirNo(No no, int mat){
        if (no.matricula==mat){
            System.out.println("Matricula já existente");
        }
        else if (mat<no.matricula){
            if (no.esq!=null){
                inserirNo(no.esq, mat);
            }
            else {
                System.out.println("Matricula "+ mat +" inserida a esquerda da matricula "+no.matricula);
                no.esq=new No(mat);
            }
        }
        else if (mat>no.matricula){
            if (no.dir!=null){
                inserirNo(no.dir, mat);
            }
            else {
                System.out.println("Matricula "+ mat +" inserida a direita da matricula "+no.matricula);
                no.dir=new No(mat);
            }
        }
    }

    public No removerMaxDoMin(No no) {
        if (no==null){
            System.out.println("ERRO");
        }
        else if (no.esq!=null){
            no.esq=removerMaxDoMin(no.esq);
            return no;
        }
        else {
            return no.dir;
        }
        return null;
    }

    public No encontraMaxDoMin(No no){
        if (no!=null){
            while (no.esq!=null){
                no=no.esq;
            }
        }
        return no;
    }
}