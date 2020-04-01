-- phpMyAdmin SQL Dump
-- version 3.5.8.2
-- http://www.phpmyadmin.net
--
-- Host: 89.46.111.90
-- Generato il: Mar 31, 2020 alle 21:05
-- Versione del server: 5.6.44-86.0-log
-- Versione PHP: 5.3.8

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `Sql1325037_1`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `emes_pratiche`
--

CREATE TABLE IF NOT EXISTS `emes_pratiche` (
  `idPratica` int(2) DEFAULT NULL,
  `nomePratica` varchar(63) DEFAULT NULL,
  `costo` varchar(64) NOT NULL DEFAULT '0.0',
  `attach` varchar(64) DEFAULT '0',
  `note` longtext,
  `visualizza` varchar(2) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dump dei dati per la tabella `emes_pratiche`
--

INSERT INTO `emes_pratiche` (`idPratica`, `nomePratica`, `costo`, `attach`, `note`, `visualizza`) VALUES
(1, 'ACCOGLIMENTO INFORTUNIO O ULTIMA REVISIONE', 'pratica a pagamento sfruttando il servizio remote services euro ', '0', 'Nessuna.', 'si'),
(2, 'ACCREDITO CONTRIBUTI FIGURATIVI GRAVIDANZA (INPS)', 'pratica a pagamento sfruttando il servizio remote services euro ', '0', 'Nessuna.', 'si'),
(3, 'ACCREDITO SERVIZIO DI LEVA', 'pratica a pagamento sfruttando il servizio remote services euro ', '0', 'Nessuna.', 'si'),
(4, 'ANF COLF', 'pratica a pagamento sfruttando il servizio remote services euro ', '0', 'Nessuna.', 'si'),
(5, 'ANF DITTE ATTIVE', 'pratica a pagamento sfruttando il servizio remote services euro ', '0', 'busta', 'si'),
(6, 'ANF DITTE CESSATE O FALLITE', '0.0pratica a pagamento sfruttando il servizio remote services eu', '0', 'Nessuna.', 'si'),
(7, 'ANF GESTIONE SEPARATA', '0.0pratica a pagamento sfruttando il servizio remote services eu', '0', 'Nessuna.', 'si'),
(8, 'ANTICIPAZIONE NASPI', 'pratica a pagamento sfruttando il servizio remote services euro ', '0', 'Nessuna.', 'si'),
(9, 'APE SOCIALE LAVORATORE MANSIONI DIFFICOLTOSE', 'pratica a pagamento sfruttando il servizio remote services euro ', '0', 'Nessuna.', 'si'),
(10, 'APE SOCIALE LAVORATORI CON 74% INVALIDIT&Aacute;', 'pratica a pagamento sfruttando il servizio remote services euro ', '0', 'Nessuna.', 'si'),
(11, 'APE SOCIALE PER LAVORATORI DISOCCUPATI', 'pratica a pagamento sfruttando il servizio remote services euro ', '0', 'Nessuna.', 'si'),
(12, 'ASSEGNI FAMILIARI - AUTORIZZAZIONI', 'pratica a pagamento sfruttando il servizio remote services euro ', '0', 'Nessuna.', 'si'),
(13, 'ASSEGNO DI NATALIT&Aacute; L.190-2014', 'pratica a pagamento sfruttando il servizio remote services euro ', '0', 'Nessuna.', 'si'),
(14, 'ASSEGNO NUCLEO FAMILIARE', 'pratica a pagamento sfruttando il servizio remote services euro ', '0', 'Nessuna.', 'si'),
(15, 'ASSEGNO O PENSIONE INVALIDIT&Aacute; CIVILE', 'pratica a pagamento sfruttando il servizio remote services euro ', '0', 'compilare con attenzione il modello ap66 ed il modello ap 70, sil modello AP70 non Ã¨ il caso il timbro di vidimazione della bamca /posta ma solo IBAN corretto', 'si'),
(16, 'ASSEGNO ORDINARIO DI INVALIDIT&Aacute; L.222-84', 'pratica a pagamento sfruttando il servizio remote services euro ', '0', 'Nessuna.', 'si'),
(17, 'ASSEGNO SOCIALE', 'pratica a pagamento sfruttando il servizio remote services euro ', '0', 'La misura massima dell assegno spettante Ã¨ determinata dalla differenza tra il limite di reddito previsto annualmente e il reddito dichiarato. ', 'si'),
(18, 'AUTORIZZAZIONE VERSAMENTI VOLONTARI', 'pratica a pagamento sfruttando il servizio remote services euro ', '0', 'Nessuna.', 'si'),
(19, 'BONUS NIDO', 'pratica a pagamento sfruttando il servizio remote services euro ', '0', 'FATTURE O RICEVUTE DI PAGAMENTO - SR163 - MANDATO - DOCUMENTO DI RICONOSCIMENTO GENITORI E MINORI ED ATTESTATO SCOLASTICO', 'si'),
(20, 'CALCOLO DI PENSIONE', 'pratica a pagamento sfruttando il servizio remote services euro ', '0', 'Nessuna.', 'si'),
(21, 'CERTIFICATO MEDICO AGGRAVAMENTO', 'pratica a pagamento sfruttando il servizio remote services euro ', '0', 'Nessuna.', 'si'),
(22, 'CERTIFICAZIONE UNICA', 'pratica a pagamento sfruttando il servizio remote services euro5', '0', 'Nessuna.', 'si'),
(23, 'CESSAZIONE ATTIVIT&Aacute;', 'pratica a pagamento sfruttando il servizio remote services euro ', '0', 'Nessuna.', 'si'),
(24, 'CESSIONE DEL QUINTO E DELEGA DIPENDENTE', '0.0', '0', 'DOCUMENTO DI RICONOSCIMENTO - MANDATO - TESSERA SANITARIA - CERTIFICAZIONE UNICA - MODELLO-DI-DICHIARAZIONE-SOSTITUTIVA-DI-ATTO-DI-NOTORIETA - ULTIME DUE BUSTE PAGHE', 'si'),
(25, 'CESSIONE DEL QUINTO PENSIONATO', 'pratica a pagamento sfruttando il servizio remote services euro ', '0', 'MODELLO CF DEL RICHIEDENTE MODELLO OBIS M - E CUD PER PRE ANALISI E IMPORTO RICHIESTO TELEFONO E CONTATI ', 'si'),
(26, 'COLLOCAMENTO MIRATO L.68-1999', 'pratica a pagamento sfruttando il servizio remote services euro ', '0', 'Nessuna.', 'si'),
(27, 'CONGEDO PARENTALE GIORNALIERO', '10.00', '0', 'Art 23 congedo parentale, Secondo il decreto Ã¨ possibile fruire dei congedi parentale straordinario per un tempo non superiore a giorni 15 per i figli sino ad anni 12- Questo speciale congedo farÃ  percepire per il periodo  un indennitÃ  pari al 50%  della retribuzione- Da sottolineare che tramite lettura del decreto sembra che tali permessi /indennitÃ  non si cumulano E NON DOVREBBERO INFICIARE i normali periodi di congedo parentale, spettano ai dipendenti ai soggetti in gestione separata, ma attenzione, si puo godere di tali ammortizzatori ,. La fruizione del congedo Ã¨ riconosciuto ALTERNATIVAMENTE  ad entrambi i genitori per un totale complessivo di giorni 15 quindi eventualmente 7 e  8  che nessuno dei due genitori  goda di sostegno di strumenti  a sostegno del redito(da capire quali nella fattispecie)  ma sicuramente se entrambi o l unico genitore non risulti disoccupato o  non abbia dovuto sospendere o cessare attivitÃ   lavorativa. Quindi semplificando: IndennitÃ   congedo parentale:  Spetta a lavoratori dipendenti Appartenenti alla gestione inps dip e gestione separata. Non spetta ai soggetti che sono iscritti a casse private  Per questi ultimi in alternativa nel rispetto dei requisiti di cui sopra potranno beneficiare del bonus Baby sitter  previa comunicazione alle proprie casse di appartenenza. Si precisa che il tutto dovrÃ  seguire  una linea operativa ancora non comunicata dallâ€™INPS e sarÃ  soggetta e limitata alle disponibilita del fondo  pratica euro 10', 'si'),
(28, 'CONGEDO PARENTALE SU BASE ORARIA', 'pratica a pagamento sfruttando il servizio remote services euro ', '0', 'R23 - BUSTA PAGA - MANDATO - DOCUMENTO DI RICONOSCIMENTO', 'si'),
(29, 'CONGEDO STRAORDINARIO', 'pratica a pagamento sfruttando il servizio remote services euro ', '0', 'Nessuna.', 'si'),
(30, 'DETRAZIONI', 'pratica a pagamento sfruttando il servizio remote services euro ', '0', 'Nessuna.', 'si'),
(31, 'DIMISSIONI VOLONTARIE', 'pratica a pagamento sfruttando il servizio remote services euro ', '0', 'Nessuna.', 'si'),
(32, 'DIS - COLL', '0.0', '0', NULL, 'si'),
(33, 'DS RIMPATRIATI', '0.0', '0', NULL, 'si'),
(34, 'ECOCERT', '0.0', '0', NULL, 'si'),
(35, 'ESTRATTO CONTRIBUTIVO', 'pratica a pagamento sfruttando il servizio remote services euro ', '0', ' Attenzione, questi documenti sono necessari al fine della lavorazione. Senza gli stessi non Ã¨ possibile inoltrare la pratica - MANDATO - DOCUMENTO DI RICONOSCIMENTO', 'si'),
(36, 'FASE CONCESSORIA - AP70', 'pratica a pagamento sfruttando il servizio remote services euro ', 'FASE CONCESSORIA - AP70.zip', 'Nessuna.', 'si'),
(37, 'FONDO GARANZIA ( ESECUZIONE INDIVIDUALE )', 'pratica a pagamento sfruttando il servizio remote services euro ', '0', 'Nessuna.', 'si'),
(38, 'FONDO GARANZIA ( FALLIMENTO )', 'pratica a pagamento sfruttando il servizio remote services euro ', '0', 'Nessuna.', 'si'),
(39, 'HANDICAP L.104-1992', 'pratica a pagamento sfruttando il servizio remote services euro ', 'HANDICAP L.104-1992.zip', 'Nessuna.', 'si'),
(40, 'INDENNIT&Aacute; DI ACCOMPAGNAMENTO INVALIDI CIVILI', 'pratica a pagamento sfruttando il servizio remote services euro ', 'INDENNITA'' DI ACCOMPAGNAMENTO INVALIDI CIVILI.zip', 'Nessuna.', 'si'),
(41, 'INDENNIT&Aacute; DI FREQUENZA', 'pratica a pagamento sfruttando il servizio remote services euro ', '0', 'Nessuna.', 'si'),
(42, 'INDENNIT&Aacute; DISOCCUPAZIONE LAV. AGRICOLI', '0.0', '0', NULL, 'si'),
(43, 'INDENNIT&Aacute; MATERNIT&Aacute; PATERNIT&Aacute; OBBLIGATORIA', 'pratica a pagamento sfruttando il servizio remote services euro ', '0', 'Nessuna.', 'si'),
(44, 'INDENNIZZO CESSAZIONE DELL&rsquo;ATTIVIT&Aacute; COMMERCIALE', 'pratica a pagamento sfruttando il servizio remote services euro ', '0', 'Nessuna.', 'si'),
(45, 'L.104-1992 MINORI FREQUENZA SCOLASTICA', 'pratica a pagamento sfruttando il servizio remote services euro ', '0', 'Nessuna.', 'si'),
(46, 'MAGGIORAZIONE SOCIALE', 'pratica a pagamento sfruttando il servizio remote services euro ', '0', 'Nessuna.', 'si'),
(47, 'MOBILIT&Aacute; IN DEROGA', '0.0', '0', NULL, 'si'),
(48, 'MODELLO INDENNIT&Aacute; COMMERCIANTI', 'pratica a pagamento sfruttando il servizio remote services euro ', '0', 'Nessuna.', 'si'),
(49, 'NASPI', 'pratica a pagamento sfruttando il servizio remote services euro ', '0', 'nel modello sr156 fare attenzione a compilare tutti i campi, tra cui patronato scelto (epasa Itaco) mentre sindacato ALDEPI, allegare sempre busta paga, unilav e/o contratto di lavoro se contratto a termine,  vi ricordo che il tempo massimo per la richiesta della Naspi e di 68 gg dalla data di interruzione del rapporto di lavoro, non saranno prese  in carico e lavorate pratiche con una scadenza inferiore a 10 giorni. per tali pratiche bisogna richiedere autorizzazioni al caricamento alla SEDE EMES NAZIONALE ', 'si'),
(50, 'NASPI - COM', '0.0', '0', NULL, 'si'),
(51, 'OBIS - M', '0.0', '0', NULL, 'si'),
(52, 'PENSIONE AI SUPERSTITI', 'pratica a pagamento sfruttando il servizio remote services euro ', 'PENSIONE AI SUPERSTITI.zip', ' MANDATO - DOCUMENTO DI RICONOSCIMENTO - AP03 / AP04 - AP15 - AP58 - AP13 - DICHIARAZIONE CERTIFICATO MORTEl superstite viene considerato a carico del defunto al sussistere delle condizioni  di: per pensione ai superstiti per i nipoti servono i documenti di entrambi i genitori autocertificazione stato di famiglia autocertificazione assenza completa di reddito documento della richiedente  numero pensione del defunto \n\nnon autosufficienza economica: tale condizione sussiste quando il reddito individuale del superstite, dedotti i redditi non computabili per legge, non supera lâ€™importo del trattamento minimo della pensione maggiorato del 30%. In caso di figli maggiorenni inabili superstiti, per i decessi intervenuti successivamente al 31 ottobre 2000, ai fini dellâ€™accertamento del requisito di non autosufficienza economica si fa riferimento al criterio stabilito per il riconoscimento del diritto a pensione nei confronti degli invalidi civili totali, per i quali il limite di reddito Ã¨ quello stabilito dall&#039;articolo 14-septies della legge 29 febbraio 1980, n. 33, annualmente rivalutato. Per i figli inabili che si trovino nelle condizioni previste dall&#039;articolo 5 della legge n. 222 del 1984 e che si trovino nella impossibilitÃ  di deambulare senza l&#039;aiuto permanente di un accompagnatore o che, non essendo in grado di compiere gli atti quotidiani della vita, abbisognino di un&#039;assistenza continua, il predetto limite deve essere aumentato dell&#039;importo dell&#039;indennitÃ  di accompagnamento\nmantenimento abituale: tale condizione puÃ² desumersi dallâ€™effettivo comportamento del dante causa nei confronti dellâ€™avente diritto.\nPer la verifica delle condizioni di non autosufficienza economica e mantenimento abituale assume particolare rilievo la convivenza o meno del superstite con il defunto.', 'si'),
(53, 'PENSIONE ANTICIPATA QUOTA 100', 'pratica a pagamento sfruttando il servizio remote services euro ', 'PENSIONE ANTICIPATA QUOTA 100.zip', 'Nessuna.', 'si'),
(54, 'PENSIONE ANZIANIT&Aacute; ANTICIPATA', '0.0', '0', NULL, 'si'),
(55, 'PENSIONE ASSEGNO CIECHI CIVILI', 'pratica a pagamento sfruttando il servizio remote services euro ', '0', 'Nessuna.', 'si'),
(56, 'PENSIONE DI CITTADINANZA', '0.0', '0', 'Nessuna.', 'si'),
(57, 'PENSIONE DI VECCHIAIA', 'pratica a pagamento sfruttando il servizio remote services euro ', '0', 'Nessuna.', 'si'),
(58, 'PENSIONE DI VECCHIAIA SUPPLEMENTARE', 'pratica a pagamento sfruttando il servizio remote services euro ', 'PENSIONE DI VECCHIAIA SUPPLEMENTARE.zip', 'Nessuna.', 'si'),
(59, 'PENSIONE ORDINARIA INABILIT&Aacute;L.222-84 - L.232-2016', 'pratica a pagamento sfruttando il servizio remote services euro ', '0', 'Nessuna.', 'si'),
(60, 'PENSIONE SORDOMUTI', 'pratica a pagamento sfruttando il servizio remote services euro ', '0', 'Nessuna.', 'si'),
(61, 'PERMESSI L. 104 FAMILIARE DISABILE', 'pratica a pagamento sfruttando il servizio remote services euro ', 'PERMESSI L. 104 FAMILIARE DISABILE.zip', 'Nessuna.', 'si'),
(62, 'PERMESSI L. 104 LAVORATORE DISABILE', 'pratica a pagamento sfruttando il servizio remote services euro ', 'PERMESSI L. 104 LAVORATORE DISABILE.zip', 'Nessuna.', 'si'),
(63, 'PREMIO ALLA NASCITA O ADOZIONE', 'pratica a pagamento sfruttando il servizio remote services euro ', 'PREMIO ALLA NASCITA O ADOZIONE.zip', 'Nessuna.', 'si'),
(64, 'RATEI MATURATI E NON RISCOSSI', 'pratica a pagamento sfruttando il servizio remote services euro ', 'RATEI MATURATI E NON RISCOSSI.zip', 'Nessuna.', 'si'),
(65, 'RDC-COM', '0.0', '0', NULL, 'si'),
(66, 'REDDITO DI CITTADINANZA', '0.0', '0', NULL, 'si'),
(67, 'RIC. TRATTAMENTO DI FAMIGLIA (ANF SE STESSO)', 'pratica a pagamento sfruttando il servizio remote services euro ', 'RIC. TRATTAMENTO DI FAMIGLIA (ANF SE STESSO).zip', 'Nessuna.', 'si'),
(68, 'RIC. TRATTAMENTO DI FAMIGLIA (NIPOTI A CARICO)', 'pratica a pagamento sfruttando il servizio remote services euro ', 'RIC. TRATTAMENTO DI FAMIGLIA (NIPOTI A CARICO).zip', 'Attenzione, questi documenti sono necessari al fine della lavorazione. Senza gli stessi non Ã¨ possibile inoltrare la pratica - AP15 - AP57 - AUTOCERTIFICAZIONE STATO DI FAMIGLIA - DOCUMENTO DI RICONOSCIMENTO - MANDATO - RINUNCIA NONNI - RINUNCIA GENITORI - STATO DISOCCUPAZIONE GENITORI - DOCUMENTI RICONOSCIMENTO ALTRI NONNI - AUTOCERTIFICAZIONE DECESSO  IN CASO DI MORTE I FILI PDF SONO PRESENTI NELL ELENCO PRATICHE NELL AREA ESTERNA ', 'si'),
(69, 'RICONGIUNZIONE ( INPDAP )', 'pratica a pagamento sfruttando il servizio remote services euro ', '0', 'Nessuna.', 'si'),
(70, 'RICONGIUNZIONE ( INPS )', 'pratica a pagamento sfruttando il servizio remote services euro ', '0', 'Nessuna.', 'si'),
(71, 'RICONOSCIMENTO POSTUMI GRADO NON INDENNIZZABILE', '0.0', '0', NULL, 'si'),
(72, 'RICONOSCIMENTO POSTUMI GRADONONINDENNIZZABILE(INAIL)', '0.0', '0', NULL, 'si'),
(73, 'RICORSO ONLINE', 'pratica a pagamento sfruttando il servizio remote services  solo', '0', 'Nessuna.', 'si'),
(74, 'RICOSTITUZIONE PENSIONE PER ALTRI MOTIVI', 'pratica a pagamento sfruttando il servizio remote services euro ', '0', 'Nessuna.', 'si'),
(75, 'RICOSTITUZIONE PENSIONE PER CONTRIBUTI PREGRESSI', 'pratica a pagamento sfruttando il servizio remote services euro ', '0', 'Nessuna.', 'si'),
(76, 'RICOSTITUZIONE PENSIONE PER SUPPLEMENTO', 'pratica a pagamento sfruttando il servizio remote services euro ', '0', 'Nessuna.', 'si'),
(77, 'RICOSTITUZIONE PER TRATTAMENTO DI FAMIGLIA', 'pratica a pagamento sfruttando il servizio remote services euro ', '0', 'Nessuna.', 'si'),
(78, 'RICOSTITUZIONI PENSIONI PER MOTIVI REDDITUALI', 'pratica a pagamento sfruttando il servizio remote services euro ', 'RICOSTITUZIONI PENSIONI PER MOTIVI REDDITUALI.zip', 'Nessuna.', 'si'),
(79, 'RINNOVO ASSEGNO INVALIDIT&Aacute; L.222-84', 'pratica a pagamento sfruttando il servizio remote services euro ', '0', 'Nessuna.', 'si'),
(80, 'RISCATTO LAUREA ( INPDAP )', 'pratica a pagamento sfruttando il servizio remote services euro ', '0', 'Nessuna.', 'si'),
(81, 'RISCATTO LAUREA ( INPS )', 'pratica a pagamento sfruttando il servizio remote services euro ', '0', 'Nessuna.', 'si'),
(82, 'SEGNALAZIONE CONTRIBUTIVA', 'pratica a pagamento sfruttando il servizio remote services euro ', '0', 'Nessuna.', 'si'),
(83, 'VARIAZIONE UFFICIO PAGATORE', 'pratica a pagamento sfruttando il servizio remote services euro ', 'VARIAZIONE UFFICIO PAGATORE.zip', 'Nessuna.', 'si'),
(84, 'ACCREDITO CONTRIBUTI FIGURATIVI GRAVIDANZA INPDAP', '0.0', '0', NULL, 'si'),
(85, 'ACCREDITO CONTRIBUTI IN RVPA', '0.0', '0', NULL, 'si'),
(86, 'APE SOCIALE LAVORATORI CHE ASSISTONO DISABILI', 'pratica a pagamento sfruttando il servizio remote services euro ', '0', 'Nessuna.', 'si'),
(87, 'RIPOSI PER ALLATTAMENTO', 'pratica a pagamento sfruttando il servizio remote services euro ', '0', 'Nessuna.', 'si');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
