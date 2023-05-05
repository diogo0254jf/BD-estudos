package dao;

import entity.Usuario;
import services.Conector;

import java.sql.*;
import java.util.ArrayList;


public class UsuarioDAO {
    public void cadastrarUsuario(Usuario usuario) {
        String sql = "INSERT INTO USUARIO(nome, login, senha, email) VALUES(?, ?, ?, ?)";
        PreparedStatement ps = null;
        try {
            System.out.println("Vou pedir");
            ps = Conector.getConnection().prepareStatement(sql);

            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getLogin());
            ps.setString(3, usuario.getSenha());
            ps.setString(4, usuario.getEmail());
            ps.executeUpdate();

            System.out.println("Usuario cadastrado com sucesso!");
            ps.execute();
            ps.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<Usuario> findAll() {
        ArrayList<Usuario> u = new ArrayList<>();
        String sql = "SELECT * FROM USUARIO";
        PreparedStatement ps = null;
        try {
            ps = Conector.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(rs.getInt("idusuario"));
                usuario.setNome(rs.getString("nome"));
                usuario.setLogin(rs.getString("login"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setEmail(rs.getString("email"));
                u.add(usuario);
            }
            ps.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return u;
    }



}