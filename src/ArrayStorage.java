import java.util.Arrays;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    Resume[] storage = new Resume[10000];

    void clear() {
        for (int i = 0; i < storage.length; i++) {
            storage[i] = null;
        }
    }

    void save(Resume r) {

        for (int i = 0; i < storage.length; i++) {
            if (storage[i] == null) {
                storage[i] = r;
                break;
            }
        }

    }

    Resume get(String uuid) {

        Resume result = new Resume();

        for (int i = 0; i < storage.length; i++) {
            if (storage[i] != null && storage[i].toString().equals(uuid)){
                return storage[i];
            }
        }

        return result;
    }

    void delete(String uuid) {

        int j = 0;
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] != null && !uuid.equals(storage[i].toString())){
                storage[j++] = storage[i];
            }
        }

        while (j < storage.length) {
            storage[j++] = null;
        }

    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {

        Resume[] result;
        int count = 0;
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] != null) {
                count++;
            }
        }

        result = Arrays.copyOf(storage, count);
        return  result;

    }

    int size() {

        int count = 0;
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] != null) {
                count++;
            }
        }

        return count;
    }
}
