package tmi.tmi_hotel.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import tmi.tmi_hotel.entity.Employee;
import tmi.tmi_hotel.repository.IEmployeeRepository;

import java.util.List;

@Service
public class UserDetailsServiceConfig implements UserDetailsService {
    @Autowired
    private IEmployeeRepository employeeRepository;

    @Override
    @Async
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        System.out.println(login);
        Employee admin = employeeRepository.findEmployeeByEmail(login);
        if (admin != null) {
            GrantedAuthority authority = new SimpleGrantedAuthority(admin.getJobTitle());
            UserDetails userDetails = new User(admin.getEmail(), admin.getPassword(), List.of(authority));
            System.out.println(userDetails.getUsername() + ":" + userDetails.getPassword() + ". Role" + userDetails.getAuthorities());
            return userDetails;
        }
        throw new UsernameNotFoundException("User not authorized.");
    }
}