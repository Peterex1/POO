import sun.font.TrueTypeFont;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Telemovel {

    private String _marca;
    private String _modelo;
    private int _x;
    private int _y;
    private ArrayList<String> _mensagens;
    private int _armazenamento;
    private int _fotos;
    private int _aplicacoes;
    private int _ocupado;
    private int _n_fotos;
    private int _n_aplicacoes;
    private ArrayList<String> _nome_aplicacoes;

    public Telemovel() {
        this._marca = "";
        this._modelo = "";
        this._x = 0;
        this._y = 0;
        this._mensagens = new ArrayList<String>();
        this._armazenamento = 0;
        this._fotos = 0;
        this._aplicacoes = 0;
        this._ocupado = 0;
        this._n_fotos = 0;
        this._n_aplicacoes = 0;
        this._nome_aplicacoes = new ArrayList<String>();
    }

    public Telemovel(String marca,
                     String modelo,
                     int x,
                     int y,
                     ArrayList<String> mensagens,
                     int armazenamneto,
                     int fotos,
                     int aplicacoes,
                     int ocupado,
                     int n_fotos,
                     int n_aplicacoes,
                     ArrayList<String> nome_aplicacoes) {
        this._marca = marca;
        this._modelo = modelo;
        this._x = x;
        this._y = y;
        this._mensagens = mensagens;
        this._armazenamento = armazenamneto;
        this._fotos = fotos;
        this._aplicacoes = aplicacoes;
        this._ocupado = ocupado;
        this._n_fotos = n_fotos;
        this._n_aplicacoes = n_aplicacoes;
        this._nome_aplicacoes = nome_aplicacoes;
    }

    public Telemovel(Telemovel umTelemovel) {
        this._marca = umTelemovel.getMarca();
        this._modelo = umTelemovel.getModelo();
        this._x = umTelemovel.getX();
        this._y = umTelemovel.getY();
        this._mensagens = umTelemovel.getMensagens();
        this._armazenamento = umTelemovel.getArmazenamento();
        this._fotos = umTelemovel.getFotos();
        this._aplicacoes = umTelemovel.getAplicacoes();
        this._ocupado = umTelemovel.getOcupado();
        this._n_fotos = umTelemovel.getNFotos();
        this._n_aplicacoes = umTelemovel.getNAplicacoes();
        this._nome_aplicacoes = umTelemovel.getNomeAplicacoes();
    }

    public String getMarca() {
        return this._marca;
    }

    public String getModelo() {
        return this._modelo;
    }

    public int getX() {
        return this._x;
    }

    public int getY() {
        return this._y;
    }

    public ArrayList<String> getMensagens() {
        return this._mensagens;
    }

    public int getArmazenamento() {
        return this._armazenamento;
    }

    public int getFotos() {
        return this._fotos;
    }

    public int getAplicacoes() {
        return this._aplicacoes;
    }

    public int getOcupado() {
        return this._ocupado;
    }

    public int getNFotos() {
        return this._n_fotos;
    }

    public int getNAplicacoes() {
        return this._n_aplicacoes;
    }

    public ArrayList<String> getNomeAplicacoes() {
        return this._nome_aplicacoes;
    }

    public boolean existeEspaco(int numeroBytes) {
        if (this._armazenamento - this._ocupado > numeroBytes) return true;
        else return false;
    }

    public void instalaApp(String nome, int tamanho) {
        this._ocupado += tamanho;
        this._aplicacoes += tamanho;
        this._nome_aplicacoes.add(nome);
        ++this._n_aplicacoes;
    }

    public void recebeMsg(String msg) {
        this._mensagens.add(msg);
    }

    public double tamMedioApps() {
        return (this._aplicacoes * 1.0 / this._n_aplicacoes); // 1.0 para passar de int para double retornar int
    }

    public String maiorMsg() {
        int size = this._mensagens.size();
        String maior = this._mensagens.get(0);

        for (int i = 1; i < size; i++) {
            if (maior.length() < this._mensagens.get(i).length()) {
                maior = this._mensagens.get(i);
            }
        }

        return maior;
    }

    public void removeApp (String nome, int tamanho) {
        this._nome_aplicacoes.remove(this._nome_aplicacoes.indexOf(nome));
        this._ocupado -= tamanho;
        this._aplicacoes -= tamanho;
        --this._n_aplicacoes;
    }

}
