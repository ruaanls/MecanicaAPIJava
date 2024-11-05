package br.com.fiap.model;
import java.time.LocalDate;


public class Agendamentos
{

    private String horario;
    private Veiculo veiculo;
    private String tipoConserto;
    private CentrosAutomotivos centrosAutomotivos;
    private String caminhoCsv = "C:\\Users\\T-GAMER\\Desktop\\Nova pasta\\Challenge\\src\\br\\com\\fiap\\agendar\\agendamentos.csv";

    private LocalDate data;
    private long id;


    public Agendamentos()
    {

    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public String getTipoConserto() {
        return tipoConserto;
    }

    public void setTipoConserto(String tipoConserto) {
        this.tipoConserto = tipoConserto;
    }

    public CentrosAutomotivos getCentrosAutomotivos() {
        return centrosAutomotivos;
    }

    public void setCentrosAutomotivos(CentrosAutomotivos centrosAutomotivos) {
        this.centrosAutomotivos = centrosAutomotivos;
    }

    public String getCaminhoCsv() {
        return caminhoCsv;
    }

    public void setCaminhoCsv(String caminhoCsv) {
        this.caminhoCsv = caminhoCsv;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

/*
    public String Agendado(LocalTime horario, Veiculo veiculo, CentrosAutomotivos centroAutomotivo, String problema, String dataAgendar )
    {
        Random rand = new Random();
        int protocolo = rand.nextInt((90000) + 10000);
        return "Agendamento de conserto para o Veículo: "+veiculo.getMarca()+" - "+ veiculo.getModelo()+" Protocolo N- "+ protocolo + " Tipo de Conserto: " + problema +
                "\nLocal: " + centroAutomotivo + "Data: "+ dataAgendar + "\nHorário: " + horario;

    }

    public void gravarCsv(Agendamentos a, int indexCA)
    {
        try
        {
            boolean arquivoExiste = new File(caminhoCsv).exists();
            FileWriter escrever = new FileWriter(caminhoCsv, StandardCharsets.ISO_8859_1, arquivoExiste);
            if(!arquivoExiste)
            {
                escrever.write("Modelo Veículo;Ano Veiculo;problema;Centro Automotivo\n");
            }
            escrever.write(a.getVeiculo().getModelo()+";"+a.getVeiculo().getAno()+";"+a.tipoConserto+";"+centrosAutomotivos.get(indexCA).getNome()+"\n");
            escrever.flush();
            escrever.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }*/





}


