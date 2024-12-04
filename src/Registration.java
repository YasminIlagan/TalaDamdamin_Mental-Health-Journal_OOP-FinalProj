import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Registration {
    public boolean registerUser(User user) {
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO users (username, password) VALUES (?, ?)")) {

            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getPassword());

            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0; // Return true if user is registered successfully

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
