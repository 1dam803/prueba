package programa;

import interfaz.principal;

/**
 * 	Clase con los m�todos usados para el control
 *  de las vidas y los finales del juego.
 */

public class Vidas {
	
	private static boolean finaljuego = false;
	
	public static void resetear() {
		
		finaljuego = false;
		
	}
	
	public static boolean getFinalJuego() {
		
		return finaljuego;
	}
	
	public static int restarVidas(int aciertos, int vidas){
		
		if (aciertos == 0) {
			vidas--;
		}
		return vidas;
	}
	
	public static void muestraResultado(int aciertos, int vidas) throws InterruptedException {
		
		if (aciertos == 0) {

			principal.escribeTerminal("\n\n�No se encuentra coincidencia!\n");
			principal.muestraPantalla(97);
			Thread.sleep(1000);
			principal.muestraPantalla(vidas);
			principal.borrarTerminal();
		}
		
		else if (aciertos == 1) {

			principal.escribeTerminal("\n\n�" +aciertos+ " coincidencia encontrada!\n");
			principal.muestraPantalla(96);
			Thread.sleep(1000);
			principal.muestraPantalla(vidas);
			principal.borrarTerminal();
			
		} 
		
		else if (aciertos > 1) {
			
			principal.escribeTerminal("\n\n�" +aciertos+ " coincidencias encontradas!\n");
			principal.muestraPantalla(96);
			Thread.sleep(1000);
			principal.muestraPantalla(vidas);
			principal.borrarTerminal();
			
		}

	}
	
	public static void finalJuego(String palabra, int aciertostotales, int vidas) throws InterruptedException {
		
		if (vidas == 0) {
			finaljuego = true;
			principal.muestraPantalla(vidas);
			Thread.sleep(1000);
			principal.escribeTerminal("���������������������������������������ͻ"
								  + "\n�                                       �" 
								  + "\n�     ____ ____ ____ ____ ____ ____     �" 
								  + "\n�     |__| |    |    |___ [__  [__      �" 
								  + "\n�     |  | |___ |___ |___ ___] ___]     �" 
								  + "\n�      ___  ____ _   _ _ ____ ___       �"
								  + "\n�      |  \\ |___ |\\  | | |___ |  \\      �" 
								  + "\n�      |__/ |___ |  \\| | |___ |__/      �"
								  + "\n�                                       �" 
								  + "\n�  �ALERTA! Intruso detectado �ALERTA!  �"  
								  + "\n�         BLOQUEANDO SISTEMAS...        �" 
								  + "\n�      Pulsa Intro para continuar.      �"
								  + "\n�                                       �"
								  + "\n���������������������������������������ͼ\n");
			
			principal.muestraPantalla(99);
			while (principal.leerLetra() != '\n') {
			
				principal.escribeTerminal("");
			}

		} if (vidas == 1) {
			
			principal.escribeTerminal("������������������������������������������\n");
			principal.escribeTerminal("      Te queda solo una oportunidad\n");
			principal.escribeTerminal("������������������������������������������\n\n");
			Thread.sleep(1000);
			principal.borrarTerminal();
			principal.muestraPantalla(vidas);
			
		} else {

			principal.escribeTerminal("������������������������������������������\n");
			principal.escribeTerminal("        Te quedan " + vidas + " oportunidades\n");
			principal.escribeTerminal("������������������������������������������\n\n");
			Thread.sleep(1000);
			principal.borrarTerminal();
			principal.muestraPantalla(vidas);
		}
		
		if (palabra.length() == aciertostotales) {
			finaljuego = true;
			principal.escribeTerminal("���������������������������������������ͻ"
								  + "\n�                                       �" 
								  + "\n�     ____ ____ ____ ____ ____ ____     �" 
								  + "\n�     |__| |    |    |___ [__  [__      �" 
								  + "\n�     |  | |___ |___ |___ ___] ___]     �" 
								  + "\n�   ____ ____ ____ _   _ ___ ____ ___   �"
								  + "\n�   | __ |__/ |__| |\\  |  |  |___ |  \\  �" 
								  + "\n�   |__] |  \\ |  | |  \\|  |  |___ |__/  �"
								  + "\n�                                       �" 
								  + "\n�   �Enhorabuena! El password ha sido   �"  
								  + "\n�   sido hackeado satisfactoriamente.   �" 
								  + "\n�      Pulsa Intro para continuar.      �"
								  + "\n�                                       �"
								  + "\n���������������������������������������ͼ\n");

			principal.muestraPantalla(98);
				while (principal.leerLetra() != '\n') {
			
			principal.escribeTerminal("");
			}
			
	
		}
		
		
	}
	
}
