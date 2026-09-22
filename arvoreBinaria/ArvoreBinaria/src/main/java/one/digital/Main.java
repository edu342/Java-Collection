package one.digital;

import one.digital.models.Obj;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static void main(String[] args) {

        ArvoreBinaria<Obj> minhaArvore = new ArvoreBinaria<>();

        minhaArvore.inserir(new Obj(14));
        minhaArvore.inserir(new Obj(10));
        minhaArvore.inserir(new Obj(24));
        minhaArvore.inserir(new Obj(67));
        minhaArvore.inserir(new Obj(9));
        minhaArvore.inserir(new Obj(1));
        minhaArvore.inserir(new Obj(50));
        minhaArvore.inserir(new Obj(5));

        minhaArvore.exibirEmOrdem();
        minhaArvore.exibirPreOrdem();
        minhaArvore.exibirPosOrdem();

    }
}
