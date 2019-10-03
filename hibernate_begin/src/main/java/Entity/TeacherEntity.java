package Entity;

/**
 * Create By yuanyuan on 2019/9/21 22:25
 */
public class TeacherEntity {

    private String id;

    private String name;

    public TeacherEntity() {
    }

    public TeacherEntity(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
