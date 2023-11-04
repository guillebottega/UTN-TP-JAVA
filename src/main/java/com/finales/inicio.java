package com.finales;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class inicio {
	@SuppressWarnings("null")
	public static void main(String[] args) {		
	
			String filePath ="C:\\Users\\Usuario\\eclipse-workspace\\finales\\src\\main\\java\\com\\finales\\resultados.csv";
			List<Participante> participantes= new ArrayList<>();
			List<Partido> partidos = new ArrayList<>(); 
			List<resultadoEnum> resul = new ArrayList<>();
			
			try (Stream<String> streanfile = Files.lines(Paths.get(filePath))) {				
			
				   participantes = streanfile.map(linea -> linea.split(";")).map(arreglo-> {					
					Participante part=new Participante(arreglo[0], filePath);
					System.out.println("fase de campeonato: " +arreglo[0]);
					return part;
					
				   }).collect(Collectors.toList());	
					
				   } catch (IOException io) {
				System.err.println("error"+ io.getMessage());
			}	
			
			try (Stream<String> streanfile = Files.lines(Paths.get(filePath))) {	
				resul = streanfile.map(linea -> linea.split(";")).map(arre-> {
					resultadoEnum par =new resultadoEnum(arre[2],arre[3]);						
					  int[] arregloDeEnteros = new int[1];
					  int[] arregloDeEnteros2 = new int[1];
					  
					  for (int i = 0; i < arregloDeEnteros.length; i++) {
						  arregloDeEnteros[i] =Integer.parseInt(arre[2]);						 
			            }
					  for (int j = 0; j < arregloDeEnteros.length; j++) {
						  arregloDeEnteros2[j] =Integer.parseInt(arre[3]);						 
			            }
					  for (int i = 0; i < arregloDeEnteros.length; i++) {
						   if(arregloDeEnteros[i]==arregloDeEnteros2[i]) {
							  System.out.println("empate"); 
						   } else if (arregloDeEnteros[i]>arregloDeEnteros2[i]){
							   System.out.println("local"); 
						   } else {
							   System.out.println("visitante");
						   }					  
					  }					
					return par;		
					}).collect(Collectors.toList());
			 } catch (IOException io) {
					System.err.println("error"+ io.getMessage());
				}	
					
			
			}

	

	
			
	}

