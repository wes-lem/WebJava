public class Rectangle{
    private double lenght;
    private double width;

    public Rectangle(double lenght, double widht){
        setMedidas(lenght, widht);
    }
    public Rectangle(){
        setMedidas(1,1);
    }

    public void setLenght(double lenght){
        if(lenght < 0 || lenght > 20){
            throw new IllegalArgumentException("Valores fora do padrão (0 > lenght < 20)");
        }
        this.lenght = lenght;
    }

    public void setWidth(double width){
        if(width < 0 || width > 20){
            throw new IllegalArgumentException("Valores fora do padrão (0 > width < 20)");
        }
        this.width = width;
    }

    public void setMedidas(double lenght, double width){
        if(width < 0 || width > 20 || lenght < 0 || lenght > 20){
            throw new IllegalArgumentException("Valores fora do padrão (0 > medidas < 20)");
        }else{
            setLenght(lenght);
            setWidth(width); 
        }
    }

    public String toString(){
        return "Largura: "+ width +"\nAltura: "+ lenght;
    }
}