package tw.bill.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tw.bill.domain.OrderInfo;

/**
 * Created by bill33 on 2016/10/16.
 */
@Repository
public interface OrderInfoRepository extends JpaRepository<OrderInfo, Long> {
}
