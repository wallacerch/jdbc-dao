package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.DB;
import db.DbException;
import model.dao.DepartamentoDao;
import model.entities.Departamento;
import model.entities.Vendedor;

public class DepartamentoDaoJDBC implements DepartamentoDao {
	
	private Connection conn;
	
	public DepartamentoDaoJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Departamento obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Departamento obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Departamento findById(Integer id) {
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			st = conn.prepareStatement(
					"select * "
					+ "from department "
					+ "where Id = ?");
			
			st.setInt(1, id);
			rs = st.executeQuery();
			if(rs.next()) {
				Departamento dep = instantiateDepartment(rs);
				return dep;
			}
			return null;
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
	}

	@Override
	public List<Departamento> findAll() {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement(
					"select * "
					+ "from department");
			
			rs = st.executeQuery();
			
			List<Departamento> lista = new ArrayList<>();
			
			while(rs.next()) {
				Departamento dep = instantiateDepartment(rs);
				lista.add(dep);
			}
			return lista;
		} catch(SQLException e) {
			throw new DbException(e.getMessage());
		}
	}
	
	private Vendedor instantiateVendedor(ResultSet rs, Departamento dep) throws SQLException {
		Vendedor vend = new Vendedor();
		vend.setId(rs.getInt("Id"));
		vend.setNome(rs.getString("Name"));
		vend.setEmail(rs.getString("Email"));
		vend.setDataNascimento(rs.getDate("BirthDate"));
		vend.setSalario(rs.getDouble("BaseSalary"));
		vend.setDepartamento(dep);
		return vend;
	}

	private Departamento instantiateDepartment(ResultSet rs) throws SQLException {
		Departamento dep = new Departamento();
		dep.setId(rs.getInt("Id"));
		dep.setNome(rs.getString("Name"));
		return dep;
	}

}
