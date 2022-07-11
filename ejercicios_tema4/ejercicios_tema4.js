    // Condicional
const numeroif = 12;
if(numeroif > 0 || numeroif < 0 || numeroif == 0){
    console.log("el numero es: " + numeroif);
}

    //Bucle While
let numeroWhile = 0;
while(numeroWhile < 3){
    numeroWhile ++;
    console.log(numeroWhile);
}

    //Bucle Do While
numeroWhile = 3;
do{
    console.log(numeroWhile);
}
while(numeroWhile < 3)

    //bucle For
let numeroFor = 3;
for(let i = 0; i <= 3; i++){
    console.log(i)
}

    // Switch
const estacion = "invierno";
switch (estacion) {
    case "otoño":
        console.log("La estacion es: otono");
        break;
    case "invierno":
        console.log("La estacion es: invierno");
        break;
    case "primavera":
        console.log("La estacion es: Primavera");
    default:
        console.log("La estacion es: verano");
        break;
}