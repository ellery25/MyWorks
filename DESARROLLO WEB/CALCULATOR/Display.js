class Display{
    constructor(displayValorAnterior, displayValorActual){
        this.displayValorAnterior = displayValorAnterior;
        this.displayValorActual = displayValorActual;
        this.calculadora = new Calculadora();
        this.tipoOperacion = undefined;
        this.ValorActual = '';
        this.ValorAnterior = '';
        this.signos = {
            sumar: '+',
            restar: '-',
            multiplicar: 'x',
            dividir: '/',
        }
    }

    borrar(){
        this.ValorActual = this.ValorActual.toString().slice(0,-1);
        this.imprimirValores();
    }

    borrarTodo() {
        this.ValorActual = '';
        this.ValorAnterior = '';
        this.tipoOperacion = undefined;
        this.imprimirValores();
    }

    computar(tipo) {
        this.tipoOperacion !== 'igual' && this.calcular();
        this.tipoOperacion = tipo;
        this.ValorAnterior = this.ValorActual || this.ValorAnterior;
        this.ValorActual = '';
        this.imprimirValores();
    }

    agregarNumero(numero) {
        if(numero === '.' && this.ValorActual.includes('.')) return 

        this.ValorActual =  this.ValorActual.toString() + numero.toString();
        this.imprimirValores();
    }

    imprimirValores() {
        this.displayValorActual.textContent = this.ValorActual;
        this.displayValorAnterior.textContent = `${this.ValorAnterior} ${this.signos[this.tipoOperacion] || ''}`;
    }

    calcular() {
        const valorAnterior = parseFloat(this.ValorAnterior);
        const valorActual = parseFloat(this.ValorActual);

        if(isNaN(valorActual) || isNaN(valorAnterior)) return     

        this.ValorActual = this.calculadora[this.tipoOperacion](valorAnterior, valorActual);

    }

}