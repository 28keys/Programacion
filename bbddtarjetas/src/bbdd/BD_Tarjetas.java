package bbdd;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.time.*;
import colegio.*;
import modelos.Cuenta;
import modelos.Tarjeta;

public class BD_Tarjetas extends BD_Conector {

	private static Statement s;
	private static ResultSet reg;

	public BD_Tarjetas(String file) {
		super(file);
	}

	public ArrayList<Cuenta> buscarCuentasPorTitular(String dni) throws ErrorBaseDatos {
		String cadenaSQL = "SELECT * FROM cuentas WHERE titular1 ='" + dni + "' OR titular2 ='" + dni
				+ "' OR titular3 ='" + dni + "'";
		ArrayList<Cuenta> listaCuentas = new ArrayList<Cuenta>();
		try {
			this.abrir();
			s = c.createStatement();
			reg = s.executeQuery(cadenaSQL);
			while (reg.next()) {
				listaCuentas.add(new Cuenta(reg.getInt("número"), reg.getString("titular1"), reg.getString("titular2"),
						reg.getString("titular3"), reg.getDouble("saldo"), reg.getDate("fecha").toLocalDate()));
			}
			s.close();
			this.cerrar();
			return listaCuentas;
		} catch (SQLException e) {
			throw new ErrorBaseDatos("No se pudo listar las cuentas");

		}
	}

	public int añadir_tarjeta_credito(Tarjeta tar) throws ErrorBaseDatos {
		String cadenaSQL = "INSERT INTO tarjetas VALUES(" + tar.getNumeroTarjeta() + "," + tar.getNumero() + ",'"
				+ tar.getTitular() + "'," + tar.getLimite() + ",'" + tar.getTipo() + "','" + tar.getFechaCaducidad()
				+ "','" + tar.getClave() + "'," + tar.getBloqueada() + ")";
		try {
			this.abrir();
			s = c.createStatement();
			int filas = s.executeUpdate(cadenaSQL);
			s.close();
			this.cerrar();
			return filas;
		} catch (SQLException e) {
			throw new ErrorBaseDatos("No se puede realizar el alta");
		}
	}

	public Cuenta buscarCuenta(int numCuenta) throws ErrorBaseDatos {
		String cadenaSQL = "SELECT * FROM cuentas WHERE número='" + numCuenta + "'";
		Cuenta ct = null;
		try {
			this.abrir();
			s = c.createStatement();
			reg = s.executeQuery(cadenaSQL);
			if (reg.next()) {
				ct = new Cuenta(reg.getInt("número"), reg.getString("titular1"), reg.getString("titular2"),
						reg.getString("titular3"), reg.getDouble("saldo"), reg.getDate("fecha").toLocalDate());
			}
			s.close();
			this.cerrar();
			return ct;
		} catch (SQLException e) {
			this.cerrar();
			throw new ErrorBaseDatos("Error al buscar cuenta");

		}
	}

	public int BuscarUltimoNumTarjeta() throws ErrorBaseDatos {
		String cadenaSQL = "SELECT MAX(numero) from tarjetas";
		int ultimo = 0;
		try {
			this.abrir();
			s = c.createStatement();
			reg = s.executeQuery(cadenaSQL);
			if (reg.next()) {
				ultimo = reg.getInt(1);
			}
			s.close();
			this.cerrar();
			return ultimo;
		} catch (SQLException e) {
			this.cerrar();
			throw new ErrorBaseDatos("Error al buscar alumno");
		}
	}

	/*
	 * public int añadir_Alumno( Alumno al) throws ErrorBaseDatos{ String
	 * cadenaSQL="INSERT INTO alumnos VALUES('" + al.getNombre() + "','" +
	 * al.getDni()+"','"+ al.getTelenono() +"',"+ al.getMatricula()+",'"+
	 * al.getCurso()+"','"+al.getFechaMatricula()+"')";
	 * 
	 * try{ this.abrir(); s=c.createStatement(); int
	 * filas=s.executeUpdate(cadenaSQL); s.close(); this.cerrar(); return filas; }
	 * catch ( SQLException e){ throw new
	 * ErrorBaseDatos("No se puede realizar el alta"); } }
	 * 
	 * public ArrayList<Alumno> listadoAlumnosCurso(String curso) throws
	 * ErrorBaseDatos{ String
	 * cadenaSQL="SELECT * from alumnos WHERE curso='"+curso+"'"; ArrayList<Alumno>
	 * listaCursos=new ArrayList<Alumno>(); try{ this.abrir();
	 * s=c.createStatement(); reg=s.executeQuery(cadenaSQL); while ( reg.next()){ //
	 * La fecha que se extrae de la bbdd es sql.Date, hay que transformarla a
	 * LocalDate java.sql.Date f=reg.getDate("fechaMatricula"); LocalDate
	 * fBuena=f.toLocalDate(); listaCursos.add(new
	 * Alumno(reg.getString("dni"),reg.getString("nombre"),reg.getString("curso"),
	 * reg.getInt("matricula"),reg.getString("telefono"),fBuena));
	 * 
	 * } s.close(); this.cerrar(); return listaCursos; } catch ( SQLException e){
	 * throw new ErrorBaseDatos("Listando alumnos curso"); } }
	 * 
	 * 
	 * public Vector<String> listadoCursos() throws ErrorBaseDatos{ String
	 * cadenaSQL="SELECT curso from cursos"; Vector<String> listaCursos=new
	 * Vector<String>(); try{ this.abrir(); s=c.createStatement();
	 * reg=s.executeQuery(cadenaSQL); while ( reg.next()){
	 * listaCursos.add(reg.getString(1)); } s.close(); this.cerrar(); return
	 * listaCursos; } catch ( SQLException e){ //
	 * System.out.println(e.getMessage()); throw new
	 * ErrorBaseDatos("Listando cursos");
	 * 
	 * } }
	 * 
	 * public void listadoAlumnosPorCurso() throws ErrorBaseDatos{ String
	 * cadenaSQL="SELECT curso from cursos"; String curso=""; try{ this.abrir();
	 * s=c.createStatement(); reg=s.executeQuery(cadenaSQL); while ( reg.next()){
	 * curso=reg.getString(1); System.out.println("CURSO:"+curso); Statement
	 * s2=c.createStatement(); ResultSet
	 * reg2=s2.executeQuery("select nombre from alumnos where curso='"+curso+"'");
	 * while ( reg2.next()){ System.out.println("\t"+reg2.getString(1)); }
	 * s2.close(); } s.close(); this.cerrar(); return; } catch ( SQLException e){ //
	 * System.out.println(e.getMessage()); throw new
	 * ErrorBaseDatos("Listando cursos");
	 * 
	 * } }
	 */

}
