package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @Column(name = "id")
    Long id;

    @Column(name = "model")
    String model;

    @Column(name = "series")
    int series;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    private User user;

    public Car() {
    }

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {return this.user;}

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getSeries() {
        return this.series;
    }
}
