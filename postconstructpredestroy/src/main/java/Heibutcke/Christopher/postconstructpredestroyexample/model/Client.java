package Heibutcke.Christopher.postconstructpredestroyexample.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

/**
 * @author Christopher adam
 * @version 1.0
 * @since 16/04/2020 19:32
 */

@Component
@Getter @Setter
@AllArgsConstructor
@ToString
public class Client {

    private String name;

    public Client() {
        System.out.println("clinte");
    }
}
