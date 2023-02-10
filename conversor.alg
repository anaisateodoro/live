algoritmo "Conversor de quilômetros|metros e litros| metros cúbicos"
// Função : Praticar os objetivos da da missão da Semana 2
// Autor :Anaísa Mayara Teodoro
// Data : 02-02-2023
// Seção de Declarações

var
opcao:caracter
conversorUm, conversorDois: real

inicio
// Seção de Comandos


repita
   escreval(".........................................................................")
   escreval(" Conversor de quilômetros para metros ou litros para metros cúbicos")
   escreval(".........................................................................")
   escreval(" ")
   escreval("Digite 1 para converter quilomêtros em metros")
   escreval("Digite 2 para converter litros em metros cúbicos")
   escreval("Digite 3 para sair do programa")
   escreval(".........................................................................")
   leia(opcao)

   limpatela
   se opcao = "1" entao
      escreval("Digite o valor do quilômetro a ser convertido em metro(s)")
      escreval
      leia(conversorUm)
      escreval
      conversorDois <- conversorUm * 1000
      escreval("", conversorUm, " quilometro(s) equivale(m) a ", conversorDois, " metro(s)")
      conversorUm <- 0
      conversorDois <- 0
      escreval
   senao
      se opcao = "2" entao
         escreval("Digite o valor em litro(s) para metros cúbicos")
         escreval
         leia(conversorDois)
         escreval
         conversorDois<- conversorDois / 1000
         escreval("",conversorUm, " metro(s) cúbico(s) equivale(m) a ", conversorDois, " litro(s)")
         conversorUm <- 0
         conversorDois <- 0
         escreval
      fimse
   fimse
ate opcao = "3"
escreval("...Encerrada a sessão do sistema conversor!")

fimalgoritmo


