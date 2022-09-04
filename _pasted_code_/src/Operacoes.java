public class Operacoes extends Pessoa {

ArrayList<Pessoa> listaPessoa = new ArrayList<>();

public void inserePessoa(Object usuario) {
    listaPessoa.add((Pessoa) usuario);
}

public String consultaPessoa() {
    for (Pessoa c: listaPessoa) {
        System.out.println(listaPessoa.get(0));
    }
    return "oi";
}}