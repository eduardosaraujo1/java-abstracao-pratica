package br.cps.fatecpg.app.models;
//3. Médico
//ATRIBUTOS
//-nome
//-crm
//-especialidade
//-hospital_atual
//MÉTODOS
//-diagnosticar()
//-prescreverMedicamento()
//-requisitarExame()
public class Medico {
    //ATRIBUTOS
    public String nome;
    public String crm;
    public String especialidade;
    public String hospital_atual;
    //MÉTODOS
    public void diagnosticar() {
        System.out.println("Diagnosticando paciente...");
        System.out.println("Paciente diagnosticado com êxito.");
    }
    public void prescreverMedicamento() {
        System.out.println("Prescrevendo medicamento para paciente...");
        System.out.println("Medicamento prescrevido com êxito.");
    }
    public void requisitarExame() {
        System.out.println("Requisitando exame para paciente...");
        System.out.println("Exame requisitado com êxito.");
    }
}
