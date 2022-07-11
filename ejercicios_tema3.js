/*Primera Parte */
function suma(numero1, numero2, numero3){
return numero1 + numero2 + numero3;
}
suma(10, 10,10);

/*Segunda parte */
class Coche{
        constructor(puertas){
            this.puertas = puertas;
        }
        agregarPuertas(numero){
            
           this.puertas = this.puertas + numero;
        }
}

let miCoche = new Coche(3);
miCoche.agregarPuertas(2);
console.log(miCoche)