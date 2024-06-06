package pacote1;


import java.util.*;


public class principal {
    //Scanner global
    public static Scanner receber = new Scanner(System.in);
    //Status padrão do personagem principal
    public static int hp = 20,hpinicial = 20, ataque = 5,defesa = 5, velocidade = 5, xp = 0;

    //Status padrão do primeiro inimigo

    public static int inihp = 20, iniataque = 5,inidefesa = 5, inivelocidade = 5;
    // nome do personagem
    public static String nome;

    public static void main(String[] args) {
        int menuclass = 0;



        System.out.println("Insira o nome do personagem");
        nome = receber.nextLine();



        while (menuclass != 1 && menuclass != 2 && menuclass != 3 && menuclass != 4) {
            System.out.println("selecione a classe do personagem \n1-Druida \n2-Guerreiro \n3-Barbaro \n4-Ladrão");
            menuclass = receber.nextInt();
            switch (menuclass) {
                case 1:
                    System.out.println("Você escolheu a classe Druida");
                    hp += 2;
                    break;
                case 2:
                    System.out.println("Você escolheu a classe Guerreiro");
                    ataque += 2;
                    break;

                case 3:
                    System.out.println("Você escolheu a classe Barbaro");
                    defesa += 2;
                    break;

                case 4:
                    System.out.println("Você escolheu a classe Ladrão");
                    velocidade += 2;
                    break;

                default:
                    System.out.println("você digitou uma opção invalida");
                    break;

            }
        }
        System.out.printf(" Bem vindo jogador %s\n", nome);

        System.out.println("Em uma casa no meio da floresta, você é acordado com uma sensação de estranha\nEntão decide vasculhar a casa... acaba se assustando ao descobrir que o mundo ao seu redor mudou drasticamente\nVultos e sons perturbadores preenchem o ambiente...\nAo olhar pela janela, se depara com um cenário estranho e surreal, completamente diferente do que estava habituado.");
        System.out.println();
        System.out.println("Decide vasculhar a casa e acha uma especie de adaga de pequeno porte para se defender , então decide sair da casa\n para encontrar uma maneira de sair desse pesadelo...\nDepois de sair de casa e ver que tudo está diferente você está em uma floresta e tem dois caminho para onde ir");
        System.out.println();
        ato1();
        informacoes();
        System.out.printf("Após o embate a noite está caindo e ficando frio,%s resolve dormir alí mesmo na caverna ,para se previnir de ataques no meio da noite",nome,"\nApós passar a noite na caverna %s continua sua jornada,ele encontra um sobrevivente e o aborda\nConversando com esse sobrevivente descobre  que a uma forma de se salvar e sair dessa realidade, mas o sobrevivente diz que tinha um preço que teria que pagar, tendo que derrota Elff o rei dragão. \n");
        System.out.println();
        System.out.printf("Não seria nada fácil chegar até esse vilão é derrotá-lo, %s sem pensar fala que vai tentar então o sobrevivente da um mapa a ele\n\nApós olhar o mapa percebe que tem que chegar em uma ilha tinha dois caminhos possíveis até essa ela\n",nome);
        ato2();
        informacoes();
        System.out.printf("Na visão dele, %s tinha dois caminhos para seguir sua jornada ",nome);
        ato3();
        informacoes();
        System.out.printf("Ao escolher enfrentar o elff, %s vai em direção ao covil, em cima de uma montanha que chega nela subindo escadas\nessa montanha era tão alta, que nem um pegasus conseguiria voar até em cima\nsendo assim, só conseguiria chegar até o rei Dragão pelas escadas\n",nome);
        ato4();
        System.out.printf("após %s derrotar o dragão um portal começou a se abrir uma luz branca saia desse portal, ele entrou nesse portal,\nE acordou em sua cama assustado percebendo que isso tudo era um sonho.\n",nome);
    }




    //Esse metodo é responsável por exibir o ato 1(a primeira parte da história).
    public static void ato1() {
        int caminho1 = 0, coletar1=0,es1;

        do {
            System.out.printf("Ao sair da sua casa e ver que está tudo diferente %s fica com dúvida para onde ir, surgem duas possibilidades:\n (1) - Seguir o caminho de uma estrela que está mais que as outras\n (2) - Subir uma grande montanha\n", nome);
            System.out.println("Escolha uma das opções acima");
            caminho1 = receber.nextInt();
            switch (caminho1) {
                case 1:
                    System.out.println("Enquanto seguia a estrela, foi apreciando esse mundo completamente diferente até chegar em uma área com árvores gigantes\nEm seu caminho estava lá uma Aranha");
                    System.out.println("A aranha (nivel 1) ataca ");
                    if (velocidade > inivelocidade) {
                        luta();
                    } else {
                        lutainimigo();
                    }
                    System.out.println("Ao passar pelo inimigo, acaba ouvindo barulhos estranhos e acaba seguindo o som, se deparando com uma caverna\nPara descer precisará escorregar pelas vinhas da caverna");
                    System.out.println();
                    System.out.println("Ao descer a caverna, descobre que o barulho que tinha escutado eram goblins bastante agressivos segurando adagas");
                    System.out.println("Goblins(nível 2) atacam você");
                    for (int contador = 1; contador <= 2; contador++) {
                        randomnivel2();
                        if (velocidade > inivelocidade) {
                            luta();
                        } else {
                            lutainimigo();
                        }
                    }
                    System.out.println("Você encontra um baú após derrotar os goblins");
                    do {
                        System.out.println("Desejá abrir o baú \n(1)-sim \n(2)-não");
                        es1 = receber.nextInt();
                        switch (es1) {
                            case 1:
                                System.out.println("Você por abrir o baú, porém o baú na verdade era um monstro disfarçado");
                                System.out.println("Que resolve se camuflar para atacar suas presas");
                                System.out.println("Você o derruba mas acaba perdendo 5 pontos de vida");
                                hpinicial-=5;


                                break;

                            case 2:
                                System.out.println("Você abriu o baú e seguiu sua jornada");
                                break;
                            default:
                                System.err.println("entrada de dados invalida");
                                break;

                        }

                    }while(es1 != 1 && es1 != 2);
                    break;

                case 2:
                    System.out.println("Ao caminhar em direção a montanha e apreciar a paisagem totalmente diferente,\n chegando no pé da montanha, acaba encontrando ruínas,\n ao entrar numa espécie de salão foi supreendido por esqueletos");
                    System.out.println("Esqueletos(Nível2) atacam você");
                    for (int contador = 1; contador <= 2; contador++) {
                        randomnivel1();
                        if (velocidade > inivelocidade) {
                            luta();
                        } else {
                            lutainimigo();
                        }


                    }


                    System.out.printf("%s mesmo cansado decide continuar a subir, e percebe que ao subir a montanha, acaba avistando um baú mais para conseguir pegar terá que escalar", nome);
                    System.out.println();
                    System.out.println("Ao pegar o baú Resolve não subir mais, prefere continuar seu percurso pela beira da montanha\nOnde acaba encontrando uma parte rochosa difícil de caminhar e do chão surge um Golem de pedra");
                    randomnivel2();
                    if (velocidade > inivelocidade) {
                        luta();
                    } else {
                        lutainimigo();
                    }
                    System.out.println("Ao descer a montanha, após derrotar o golem resolve abrir o baú e acha uma espada ");
                    System.out.println("porém fica em duvida se deve ou não pegar, temendo ser um item menos versatil que sua adaga");
                    do {
                        System.out.println("Desejá pegar a espada? \n(1)-sim \n(2)-não");
                        coletar1 = receber.nextInt();
                        switch (coletar1) {
                            case 1:
                                System.out.println("Você pegou a espada ganhou 3 pontos de ataque, porém perdeu 3 pontos de velocidade");
                                ataque+=3;
                                velocidade-=3;

                                break;

                            case 2:
                                System.out.println("Você não pegou a espada");
                                break;
                            default:
                                System.err.println("entrada de dados invalida");
                                break;

                        }

                    }while(coletar1 != 1 && coletar1 != 2);
                    break;
                default:
                    System.err.println("entrada de dados invalida");
                    break;

            }

        } while (caminho1 != 1 && caminho1 != 2);


    }

    //Esse metodo é responsável por exibir o ato 2(a segunda parte da história).
    public static void ato2(){
        int caminho2 = 0, coletar2=0,coletar3=0;

        do {
            System.out.printf("Ao olhar o mapa %s vê as duas opções:\n (1) - ir pelo mar de barco\n (2)-ir pela ponte \n",nome);
            System.out.println("Escolha uma das opções acima");
            caminho2 = receber.nextInt();
            switch (caminho2) {
                case 1:
                    System.out.printf("%s escolhe ir pelo mar, indo em direção ao mar percebe que na beira do mar haveria um barco, e começa a navegar\nPorém conforme ele navega o clima ficá mais denso com raios e chuvas...",nome);
                    System.out.println();
                    System.out.println("mas ele continua em direção a ilha, porém tudo começa a tremer e um polvo gigante começa a emergir do fundo do mar");
                    System.out.println("Polvo Nível 3");
                    randomnivel3();
                    if(velocidade>inivelocidade){
                        luta();
                    }else{
                        lutainimigo();
                    }
                    System.out.println("Após derrotar o polvo você achar um cilindro com um elemento estranho, pensando ser uma especie de poção");

                    do {
                        System.out.println("Desejá tomar a poção? \n(1)-sim \n(2)-não");
                        coletar2 = receber.nextInt();
                        switch (coletar2) {
                            case 1:
                                System.out.println("Você tomou a poção e ganho mais 3 pontos de vida e velocidade");
                                hpinicial+=3;
                                velocidade +=3;

                                break;

                            case 2:
                                System.out.println("Você não tomou a poção");
                                break;
                            default:
                                System.err.println("entrada de dados invalida");
                                break;

                        }

                    }while(coletar2 != 1 && coletar2 != 2);
                    System.out.printf("Após derrotar o polvo %s fica bastante aliviado, estava chegando cada vez mais perto de sair daquela realidade então avista a ilha\nE dorme para recuperar as suas forças.....",nome);



                    break;

                case 2:
                    System.out.printf("Ao escolher ir pela ponte %s avista a ponte ,ele caminha nessa ponte, tanto que começa a chover\ne olha para a frente e já se depara com o primeiro monstro\nEle sabia que não seria dificil porém tinham muitos mais deles\n",nome);
                    for(int contador=1;contador<=4;contador++) {
                        randomnivel3();
                        if (velocidade > inivelocidade) {
                            luta();
                        } else {
                            lutainimigo();
                        }
                    }

                    System.out.printf("Após derrotar todos os monstros, %s olha para a frente e percebe que chegou na ilha \nSó que estava bastante cansado, e prentende descansar para poder seguir em frente com mais facilidade\n",nome);
                    System.out.println("No caminho acha um cilindro com água deixado por alguem, com um bilhete informando que pode ser de grande ajuda se tomar");
                    do {
                        System.out.println("Desejá tomar a água? \n(1)-sim \n(2)-não");
                        coletar3 = receber.nextInt();
                        switch (coletar3) {
                            case 1:
                                System.out.println("Você optou por tomar a água, porém acaba se sentindo tonto");
                                System.out.println("Sendo apunhalado por uma adaga, era um ladrão e acabou roubando seus itens e te deixando vuneravel ");
                                System.out.println("Você perdeu menos 7 pontos de vida");
                                hpinicial-=7;


                                break;

                            case 2:
                                System.out.println("Você não tomou a água");
                                break;
                            default:
                                System.err.println("entrada de dados invalida");
                                break;

                        }

                    }while(coletar3 != 1 && coletar3 != 2);
                    break;
                default:
                    System.err.println("entrada de dados invalida");
                    break;

            }

        } while (caminho2 != 1 && caminho2 != 2);
    }

    //Esse metodo é responsável por exibir o ato 3(a terceira parte da história)
    public static void ato3() {
        int caminho3 = 0,coletar4=0;

        do {
            System.out.printf("Ao chegar na ilha %s tem duas opções:\n (1) - Domar um pegasus para chegar ao topo da ilha\n (2) - Atravessar uma caverna submerssa\n", nome);
            System.out.println("Escolha uma das opções acima");
            caminho3 = receber.nextInt();
            switch (caminho3) {
                case 1:
                    System.out.println("Ao escolher domar o pegasus, vai até um oásis onde estava, mas também o gigante ao olhar em volta...\nTerá que enfrentar o gigante para chegar no pegasus, olha para o gigante e vai para cima com todas as suas forças");
                    System.out.println("Gigante (nível 4) ataca você");
                    randomnivel4();
                    if (velocidade > inivelocidade) {
                        luta();
                    } else {
                        lutainimigo();
                    }

                    System.out.printf("Após uma violenta batalha %s vence o combate, e descansa para poder derrotar elff o rei dragão ele teria que descansar\nSendo assim ele doma o pegasus e  sobe para ir em direção ao topo da montanha....\n", nome);
                    break;

                case 2:
                    System.out.printf("Ao passar um dia e meio descendo para a caverna\n%s chega na metade do caminho era por sorte dele \nEra uma caverna de cristal azul que refletia a cor do céu até o final da caverna\n", nome);
                    System.out.println();
                    System.out.printf("Mas ele mal sabia os perigos que tinha nela, seguindo em direção da caverna %s vê a horda de morcegos ele percebe que não tinha jeito...\nE partiu para enfrentar eles\n", nome);
                    System.out.println("Morcegos (nível 3) atacam você");

                    for (int contador = 1; contador <= 3; contador++) {
                        randomnivel3();
                        if (velocidade > inivelocidade) {
                            luta();
                        } else {
                            lutainimigo();
                        }

                    }
                    System.out.printf("%s derrotou todos os morcegos, mas com isso gastou muita energia. \nEle escolheu não parar e continuou sua jornada.\nPercebendo uma luz no final da caverna seria a saída até que chega no final da caverna, indo direto para o topo da ilha....", nome);
                    break;
                default:
                    System.err.println("entrada de dados invalida");
                    break;

            }


        }while (caminho3 != 1 && caminho3 != 2);
        System.out.println("Ao chegar perto do seu objetivo acha uma espada, e uma armadura que podem ser de grande ajuda para sua luta ");
        do {
            System.out.println("Desejá pegar os itens? \n(1)-sim \n(2)-não");
            coletar4 = receber.nextInt();
            switch (coletar4) {
                case 1:
                    System.out.println("Você pegou os itens e ganhou mais 3 pontos de ataque e 3 pontos de defesa, porém ficou mais lento perdendo 7 pontos de velocidade ");
                    ataque+=3;
                    defesa+=3;
                    velocidade-=5;
                    break;

                case 2:
                    System.out.println("Você não pegou os itens");
                    break;
                default:
                    System.err.println("entrada de dados invalida");
                    break;

            }

        }while(coletar4 != 1 && coletar4 != 2);
    }
    //Esse metodo é responsável por exibir o ato 4(a quarta parte da história).
    public static void ato4(){
        int caminho4=0;
        do{
        System.out.printf("Qual escolha deseja fazer: \n (1) batalhar contra o rei dragão \n (2) fugir\n");
        System.out.println("Escolha uma das opção acima");
        caminho4 = receber.nextInt();

        switch (caminho4) {
            case 1:
                System.out.printf("Ele percebia que estava chegando perto, pois a chama do dragão era tão quente que mesmo de longe ele sentia o calor\nCom toda sua garra e vontade de sair do lugar onde se encontrava, %s continuou para o rei dragão\nEle olhou, empunhou sua arma e foi em direção ao dragão Sabendo que seria sua única chance de sair da realidade.\n", nome);
                System.out.println("Rei dragão (nível 5) ataca você");
                randomnivel5();
                lutafinal();
                break;
            case 2:
                System.out.printf("%s ficou com receio de enfrentar o rei dragão e saiu daquela ilha o mais rápido possível\n", nome);
                System.out.printf("Mas ao dar as costas para ilha, avistou o rei dragão vindo em direção a ele soltando uma rajada de fogo tão forte que era impossível de conseguir reagir\n%s fecha os olhos , e  acorda na sua cama com o coração disparado percebendo que tudo era apenas um sonho\n", nome);
                break;

            default:
                System.err.println("entrada de dados invalida");
                break;
        }
        } while (caminho4 != 1 && caminho4 != 2);
    }

    //Metodo utilizado para verificar se o personagem pode subir de nível dependendo da condição.
    public static void subirnivel() {
        int xplimite=50;
        if (xp > xplimite) {
            hpinicial += 4;
            ataque += 2;
            defesa += 2;
            velocidade += 2;
        }
        xplimite +=50;

    }

    //Metodo para realizar o ataque do inimigo
    public static int ataqueinimigo() {
        Random gerador = new Random();
        return gerador.nextInt(2);

    }

    //Metodo para geração do XP para subir de nível
    public static int geradorxp() {
        Random gerar = new Random();
        return gerar.nextInt((100 - 50) + 1) + 50;

    }

    //Metodo para recuperar vida
    public static void recuperarvida(){
        hp = hpinicial;
    }

    //Metodo resposável por exibir as informações do usuario caso desejado
    public static void informacoes() {
        System.out.println("Veja suas informações");
        System.out.printf("vida %d\n", hp);
        System.out.printf("ataque %d\n", ataque);
        System.out.printf("defesa %d\n", defesa);
        System.out.printf("velocidade %d\n", velocidade);
        System.out.println();
    }

    //Metodo para reativar o status base do inimigo, com valores de inimigo nível 1
    public static void randomnivel1() {
        Random gerador = new Random();
        inihp = gerador.nextInt((20 - 15) + 1) + 15;
        iniataque = gerador.nextInt((6 - 5) + 1) + 5;
        inidefesa = gerador.nextInt((6 - 5) + 1) + 5;
        inivelocidade = gerador.nextInt((6 - 5) + 1) + 5;
    }

    //Metodo para reativar o status base do inimigo, com valores de inimigo nível 2
    public static void randomnivel2() {
        Random gerador = new Random();
        inihp = gerador.nextInt((25 - 15) + 1) + 15;
        iniataque = gerador.nextInt((7 - 5) + 1) + 5;
        inidefesa = gerador.nextInt((7 - 5) + 1) + 5;
        inivelocidade = gerador.nextInt((10 - 7) + 1) + 7;
    }

    //Metodo para reativar o status base do inimigo, com valores de inimigo nível 3
    public static void randomnivel3() {
        Random gerador = new Random();
        inihp = gerador.nextInt((30 - 20) + 1) + 20;
        iniataque = gerador.nextInt((10 - 7) + 1) + 7;
        inidefesa = gerador.nextInt((10 - 7) + 1) + 7;
        inivelocidade = gerador.nextInt((10 - 7) + 1) + 7;
    }

    //Metodo para reativar o status base do inimigo, com valores de inimigo nível 4
    public static void randomnivel4() {
        Random gerador = new Random();
        inihp = gerador.nextInt((30 - 20) + 1) + 30;
        iniataque = gerador.nextInt((15 - 10) + 1) + 10;
        inidefesa = gerador.nextInt((15 - 10) + 1) + 10;
        inivelocidade = gerador.nextInt((15 - 10) + 1) + 17;
    }

    //Metodo para reativar o status base do inimigo, com valores de inimigo nível 5
    public static void randomnivel5(){
        Random gerador = new Random();
        inihp = 30;
        iniataque = 15;
        inidefesa = 15;
        inivelocidade = 35;
    }


    //Metodo para realizar o combate caso a velocidade do personagem seja maior que a do inimigo
    public static void luta() {

        int escolha = 0;



        do {
            System.out.println("==================================================================");
            System.out.println("você entrou no combate selecione a opção para (1) atacar ou (2) correr");
            System.out.println("==================================================================");
            System.out.printf("vida do usuario %d\n", hp);
            System.out.printf("vida do inimigo %d\n", inihp);

            escolha = receber.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("você atacou o inimigo");
                    inihp -= ataque + (ataque/inidefesa);
                    break;

                case 2:
                    System.out.println("você correu da batalha");
                    break;


                default:
                    System.err.println("opção invalida digite a opção novamente");
                    break;
            }
            if (escolha != 2) {
                if (inihp > 0) {
                    escolha = ataqueinimigo();
                    switch (escolha) {
                        case 0:
                            System.out.println("O inimigo aplicou um ataque");
                            hp -= iniataque + (iniataque/defesa);
                            break;
                        case 1:
                            System.out.println("O inimigo errou o ataque");
                            break;
                    }
                }
            }

        } while (hp > 0 && inihp > 0 && escolha != 2);


        if (escolha == 2) {
            System.out.println();
        } else if (hp <= 0) {
            System.out.println("você foi derrotado");
            System.exit(0);
        } else {
            System.out.println("você derrotou o inimigo");
            xp = geradorxp();
            System.out.printf("Você ganhou %d de xp\n",xp);

            recuperarvida();
            subirnivel();
        }
    }

    //Metodo para realizar o combate caso a velocidade do personagem seja menor que a do inimigo
    public static void lutainimigo() {

        int escolha = 0, escolhaini = 0;


        //personagem


        do {
            System.out.println("==================================================================");
            System.out.println("você entrou no combate selecione a opção para (1) atacar ou (2) correr");
            System.out.println("==================================================================");
            System.out.printf("vida do usuario %d\n", hp);
            System.out.printf("vida do inimigo %d\n", inihp);

            escolha = receber.nextInt();
            if (escolhaini != 2) {
                if (inihp > 0) {
                    escolhaini = ataqueinimigo();
                    switch (escolhaini) {
                        case 0:
                            System.out.println("O inimigo aplicou um ataque");
                            hp -= iniataque + (iniataque/defesa) ;
                            break;
                        case 1:
                            System.out.println("O inimigo errou o ataque");
                            break;
                    }
                }
            }

            switch (escolha) {
                case 1:
                    System.out.println("você atacou o inimigo");
                    inihp -= ataque + (ataque/inidefesa);
                    break;

                case 2:
                    System.out.println("você fugiu da batalha");
                    break;

                default:
                    System.err.println("opção invalida digite a opção novamente");
                    break;
            }

        }while (hp > 0 && inihp > 0 && escolha != 2);

        if (escolha == 2) {
            System.out.println();
        } else if (hp <= 0) {
            System.out.println("você foi derrotado");
            System.exit(0);
        } else {
            System.out.println("você derrotou o inimigo");
            xp = geradorxp();
            System.out.printf("Você ganhou %d de xp\n",xp);

            recuperarvida();
            subirnivel();
        }


    }
    //Metodo para executar a luta final do RPG
    public static void lutafinal() {

        int escolha = 0, escolhaini = 0;


        //personagem


        do {
            System.out.println("==================================================================");
            System.out.println("você entrou no combate selecione a opção para (1) atacar ou (2) correr");
            System.out.println("==================================================================");
            System.out.printf("vida do usuario %d\n", hp);
            System.out.printf("vida do inimigo %d\n", inihp);

            escolha = receber.nextInt();
            if (escolhaini != 2) {
                if (inihp > 0) {
                    escolhaini = ataqueinimigo();
                    switch (escolhaini) {
                        case 0:
                            System.out.println("O inimigo aplicou um ataque");
                            hp -= iniataque + (iniataque/defesa);
                            break;
                        case 1:
                            System.out.println("O inimigo errou o ataque");
                            break;
                    }
                }
            }
            switch (escolha) {
                case 1:
                    System.out.println("você atacou o inimigo");
                    inihp -= ataque + (ataque/inidefesa);
                    break;
                    default:
                    System.err.println("opção invalida digite a opção novamente");
                    break;
            }

        }while(hp > 0 && inihp > 0);


        if (hp <= 0) {
            System.out.println("você foi derrotado");
            System.exit(0);
        } else {
            System.out.println("você derrotou o inimigo");
            xp = geradorxp();
            System.out.printf("Você ganhou %d de xp\n",xp);

            recuperarvida();
            subirnivel();
        }


    }
}
