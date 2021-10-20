/**
 * author: Llewelyn Klaase
 * student no: 216267072
 */
package za.ac.cput.service.physical;

import za.ac.cput.entity.physical.Room;
import za.ac.cput.service.IService;
import java.util.Set;

public interface IRoomService extends IService<Room, String> {
    Set<Room> getAll();
}
