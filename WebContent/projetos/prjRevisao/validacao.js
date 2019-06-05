function validaRa() {
	if (ra.value == "") {
		alert("RA não pode ser vazio!");
	}
}

function validaNome() {
	if (nome.valu == "") {
		alert("Nome não pode ser vazio!");
	}
}

function validaSemestre() {
	if (semestre.value == "") {
		alert("SEMESTRE não pode ser vazio!");
	} else if (!isNaN(semestre.value)) {
		var sem = (semestre.value);
		if (sem <= 0) {
			alert("Semestre não pode ser menor/igual a 0!");
		} else if (sem > 6) {
			var situacao = "Aluno com DP";
			alert(situacao);
		}
	}
}

function validaDisciplina() {
	if (disciplina.value == "") {
		alert("DISCIPLINA não pode ser vazio!");
	} else if (isNaN(disciplina.value)) {
		disciplina.value = disciplina.value.toUpperCase();
	}
}

function validaP1() {
	if (p1.value == "") {
		alert("P1 não pode ser vazio!");
	} else if (!isNaN(p1.value)) {
		var prova1 = parseDouble(p1.value);
		if (prova1 < 0.0 && prova1 > 10.0) {
			alert("Valor INVÁLIDO para P1!");
		}
	} else {
		alert("P1 dever ser número!");
	}
}

function validaP2() {
	if (p2.value == "") {
		alert("P2 não pode ser vazio!");
	} else if (!isNaN(p2.value)) {
		var prova2 = parseDouble(p1.value);
		if (prova2 < 0.0 || prova2 > 10.0) {
			alert("Valor INVÁLIDO para P2!");
		}
	} else {
		alert("P2 dever ser número!");
	}
}

function validaTrabalho() {
	if (trabalho.value == "") {
		alert("TRABALHOS/ATIVIDADES não pode ser vazio!");
	} else if (!isNaN(trabalho.value)) {
		var trab = parseDouble(trabalho.value);
		if (trab < 0.0 || trab > 10.0) {
			alert("Valor INVÁLIDO para TRABALHOS/ATIVIDADES!");
		}
	} else {
		alert("TRABALHOS/ATIVIDADES dever ser número!");
	}
}

function validaFrequancia() {
	if (frequencia.value === "") {
		alert("FREQUÊNCIA não pode ser vazio!");
	} else if (!isNaN(frequencia.value)) {
		alert("FREQUÊNCIA deve ser um número!");
	}
}

function calculaAluno() {
	var nota1 = parseDouble(p1.value);
	var nota2 = parseDouble(p2.value);
	var trab = parseDouble(trabalho.value);
	var freq = frequencia.value;
	var media = parseDouble(nota1 + nota2 + tra)/2;
	var materia = disciplina.value;
	var status = "INCERTO!";

	resultado.innerHTML="Status: " + status;
}