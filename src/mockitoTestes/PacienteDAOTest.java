package mockitoTestes;

import DAO.PacienteDAO;
import services.conexao.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.junit.*;

import org.mockito.*;

public class PacienteDAOTest {
	
	@Mock
	PacienteDAO pacienteDAO = Mockito.mock(PacienteDAO.class);
	
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
		pacienteDAO.addPaciente("Karla", "41235263252", "78958632541", "85965965231", "Chorozinho", "Feminino", "20/09/2003", "vava123");
		Mockito.verify(stmt, Mockito.times(1)).executeUpdate();
		
	}
	
	@Test
	public void removerConsulta () throws Exception {
		pacienteDAO.editarPaciente("Karla", "41235263252", "78958632541", "85965965231", "Chorozinho", "Feminino", "20/09/2003", "vava321");
		Mockito.verify(stmt, Mockito.times(1)).executeUpdate();
	}
	
}