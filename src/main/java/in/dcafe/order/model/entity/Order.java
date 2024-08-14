package in.dcafe.order.model.entity;


import in.dcafe.order.model.Address;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;

import java.util.List;


@Entity
@Data
@Builder
public class Order {

    @Id
    private Long orderUid;

    private List<Long> itemIds;

    private Long restaurantId;

    private Address address;

    private Long deliveryPartnerId;

}
