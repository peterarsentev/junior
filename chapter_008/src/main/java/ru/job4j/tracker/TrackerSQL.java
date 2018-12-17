package ru.job4j.tracker;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TrackerSQL implements ITracker, AutoCloseable {

    private final Connection connection;

    public TrackerSQL(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Item add(Item item) {
        try (final PreparedStatement statement = this.connection
                .prepareStatement("insert into items (name) values (?)", Statement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, item.getName());
            statement.executeUpdate();
            try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    item.setId(generatedKeys.getString(1));
                    return item;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        throw new IllegalStateException("Could not create new user");
    }

    @Override
    public void replace(String id, Item item) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public List<Item> findAll() {
        return null;
    }

    @Override
    public List<Item> findByName(String key) {
       List<Item> items = new ArrayList<>();
        try (final PreparedStatement statement = this.connection
                .prepareStatement("select * from items")) {
            try (ResultSet set = statement.executeQuery()) {
                while (set.next()) {
                    items.add(new Item(set.getString("id"), set.getString("name")));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return items;
    }

    @Override
    public Item findById(String id) {
        return null;
    }

    @Override
    public void close() {

    }
}
