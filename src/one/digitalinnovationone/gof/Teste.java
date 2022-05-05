package one.digitalinnovationone.gof;

import one.digitalinnovationone.gof.padrao_facade.Facade;
import one.digitalinnovationone.gof.padrao_singleton.SingletonEager;
import one.digitalinnovationone.gof.padrao_singleton.SingletonLazy;
import one.digitalinnovationone.gof.padrao_singleton.SingletonLazyHolder;
import one.digitalinnovationone.gof.padrao_strategy.Comportamento;
import one.digitalinnovationone.gof.padrao_strategy.Comport_Agressivo;
import one.digitalinnovationone.gof.padrao_strategy.Comport_Defensivo;
import one.digitalinnovationone.gof.padrao_strategy.Comport_Normal;
import one.digitalinnovationone.gof.padrao_strategy.Robo;

public class Teste {
	
	public static void main(String[] args) {
		
		// Testes sobre Design Pattern Singleton
		
		SingletonLazy lazy = SingletonLazy.getIntancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getIntancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		// Strategy
				
		Comportamento defensivo = new Comport_Defensivo();
		Comportamento normal = new Comport_Normal();
		Comportamento agressivo = new Comport_Agressivo();
		
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		
		// Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Monikeily", "64090000");
		
		
		
		
	}

}
