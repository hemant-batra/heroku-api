package app.converters;

import app.dtos.UserDTO;
import app.entities.User;
import app.repositories.UsersRepository;
import app.utilities.EntityConverter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserConverter extends EntityConverter<String, User, UserDTO> {

    private final UsersRepository usersRepository;

    @Autowired
    public UserConverter(UsersRepository usersRepository) {
        super(usersRepository, User.class, UserDTO.class);
        this.usersRepository = usersRepository;
    }

    public List<UserDTO> findAllByIpAddress(String ipAddress) {
        return toDTOs(usersRepository.findAllByIpAddress(ipAddress));
    }
}