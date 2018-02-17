/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    Resume[] storage = new Resume[10000];

    void clear() {
        for (String string: storage) {
            s = null;
        }
    }

    void save(Resume r) {

        for (int i = 0; i < storage.length; i++) {
            if (storage[i] != null) {
                storage[i] = r;
            }
        }

    }

    Resume get(String uuid) {

        String result = null;

        for (int i = 0; i < storage.length; i++) {
            if (storage[i] == uuid){
                result = storage[i];
            }
        }

        return result;
    }

    void delete(String uuid) {

        for (int i = 0; i < storage.length; i++) {
            if (storage[i] == uuid){
                storage[i] = null;
            }
        }

    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {

        Resume[] result = new Resume[10000];
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] != null) {
                result[i] = storage[i];
            }
        }

        return result;
    }

    int size() {
        return storage.length;
    }
}
