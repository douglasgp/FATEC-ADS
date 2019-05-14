/*
 * Campos são obrigatórios: sexo, ano de nascimento, ano de fabricação, valor do veículo e porcentagem do bônus 
 */
function validarNome() {
	if (nome.value == "") {
		alert("Informe o nome do segurado!");
	}
}
/*
 * O campo sexo deverá aceitar apenas F (Feminino) ou M (Masculino)
 */
function validarSexo() {
	if ((sexo.value != "F" && sexo.value != "M")
			&& (sexo.value != "f" && sexo.value != "m")) {
		alert("Informe um sexo válido! (m/f)");
	}
}

/*
 * O campoano de nascimento deve aceitar um valor entre 2001 e 1901 Não deve
 * aceitar letras caracteres
 */
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

/*
 * O campo ano de fabricação deverá ser um valor inteiro positivo
 */
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
/*
 * O campo valor do veículo deve ser um número real positivo.
 */
function validarValorVeiculo() {
	if (valorVeiculo.value === "") {
		alert("Informe o Valor do Veículo!")
	} else if (!isNaN(valorVeiculo.value)) {
		var valor = parseFloat(valorVeiculo.value);
		if (valor < 0.0) {
			alert("Valor de Veículo não pode ser negativo!")
		}
	} else {
		alert("Valor do Veículo deve ser um número!")
	}
}
/*
 * O campo porcentagem do bônus deverá ser um número real entre 0 e 25
 */
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

function apolice() {
	var valorApolice;
	var valorVeic = parseFloat(valorVeiculo.value);
	var ano = parseInt(anoFabric.value);
	var vSexo = sexo.value;
	var hoje = new Date();
	var vHoje = hoje.getFullYear() - parseInt(anoNasc.value);
	var vBonus = parseFloat(bonus.value);
	
	var descSexo;
	var descIdade;

	// Cálculo de desconto pelo ano de fabricação
	if (ano >= 2010 && ano <= 2019) {
		valorApolice = (1.25 * valorVeic) / 100;
	} else if (ano >= 2000 && ano <= 2009) {
		valorApolice = (1.75 * valorVeic) / 100;
	} else if (ano >= 1980 && ano <= 1999) {
		valorApolice = (2.00 * valorVeic) / 100;
	} else {
		valorApolice = (2.50 * valorVeic) / 100;
	}
	// Calculo de desconto pelo sexo
	if (vSexo === "f" || vSexo === "F") {
		descSexo = (valorApolice * 10) / 100;
		valorApolice -= descSexo;
	} else if(vSexo === "m" || vSexo === "M"){
		descSexo = (valorApolice * 05) / 100;
		valorApolice += descSexo;
	}
	// Cálculo de desconto por idade
	if(vHoje < 30 && vHoje > 60){
		descIdade = (valorApolice * 20) / 100;
		valorApolice -= descIdade;
	}
	// Cálculo de desconto pelo bônus
	valorApolice -= (valorApolice * vBonus) / 100;
	
	
	resultado.innerHTML = "Valor apólice: R$ " + valorApolice;
}

/*
 * a) Para veículos entre 2019 e 2010 o valor da apólice é de 1,25% do valor do
 * veículo, veículos entre 2009 e 2000 o valor da apólice é de 1,75% do valor do
 * veículo, veículos entre 1999 e 1980 o valor da apólice é de 2,00% e para os
 * demais anos de fabricação devemos utilizar 2,50% como base de cálculo. 
 * b) Caso o segurado seja do sexo feminino aplicar um desconto 10% sobre o valor
 * calculado no item a, caso contrário, acrescer 5% ao valor calculado no item
 * a.
 * 
 * var hoje = new Date(); hoje.getFullYear() - parseInt(ano.value)
 * 
 * c) Se o segurado possuir menos de 30 anos ou mais de 60 anos, acrescentar 20%
 * ao valor da apólice após os cálculos realizados no item a e no item b.
 * d) A partir do valor apurado nos itens a, b e c aplicar o desconto com base na
 * porcentagem de bônus informada pelo usuário.
 */
