package br.com.jrdani.jaco.model.enums

enum class Livro(
    val abbrev: String,
    val author: String,
    val chapters: Int,
    val group: String,
    val bookName: String,
    val testament: String
) {
    GENESIS (
        abbrev = "gn",
        author = "Moisés",
        chapters = 50,
        group = "Pentateuco",
        bookName = "Gênesis",
        testament = "VT"
    ),
    EXODO (
        abbrev = "ex",
        author = "Moisés",
        chapters = 40,
        group = "Pentateuco",
        bookName = "Êxodo",
        testament = "VT"
    ),
    LEVITICO (
        abbrev = "lv",
        author = "Moisés",
        chapters = 27,
        group = "Pentateuco",
        bookName = "Levítico",
        testament = "VT"
    ),
    NUMEROS (
        abbrev = "nm",
        author = "Moisés",
        chapters = 36,
        group = "Pentateuco",
        bookName = "Números",
        testament = "VT"
    ),
    DEUTERONOMIO (
        abbrev = "dt",
        author = "Moisés",
        chapters = 34,
        group = "Pentateuco",
        bookName = "Deuteronômio",
        testament = "VT"
    ),
    JOSUE (
        abbrev = "js",
        author = "Josué",
        chapters = 24,
        group = "Históricos",
        bookName = "Josué",
        testament = "VT"
    ),
    JUIZES (
        abbrev = "jz",
        author = "Samuel",
        chapters = 21,
        group = "Históricos",
        bookName = "Juízes",
        testament = "VT"
    ),
    RUTE (
        abbrev = "rt",
        author = "Samuel",
        chapters = 4,
        group = "Históricos",
        bookName = "Rute",
        testament = "VT"
    ),
    I_SAMUEL (
        abbrev = "1sm",
        author = "Samuel",
        chapters = 31,
        group = "Históricos",
        bookName = "1º Samuel",
        testament = "VT"
    ),
    II_SAMUEL (
        abbrev = "2sm",
        author = "Samuel",
        chapters = 24,
        group = "Históricos",
        bookName = "2º Samuel",
        testament = "VT"
    ),
    I_REIS (
        abbrev = "1rs",
        author = "Jeremias",
        chapters = 22,
        group = "Históricos",
        bookName = "1º Reis",
        testament = "VT"
    ),
    II_REIS (
        abbrev = "2rs",
        author = "Jeremias",
        chapters = 25,
        group = "Históricos",
        bookName = "2º Reis",
        testament = "VT"
    ),
    I_CRONICAS (
        abbrev = "1cr",
        author = "Esdras",
        chapters = 29,
        group = "Históricos",
        bookName = "1º Crônicas",
        testament = "VT"
    ),
    II_CRONICAS (
        abbrev = "2cr",
        author = "Esdras",
        chapters = 36,
        group = "Históricos",
        bookName = "2º Crônicas",
        testament = "VT"
    ),
    ESDRAS (
        abbrev = "ed",
        author = "Esdras",
        chapters = 10,
        group = "Históricos",
        bookName = "Esdras",
        testament = "VT"
    ),
    NEEMIAS (
        abbrev = "ne",
        author = "Neemias",
        chapters = 13,
        group = "Históricos",
        bookName = "Neemias",
        testament = "VT"
    ),
    ESTER (
        abbrev = "et",
        author = "Desconhecido",
        chapters = 10,
        group = "Históricos",
        bookName = "Ester",
        testament = "VT"
    ),
    JO (
        abbrev = "job",
        author = "Desconhecido",
        chapters = 42,
        group = "Poéticos",
        bookName = "Jó",
        testament = "VT"
    ),
    SALMOS (
        abbrev = "sl",
        author = "David, Moisés, Salomão",
        chapters = 150,
        group = "Poéticos",
        bookName = "Salmos",
        testament = "VT"
    ),
    PROVERBIOS (
        abbrev = "pv",
        author = "Salomão",
        chapters = 31,
        group = "Poéticos",
        bookName = "Provérbios",
        testament = "VT"
    ),
    ECLESIASTES (
        abbrev = "ec",
        author = "Salomão",
        chapters = 12,
        group = "Poéticos",
        bookName = "Eclesiastes",
        testament = "VT"
    ),
    CANTICOS (
        abbrev = "ct",
        author = "Salomão",
        chapters = 8,
        group = "Poéticos",
        bookName = "Cânticos",
        testament = "VT"
    ),
    ISAIAS (
       abbrev = "is",
       author = "Isaías",
       chapters = 66,
       group = "Profetas maiores",
       bookName = "Isaías",
       testament = "VT"
    ),
    JEREMIAS (
        abbrev = "jr",
        author = "Jeremias",
        chapters = 52,
        group = "Profetas maiores",
        bookName = "Jeremias",
        testament = "VT"
    ),
    LAMENTACOES (
        abbrev = "lm",
        author = "Jeremias",
        chapters = 5,
        group = "Profetas maiores",
        bookName = "Lamentações de Jeremias",
        testament = "VT"
    ),
    EZEQUIEL (
        abbrev = "ez",
        author = "Ezequiel",
        chapters = 48,
        group = "Profetas maiores",
        bookName = "Ezequiel",
        testament = "VT"
    ),
    DANIEL (
        abbrev = "dn",
        author = "Daniel",
        chapters = 12,
        group = "Profetas maiores",
        bookName = "Daniel",
        testament = "VT"
    ),
    OSEIAS (
        abbrev = "os",
        author = "Oséias",
        chapters = 14,
        group = "Profetas menores",
        bookName = "Oséias",
        testament = "VT"
    ),
    JOEL (
        abbrev = "jl",
        author = "Joel",
        chapters = 3,
        group = "Profetas menores",
        bookName = "Joel",
        testament = "VT"
    ),
    AMOS (
        abbrev = "am",
        author = "Amós",
        chapters = 9,
        group = "Profetas menores",
        bookName = "Amós",
        testament = "VT"
    ),
    OBADIAS (
        abbrev = "ob",
        author = "Obadias",
        chapters = 1,
        group = "Profetas menores",
        bookName = "Obadias",
        testament = "VT"
    ),
    JONAS (
        abbrev = "jn",
        author = "Jonas",
        chapters = 4,
        group = "Profetas menores",
        bookName = "Jonas",
        testament = "VT"
    ),
    MIQUEIAS (
        abbrev = "mq",
        author = "Miquéias",
        chapters = 7,
        group = "Profetas menores",
        bookName = "Miquéias",
        testament = "VT"
    ),
    NAUM (
        abbrev = "na",
        author = "Naum",
        chapters = 3,
        group = "Profetas menores",
        bookName = "Naum",
        testament = "VT"
    ),
    HABACUQUE (
        abbrev = "hc",
        author = "Habacuque",
        chapters = 3,
        group = "Profetas menores",
        bookName = "Habacuque",
        testament = "VT"
    ),
    SOFONIAS (
        abbrev = "sf",
        author = "Sofonias",
        chapters = 3,
        group = "Profetas menores",
        bookName = "Sofonias",
        testament = "VT"
    ),
    AGEU (
        abbrev = "ag",
        author = "Ageu",
        chapters = 2,
        group = "Profetas menores",
        bookName = "Ageu",
        testament = "VT"
    ),
    ZACARIAS (
        abbrev = "zc",
        author = "Zacarias",
        chapters = 14,
        group = "Profetas menores",
        bookName = "Zacarias",
        testament = "VT"
    ),
    MALAQUIAS (
        abbrev = "ml",
        author = "Malaquias",
        chapters = 4,
        group = "Profetas menores",
        bookName = "Malaquias",
        testament = "VT"
    ),
    MATEUS (
        abbrev = "mt",
        author = "Mateus",
        chapters = 28,
        group = "Evangelhos",
        bookName = "Mateus",
        testament = "NT"
    ),
    MARCOS (
        abbrev = "mc",
        author = "Marcos",
        chapters = 16,
        group = "Evangelhos",
        bookName = "Marcos",
        testament = "NT"
    ),
    LUCAS (
        abbrev = "lc",
        author = "Lucas",
        chapters = 24,
        group = "Evangelhos",
        bookName = "Lucas",
        testament = "NT"
    ),
    JOAO (
        abbrev = "jo",
        author = "João",
        chapters = 21,
        group = "Evangelhos",
        bookName = "João",
        testament = "NT"
    ),
    ATOS (
        abbrev = "at",
        author = "Lucas",
        chapters = 28,
        group = "Histórico",
        bookName = "Atos",
        testament = "NT"
    ),
    ROMANOS (
        abbrev = "rm",
        author = "Paulo",
        chapters = 16,
        group = "Cartas",
        bookName = "Romanos",
        testament = "NT"
    ),
    I_CORINTIOS (
        abbrev = "1co",
        author = "Paulo",
        chapters = 16,
        group = "Cartas",
        bookName = "1ª Coríntios",
        testament = "NT"
    ),
    II_CORINTIOS (
        abbrev = "2co",
        author = "Paulo",
        chapters = 13,
        group = "Cartas",
        bookName = "2ª Coríntios",
        testament = "NT"
    ),
    GALATAS (
        abbrev = "gl",
        author = "Paulo",
        chapters = 6,
        group = "Cartas",
        bookName = "Gálatas",
        testament = "NT"
    ),
    EFESIOS (
        abbrev = "ef",
        author = "Paulo",
        chapters = 6,
        group = "Cartas",
        bookName = "Efésios",
        testament = "NT"
    ),
    FILIPENSES (
        abbrev = "fp",
        author = "Paulo",
        chapters = 4,
        group = "Cartas",
        bookName = "Filipenses",
        testament = "NT"
    ),
    COLOSSENSES (
        abbrev = "cl",
        author = "Paulo",
        chapters = 4,
        group = "Cartas",
        bookName = "Colossenses",
        testament = "NT"
    ),
    I_TESSALONICENSES (
        abbrev = "1ts",
        author = "Paulo",
        chapters = 5,
        group = "Cartas",
        bookName = "1ª Tessalonicenses",
        testament = "NT"
    ),
    II_TESSALONICENSES (
        abbrev = "2ts",
        author = "Paulo",
        chapters = 3,
        group = "Cartas",
        bookName = "2ª Tessalonicenses",
        testament = "NT"
    ),
    I_TIMOTEO (
       abbrev = "1tm",
       author = "Paulo",
       chapters = 6,
       group = "Cartas",
       bookName = "1ª Timóteo",
       testament = "NT"
    ),
    II_TIMOTEOS (
        abbrev = "2tm",
        author = "Paulo",
        chapters = 4,
        group = "Cartas",
        bookName = "2ª Timóteo",
        testament = "NT"
    ),
    TITO (
        abbrev = "tt",
        author = "Paulo",
        chapters = 2,
        group = "Cartas",
        bookName = "Tito",
        testament = "NT"
    ),
    FILEMOM (
        abbrev = "fm",
        author = "Paulo",
        chapters = 1,
        group = "Cartas",
        bookName = "Filemom",
        testament = "NT"
    ),
    HEBREUS (
        abbrev = "hb",
        author = "Desconhecido",
        chapters = 13,
        group = "Cartas",
        bookName = "Hebreus",
        testament = "NT"
    ),
    TIAGO (
        abbrev = "tg",
        author = "Tiago",
        chapters = 5,
        group = "Cartas",
        bookName = "Tiago",
        testament = "NT"
    ),
    I_PEDRO (
        abbrev = "1pe",
        author = "Pedro",
        chapters = 5,
        group = "Cartas",
        bookName = "1ª Pedro",
        testament = "NT"
    ),
    II_PEDRO (
        abbrev = "2pe",
        author = "Pedro",
        chapters = 3,
        group = "Cartas",
        bookName = "2ª Pedro",
        testament = "NT"
    ),
    I_JOAO (
        abbrev = "1jo",
        author = "João",
        chapters = 5,
        group = "Cartas",
        bookName = "1ª João",
        testament = "NT"
    ),
    II_JOAO (
        abbrev = "2jo",
        author = "João",
        chapters = 1,
        group = "Cartas",
        bookName = "2ª João",
        testament = "NT"
    ),
    III_JOAO (
        abbrev = "3jo",
        author = "João",
        chapters = 1,
        group = "Cartas",
        bookName = "3ª João",
        testament = "NT"
    ),
    JUDAS (
        abbrev = "jd",
        author = "Judas",
        chapters = 1,
        group = "Cartas",
        bookName = "Judas",
        testament = "NT"
    ),
    APOCALIPSE (
        abbrev = "ap",
        author = "João",
        chapters = 22,
        group = "Revelações",
        bookName = "Apocalipse",
        testament = "NT"
    );
}
