package view;

import model.ILista;
import model.Lista;

public class Principal {
	 public static void main(String[] args) throws Exception {
		 ILista lista = new Lista();
		ILista listaaux=new Lista();
			
		    lista.addFirst(10);
			lista.add(5,1);
			lista.add(8,2);
			lista.add(1,3);
			lista.add(9,4);
			lista.add(2,5);
			lista.add(4,6);
			lista.add(7,7);
			lista.add(3,8);
			lista.addLast(6);
			System.out.println("Lista normal: ");
			for(int i=0; i<lista.size(); i++) {
				System.out.print(lista.get(i)+" ");
			
				 }
			System.out.println();
			for(int i=0; i<lista.size(); i++) {
						listaaux.addFirst(lista.get(i));	
						
					}
			
			System.out.println("Lista Invertida: ");
			for(int i=0; i<listaaux.size();i++) {
				System.out.print(listaaux.get(i)+" ");
			}
			
				}
				
						
				
		
			
		}
	 



