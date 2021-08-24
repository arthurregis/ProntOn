package mockitoTestes;

import DAO.RecepcionistaDAO;
import services.conexao.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.junit.*;

import org.mockito.*;

public class RecepcionistaDAOTest {
	
	@Mock
	RecepcionistaDAO recepcionistaDAO = Mockito.mock(RecepcionistaDAO.class);
	
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
		recepcionistaDAO.addRecepcionista("Jura", "74589856352", "74125412563", "85963574210", "Morada Nova", "Masculino", "biutiful");
		Mockito.verify(stmt, Mockito.times(1)).executeUpdate();
		
	}
	
	@Test
	public void removerConsulta () throws Exception {
		recepcionistaDAO.editarRecepcionista("Jura", "74589856352", "74125412563", "85963574210", "Morada Nova", "Masculino", "lindo");
		Mockito.verify(stmt, Mockito.times(1)).executeUpdate();
	}
	
	
}
