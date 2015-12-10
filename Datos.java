package museos;

import java.util.ArrayList;

/**
 *
 * @author galleta
 */
public class Datos {

    //crear lista con la clase Museo
    ArrayList<Museo> listaMuseos = new ArrayList<Museo>();

    public Datos() {
        iniciarDatos();
    }

    public void iniciarDatos() {
        /*se añaden elementos a la lista, creando los objetos con el metodo constructor
          porque el método constructor crea objetos
        */
        listaMuseos.add(new Museo("Museo de la caricatura", "Cuauhtémoc", "Centro Histórico, 06020 Ciudad de México, D.F.", "Donceles", "No. 99", "Lunes a Domingo de 10-00am a 18-00pm", "Donativo- 20 pesos entrada general y 15 pesos estudiantes, maestros y adultos mayores.", "Este museo contiene obras de diversos caricaturistas mexicanos.", 19.4356592, -99.1348822));
        listaMuseos.add(new Museo("Museo Casa de Carranza", "Cuauhtémoc", "C.P. 06500 México, D.F.", " Río Lerma, esquina con Río Amazonas", "No. 35", "De martes a sábado de 9.00 a 18:00 hrs.", "$43.00\n" +
                                  "\n Entrada gratuita a niños menores de 12 años; adultos mayores, jubilados, pensionados, estudiantes y maestros con credencial vigente; personas con discapacidad.\n" +
                                  "Domingo, entrada libre a nacionales y residentes extranjeros", "Narra la historia de la Revolución mexicana(Carranza)", 19.4311985, -99.1656567));
        listaMuseos.add(new Museo("Museo Nacional de culturas Populares", "Coyoacán", "Col. Del Carmen Coyoacán", "Av. Hidalgo", "289", "Martes a Jueves: 10:00 a 18:00 hrs, Viernes a Domingo:  10:00 a 20:00 hrs. Entrada libre: menores de 12 años, mayores de 60 años, jubilados y pensionados, personas con discapacidad, estudiantes y maestros con credencial vigente. Domingos, entrada libre general"," $13.00", "Diversas muestras de la cultura indígena de México.", 19.3499144, -99.1632077));
        listaMuseos.add(new Museo("Museo del Palacio de Bellas Artes", "Eje Central Lázaro Cárdenas", "Centro Histórico", "Av. Juárez", "06010", "Martes a Domingo10:00–17:00", "$45.00 pesos DESCUENTO a Estudiantes, maestros, INAPAM, empleados de CONACULTA e INBA. Todos los domingos entrada libre ", "Cuenta con una serie de 17 murales hechos por pintores mexicanos.", 19.435205, -99.1433887));
        listaMuseos.add(new Museo("Museo Nacional de la Cultura", "Cuauhtémoc", "col. Centro 06060 D.F. ", "Moneda", "No. 13", "Martes a domingo de 10:00 a 17:00 hrs.", " Entrada libre al público en general.", "Es el museo más antiguo de México.", 19.4331249, -99.1326262));
        listaMuseos.add(new Museo("Museo del Tequila y el Mezcal", "Cuauhtémoc", "Centro Histórico.Ciudad de México, D.F.", "Plaza Garibaldi.", "06010", "Lunes a Domingo de 11:00 a 20:00 hrs", "50 pesos para mayores de 18 años y de 30 pesos para personas de 5 a 17 años y adultos mayores con credencial del INAPAM.", "Proceso de elaboración de estas bebidas", 19.440051,-99.1420947));
        listaMuseos.add(new Museo("Museo Casa de León Trotsky", "Coyoacán", "Col. Del Carmen", "Río Churubusco", "410", "Martes a Domingo de 10:00 a 17:00 hrs", "Entrada general: $40.Con credencial de estudiante, maestro o INAPAM: $20", "El líder revolucionario vivió en esta casa", 19.357624, -99.1617661));
        listaMuseos.add(new Museo("Museo Cuartel Zapatista", "Milpa Alta.", "San Pablo Oztotepec, M{exico, D.F.", "Galeana sur", "12400", "De martes a sábado, 01:00 hrs", "Entrada Gratuita", "Este lugar fue el cuartel de la tropa zapatista.",0,0 ));
        listaMuseos.add(new Museo("Museo Casa Talavera", "Cuauhtémoc", "Centro Histórico", "Talavera", "20", "Lunes a viernes de 10:00 a 18:00 horas.", "Entrada libre", "El museo tiene objetos del periodo virreinal.", 19.4224104, -99.1485683));
        listaMuseos.add(new Museo("Museo Nacional de la Acuarela Mexicana", "Coyoacán", "Barrio de Santa Catarina", "Salvador Novo", "88", "Martes a domingo de 11:00 a 18:00 hrs.", "Entrada libre al museo. Precio de los cursos para adultos: $600.00 inscripción y $600.00 mensualidad. Cursos para niños: $400.00 inscripción y $400.00 mensualidad", "Tiene pinturas al agua mexicanas.", 19.348636, -99.1792587));
        listaMuseos.add(new Museo("Museo Nacional de Antropología", "Miguel Hidalgo", "col. Polanco Chapultepec", "Paseo de la Reforma", "11560", "Martes a Domingo de 9:00 a 19:00 hrs", " $64, sin costos a adultos mayores, personas con discapacidad, profesores y estudiantes.Domingo entrada gratuita", "Este museo tiene colecciones arqueológicas.", 19.4260082, -99.1884673));
        listaMuseos.add(new Museo("Museo Nacional de la Revolución", "Cuauhtémoc", "col. Tabacalera", "Plaza de la República", "06030", "Martes a domingo de 09:00 a 17:00 hrs", "$20.00 Estudiantes, maestros e Inapam, 50% de descuento con credencial vigente.", "Este museo tiene criptas de personajes nacionales.", 19.4362451, -99.1567462));
        listaMuseos.add(new Museo("Museo de Arte Popular", "Cuauhtémoc", "Centro Histórico","Revillagigedo", "11", " Martes a domingo de las 10:00 a las 18:00 horas y Miércoles de las 10:00 a las 21:00 horas.", "$40.00 . Domingo entrada libre", "Tiene manifestaciones artísticas populares, tanto recientes como antiguas.", 19.433784, -99.1485107));
        listaMuseos.add(new Museo("Museo Mexicano de Diseño", "Cuauhtémoc", "Col. Centro, 06000 Ciudad de México, D.F.", ": Av. Francisco I. Madero", "74", "Lunes de 11:30 a 20 horas / Martes a Domingo de 10 a 20 horas", "$20.00", "Expone la historia del diseño en México.", 19.4333327, -99.1367774));
        listaMuseos.add(new Museo("Museo Universitario de Arte Contemporáneo", "Coyoacán", "Ciudad Universitaria", "Av. Insurgentes Sur", "3000", "Miércoles, Viernes y Domingos de 10:00 a 18:00 horas. Jueves y Sábado 10:00 a 20:00 horas", "Jueves a Sábado: $40.00. Miércoles y Domingos: 20. *Hay descuento para ciertas instituciones en este museo", "Obras representativas de diversas corrientes artísticas", 19.3146535, -99.1875876));
        listaMuseos.add(new Museo("Mapoteca Manuel Orozco y Berra, Observatorio Central Tacubaya", "Miguel Hidalgo.", "col. Observatorio", "Av. Observatorio", "192", "Lunes a viernes de 8:30 a 15:00 hrs", "Entrada libre", "Colección de mapas de diversas épocas.  Hay más de tres mil ejemplares.", 19.403484, -99.1987327));
        listaMuseos.add(new Museo("Museo de Historia de Tlalpan", "Tlalpan", "Centro de Tlalpan", "Plaza de la Constitución", "10", "De martes a domingo, 10:00 - 18:00 hrs", "Entrada libre", "Su atractivo es el teléfono con el que se realizó la 1era llamada.", 19.2880703, -99.1694003));
        listaMuseos.add(new Museo("Museo José Luis Cuevas", "Cuauhtémoc", "Centro Histórico", "Academia", "13", "Martes a domingo de 10:00 a 18:00 hrs", "Entrada al museo: $20.00", "Arte contemporáneo, principalmente de Latinoamérica", 19.4336041, -99.1311716));
        listaMuseos.add(new Museo("Galería de Historia, Museo Caracol", "Miguel Hidalgo", "Primera sección del Bosque de Chapultepec", "Rampa de acceso al Castillo de Chapultepec", "11580", "De martes a domingo de 9:00 am a 4:15 pm", ": $ 52.00 entrada, $ 45.00 permiso para grabar video.", "Esculturas de barro de personajes y héroes nacionales", 19.419059,-99.1855007 ));
        listaMuseos.add(new Museo("Papalote Museo del Niño", "Miguel Hidalgo", "Col. Daniel Garza", "Periférico", "11830", "Lunes a Viernes de 9:00 a 18:00 hrs", "", "Muestra conocimientos científicos y tecnológicos", 19.4116573, -99.1969259 ));
        listaMuseos.add(new Museo("Museo Palacio Cultural Banamex (Antiguo Palacio de Iturbide)", "Cuauhtémoc", "Centro Histórico", "Madero", "17", " L-D: 10:00-19:00 hrs", "Entrada libre", "Tiene más de 1300 obras de arte de autores mexicanos", 19.4334791, -99.1414993 ));
        listaMuseos.add(new Museo("Museo Interactivo de Economía (MIDE)", "Cuauhtémoc", "Centro Histórico", "Antiguo Convento de Betlemitas, Tacuba", "17", "Martes a domingo de 9:00 a 18:00 hrs.", "$65 y $55 para menores de 12 años, estudiantes y maestros con credencial vigente.", "Enfocado a la economía y lo que lo constituye", 19.4355485, -99.1406088));
        listaMuseos.add(new Museo("Museo Arqueológico de Azcapotzalco Príncipe Tlaltecatzin", "Azcapotzalco", "Col. El Recreo", "Libertad", "35", "Martes a Domingo de 10:00 a 14:00 hrs. y de 16:00 a 18:00 hrs.", "Cooperación voluntaria", "Piezas arqueológicas reunidas por el señor Octavio Romero.", 19.4773755, -99.1880488));
        listaMuseos.add(new Museo("Museo de Sitio del Ex Convento del Desierto de los Leones", "Cuajimalpa de Morelos.", "Parque Nacional Desierto de los Leones, Carretera México-Toluca", "La venta", "05020", "De martes a domingo, 11:00 - 17:00 hrs.", "$13.00", "Cuenta con salas de exposiciones y conciertos de musica sacra", 19.3153067,-99.3086746));
        listaMuseos.add(new Museo("Museo Soumaya. Plaza Carso", "Miguel Hidalgo", "Granada", "Miguel de Cervantes Saavedra", "303", "Todos los días de 10:30 a 18:30 h", "Entrada libre", "Podemos ver piezas prehispánicas", 19.4406976, -99.2068888));
        listaMuseos.add(new Museo("Museo Comunitario San Miguel Teotongo", "Iztapalapa", "Col. San Miguel Teotongo", "Espiga", "19630", "Lunes a viernes de 10:00 a 17:00, sábado y domingo de 10:00 a 15:00 hrs.", "Entrada libre", "Colección de piezas prehispánicas", 0,0));
        listaMuseos.add(new Museo("Museo Arqueológico del Cerro de la Estrella", "Iztapalapa", "Col. Ampl. Veracruzana", "Carretera escénica al Cerro de la Estrella", "Km 2", "Martes a Viernes de 09:00 a 17:00; Sábado, domingo y días festivos de 09:00 a 18:00 hrs", "Donaivo $3", "Tiene 500 piezas prehispánicas y coloniales", 19.3482012, -99.0932759));
        listaMuseos.add(new Museo("Museo Cabeza de Juárez", "Iztapalapa", "Col. Agua Prieta", "Av. Guelatao y calzada Ermita Zaragoza", "09227", "Lunes a viernes de 8:00 a 15:00 hrs., sábado y domingo de 11:00 a 17:00 hrs.", "Entrada libre", "Pinturas murales y una exposición permanente de 1806 a 1872", 19.382716, -99.0412566));
        listaMuseos.add(new Museo("Museo Diego Rivera Anahuacalli", "Coyoacán", " Col. San Pablo Tepetlapa", "Av. del Museo", "150", "Martes a Domingo de 10:00 a 17:00 hrs", " $45 pesos público en general. $20 pesos estudiantes, profesores e INAMAP.", "Piezas coleccionadas por Diego Rivera.", 19.3225739, -99.1462769));
        listaMuseos.add(new Museo("Museo Nacional de la Mujer", "Cuauhtémoc", "Centro,06020 Ciudad de México, D.F.", "República de Bolivia", "17", "De martes a domingos, 10:00 a 18:00 hrs", "La entrada general tiene un costo de $20.00; y estudiantes e INAPAM, $10.00", "Documenta la historia con enfoque de género.", 19.4391832, -99.1343082));
        listaMuseos.add(new Museo("Museo de la Charrería", "Cuauhtémoc", "Centro Histórico", "Isabel la Católica", "108", "Lun-Vie 11:00-17:00 hrs.", "Entrada libre con identificación oficial", "Exhibe trajes,arreos,monturas,pinturas con la charrería", 19.4260453, -99.1394125));
        listaMuseos.add(new Museo("Museo Soumaya, Plaza Loreto", "Álvaro Obregón", "San Ángel", "Av. Revolución y Río Magdalena", "Eje 10 Sur", "10:30 a 18:30 h. Sábados hasta las 20 h | Martes cerrado", "Entrada libre", "Arte virreinal, europeo, sudamericano, y novohispano.", 19.3387325, -99.1942326));
        listaMuseos.add(new Museo("Museo del Ejército y Fuerza Aérea Mexicanos Bethlemitas", "Cuauhtémoc", "Centro Histórico", "Filomeno Mata", "6", "Martes a sábado de 10:00 a 17:00, domingo y días festivos de 10:00 a 16:00 hrs.", "Entrada Libre", "Documentos e información de la actividad militar", 19.4355342, -99.1411278));
        listaMuseos.add(new Museo("Museo Numismático Nacional", "Cuauhtémoc", "Centro Histórico", "Apartado", "13", "Visitas programadas de lunes a viernes a las 10 y 13 horas exclusivamente", "Entrada libre", "Muestra del acervo numismático de la Casa de Moneda.", 19.440019,-99.1324577));
        listaMuseos.add(new Museo("Museo Antiguo Colegio de San Ildefonso ", "Cuauhtémoc", "Centro Histórico", "Justo Sierra", "16", "Martes, entrada libre, de 10:00 a 19:30 h. Miércoles a Domingo De 10:00 a 17:30 h", "$45.00", "Pinturas de Diego Rivera y José Clemente Orozco", 19.436346,-99.1330521));
        listaMuseos.add(new Museo("Museo del Policía", "Cuauhtémoc", "Centro Histórico", "Victoria", "82", "Lunes a Domingo de 10 a 18hrs.", "$65 adultos, $45 niños, estudiantes y  maestros", "Espacio para que los policías muestren habilidades",19.43194,-99.1486107 ));
        listaMuseos.add(new Museo("San Carlos, Centro Cultural de la Escuela Nacional de Artes Plásticas", "Cuauhtémoc", "Centro Histórico", "Academia", "22", "No tiene horario definido", "Libre", "Colecciones artísticas siglos (XVI al XIX.)",19.4331001,-99.1309127 ));
        listaMuseos.add(new Museo("Museo de Sitio de Cuicuilco", "Tlalpan", "Isidro Favela", "Av. Insurgentes Sur", "146", "Lunes a domingo de 9 a 17 horas", "Entrada libre", "Materiales arqueológicos excavados en el sitio", 19.3003768,-99.1739265));
        listaMuseos.add(new Museo("Museo de Arte Contemporáneo Internacional Rufino Tamayo", "Miguel Hidalgo", "Bosque de Chapultepec", "Paseo de la Reforma", "51", "Martes a Domingo de 10:00 a 18:00 hrs.", "$19.00 al público en general", "Colección de artes plásticas y audiovisuales",19.425725,-99.1839047 ));
        listaMuseos.add(new Museo("Museo de Anatomía Patológica Animal", "Coyoacán", "CU", "Av. Insurgentes sur", "3000", "Lunes a viernes de 10:00 a 16:00 hrs.", "Entrada libre (con cita previa)", "Esqueletos, órganos y cortes de diferentes animales",19.330905,-99.1799537 ));
        listaMuseos.add(new Museo("Museo de Anatomía", "Coyoacán", "CU", "Edif. B de la Facultad de Medicina", "4to piso", "Martes y jueves de 13 a 15 hs.", "Entrada libre", "Modelos de partes y órganos humanos naturales.", 19.330905,-99.1799537));
        listaMuseos.add(new Museo("Museo de Paleontología y Geología", "Coyoacán", "CU", "Facultad de Ciencias", "04510", "Martes a Domingo de 10:00 a 17:00 hrs", "Entrada libre", "Colecciones que dan apoyo a la paleontología.",19.4502407,-99.1598886 ));
        listaMuseos.add(new Museo("Museo Casa Frida Kahlo", "Coyoacán", "col. Del Carmen", "Londres", "247", "Martes: 10:00 - 17:45 h, Miércoles: 11:00 - 17:45 h, Jueves a domingo: 10:00 - 17:45 h", "$120 entrada general, descuentos para académicos, niños y adultos mayores", "Se pueden apreciar algunos de sus cuadros y artículos.", 19.355148,-99.1647136));
        listaMuseos.add(new Museo("Museo de Odontología Dr. Samuel Fastlicht de la UNAM", "Cuauhtémoc", "Centro Histtórico", "Primo Verdad", "2", "Lunes a Viernes de 10:00 a 13:00 hrs", "Entrada libre", "Instrumental odontológico utilizado a lo largo de la historia.", 19.323632,-99.3134413));
        listaMuseos.add(new Museo("Museo del Templo Mayor", "Cuauhtémoc", "Centro Histórico", "Seminario", "8", " martes a domingo de 9:00 de la mañana a 5:00 de la tarde"," Los domingos la entrada es libre para mexicanos y extranjeros residentes en el país. $57 para menores de 13 años, estudiantes, profesores, personas de la tercera edad, pensionados y jubilados tienen acceso gratuito.", "Muestra ruinas arqueológicas", 19.4346088,-99.1340697));
        listaMuseos.add(new Museo("Museo del Objeto (MODO)", "Cuauhtemoc","Roma", "Colima", "145", "Miércoles a domingo de 10:00 am a 6:00 pm ", "Público $40, INAPAM, estudiantes y maestros $20/ Vecinos $20/ Menores de 12 años gratis","tiene un acervo de cerca de 100 mil objetos de 1810 a la fecha",19.4202617,-99.1613324));
        listaMuseos.add(new Museo("Museo Nacional de Historia, Castillo de Chapultepec", "Miguel Hidalgo", "Bosque de Chapultepec", "Primera sección", "0", "martes a domingo de 9.00 a 17:30 hrs", "$35 pesos los domingos es gratis", "Exhibe la zona que ocupño el colegio militar, y el alcázar", 19.4204447,-99.1841237));
        listaMuseos.add(new Museo("Museo Franz Meyer", "Cuauhtemoc", "Centro Histórico", "Plaza de la Santa Veracruz. Av. Hidalgo"," 45", "Martes a viernes: 10:00 a 17:00 horas", "Admisión general $45.00, Estidiantes y Maestros $25", "Colección de artes decorativas, con piezas de los siglos XVI al XIX", 19.4372286,-99.1453175));
        listaMuseos.add(new Museo("Museo de lo Increíble (Ripley)", "Cuauhtemoc", "Juárez", "Londres", "4", " lunes a domingo de 11:00 a 19:00 hrs", "Adultos $75 pesos. Niños, maestros y estudiantes $60 pesos", "toda clase de objetos extraños y estatuas raras", 19.4285856,-99.1589914));
        listaMuseos.add(new Museo("Museo de Cera", "Cuauhtemoc", "Juárez", "Londres", "6", "todos los días de 11:00 de la mañana a 7:00", "Entrada individual adultos a 70 pesos, niños y estudiantes con credencial vigente 60 pesos", "Personajes del arte, historia, política,espectáculo, en cera", 19.4284674,-99.1592315));
    }

    /*Método que busca en los elementos de la lista, el museo deseado*/
    public Museo buscarMuseoPorNombre(String nombre) {
        System.out.println("nombre recibido: " + nombre);
       
        /*Se hace una iteracion en la lista de museos, previamente creada*/
        for (Museo museo : listaMuseos) {
            /*Se compara, sí el nombre del obejto museo que se esta iterando, es el mismo al nombre que ingresó el usuario.
            Con el equals se compara si la cadena es la misma.
            con el contains, sí el nombre que dió el usuario está contenido en el nombre del objeto
            Se usa el toUpperCase para igualar los nombres a mayusculas, y que lo que se compara esté en mayusculas como lo que 
            se busca esté en mayusculas.
            upper sirve para comparar la palabra no impotando si es mayuscula o minuscula, y equals para comparar
            */
            if (museo.getNombre().toUpperCase().equals(nombre.toUpperCase()) || museo.getNombre().toUpperCase().contains(nombre.toUpperCase())) {
               /*cuando se encuentra una coincidencia, se regresa ese objeto*/
                return museo;
            }
        }

        /*se retorna un null en caso de que no haya encontrado algo*/
        return null;
    }
}
