package model;

public abstract class Animal {
    private String nombre;
    private int edad;
    private float peso;

    public Animal(String nombre, int edad, float peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public float getPeso() { return peso; }
    public void setPeso(float peso) { this.peso = peso; }

    public abstract void comer();
    public abstract void dormir();
    public abstract void desplazarse();
}
