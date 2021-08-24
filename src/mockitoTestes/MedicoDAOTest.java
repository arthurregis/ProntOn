package mockitoTestes;

import DAO.MedicoDAO;
import services.conexao.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.junit.*;

import org.mockito.*;

public class MedicoDAOTest {
	
	@Mock
	MedicoDAO medicoDAO = Mockito.mock(MedicoDAO.class);
	
	@Mock
	private PreparedStatement stmt = Mockito.mock(PreparedStatement.class);
	
	@Mock
	private ResultSet rs = Mockito.mock(ResultSet.class);
	
	@Mock
	private Conexao conexao = Mockito.mock(Conexao.class);
	
	@Mock
	private Connection con = Mockito.mock(Connection.class);
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		Mockito.when(conexao.getConexao()).thenReturn(con);
		Mockito.when(con.prepareStatement(Mockito.any(String.class))).thenReturn(stmt);
		Mockito.when(stmt.executeUpdate()).thenReturn(1);
		Mockito.when(stmt.executeQuery()).thenReturn(rs);
		Mockito.when(rs.next()).thenReturn(true);
	}
	
	@Test
	public void addConsulta() throws Exception {
		medicoDAO.addMedico("Davi", "Maia", "quixada", "86965687542", "89659632547", "dashshi", "Masculino", "78541236523", "Clinico Geral", "Clinica");
		Mockito.verify(stmt, Mockito.times(1)).executeUpdate();
		
	}
	
	@Test
	public void removerConsulta () throws Exception {
		medicoDAO.editarMedico("Davi", "Maia", "quixada", "86965687542", "89659632547", "dashshu", "Masculino", "78541236523", "Pediatra", "clinica");
		Mockito.verify(stmt, Mockito.times(1)).executeUpdate();
	}
	
}