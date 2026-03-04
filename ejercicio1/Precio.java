import java.lang.reflect.Array;

public class Precio {

        int[] precios = {10, 20, 30,
        };

        /*lo us´´e como el de ahorita  */
        int precioUno = 0;
        int precioDos = 0;
        int precioTres = 0;
     

        for (int i = 0; i < precio.lenght; i++) {
          if (precioDos > precioUno) {
            precioDos = precioUno;
            precioUno= precioDos;

          } else if (precioTres > precioUno && precioTres > precioDos) {
            precioTres = precioUno;
            precioDos = precioTres;
            precioUno = precioDos;
          } else 
            {

          }
        }
    }




/*---

## Ejercicio 1 (Básico) 

### Descripción
Dado un arreglo de enteros `precios`, encuentra los **3 precios más altos** y muéstralos en **orden descendente**.

- Si el arreglo tiene menos de 3 elementos, devuelve **todos** los elementos ordenados de mayor a menor.
- **No está permitido usar** funciones de ordenamiento del lenguaje:
  - JavaScript: `Array.sort()`
  - Java: `Arrays.sort()` / `Collections.sort()`

### Objetivo de aprendizaje
- Recorrer arreglos
- Comparar valores
- Mantener el “Top 3” actualizado con lógica condicional
- Modularizar en funciones (por ejemplo: insertar en top)

### Restricciones
- `1 ≤ n ≤ 100000`
- `0 ≤ precios[i] ≤ 10^9`

---*/