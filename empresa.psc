Algoritmo empresa
	Definir dias,gsto_comida,gasto_hotel, total Como Real 
	Escribir " ingrese los dias de viaje"
	leer dias
	Escribir "ingrese el gasto de hotel por dia"
	Leer gastos_hotel
	escribir "ingresa el gasto de comida diario "
	leer gasto_comida
	total=(gasto_hotel*dias)+(gasto_comida*dias)+(dias*100)
	Escribir "el total de dinero para comida es:$",gasto_comida*dias
	Escribir "el total de dinero para hotel es:$",gasto_hotel*dias
	Escribir "el total de dinero para otros gastos es: $",dias *100
	Escribir "el dinero total por el viaje es:$",total
FinAlgoritmo
