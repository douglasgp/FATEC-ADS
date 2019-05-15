function validarNome() {
	if (nome.value == "") {
		alert("Informe o nome do segurado!");
	}
}

function validarSexo() {
	if ((sexo.value != "F" && sexo.value != "M")
			&& (sexo.value != "f" && sexo.value != "m")) {
		alert("Informe um sexo válido! (m/f)");
	}
}

function validarAnoNasc() {
	if (anoNasc.value === "") {
		alert("Informe um ano de nascimento!");
	} else if (!isNaN(anoNasc.value)) {
		var ano = parseInt(anoNasc.value);
		if (ano < 1901 || ano > 2001) {
			alert("Idade inválida para gerar apólice.\nInforme outra data de nascimento.");
		}
	} else {
		alert("Ano de Nascimento deve ser um número!");
	}
}

function validarAnoFabric() {
	if (anoFabric.value === "") {
		alert("Informe Ano de Fabricação!");
	} else if (!isNaN(anoFabric.value)) {
		var fabric = (anoFabric.value);
		if (fabric <= 0) {
			alert("Ano de Fabricação INVÁLIDO!");
		}
	} else {
		alert("Ano de Fabricação deve ser numérico!")
	}
}

function validarValorVeiculo() {
	if (valorVeiculo.value === "") {
		alert("Informe o Valor do Veículo!")
	} else if (!isNaN(valorVeiculo.value)) {
		var valor = parseDouble(valorVeiculo.value);
		if (valor < 0.0) {
			alert("Valor de Veículo não pode ser negativo!")
		}
	} else {
		alert("Valor do Veículo deve ser um número!")
	}
}

function validarBonus() {
	if (bonus.value === "") {
		alert("Informe uma Porcentagem de Bônus!");
	} else if (!isNaN(bonus.value)) {
		var premio = parseFloat(bonus.value);
		if (premio < 0 || premio > 25) {
			alert("Porcentagem de Bônus INVÁLIDA!");
		}
	} else {
		alert("Porcentagem de Bônus deve ser um número!");
	}
}

function calculaApolice() {
	var valorApolice;
	var vVeiculo = parseFloat(valorVeiculo.value);
	var ano = parseInt(anoFabric.value);
	var vSexo = sexo.value;
	var hoje = new Date();
	var vHoje = hoje.getFullYear() - parseInt(anoNasc.value);
	var vBonus = parseFloat(bonus.value);
	var valorVeic = parseFloat(valorVeiculo.value);

	if (ano >= 2010 && ano <= 2019) {
		valorApolice = (1.25 * valorVeic) / 100;
	} else if (ano >= 2000 && ano <= 2009) {
		valorApolice = (1.75 * valorVeic) / 100;
	} else if (ano >= 1980 && ano <= 1999) {
		valorApolice = (2.00 * valorVeic) / 100;
	} else {
		valorApolice = (2.50 * valorVeic) / 100;
	}
	if (vSexo == "f" || vSexo == "F") {
		valorApolice = (valorApolice * 10) / 100;
	} else if(vSexo == "m" || vSexo == "M") {
		valorApolice = (valorApolice * 05) / 100;
	}
	if(vHoje < 30 || vHoje > 60){
		valorApolice = (valorApolice * 20) / 100;
	}
	/*
	valorApolice = (valorApolice * vBonus) / 100;
	*/
	resultado.innerHTML = "Valor de desconto pelo ano do veículo: R$ " + valorApolice;	
}