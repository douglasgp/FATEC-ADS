function validarProduto() {
	if (prod.value === "") {
		alert("Digite o nome do produto!");
	}
}

function validarQuantidade() {
	if (qtd.value === "") {
		alert("Digite a quantidade!");
	} else if (!isNaN(qtd.value)) {
		var num = parseInt(qtd.value);
		if (num < 1 || num > 99) {
			alert("A quantidade deve estar entre 1 e 99");
		}
	} else
		alert("A quantidade deve ser um número entre 1 e 99.");
}

function validarPrecoUnit() {
	if (precoUnit.value === "") {
		alert("Digite o preço unitário!");
	} else if (isNaN(precoUnit.value) === false) {
		var num = parseFloat(precoUnit.value);
		if (num <= 0.0) {
			alert("O preço unitário deve ser maior que 0.");
		}
	} else
		alert("O preço unitário deve ser um número maior que zero!")
}

function validarDesconto() {
	if (desc.value === "") {
		alert("Informe um desconto!");
	} else if (!isNaN(desc.value)) {
		var num = parseFloat(desc.value);
		if (num < 0 || num > 100) {
			alert("Desconto deve estar entre 0 e 100!");
		}
	} else {
		alert("O desconto deve ser um número!");
	}
}

function calcular() {
	var nQtd = parseInt(qtd.value);
	var nUnit = parseFloat(qtd.value);
	var nDesc = parseFloat(desc.value);
	var nFinal = (nUnit * nQtd)* (1-(nDes/100));
	final.value = nFinal;
}