package metodos;















//IMPORTANTE SI LO VAS USAR EN UN EXAMEN CAMBIA VARIABLES NOMBRE DE METODOS Y TODOS LOS COMENTARIOS

//CAMBIA
//TODO
//!
//!
//!















public class metodosFormas {

	public static void main(String[] args) {
		
		
		
	}
	
	static void dibujarTrianguloV1() {
		
		int filas = 5;
        int columnas = 9;

        // Crear la matriz bidimensional para representar el triángulo
        String[][] triangulo = new String[filas][columnas];

        // Inicializar la matriz con espacios en blanco
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                triangulo[i][j] = " ";
                
                triangulo[filas-1][i]="";
            }
        }

        // Dibujar el contorno del triángulo en la matriz
        for (int i = 0; i < filas; i++) {
            triangulo[i][columnas / 2 - i] = "*"; // Lado izquierdo
            triangulo[i][columnas / 2 + i] = "*"; // Lado derecho
            triangulo[filas - 1][i*2] = "*"; // Base del triángulo
            
        }

        // Imprimir la matriz en la consola
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(triangulo[i][j]);
            }
            System.out.println(); // Nueva línea después de cada fila
        }
		
	}
	
	static void dibujarTrianguloVacioV2() {
		

		// Definir el tamaño del triángulo
        int altura = 5;

        // Crear una matriz para el triángulo
        char[][] triangulo = new char[altura][altura * 2 - 1];

        // Inicializar la matriz con espacios en blanco
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura * 2 - 1; j++) {
                triangulo[i][j] = ' ';
            }
        }

        // Dibujar el triángulo en la matriz
        for (int i = 0; i < altura; i++) {
            triangulo[i][altura - 1 - i] = '*'; // Lado izquierdo
            triangulo[i][altura - 1 + i] = '*'; // Lado derecho
            triangulo[altura - 1][i * 2] = '*'; // Base del triángulo
        }

        // Imprimir el triángulo en la consola
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura * 2 - 1; j++) {
                System.out.print(triangulo[i][j]);
            }
            System.out.println(); // Nueva línea después de cada fila
        }

	}
	
	static void dibujarTrianguloIzquierda() {
		
		// Definir el tamaño del triángulo
        int altura = 5;

        // Crear una matriz para el triángulo
        char[][] triangulo = new char[altura][altura];

        // Inicializar la matriz con espacios en blanco
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                triangulo[i][j] = ' ';
            }
        }

        // Dibujar el triángulo en la matriz
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j <= i; j++) {
                triangulo[i][j] = '*';
            }
        }

        // Imprimir el triángulo en la consola
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                System.out.print(triangulo[i][j]);
            }
            System.out.println(); // Nueva línea después de cada fila
        }
	}
	
	static void dibujarTrianguloSencillo() {
		
		// Definir el tamaño del triángulo
        int altura = 5;

        // Crear una matriz para el triángulo
        char[][] triangulo = new char[altura][altura];

        // Inicializar la matriz con espacios en blanco
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                triangulo[i][j] = ' ';
            }
        }

        // Dibujar el triángulo en la matriz
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j <= i; j++) {
                if (j % 2 == 0) {//cambiar J por I en caso de que sea por filas
                    triangulo[i][j] = '+';
                } else {
                    triangulo[i][j] = '-';
                }
            }
        }

        // Imprimir el triángulo en la consola
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                System.out.print(triangulo[i][j]);
            }
            System.out.println(); // Nueva línea después de cada fila
        }
    
		
		
	}
	
	static void rectanguloParesImpares(){
		
		// Definir las dimensiones del rectángulo
        int filas = 5;
        int columnas = 12;

        // Crear una matriz para el rectángulo
        char[][] rectangulo = new char[filas][columnas];

        // Inicializar la matriz con espacios en blanco
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                rectangulo[i][j] = ' ';
            }
        }

        // Dibujar el rectángulo en la matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (j % 2 == 0) {//cambiar J por I si es por filas
                    rectangulo[i][j] = '+';
                } else {
                    rectangulo[i][j] = '-';
                }
            }
        }

        // Imprimir el rectángulo en la consola
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(rectangulo[i][j]);
            }
            System.out.println(); // Nueva línea después de cada fila
        }
	}
	
	static void romboParesImpares() {
		
		// Definir la altura del rombo (debe ser un número impar)
        int altura = 20;

        // Crear una matriz para el rombo
        char[][] rombo = new char[altura][altura];

        // Inicializar la matriz con espacios en blanco
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                rombo[i][j] = ' ';
            }
        }

        // Dibujar la parte superior del rombo en la matriz
        for (int i = 0; i < altura / 2 + 1; i++) {
            for (int j = 0; j < altura; j++) {
                if (j >= altura / 2 - i && j <= altura / 2 + i) {
                    if (i % 2 == 0) { // si CAMBIAs I por j se hacen las columnas
                        rombo[i][j] = '+';
                    } else {
                        rombo[i][j] = '-';
                    }
                }
            }
        }

        // Dibujar la parte inferior del rombo en la matriz
        for (int i = altura / 2 + 1; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                if (j >= i - altura / 2 && j <= altura - 1 - (i - altura / 2)) {
                    if (i % 2 == 0) {
                        rombo[i][j] = '+';
                    } else {
                        rombo[i][j] = '-';
                    }
                }
            }
        }

        // Imprimir el rombo en la consola
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                System.out.print(rombo[i][j]);
            }
            System.out.println(); // Nueva línea después de cada fila
        }
	}
	
	static void romboVacioParesImpares()
	{
		
		 // Definir la altura del rombo (debe ser un número impar)
        int altura = 15;

        // Crear una matriz para el rombo
        char[][] rombo = new char[altura][altura];

        // Inicializar la matriz con espacios en blanco
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                rombo[i][j] = ' ';
            }
        }

        // Dibujar la parte superior del rombo en la matriz
        for (int i = 0; i < altura / 2 + 1; i++) {
            for (int j = 0; j < altura; j++) {
                if (j == altura / 2 - i || j == altura / 2 + i) {
                    rombo[i][j] = (j % 2 == 0) ? '+' : '-';//cambiar j por i para hacero por columnas
                }
            }
        }

        // Dibujar la parte inferior del rombo en la matriz
        for (int i = altura / 2 + 1; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                if (j == i - altura / 2 || j == altura - 1 - (i - altura / 2)) {
                    rombo[i][j] = (i % 2 == 0) ? '+' : '-';
                }
            }
        }

        // Imprimir el rombo en la consola
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                System.out.print(rombo[i][j]);
            }
            System.out.println(); // Nueva línea después de cada fila
        }
		
	}
}
