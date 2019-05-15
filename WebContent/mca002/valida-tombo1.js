function tombo(){
	var derivada = 0;
	var coef;
	var pot = 0;
	for(var i = pot; i >=0; i--){
		derivada += 1;
		coef *= pot;
		pot -= 1;
		resultado.value = "<br>Derivada = " + derivada + "º grau<br>Coeficiente = " + coef + "\nPotência = " + pot;
	}
			
}

function validaCoef(){
	if(coef.value === ""){
		alert("Informe um valor de Coeficiente!");
	}else if(isNaN(coef.value)){
		alert("Coeficiente deve ser um número")
	}
}

function validaPot(){
	if(pot.value === ""){
		alert("Informe um valor da Potência!");
	}else if(isNaN(pot.value)){
		alert("Potência deve ser um número!");
	}
}

function derivar(){
	var vCoef = parseInt(coef.value);
	var vPot = parseInt(pot.value);
	var vDer = 0;
	
	for(var i = vPot; i >= 0; i--){
		vDer += 1;
		vCoef *= vPot;
		vPot -= 1;
	}

	resultado.value = "<br>Derivada = " + vDer + "º grau<br>Coeficiente = " + vCoef + "\nPotência = " + vPot;
	
}