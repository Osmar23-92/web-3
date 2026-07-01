<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Açai - Pedido</title>
        
        <style>
            /* Importando uma fonte moderna do Google */
@import url('https://fonts.googleapis.com/css2?family=Poppins:wght@400;600;700&display=swap');

* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    font-family: 'Poppins', sans-serif;
}

body {
    background-color: #f4f0f6; /* Fundo levemente arroxeado/cinza bem claro */
    color: #333;
    display: flex;
    justify-content: center;
    align-items: center;
    min-height: 100vh;
    padding: 20px;
}

/* Container principal do formulário */
.container {
    background-color: #ffffff;
    padding: 40px;
    border-radius: 15px;
    box-shadow: 0 10px 25px rgba(74, 20, 140, 0.1); /* Sombra roxa suave */
    max-width: 500px;
    width: 100%;
}

h1 {
    color: #4a148c; /* Roxo Açai */
    font-size: 28px;
    font-weight: 700;
    text-align: center;
    margin-bottom: 5px;
}

h2 {
    color: #6a1b9a;
    font-size: 16px;
    font-weight: 400;
    text-align: center;
    margin-bottom: 30px;
}

h3 {
    color: #4a148c;
    font-size: 16px;
    font-weight: 600;
    margin-top: 20px;
    margin-bottom: 12px;
    border-left: 4px solid #ffb300; /* Detalhe dourado/amarelo na lateral */
    padding-left: 8px;
}

/* Organização das opções */
.options-group {
    display: flex;
    flex-direction: column;
    gap: 10px;
}

.options-group-row {
    display: flex;
    gap: 20px;
}

.option-item {
    display: flex;
    align-items: center;
    background-color: #fdfbfe;
    border: 1px solid #e1d5e7;
    padding: 10px 15px;
    border-radius: 8px;
    cursor: pointer;
    transition: all 0.2s ease;
}

/* Efeito ao passar o mouse por cima das opções */
.option-item:hover {
    border-color: #a278c5;
    background-color: #f8f3fc;
}

/* Estilo para os inputs de Seleção */
input[type="radio"], input[type="checkbox"] {
    accent-color: #4a148c; /* Muda a cor da bolinha/check para o roxo do açaí */
    width: 18px;
    height: 18px;
    margin-right: 12px;
    cursor: pointer;
}

label {
    cursor: pointer;
    font-size: 14px;
    width: 100%;
    user-select: none;
}

hr {
    border: 0;
    height: 1px;
    background-color: #e1d5e7;
    margin: 30px 0 20px 0;
}

/* Botão de Enviar */
.btn-submit {
    display: block;
    width: 100%;
    background-color: #ffb300; /* Amarelo/Dourado que contrasta com o roxo */
    color: #4a148c;
    border: none;
    padding: 14px;
    font-size: 16px;
    font-weight: 600;
    border-radius: 8px;
    cursor: pointer;
    transition: background-color 0.2s ease, transform 0.1s ease;
    text-transform: uppercase;
    letter-spacing: 0.5px;
}

.btn-submit:hover {
    background-color: #ffa000;
}

.btn-submit:active {
    transform: scale(0.98); /* Efeito de clique */
}
        </style>
        
    </head>
    <body>
        
        <h1>Novo pedido</h1>
        <h2>Escolha os itens do pedido:</h2>
        
        
        
        <form action="PedidoController" method="get">
            
            <h3>Tamanho</h3>
            
            <input type="radio" id="tamanho1" name="tamanho" value="Pequeno">
        <label for="tamanho1"> Pequeno (200ml) </label>
        <br>
        
        <input type="radio" id="tamanho2" name="tamanho" value="Médio">
        <label for="tamanho2"> Médio (500ml) </label>
        <br>
        
        <input type="radio" id="tamanho3" name="tamanho" value="Grande">
        <label for="tamanho3"> Grande (700ml) </label>
        <br>
        
        <input type="radio" id="tamanho4" name="tamanho" value="Extra Grande">
        <label for="tamanho4"> Extra Grande (1000ml) </label>
        <br>
        
        <h3>Acompanahmentos</h3>
            
                <input type="checkbox" id="acomp1" name="acomp[]" value="value">
                <label for="acomp1">Ninho</label>
           
            <br>
            
                <input type="checkbox" id="acomp2" name="acomp[]" value="pacoca">
                <label for="acomp2">Paçoca</label>
           
            <br>
           
                <input type="checkbox" id="acomp3" name="acomp[]" value="brigadeiro">
                <label for="acomp3">Brigadeiro</label>
            
            <br>
           
                <input type="checkbox" id="acomp4" name="acomp[]" value="nuttella">
                <label for="acomp4">Nuttella</label>
           
            <br>
           
                <input type="checkbox" id="acomp5" name="acomp[]" value="morango">
                <label for="acomp5">Morango</label>
           
        <br>
        
        <h3>Vai colher?</h3>
        
                <input type="radio" id="colher1" name="colher" value="Sim">
                <label for="colher1"> Sim </label>
        <br>        
                <input type="radio" id="colher2" name="colher" value="Não">
                <label for="colher1"> Não </label>
        <br>
            
        <h3>Entrega</h3>
        
                <input type="radio" id="entrega1" name="entrega" value="Retirar na loja">
                <label for="entrega1"> Retirar na loja </label>
        <br>        
                <input type="radio" id="entrega2" name="entrega" value="Delivery">
                <label for="entrega2"> Delivery </label>
        <br>
        
            <hr>
            
            <input type="submit" value="Continuar pedido">
            
        </form>
        
    </body>
</html>
