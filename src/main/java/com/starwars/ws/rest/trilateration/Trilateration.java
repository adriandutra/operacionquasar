package com.starwars.ws.rest.trilateration;

public class Trilateration {

	
	public static Point getLocation(Point punto1, double distanciap1,
			                           Point punto2, double distanciap2, 
			                           Point punto3, double distanciap3 ){
		
		Point retorno = new Point();
		retorno.setNombre("position");
        double[] P1   = new double[2];
        double[] P2   = new double[2];
        double[] P3   = new double[2];
        double x;
        double y;

        P1[0] = punto1.getLatitud();
        P1[1] = punto1.getLongitud();
        
        P2[0] = punto2.getLatitud();
        P2[1] = punto2.getLongitud();
        
        P3[0] = punto3.getLatitud();
        P3[1] = punto3.getLongitud();

        double a1Sq = P1[0] * P1[0], a2Sq = P2[0] * P2[0], a3Sq = P3[0] * P3[0], b1Sq = P1[1] * P1[1], b2Sq = P2[1] * P2[1], 
        	       b3Sq = P3[1] * P3[1], r1Sq = distanciap1 * distanciap1, r2Sq = distanciap2 * distanciap2, r3Sq = distanciap3 * distanciap3;
        		   

        double numerator1 =	(P2[0] - P1[0]) * (a3Sq + b3Sq - r3Sq) + 
        	(P1[0] - P3[0]) * (a2Sq + b2Sq - r2Sq) + (P3[0] - P2[0]) * (a1Sq + b1Sq -r1Sq);

        double denominator1 = 2 * ( P3[1] * (P2[0] - P1[0]) + P2[1] * (P1[0] - P3[0]) + P1[1] * (P3[0] - P2[0]));

        y = numerator1 / denominator1;

        double numerator2 = r2Sq - r1Sq + a1Sq - a2Sq + b1Sq - b2Sq - 2 * (P1[1] - P2[1]) * y;

        double denominator2 = 2 * (P1[0] - P2[0]);

        x = numerator2 / denominator2;
               
        retorno.setLatitud(Math.round(x));
               
        retorno.setLongitud(Math.round(y));

        return retorno;
		}
	
}
