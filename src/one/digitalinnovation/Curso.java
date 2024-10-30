public class Curso extends Conteudo{

    
    private Double cargaHoraria;

    
    
    public Double getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(Double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
   
    @Override
    public String toString() {
        return "Curso [titulo=" + getTitulo() + "]";
    }
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    
}
