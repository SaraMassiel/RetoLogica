public class factura {
      
        int subtotal=0;
        int descuento=0;
        
        if  (cupon.equals("DESC10")) {
            descuento = subtotal *10/100;
        } else if (cupon.equals("DESC20") && subtotal >= 200000) {
            descuento = subtotal *20/100;  
            else if (cupon .equals("FREESHIP")) {
                ENVIO = 0;}
        
        int base = subtotal - descuento;
        Double ivaTotal = base * 0.19; 
    int total = base + ivaTotal+ ENVIO}

    System.out.println("SUBTOTAL " + subtotal);
    System.out.println("DESCUENTO " + descuento);
    System.out.println("IVA " + ivaTotal);
    System.out.println("TOTAL " + total);

/*## Ejercicio 2 (Medio) 

### Descripción
Construye un programa que calcule una factura a partir de una lista de precios, un cupón y un costo de envío.

Reglas:
1. `subtotal = suma(precios)`
2. Aplicar cupón:
   - `"DESC10"`: descuento del 10% sobre el subtotal
   - `"DESC20"`: descuento del 20% sobre el subtotal **solo si** `subtotal >= 200000`
   - `"FREESHIP"`: el envío queda en `0` (sin descuento al subtotal)
   - `"NONE"`: sin cambios
3. `base = subtotal - descuento`
4. `iva = 19%` de `base` **(sin incluir envío)**
5. El `iva` debe **redondearse al entero más cercano** (0.5 hacia arriba)
6. `total = base + iva + envio`
### Objetivo de aprendizaje
- Recorrer arreglos con ciclos (`for` / `while`) y controlar límites (`0`, `n-1`)
- Usar condicionales para comparar valores y construir lógica (detección de picos)
- Crear y usar funciones para separar responsabilidades (invertir, sumar, max/min, picos)
- Manipular arreglos: invertir, generar listas de resultados (índices)
- Realizar cálculos básicos con cuidado de tipos numéricos y redondeo del promedio

### Entrada
1. Entero `n`
2. `n` enteros (precios)
3. String `cupon`
4. Entero `envio`
### Salida
Imprimir exactamente 4 líneas:
- `SUBTOTAL X`
- `DESCUENTO Y`
- `IVA Z`
- `TOTAL T`
### Restricciones
- `1 ≤ n ≤ 100000`
- `0 ≤ precios[i], envio ≤ 10^9`
- `cupon ∈ {NONE, DESC10, DESC20, FREESHIP}`
---*/