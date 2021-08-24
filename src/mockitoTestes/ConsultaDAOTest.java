package mockitoTestes;

import DAO.ConsultaDAO;
import services.conexao.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.junit.*;

import org.mockito.*;

public class ConsultaDAOTest {
	
	@Mock
	ConsultaDAO consultaDAO = Mockito.mock(ConsultaDAO.class);
	
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
		consultaDAO.addConsulta("Soares", "Diego", "12352369875", "10/08/2021", "15:30", "1");
		Mockito.verify(stmt, Mockito.times(1)).executeUpdate();
		
	}
	
	@Test
	public void removerConsulta () throws Exception {
		consultaDAO.removerConsulta(20);
		Mockito.verify(stmt, Mockito.times(1)).executeUpdate();
	}
	
	@Test
	public void editarConsulta() {
		consultaDAO.editarConsulta("Soares", "Diego", "12352369875", "10/08/2021", "14:00", "1", 20);
	}
	
	
}