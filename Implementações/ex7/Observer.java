package uff.ic.lleme.tcc00328.trabalhos.grupo1.Ex7;

public interface Observer<T extends Subject> {
    
    public void atualizar(T observado);
}
